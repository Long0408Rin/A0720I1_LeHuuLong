package com.example.casestudy_springboot.repository.employee;

import com.example.casestudy_springboot.entity.employee.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String userName);
}
