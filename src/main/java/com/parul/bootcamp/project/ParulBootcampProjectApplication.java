package com.parul.bootcamp.project;

import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.repos.AddressRepository;
import com.parul.bootcamp.project.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ParulBootcampProjectApplication {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    public static void main(String[] args) {
        SpringApplication.run(ParulBootcampProjectApplication.class, args);


    }
    public void run(){

        User user = new User();
        user.setId(1);
        user.setFirstName("Parul");
        user.setMiddleName("Govind");
        user.setLastName("Sharma");
        userRepository.save(user);
    }



}
