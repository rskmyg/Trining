ALTER TABLE orders ADD CONSTRAINT orders_fk1 FOREIGN KEY (user_id) REFERENCES customer (user_id);
