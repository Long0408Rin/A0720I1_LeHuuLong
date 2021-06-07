package aop.exception.homework.service;

import aop.exception.homework.entity.BooksBorrowNumber;

import java.util.List;


public interface IBooksBorrowNumberService {
    List<BooksBorrowNumber> findAll();

    void save(BooksBorrowNumber booksBorrowNumber);

}
