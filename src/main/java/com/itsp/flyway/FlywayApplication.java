package com.itsp.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.itsp.flyway")
public class FlywayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlywayApplication.class, args);
	}

	public RestTemplate restTemplate(){
		return restTemplate();
	}

}
