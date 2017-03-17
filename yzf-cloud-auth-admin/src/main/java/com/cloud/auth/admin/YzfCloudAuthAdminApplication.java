package com.cloud.auth.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:spring/spring.xml"})
public class YzfCloudAuthAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(YzfCloudAuthAdminApplication.class, args);
	}
}
