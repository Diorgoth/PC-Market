package com.example.demo.projection;

import com.example.demo.entity.Cart;
import com.example.demo.entity.CartInfo;
import com.example.demo.entity.Product;
import org.springframework.data.rest.core.config.Projection;



@Projection(types = CartInfo.class)
public interface CustomCartInfo {

    Integer getId();


    Product getProduct();


    Cart getCart();


    Integer getQuantity();

}
