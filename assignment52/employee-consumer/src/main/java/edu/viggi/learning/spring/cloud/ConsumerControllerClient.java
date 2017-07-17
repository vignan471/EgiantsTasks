package edu.viggi.learning.spring.cloud;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerControllerClient {
	
	@Autowired
	private LoadBalancerClient loadBal;
	
	@Bean
	RestTemplate restTemplate(){
	    return new RestTemplate();
	  }
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/output")
	public String getEmployee() throws RestClientException, IOException {
		
		ServiceInstance serviceInstance = loadBal.choose("employee-producer");
		
		String baseUrl = serviceInstance.getUri().toString();
		
		baseUrl = baseUrl + "/employee";
		
		System.out.println(baseUrl);
		
		ResponseEntity<String> response=null;
		try{
		response=restTemplate.exchange(baseUrl,
				HttpMethod.GET, getHeaders(),String.class);
		System.out.println(response.getBody());
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		return response.getBody();
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}

}
