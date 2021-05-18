package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Demo2Application.class, args);

		Alien a = context.getBean(Alien.class);

		a.toShow();
//
//		Alien a1 = context.getBean(Alien.class);
//
//		a1.toShow();
	}
}
