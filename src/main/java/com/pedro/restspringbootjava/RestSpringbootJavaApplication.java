package com.pedro.restspringbootjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.pedro.restspringbootjava.entity")
public class RestSpringbootJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringbootJavaApplication.class, args);
	}
}