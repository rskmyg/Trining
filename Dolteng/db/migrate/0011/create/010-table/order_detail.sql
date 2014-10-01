CREATE TABLE order_detail (
    order_no INT NOT NULL,
    isbn VARCHAR(255) NOT NULL,
    create_datetime TIMESTAMP,
    modify_datetime TIMESTAMP,
    quantity INT,
    CONSTRAINT order_detail_pk PRIMARY KEY(order_no, isbn)
);
