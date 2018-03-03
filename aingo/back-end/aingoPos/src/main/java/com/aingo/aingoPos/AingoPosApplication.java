package com.aingo.aingoPos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("persistencia.entidad")
public class AingoPosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AingoPosApplication.class, args);
	}
}
