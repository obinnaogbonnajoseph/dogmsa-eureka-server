package com.udacity.dogmsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DogmsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogmsaApplication.class, args);
	}

}
