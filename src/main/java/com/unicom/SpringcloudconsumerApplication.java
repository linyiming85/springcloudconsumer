package com.unicom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * @author linyi
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconsumerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
