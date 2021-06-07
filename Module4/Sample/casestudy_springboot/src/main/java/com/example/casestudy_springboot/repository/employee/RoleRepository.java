package com.example.casestudy_springboot.repository.employee;

import com.example.casestudy_springboot.entity.employee.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
