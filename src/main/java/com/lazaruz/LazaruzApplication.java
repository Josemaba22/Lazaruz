package com.lazaruz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.lazaruz.*")
@EntityScan("com.lazaruz.entity")
@EnableJpaRepositories("com.lazaruz.repository")
public class LazaruzApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazaruzApplication.class, args);
	}

}
