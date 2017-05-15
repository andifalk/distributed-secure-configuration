package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientApplication {

	@Value("${msg}")
	private String message;

    @Value("${secretkey:n/a}")
    private String secretKey;

    public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "<h1>Message: '" + message + "'</h1><h1>Secret key: '" + secretKey + "'</h1>";
	}

}
