package aop.exception.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Books;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
}
