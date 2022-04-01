USE mydb;

CREATE TABLE IF NOT EXISTS product(
  id INT PRIMARY KEY AUTO_INCREMENT,
  seller_user_id INT,
  category_id INT,
  name  VARCHAR(125),
  description  VARCHAR(600),
  brand  VARCHAR(100),
  is_cancellable  BOOLEAN,
  is_returnable  BOOLEAN,
  is_active  BOOLEAN,
  is_deleted  BOOLEAN
--FORIEGN KEY (seller_user_id) REFERENCES tablename(id),
--FORIEGN KEY (category_id) REFERENCES tablename(id),
);