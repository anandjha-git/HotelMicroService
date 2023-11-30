package com.lcwd.hotel.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelMicroServiceApplication.class, args);
	}

}
