package com.penn.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestDemoApplication {

	public static void main(String[] args) {
		System.out.println("=============spring boot begin start=============================");
		SpringApplication.run(SpringTestDemoApplication.class, args);
		System.out.println("=============spring boot start success=============================");
	}

}
