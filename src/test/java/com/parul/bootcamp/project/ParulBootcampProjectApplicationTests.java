package com.parul.bootcamp.project;

import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.repos.CustomerRepository;
import com.parul.bootcamp.project.repos.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParulBootcampProjectApplicationTests {
	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

}
