package com.dr.department.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DepartmentConfig {

    @Bean
    public RestTemplate getRestClient(){

        RestTemplate restTemplate= new RestTemplate();
        return restTemplate;
    }
}
