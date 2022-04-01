package com.parul.bootcamp.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
class ParulBootcampProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@Sql({"/createSchema.sql"})
	void createAllTables(){}
}
