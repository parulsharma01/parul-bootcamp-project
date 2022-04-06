package com.parul.bootcamp.project.repos;

import com.parul.bootcamp.project.entities.Token;
import org.springframework.data.repository.CrudRepository;

public interface TokenRepository extends CrudRepository<Token, Integer> {
    public Token findByUserEmail(String userEmail);
    public Token findByActivationToken(String activationToken);

    public Token findByUserEmailAndActivationToken(String userEmail, String activationToken);
}
