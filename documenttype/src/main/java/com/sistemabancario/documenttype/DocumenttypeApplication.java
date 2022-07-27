package com.sistemabancario.documenttype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class DocumenttypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumenttypeApplication.class, args);
	}

}
