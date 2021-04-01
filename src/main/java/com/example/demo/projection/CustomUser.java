package com.example.demo.projection;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;



@Projection(types = User.class)
public interface CustomUser {


    Integer getId();


    String getFirstName();


    String getLastName();


    String getEmail();


     String getPhone();


     Attachment getPhoto();

}
