package com.example.SpringBootProcess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProcessApplication {

	public static void main(String[] args) {
		System.out.println("0");
		SpringApplication.run(SpringBootProcessApplication.class, args);
		System.out.println("1");
	}

}
