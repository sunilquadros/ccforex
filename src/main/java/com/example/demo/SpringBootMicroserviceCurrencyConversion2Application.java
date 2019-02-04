package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
//@EnableFeignClients("com.in28minutes.springboot.microservice.example.currencyconversion")
//@EnableFeignClients("com.example.demo.currencyconversion")
@EnableFeignClients
@EnableDiscoveryClient


public class SpringBootMicroserviceCurrencyConversion2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceCurrencyConversion2Application.class, args);
	}
}
