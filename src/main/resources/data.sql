INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (1, '1985-01-01', 'dean@miu.edu',true,'John','Doe','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a','641-222-1111','2021-12-12','john');
INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (2, '1990-02-02', 'smith@miu.edu',true,'Smith','Clutch','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a','641-333-1111','2021-12-12','smith');
INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (3, '1977-03-11', 'user1@miu.edu',true,'User1L','User1F','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a','641-444-1111','2021-12-10','user1');
INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (4, '1994-04-05', 'user2@miu.edu',true,'User2L','User2F','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a','641-555-1111','2021-12-12','user2');
INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (5, '1999-09-09', 'admin@miu.edu',true,'admin','admin','$2a$12$jsFHTdpZAOjxbgk9hnoEeeCPMQaq3pHiOOLX.U3X5TnQde7zxIILC','999-999-9999','2020-09-09','admin');

INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id) VALUES (1,'2021-12-13', 'Socks','2.5','Clothing','active',1);
INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id) VALUES (2,'2021-12-13', 'Hat','10.5','Clothing','active',1);
INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id) VALUES (3,'2021-12-13', 'Dell','950.60','Computer','active',2);
INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id) VALUES (4,'2021-12-13', 'Apple Watch','120.0','Watch','active',2);
INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id) VALUES (5,'2021-12-13', 'Dell monitor','150.0','Computer','active',4);

INSERT INTO ORDERS (id, order_date, total_price, user_id, order_status)  VALUES (1, '2021-12-13', '13', 1, 'Just_ordered');
INSERT INTO ORDERS (id, order_date, total_price, user_id, order_status)  VALUES (2, '2021-12-13', '120', 1, 'Cancelled');
INSERT INTO ORDERS (id, order_date, total_price, user_id, order_status)  VALUES (3, '2021-12-13', '122.5', 2, 'Shipped');
INSERT INTO ORDERS (id, order_date, total_price, user_id, order_status)  VALUES (4, '2021-12-13', '950.60', 2, 'Delivered');

INSERT INTO REVIEW (id, comment, rate, status, product_id)  VALUES (1, 'it was good.', 'Good', 'new_added', 1);
INSERT INTO REVIEW (id, comment, rate, status, product_id)  VALUES (2, 'it was Excellent.', 'Excellent', 'approved', 2);
INSERT INTO REVIEW (id, comment, rate, status, product_id)  VALUES (3, 'it was not so good.', 'Neutral', 'approved', 3);

INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (1, 'USER');
INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (2, 'ADMIN');

insert into USER_ROLES(USER_ID, ROLE_ID) values (1, 1);
insert into USER_ROLES(USER_ID, ROLE_ID) values (2, 1);
insert into USER_ROLES(USER_ID, ROLE_ID) values (3, 1);
insert into USER_ROLES(USER_ID, ROLE_ID) values (4, 1);
insert into USER_ROLES(USER_ID, ROLE_ID) values (5, 2);

INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (1, 1);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (1, 2);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (2, 4);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (4, 3);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (3, 1);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (3, 4);