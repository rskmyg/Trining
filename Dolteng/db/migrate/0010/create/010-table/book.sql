CREATE TABLE book (
    isbn VARCHAR(255) NOT NULL,
    create_datetime TIMESTAMP,
    modify_datetime TIMESTAMP,
    category_id INT,
    release_date DATE,
    price INT,
    publisher_name VARCHAR(255),
    author_name VARCHAR(255),
    book_name VARCHAR(255),
    CONSTRAINT book_pk PRIMARY KEY(isbn)
);
