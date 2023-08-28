package com.example.portfolioBackend;

import com.example.portfolioBackend.model.Doviz;
import com.example.portfolioBackend.model.DovizTuru;
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
          /*  Doviz doviz=new Doviz(
					DovizTuru.DOLAR,
					25.00,
					"28/08/2022",
					12);
			repository.insert(doviz);
		};*/
		};
	}

}
