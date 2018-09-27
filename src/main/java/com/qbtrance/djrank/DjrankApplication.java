package com.qbtrance.djrank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//create and access database in Apache Derby:
// ij;
// connect 'jdbc:derby://localhost:1527/db_djrank;create=true';

@SpringBootApplication
public class DjrankApplication {

	public static void main(String[] args) {
		SpringApplication.run(DjrankApplication.class, args);
}
}
