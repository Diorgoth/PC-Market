package com.example.demo.projection;

import com.example.demo.entity.Details;
import com.example.demo.entity.Feature;
import com.example.demo.entity.Product;
import org.springframework.data.rest.core.config.Projection;



@Projection(types = Details.class)
public interface CustomDetails {

      Integer getId();


    String getValue();


      Product getProduct();


   Feature getFeature();


}
