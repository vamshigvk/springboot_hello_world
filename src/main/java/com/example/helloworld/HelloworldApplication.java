package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=	SpringApplication.run(HelloworldApplication.class, args);
		System.out.println("*******Hello Spring boot World");

		//Alien a = new Alien();
		
		//Component, singleton, it creates object only once and by default
		//@Scope(value = "prototype"), it creates object on demand(when getbean is called, object creates multiple times
		//Alien a1 = context.getBean(Alien.class);
		Alien a2 = context.getBean(Alien.class);
		a2.show();
		System.out.println(a2);
		System.out.println(a2.getLaptop());
		
	}

}
