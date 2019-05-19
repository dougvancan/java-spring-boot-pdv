package com.pdv.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PontoDeVendaApplication {
	
	@Value("${spring.profiles.active}")
	private String ambiente;

	public static void main(String[] args) {
		SpringApplication.run(PontoDeVendaApplication.class, args);
		System.out.println("Running PontoDeVendaApplication");
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Ambiente utilizado: "+ambiente);
		};
	}

}
