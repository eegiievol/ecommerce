INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (1, '1985-01-01', 'dean@miu.edu',true,'John','Doe','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a','641-222-1111','2021-12-12 11:10:33','customer1');
INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (2, '1990-02-02', 'smith@miu.edu',true,'Smith','Clutch','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a','641-333-1111','2021-12-12 12:20:46','customer2');
INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (3, '1977-03-11', 'user1@miu.edu',false,'User1L','User1F','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a','641-444-1111','2021-12-10 04:30:44','customer3');
INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (4, '1994-04-05', 'user2@miu.edu',true,'User2L','User2F','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a','641-555-1111','2021-12-12 13:22:56','seller');
INSERT into USER (id, birth_date, email, is_enabled, lastname, name, password, phone, registered_date, username)
VALUES (5, '1999-09-09', 'admin@miu.edu',true,'admin','admin','$2a$12$jsFHTdpZAOjxbgk9hnoEeeCPMQaq3pHiOOLX.U3X5TnQde7zxIILC','999-999-9999','2020-09-09 22:21:20','admin');

INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id,image_path) VALUES (1,'2021-12-01 11:20:41', 'Christmas Socks','3.5','Clothing','active',1,'./image/img_1.png');
INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id,image_path) VALUES (2,'2021-12-11 13:25:12', 'Hat Under Armor','10.5','Clothing','active',1, './image/img_2.png');
INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id,image_path) VALUES (3,'2021-12-03 12:40:13', 'Dell Optiplex 7090','850.60','Computer','active',2, './image/img_3.png');
INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id,image_path) VALUES (4,'2021-11-22 03:20:41', 'Apple Watch Series 6','144.0','Watch','active',2, './image/img_4.png');
INSERT INTO PRODUCT(id,added_date,name,price,category,status,user_id,image_path) VALUES (5,'2021-09-12 08:33:49', 'MaCBook Pro 16-inch','1055.0','Computer','active',4, './image/img_5.png');

INSERT INTO ORDERS (id, order_date, total_price, user_id, order_status)  VALUES (1, '2021-12-12 17:15:21', '13', 1, 'Just_ordered');
INSERT INTO ORDERS (id, order_date, total_price, user_id, order_status, cancelled_date)  VALUES (2, '2021-12-13 15:30:41', '120', 1, 'Cancelled', '2021-12-13 18:45:30');
INSERT INTO ORDERS (id, order_date, total_price, user_id, order_status)  VALUES (3, '2021-12-11 09:44:44', '122.5', 2, 'Shipped');
INSERT INTO ORDERS (id, order_date, total_price, user_id, order_status)  VALUES (4, '2021-12-01 03:20:25', '950.60', 2, 'Delivered');

INSERT INTO REVIEW (id, comment, rate, status, product_id, review_date)  VALUES (1, 'it was good.', 'Good', 'new_added', 1, '2021-09-25 09:24:54');
INSERT INTO REVIEW (id, comment, rate, status, product_id, review_date)  VALUES (2, 'it was Excellent.', 'Excellent', 'approved', 2, '2021-12-11 19:45:55');
INSERT INTO REVIEW (id, comment, rate, status, product_id, review_date)  VALUES (3, 'it was not so good.', 'Neutral', 'approved', 3, '2021-12-13 17:42:41');

INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (1, 'CUSTOMER');
INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (2, 'SELLER');
INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (3, 'ADMIN');

insert into USER_ROLES(USER_ID, ROLE_ID) values (1, 1);
insert into USER_ROLES(USER_ID, ROLE_ID) values (2, 1);
insert into USER_ROLES(USER_ID, ROLE_ID) values (3, 1);
insert into USER_ROLES(USER_ID, ROLE_ID) values (4, 2);
insert into USER_ROLES(USER_ID, ROLE_ID) values (5, 2);
insert into USER_ROLES(USER_ID, ROLE_ID) values (5, 3);

INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (1, 1);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (1, 2);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (2, 4);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (4, 3);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (3, 1);
INSERT INTO ORDERS_PRODUCTS (orders_id, products_id) VALUES (3, 4);