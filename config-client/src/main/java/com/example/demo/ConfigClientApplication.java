package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigClientApplication {

	@Value("${msg:n/a}")
	private String message;

    @Value("${secretkey:n/a}")
    private String secretKey;

    public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@GetMapping("/")
	public String index() {

        return "<h1>Config Client</h1><h2>Message: '"
                + message + "'</h2><h2>Secret key: '"
                + secretKey + "'</h2>";
	}

}
