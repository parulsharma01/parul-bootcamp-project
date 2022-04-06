package com.parul.bootcamp.project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class ParulBootcampProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParulBootcampProjectApplication.class, args);
    }

    //to convert dto to entity and viceversa
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
