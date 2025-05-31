package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Example10 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1 = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from the spring context is: " + person.getName());
        System.out.println("Vehicle name from the spring context is: " + veh1.getName());
        System.out.println("Vehicle that person own is: " + person.getVehicle());


    }
}