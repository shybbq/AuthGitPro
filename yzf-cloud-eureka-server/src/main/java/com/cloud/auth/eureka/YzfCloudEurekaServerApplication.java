package com.cloud.auth.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YzfCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YzfCloudEurekaServerApplication.class, args); 
	}
}
