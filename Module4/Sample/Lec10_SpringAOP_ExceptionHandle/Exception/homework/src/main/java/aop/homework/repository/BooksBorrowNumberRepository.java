package aop.homework.repository;


import aop.homework.entity.BooksBorrowNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksBorrowNumberRepository extends JpaRepository<BooksBorrowNumber, Integer> {
}
