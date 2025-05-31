package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Example1 {
    public static void main(String[] args) {
        //without spring context
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        System.out.println("Vehicle name from the non-spring context is: " + vehicle.getName());

        //with spring context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from the spring context is: " + veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("String from the spring context is: " + hello);

        Integer number = context.getBean(Integer.class);
        System.out.println("Integer from the spring context is: " + number);
    }
}