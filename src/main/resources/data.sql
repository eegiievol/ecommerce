INSERT INTO BUYER(id,first_name,last_name,address) VALUES (1, 'Munkh', 'Enkh', 'Address1');
INSERT INTO BUYER(id,first_name,last_name,address) VALUES (2, 'Buyer2', 'Buyer2', 'Address2');

INSERT INTO SELLER(id,first_name,last_name,shop_name) VALUES (1, 'Seller1', 'Seller1', 'Shop1');
INSERT INTO SELLER(id,first_name,last_name,shop_name) VALUES (2, 'Seller2', 'Seller2', 'Shop2');

INSERT INTO PRODUCT(id,added_date,name,price,category,status,seller_id) VALUES (1,'2021-12-13', 'Socks','2.5','Clothing','active',1);
INSERT INTO PRODUCT(id,added_date,name,price,category,status,seller_id) VALUES (2,'2021-12-13', 'Hat','10.5','Clothing','active',1);
INSERT INTO PRODUCT(id,added_date,name,price,category,status,seller_id) VALUES (3,'2021-12-13', 'Dell','950.60','Computer','active',2);
INSERT INTO PRODUCT(id,added_date,name,price,category,status,seller_id) VALUES (4,'2021-12-13', 'Apple Watch','120.0','Watch','active',2);

INSERT INTO ORDERS (id, order_date, total_price, buyer_id)  VALUES (1, '2021-12-13', '13', 1);
INSERT INTO ORDERS (id, order_date, total_price, buyer_id)  VALUES (2, '2021-12-13', '120', 1);
INSERT INTO ORDERS (id, order_date, total_price, buyer_id)  VALUES (3, '2021-12-13', '122.5', 2);
INSERT INTO ORDERS (id, order_date, total_price, buyer_id)  VALUES (4, '2021-12-13', '950.60', 2);

INSERT INTO REVIEW (id, comment, rate, status, product_id)  VALUES (1, 'it was good.', 'Good', 'new_added', 1);
INSERT INTO REVIEW (id, comment, rate, status, product_id)  VALUES (2, 'it was Excellent.', 'Excellent', 'approved', 2);
INSERT INTO REVIEW (id, comment, rate, status, product_id)  VALUES (3, 'it was not so good.', 'Neutral', 'approved', 3);