package com.example.casestudy_springboot.repository.contact_furama;

import com.example.casestudy_springboot.entity.contract_detail.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachServiceRepository extends JpaRepository<AttachService, Integer> {
}
