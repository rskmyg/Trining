CREATE TABLE category (
    category_id INT NOT NULL,
    create_datetime TIMESTAMP,
    modify_datetime TIMESTAMP,
    category_name VARCHAR(255),
    CONSTRAINT category_pk PRIMARY KEY(category_id)
) ENGINE = INNODB;
