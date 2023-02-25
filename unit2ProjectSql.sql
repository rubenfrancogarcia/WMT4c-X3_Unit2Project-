CREATE TABLE customer_table ( customer_id SERIAL PRIMARY KEY , first_name VARCHAR, last_name VARCHAR, email_address VARCHAR, phone_number VARCHAR);
CREATE TABLE products_table (product_id SERIAL PRIMARY KEY , brand VARCHAR, model VARCHAR, description VARCHAR, price VARCHAR, quanity NUMERIC(8, 2)); 
CREATE TABLE transaction_table (transaction_id SERIAL PRIMARY KEY , customer_id INTEGER  REFERENCES customer_table, product_id INTEGER  REFERENCES products_table, transaction_date TIMESTAMP DEFAULT now());
INSERT INTO customer_table (first_name,last_name,email_address,phone_number) VALUES (
  'ruben',
  'garcia',
  'rubeng@gmail.com',
  '888-954-1234'
); 

INSERT INTO customer_table (first_name,last_name,email_address,phone_number) VALUES (
  'jake',
  'from statefarm',
  'jake@statefarm.com',
  '209399220'
); 

INSERT INTO products_table (brand,model,description,price,quanity) VALUES (
  'apple',
  'watch',
  'a watch ',
  '299.99',
  '3'
); 

INSERT INTO products_table (brand,model,description,price,quanity) VALUES (
  'samsung',
  'phone',
  '',
  '199.99',
  '10'
); 
INSERT INTO transaction_table (customer_id,product_id) VALUES (
  '1',
  '1'
); 
INSERT INTO transaction_table (customer_id,product_id) VALUES (
  '2',
  '1'
); 

select * from transaction_table; 
select * from products_table; 
select * from customer_table;
update products_table set quanity = quanity -1  where products_table.products_id = 1; 