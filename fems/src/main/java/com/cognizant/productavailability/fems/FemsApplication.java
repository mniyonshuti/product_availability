package com.cognizant.productavailability.fems;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.io.Resource;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class FemsApplication {
	public static void main(String[] args) {
		SpringApplication.run(FemsApplication.class, args);
	}
}
