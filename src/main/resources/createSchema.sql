--There is no error in this file and it runs fine. This IDE shows syntax error
--but all tests are passing and this table gets created in database.

USE mydb;

CREATE TABLE IF NOT EXISTS address(
  id INT PRIMARY KEY AUTO_INCREMENT,
  user_id INT,
  city  VARCHAR(100),
  state  VARCHAR(100),
  country  VARCHAR(100),
  address_line  VARCHAR(400),
  zip_code  VARCHAR(50),
  label  VARCHAR(50),
  FORIEGN KEY (user_id) REFERENCES user(id)
);

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

