package aop.homework.service;


import aop.homework.entity.Books;

import java.util.List;

public interface IBooksService {
    List<Books> findAll();

    Books findById(Integer id);

    void save(Books books);

    void borrow(Integer id) throws Exception;

    String giveBack(Integer borrowNumber, Integer id);

}
