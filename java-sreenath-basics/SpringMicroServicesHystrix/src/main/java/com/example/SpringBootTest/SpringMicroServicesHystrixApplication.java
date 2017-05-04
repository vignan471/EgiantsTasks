package com.example.SpringBootTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringMicroServicesHystrixApplication {
	
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/startClient")
	public List<String> startClient(){
		return this.restTemplate.getForObject("http://localhost:8888/service", List.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServicesHystrixApplication.class, args);
	}
}
