CREATE TABLE customer (
    user_id VARCHAR(255) NOT NULL,
    create_datetime TIMESTAMP,
    modify_datetime TIMESTAMP,
    tel_no VARCHAR(255),
    address VARCHAR(255),
    prefecture VARCHAR(255),
    zip_code VARCHAR(255),
    user_name VARCHAR(255),
    password VARCHAR(255),
    CONSTRAINT customer_pk PRIMARY KEY(user_id)
) ENGINE = INNODB;
