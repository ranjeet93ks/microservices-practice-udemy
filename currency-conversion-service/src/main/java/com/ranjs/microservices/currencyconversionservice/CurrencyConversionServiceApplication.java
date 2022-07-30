package com.ranjs.microservices.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //otherwise error -> Field proxy in com.ranjs.microservices.currency conversionservice.Currency Conversion Controller required a bean of type 'com.ranjs.microservices.currencyconversionservice.CurrencyExchangeProxy' that could not be found.
public class CurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

}
