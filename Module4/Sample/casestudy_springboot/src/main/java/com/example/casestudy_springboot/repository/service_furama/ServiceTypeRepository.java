package com.example.casestudy_springboot.repository.service_furama;

import com.example.casestudy_springboot.entity.serviceFurama.ServiceFurama;
import com.example.casestudy_springboot.entity.serviceFurama.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, Integer> {
}