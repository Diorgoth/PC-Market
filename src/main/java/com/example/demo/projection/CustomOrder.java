package com.example.demo.projection;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Order;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;


import java.sql.Date;

@Projection(types = Order.class)
public interface CustomOrder {



       Integer getId();


       Date getDate();


      User getCustomer();


      Cart getCart();
}
