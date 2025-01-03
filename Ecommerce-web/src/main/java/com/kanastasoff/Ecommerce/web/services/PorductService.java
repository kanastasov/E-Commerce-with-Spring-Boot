package com.kanastasoff.Ecommerce.web.services;

import com.kanastasoff.Ecommerce.web.data.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PorductService {
    List<Product> products
            = Arrays.asList(new Product(1, "Phone", 3000), new Product(2, "Camera", 4000) , new Product(3, "Mic", 200));

    public List<Product> getProducts(){
        return products;
    }
}
