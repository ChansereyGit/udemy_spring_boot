package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for defining Spring Beans.
 *
 * This class is responsible for creating and managing the beans
 * required for the application. It utilizes Spring's @Configuration
 * and @Bean annotations to integrate objects into the Spring context.
 */
@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

}
