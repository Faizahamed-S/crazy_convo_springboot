package com.sjsu.CrazyConvo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.sjsu.CrazyConvo.model")
public class CrazyConvoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrazyConvoApplication.class, args);
	}

}
