package aop.homework.service;


import aop.homework.entity.BooksBorrowNumber;

import java.util.List;

public interface IBooksBorrowNumberService {
    List<BooksBorrowNumber> findAll();

    void save(BooksBorrowNumber booksBorrowNumber);

}
