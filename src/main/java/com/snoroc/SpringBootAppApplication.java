package com.snoroc;

import com.snoroc.rest.MainController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring");

			String[] beanDefinitionNames = context.getBeanDefinitionNames();
			Arrays.sort(beanDefinitionNames);
			for(String beanName : beanDefinitionNames) {
				System.out.println(beanName);
			}
		};
	}

}
