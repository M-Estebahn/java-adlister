USE adlister_db;

CREATE TABLE IF NOT EXISTS users(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(50),
    email VARCHAR(100),
    password VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS  ads(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id int UNSIGNED NOT NULL,
    title VARCHAR(100),
    description TEXT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);


INSERT INTO users(username,email,password) VALUES ('Moe','moe@moemail.com','moespassword');

