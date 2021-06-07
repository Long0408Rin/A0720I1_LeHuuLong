package aop.exception.homework.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BooksBorrowNumber {
    @Id
    private int id;
    private int borrowNumber;

    public BooksBorrowNumber() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBorrowNumber() {
        return borrowNumber;
    }

    public void setBorrowNumber(int borrowNumber) {
        this.borrowNumber = borrowNumber;
    }


}
