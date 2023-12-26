package com.example.spring_initializer;

import com.example.spring_initializer.dao.entities.Computer;
import com.example.spring_initializer.service.ComputerManager;
import com.example.spring_initializer.service.mapper.ComputerMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringInitializerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInitializerApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ComputerManager computerManager) {
		return args -> {
			Computer c1 = computerManager.saveComputer(Computer.builder().Proce("test").ram("454").build());


		};

	}
}
