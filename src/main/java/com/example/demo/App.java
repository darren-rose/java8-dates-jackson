package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@SpringBootApplication
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);


	@GetMapping("/invoice")
	public Invoice toInstant(){
        LOGGER.info("currentTimeMillis: {}", System.currentTimeMillis());
		return new Invoice();
	}

	@PostMapping("/invoice")
	public Invoice toInstant(@RequestBody Invoice invoice){
	    invoice.setModified(Instant.now());
	    LOGGER.info(invoice.toString());
	    LOGGER.info("currentTimeMillis: {}", System.currentTimeMillis());
		return invoice;
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
