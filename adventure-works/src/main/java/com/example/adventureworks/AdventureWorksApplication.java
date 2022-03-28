package com.example.adventureworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AdventureWorksApplication
{
	public static void main(String[] args) {
		SpringApplication.run(AdventureWorksApplication.class, args);
	}

}
