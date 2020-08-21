package com.orbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Driver class is the main class for this project. Run this while class to start Spring Boot application.
 * 
 * @author Alex Kamieniarczyk
*/

@SpringBootApplication
public class Driver extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(Driver.class, args);
	}
	
	@Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(Driver.class);  
    }  

}