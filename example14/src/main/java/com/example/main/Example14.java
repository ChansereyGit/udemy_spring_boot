package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Example14 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices veh1 = context.getBean(VehicleServices.class);
        VehicleServices veh2 = context.getBean(VehicleServices.class);
        System.out.println("Hashcode of the object vehicleServices1 : " + veh1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2 : " + veh2.hashCode());
        if(veh1==veh2){
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }
    }
}