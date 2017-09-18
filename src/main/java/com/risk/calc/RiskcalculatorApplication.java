package com.risk.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages="com.risk.calc.repository")
public class RiskcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiskcalculatorApplication.class, args);
	}
}
