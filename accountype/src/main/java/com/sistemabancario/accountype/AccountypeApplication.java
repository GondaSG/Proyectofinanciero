package com.sistemabancario.accountype;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class AccountypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountypeApplication.class, args);
	}

}
