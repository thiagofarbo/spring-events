package com.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsApplication.class, args);
	}

}
