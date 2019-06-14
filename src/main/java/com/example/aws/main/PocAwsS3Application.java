package com.example.aws.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.aws")
public class PocAwsS3Application {

	public static void main(String[] args) {
		SpringApplication.run(PocAwsS3Application.class, args);
	}

}
