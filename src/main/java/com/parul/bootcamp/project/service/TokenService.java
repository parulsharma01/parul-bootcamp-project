package com.parul.bootcamp.project.service;

import com.parul.bootcamp.project.entities.Token;
import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.repos.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class TokenService {
    @Autowired
    private TokenRepository tokenRepository;

    public Token generateActivationToken(User user){
        Token token = new Token();
        token.setUserEmail(user.getEmail());
        token.setActivationToken(UUID.randomUUID().toString());
        token.setCreatedAt(LocalDateTime.now());
        return tokenRepository.save(token);
    }
    public Token validateToken(Token token){
        return tokenRepository.findByUserEmailAndActivationToken(token.getUserEmail(),token.getActivationToken());
    }
}

