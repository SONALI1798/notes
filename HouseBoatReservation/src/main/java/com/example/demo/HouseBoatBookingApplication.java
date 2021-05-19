package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com")
//Use appropriate annotation to scan the packages
public class HouseBoatBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseBoatBookingApplication.class, args);
	}

}
