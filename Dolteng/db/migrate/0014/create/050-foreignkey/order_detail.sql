ALTER TABLE order_detail ADD CONSTRAINT order_detail_fk1 FOREIGN KEY (order_no) REFERENCES orders (order_no);
ALTER TABLE order_detail ADD CONSTRAINT order_detail_fk2 FOREIGN KEY (isbn) REFERENCES book (isbn);
