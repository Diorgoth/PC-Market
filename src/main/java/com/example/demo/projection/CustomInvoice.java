package com.example.demo.projection;

import com.example.demo.constrains.OrderStatus;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.Order;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = Invoice.class)
public interface CustomInvoice {


     Integer getId();


      User getCustomer();


     Order getOrder();

    double getPrice();

     Date getCreatedDate();

   Date getDueDate();


     OrderStatus getOrderStatus();

}
