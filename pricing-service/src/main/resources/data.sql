CREATE TABLE IF NOT EXISTS PRICE(id INT PRIMARY KEY, vehicle_id VARCHAR(255), currency VARCHAR(255), price DECIMAL);

INSERT INTO price (vehicle_id, currency, price) VALUES (1, 'USD', 100.50);
INSERT INTO price (vehicle_id, currency, price) VALUES (2, 'USD', 200.10);
INSERT INTO price (vehicle_id, currency, price) VALUES (3, 'USD', 300);
INSERT INTO price (vehicle_id, currency, price) VALUES (4, 'USD', 400.60);
INSERT INTO price (vehicle_id, currency, price) VALUES (5, 'USD', 500);
INSERT INTO price (vehicle_id, currency, price) VALUES (6, 'USD', 600.75);
INSERT INTO price (vehicle_id, currency, price) VALUES (7, 'USD', 900);
INSERT INTO price (vehicle_id, currency, price) VALUES (8, 'USD', 1000);
INSERT INTO price (vehicle_id, currency, price) VALUES (9, 'USD', 1100);
INSERT INTO price (vehicle_id, currency, price) VALUES (10, 'USD', 999.99);
