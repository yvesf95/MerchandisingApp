package com.jgalds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MerchandisingApp {

	public static void main(String[] args) {
		SpringApplication.run(MerchandisingApp.class, args);
	}
}
