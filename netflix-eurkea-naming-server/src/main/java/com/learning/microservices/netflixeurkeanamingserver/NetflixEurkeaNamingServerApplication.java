package com.learning.microservices.netflixeurkeanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurkeaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurkeaNamingServerApplication.class, args);
	}
}
