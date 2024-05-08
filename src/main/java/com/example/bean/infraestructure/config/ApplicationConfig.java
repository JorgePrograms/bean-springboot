package com.example.bean.infraestructure.config;


import com.example.bean.application.service.PersonaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public PersonaService personaService(){
        return new PersonaService();
    }

}
