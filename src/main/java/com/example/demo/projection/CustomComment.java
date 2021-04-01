package com.example.demo.projection;

import com.example.demo.entity.Comment;
import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = Comment.class)
public interface CustomComment {


     Integer getId();



     User getCustomer();

      String getMessage();

      Date getDate();

     double getMark();


     Product getProduct();

}
