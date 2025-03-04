package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.services.services;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class  DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
		services services = context.getBean(services.class);

		services.someService();

		context.close();
	}
	}


