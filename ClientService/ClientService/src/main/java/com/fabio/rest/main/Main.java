package com.fabio.rest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages= {"com.fabio.rest.feign"})
@ComponentScan(basePackages= {"com.fabio.rest.controller","com.fabio.rest.service"})
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}

}
