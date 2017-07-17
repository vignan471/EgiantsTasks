package edu.viggi.learning.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

	@EnableZuulProxy
	@SpringBootApplication
	@EnableDiscoveryClient
	public class GatewayApplication {

	  public static void main(String[] args) {
	    SpringApplication.run(GatewayApplication.class, args);
	  }
	}
