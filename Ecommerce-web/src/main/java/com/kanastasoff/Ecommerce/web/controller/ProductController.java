package com.kanastasoff.Ecommerce.web.controller;

import com.kanastasoff.Ecommerce.web.data.Product;
import com.kanastasoff.Ecommerce.web.services.PorductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    PorductService porductService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return porductService.getProducts();



    }
}
