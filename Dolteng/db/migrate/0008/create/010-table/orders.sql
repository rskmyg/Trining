CREATE TABLE orders (
    order_no BIGINT NOT NULL,
    create_datetime TIMESTAMP,
    modify_datetime TIMESTAMP,
    address VARCHAR(255),
    prefecture VARCHAR(255),
    zip_code VARCHAR(255),
    user_id VARCHAR(255),
    order_date TIMESTAMP,
    CONSTRAINT orders_pk PRIMARY KEY(order_no)
);
