package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    public Person() {
        System.out.println("Person bean created by Spring");
    }

    private String name = "Lucy";

    @Autowired
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
