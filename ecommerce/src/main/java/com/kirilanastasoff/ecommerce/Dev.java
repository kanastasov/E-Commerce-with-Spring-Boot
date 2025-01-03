package com.kirilanastasoff.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Dev(int age) {
        this.age = age;
    }

    private int age;
    @Autowired
    @Qualifier("laptop")
    private Laptop laptop = new Laptop();

    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }

    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }



    public void build(){
        laptop.compile();
        System.out.println("Build Success");
    }
}
