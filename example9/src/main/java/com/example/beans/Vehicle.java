package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Vechicle bean created by Spring");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello from Component vehicle bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is - " + name;
    }
}
