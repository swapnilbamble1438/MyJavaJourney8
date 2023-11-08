package com;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MySpringBootAa27BlogAppApIsViiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootAa27BlogAppApIsViiApplication.class, args);
	}
	

	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}



}
