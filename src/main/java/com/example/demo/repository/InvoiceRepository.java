package com.example.demo.repository;

import com.example.demo.entity.Invoice;
import com.example.demo.projection.CustomInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "invoice",collectionResourceRel = "list",excerptProjection = CustomInvoice.class)
public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {

}
