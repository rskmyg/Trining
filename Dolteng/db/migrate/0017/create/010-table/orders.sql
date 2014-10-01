CREATE TABLE orders (
    order_no INT NOT NULL AUTO_INCREMENT,
    create_datetime TIMESTAMP,
    modify_datetime TIMESTAMP,
    address VARCHAR(255),
    prefecture VARCHAR(255),
    zip_code VARCHAR(255),
    user_id VARCHAR(255),
    order_date TIMESTAMP,
    CONSTRAINT orders_pk PRIMARY KEY(order_no)
) ENGINE = INNODB;
