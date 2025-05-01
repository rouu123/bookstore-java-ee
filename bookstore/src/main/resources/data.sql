CREATE TABLE IF NOT EXISTS book (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    price DECIMAL
);


INSERT INTO BOOK (id, title, author, price) VALUES (1, 'Clean Code', 'Robert C. Martin', 35.00);
INSERT INTO BOOK (id, title, author, price) VALUES (2, 'Spring in Action', 'Craig Walls', 45.00);
INSERT INTO BOOK (id, title, author, price) VALUES (3, 'Effective Java', 'Joshua Bloch', 50.00);
