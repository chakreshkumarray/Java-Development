create database loginregis;
use loginregis;
CREATE TABLE users(
id INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(100) NOT NULL,
email varchar(100) NOT NUll,
password varchar(100) NOT NULL
);
INSERT INTO users (username,email,password)
VALUES ('Chakresh','kumar789@gmail.com','Chak1213'),
	('Ambreesh','ambreesh123@gmail.com','Ambr@1233'),
    ('Shivam','Shivam222@gmail.com','Shiv@1122'),
    ('Suraj','Suraj122@gmail.com','Sura@12333');
    
SELECT *from users;
