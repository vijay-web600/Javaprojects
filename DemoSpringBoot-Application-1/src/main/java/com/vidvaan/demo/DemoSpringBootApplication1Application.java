package com.vidvaan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringBootApplication1Application {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context=	SpringApplication.run(DemoSpringBootApplication1Application.class, args);
	Student student=(Student) context.getBean("student");
	student.runing();
	
	Student student1=(Student) context.getBean("student");
	student1.runing();

	}
	
	

}
