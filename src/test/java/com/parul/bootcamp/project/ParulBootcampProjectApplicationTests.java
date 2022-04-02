package com.parul.bootcamp.project;

import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.repos.AddressRepository;
import com.parul.bootcamp.project.repos.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
class ParulBootcampProjectApplicationTests {
	@Autowired
	UserRepository userRepository;

	@Autowired
	AddressRepository addressRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void run(){

		User user = new User();
		user.setId(1);
		user.setFirstName("Parul");
		user.setMiddleName("Govind");
		user.setLastName("Sharma");
		userRepository.save(user);
	}
}
