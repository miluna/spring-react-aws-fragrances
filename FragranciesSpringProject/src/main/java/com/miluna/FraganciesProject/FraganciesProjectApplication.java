package com.miluna.FraganciesProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class FraganciesProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FraganciesProjectApplication.class, args);
	}
}
