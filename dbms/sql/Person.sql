create database Person;
use Person;
CREATE TABLE Customer (
    cust_id          INT              PRIMARY KEY,
    cust_name        VARCHAR(50)      NOT NULL,
    cust_address     VARCHAR(100)     NOT NULL,
    cust_aadhaar_number VARCHAR(12)   UNIQUE NOT NULL,
    cust_pan_number  VARCHAR(10)      UNIQUE NOT NULL
);
INSERT INTO Customer (cust_id, cust_name, cust_address, cust_aadhaar_number, cust_pan_number) 
VALUES 
(100001, 'Sunil Kumar',   'Noida',          '372464389211', 'ADSFS3456K'),
(100002, 'Ankit Gupta',   'Gr Noida',       '442289458453', 'CGHAD7583L');
SELECT * FROM Customer;

CREATE TABLE Order_Table (
    cust_id          INT              NOT NULL,
    order_month_year VARCHAR(20)      NOT NULL,
    order_amount     DECIMAL(10,2)    NOT NULL,
    PRIMARY KEY (cust_id, order_month_year),
    FOREIGN KEY (cust_id) REFERENCES Customer(cust_id)
        ON DELETE CASCADE
);

DESC Order_Table;
INSERT INTO Order_Table (cust_id, order_month_year, order_amount) 
VALUES 
(100001, '2019 - Jan', 1000.00),
(100002, '2019 - Jan', 1200.00);

SELECT * FROM Order_Table;