package com.parul.bootcamp.project.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.parul.bootcamp.project.Security.SecurityService;
import com.parul.bootcamp.project.repos.TokenRepository;
import com.parul.bootcamp.project.repos.UserRepository;
import com.parul.bootcamp.project.repos.CustomerRepository;
import com.parul.bootcamp.project.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private SecurityService securityService;

    @Autowired
    TokenRepository tokenRepository;

    @Autowired
    UserRepository userRepo;
    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    private EmailService emailService;


    @PostMapping("/login")
    public String login(@RequestBody ObjectNode objectNode) {
        String email = objectNode.get("email").asText();
        String password = objectNode.get("password").asText();

        boolean loginResponse = securityService.login(email, password);
        if (loginResponse) {
            return "Successfully Logged in ";
        }
        return "Account does not exist wit email "+email;
    }

}
