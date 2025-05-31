package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Vechicle bean created by Spring");
    }

    private String name = "Toyota";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle name is - " + name;
    }
}
