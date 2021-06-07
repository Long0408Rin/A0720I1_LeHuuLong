package aop.exception.homework.repository;

import aop.exception.homework.entity.BooksBorrowNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksBorrowNumberRepository extends JpaRepository<BooksBorrowNumber, Integer> {
}
