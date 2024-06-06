package com.platziMarket.platziMarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.platziMarket.platziMarket.persistence.entity.Category; 

@SpringBootApplication
public class PlatziMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
	}

}
