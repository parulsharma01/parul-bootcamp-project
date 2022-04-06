package com.parul.bootcamp.project.repos;

import com.parul.bootcamp.project.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
}
