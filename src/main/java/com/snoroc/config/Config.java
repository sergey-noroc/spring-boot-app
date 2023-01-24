package com.snoroc.config;

import com.snoroc.bean.MyBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.TomcatServletWebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@Configuration
@PropertySource("classpath:application.properties")
public class Config {

    @Value("${firstName}")
    private String firstName;

    @Value("${lastName}")
    private String lastName;

    @Value("${age}")
    private int age;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public MyBean myBean() {
        return new MyBean(firstName, lastName, age);
    }

}
