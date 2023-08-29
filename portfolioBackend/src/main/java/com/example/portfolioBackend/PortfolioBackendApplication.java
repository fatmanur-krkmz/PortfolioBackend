package com.example.portfolioBackend;

import com.example.portfolioBackend.model.Doviz;
import com.example.portfolioBackend.model.DovizTuru;
import com.example.portfolioBackend.model.Financial;
import com.example.portfolioBackend.repository.DovizRepository;
import com.example.portfolioBackend.repository.FinancialRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class PortfolioBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(DovizRepository repository){
		return args -> {


		};
		}
	}


