use mydb;
--There is no error in this file and it runs fine. This IDE shows syntax error
--but all tests are passing and this table gets created in database.

CREATE Table IF NOT EXISTS  user(
  id INT PRIMARY KEY AUTO_INCREMENT,
  email VARCHAR(50),
  first_name VARCHAR(50),
  middle_name VARCHAR(50),
  last_name VARCHAR(50),
  password VARCHAR(255),
  is_deleted BOOLEAN,
  is_Active BOOLEAN,
  is_Expired BOOLEAN,
  is_Locked BOOLEAN,
  invalid_attempt_count INT,
  password_update_date DATE
);



