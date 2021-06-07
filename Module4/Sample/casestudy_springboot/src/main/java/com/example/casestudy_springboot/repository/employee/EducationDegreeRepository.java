package com.example.casestudy_springboot.repository.employee;

import com.example.casestudy_springboot.entity.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducationDegreeRepository extends JpaRepository<EducationDegree, Integer> {
}
