package com.example.casestudy_springboot.repository.contact_furama;

import com.example.casestudy_springboot.entity.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
