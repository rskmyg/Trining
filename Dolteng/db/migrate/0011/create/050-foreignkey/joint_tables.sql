ALTER TABLE joint_tables ADD CONSTRAINT joint_tables_fk1 FOREIGN KEY (isbn) REFERENCES book (isbn);
ALTER TABLE joint_tables ADD CONSTRAINT joint_tables_fk2 FOREIGN KEY (category_id) REFERENCES category (category_id);
