package com.example.casestudy_springboot.repository.service_furama;

import com.example.casestudy_springboot.entity.serviceFurama.ServiceFurama;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceFurama, String> {
}
