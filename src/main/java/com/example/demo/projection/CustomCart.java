package com.example.demo.projection;

import com.example.demo.entity.Cart;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;


import java.sql.Date;

@Projection(types = Cart.class)
public interface CustomCart {



      Integer getId();


    User getCustomer();


    Date getCreatedDate();

}
