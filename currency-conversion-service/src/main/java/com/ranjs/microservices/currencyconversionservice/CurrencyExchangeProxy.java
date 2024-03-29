package com.ranjs.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//http://localhost:8000/currency-exchange/from/USD/to/INR
//@FeignClient(name = "currency-exchange", url ="localhost:8000") 
@FeignClient(name = "currency-exchange") // auto load balancing
public interface CurrencyExchangeProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);

}
