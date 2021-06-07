package aop.homework.service.impl;

import aop.homework.entity.BooksBorrowNumber;
import aop.homework.service.IBooksBorrowNumberService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BooksBorrowNumberServiceImpl implements IBooksBorrowNumberService {
    @Autowired
    private BooksBorrowNumber booksBorrowNumber;

    @Override
    public List<BooksBorrowNumber> findAll() {
        return null;
    }

    @Override
    public void save(BooksBorrowNumber booksBorrowNumber) {
    }
}
