package com.ikeda.registryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRegistryServerApplication.class, args);
	}

}
