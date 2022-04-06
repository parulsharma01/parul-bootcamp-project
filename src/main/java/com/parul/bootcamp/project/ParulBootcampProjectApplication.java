package com.parul.bootcamp.project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Optional;
import java.util.Properties;

@SpringBootApplication
public class ParulBootcampProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParulBootcampProjectApplication.class, args);
    }
}
