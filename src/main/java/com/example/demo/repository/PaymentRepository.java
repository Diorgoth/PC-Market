package com.example.demo.repository;

import com.example.demo.entity.Payment;
import com.example.demo.projection.CustomPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "payment",collectionResourceRel = "list",excerptProjection = CustomPayment.class)
public interface PaymentRepository extends JpaRepository<Payment,Integer> {



}
