package com.javafsd.azureHemadri;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class AzureHemadriApplication {


public static void main(String[] args) {
SpringApplication.run(AzureHemadriApplication.class, args);
}

@GetMapping("/Hello")
public String hello() {
return "Hello! Welocme to Azure";
}




}