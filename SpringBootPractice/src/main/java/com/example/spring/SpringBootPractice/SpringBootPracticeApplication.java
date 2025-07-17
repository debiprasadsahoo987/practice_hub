package com.example.spring.SpringBootPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootPracticeApplication.class, args);
		Programmer programmer = context.getBean(Programmer.class);
		programmer.code();
	}

}