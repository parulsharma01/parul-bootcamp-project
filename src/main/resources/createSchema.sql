USE mydb;

CREATE TABLE IF NOT EXISTS address(
  id INT PRIMARY KEY AUTO_INCREMENT,
  user_id INT,
  city  VARCHAR(100),
  state  VARCHAR(100),
  country  VARCHAR(100),
  address_line  VARCHAR(400),
  zip_code  VARCHAR(50),
  label  VARCHAR(50)

--FORIEGN KEY (user_id) REFERENCES user(id),
--FORIEGN KEY (category_id) REFERENCES tablename(id),
);