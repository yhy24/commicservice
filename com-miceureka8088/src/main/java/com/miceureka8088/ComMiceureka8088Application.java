package com.miceureka8088;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ComMiceureka8088Application {

	public static void main(String[] args) {
		SpringApplication.run(ComMiceureka8088Application.class, args);
	}

}
