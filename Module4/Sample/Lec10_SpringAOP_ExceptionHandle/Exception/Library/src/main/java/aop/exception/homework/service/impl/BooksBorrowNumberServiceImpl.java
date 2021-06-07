package aop.exception.homework.service.impl;

import aop.exception.homework.entity.BooksBorrowNumber;
import aop.exception.homework.service.IBooksBorrowNumberService;
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
