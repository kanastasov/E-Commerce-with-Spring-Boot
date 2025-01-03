package com.kirilanastasoff.ecommerce;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile(){
        System.out.println("Compile Desktop");
    }
}
