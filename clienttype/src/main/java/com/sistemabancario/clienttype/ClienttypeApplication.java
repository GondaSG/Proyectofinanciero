package com.sistemabancario.clienttype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ClienttypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienttypeApplication.class, args);
	}

}
