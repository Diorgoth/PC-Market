package com.example.demo.projection;

import com.example.demo.entity.Invoice;
import com.example.demo.entity.Payment;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;


import java.util.Date;

@Projection(types = Payment.class)
public interface CustomPayment {


      Integer getId();


      float getPrice();


      User getCustomer();


      Invoice getInvoice();


      Date getDate();

}
