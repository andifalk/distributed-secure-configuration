package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VaultConfigClient1Application {

    @Value("${mysecret:n/a}")
    private String mySecretKey;

    @Value("${foo:n/a}")
    private String foo;

    public static void main(String[] args) {
		SpringApplication.run(VaultConfigClient1Application.class, args);
	}

	@GetMapping(path = "/")
	public String index() {
		return "<h1>Application 1</h1><h2>My secret key="
                + mySecretKey + "</h2><h2>Foo=" + foo + "</h2>";
	}

}
