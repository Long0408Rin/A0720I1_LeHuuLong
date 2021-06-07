package aop.homework.service.impl;

import aop.homework.entity.Books;
import aop.homework.entity.BooksBorrowNumber;
import aop.homework.repository.BooksBorrowNumberRepository;
import aop.homework.repository.BooksRepository;

import aop.homework.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements IBooksService {
    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private BooksBorrowNumberRepository booksBorrowNumberRepository;

    @Override
    public List<Books> findAll() {
        return this.booksRepository.findAll();
    }

    @Override
    public Books findById(Integer id) {
        return this.booksRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Books books) {
        this.booksRepository.save(books);
    }

    @Override
    public void borrow(Integer id) throws Exception {
        Books book = findById(id);
        if (book.getQuantity() == 0) {
            throw new Exception("Het Sach!");
        } else {
            book.setQuantity(book.getQuantity() - 1);
            BooksBorrowNumber booksBorrowNumber = new BooksBorrowNumber();
            booksBorrowNumber.setId((int) (Math.random() * 100) + 999);
            booksBorrowNumber.setBorrowNumber((int) (Math.random() * 100) + 999);
            this.booksBorrowNumberRepository.save(booksBorrowNumber);
        }
    }

    @Override
    public String giveBack(Integer borrowNumber, Integer id) {
        List<BooksBorrowNumber> booksBorrowNumbersList = this.booksBorrowNumberRepository.findAll();
        boolean check = false;
        for (BooksBorrowNumber booksBorrowNumber : booksBorrowNumbersList) {
            if (booksBorrowNumber.getBorrowNumber() == borrowNumber) {
                check = true;
                Books book = findById(id);
                book.setQuantity(book.getQuantity() + 1);
                this.booksBorrowNumberRepository.delete(booksBorrowNumber);
                break;
            }
        }
        if (check) {
            return "Give Back Complete !";
        } else {
            return "Book Loan Number is not exist !";
        }
    }
}
