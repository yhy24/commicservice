package com.consumerfeigin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.consumerfeigin.controller")
@ComponentScan(basePackages = "com.consumerfeigin.service")
public class ComConsumerfeiginApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComConsumerfeiginApplication.class, args);
	}

}
