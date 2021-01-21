package com.cognizant.productavailability.locationcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LocationCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationCrudApplication.class, args);
	}

}
