package com.overpathz.elkstackdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ElkStackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElkStackDemoApplication.class, args);
	}

}
