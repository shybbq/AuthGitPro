package com.yzf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 系统基础服务抽象 包括 entity dao service 的抽象
@SpringBootApplication
@EnableEurekaClient
public class YzfCloudAuthCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(YzfCloudAuthCommonApplication.class, args);
	}
}
