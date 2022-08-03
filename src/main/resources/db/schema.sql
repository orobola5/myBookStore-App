CREATE TABLE BOOKS (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       name VARCHAR(255) NOT NULL,
                       price NUMERIC NOT NULL,
                       authors VARCHAR(255) NOT NULL,
                       isbn VARCHAR(255) NOT NULL,
                       publisher VARCHAR(255) NOT NULL,
                       published_on DATE NOT NULL,
                       PRIMARY KEY (id)
);