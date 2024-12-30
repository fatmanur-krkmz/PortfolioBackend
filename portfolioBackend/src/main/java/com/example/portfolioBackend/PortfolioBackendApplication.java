package com.example.portfolioBackend;
import com.example.portfolioBackend.repository.DovizRepository;
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


