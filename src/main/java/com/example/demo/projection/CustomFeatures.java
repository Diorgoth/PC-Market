package com.example.demo.projection;

import com.example.demo.entity.Category;
import com.example.demo.entity.Feature;
import org.springframework.data.rest.core.config.Projection;



@Projection(types = Feature.class)
public interface CustomFeatures {


      Integer getId();



      String getName();


      String getDescription();


     Category getCategory();

}
