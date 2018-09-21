package com.hrms.leave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LeaveApplication extends SpringBootServletInitializer{

 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LeaveApplication.class);
    }
	 
	public static void main(String[] args) {
		SpringApplication.run(LeaveApplication.class, args);
	}
}
