-- assignment 1 : create a db named sales and production

create database sales;
create database production;

-- using sales databse for first initialization

use sales;

-- creating tables for sales 

create table customers (
customer_id int primary key,
first_name varchar(30),
last_name varchar (30),
phone int,
email varchar(40),
street varchar(100),
city varchar(20),
state varchar(30),
zip_code varchar(10));

create table stores (
    store_id int primary key,
    store_name varchar(100),
    phone varchar(20),
    email varchar(100),
    street varchar(100),
    city varchar(50),
    state varchar(50),
    zip_code varchar(10)
);

create table staffs (
    staff_id int primary key,
    first_name varchar(50),
    last_name varchar(50),
    email varchar(100),
    phone varchar(20),
    active_id boolean,
    store_id int,
    manager_id int,
    foreign key (store_id) references stores(store_id),
    foreign key (manager_id) references staffs(staff_id)
);

create table orders (
    order_id int primary key,
    customer_id int,
    order_status varchar(20),
    order_date date,
    required_date date,
    shipped_date date,
    store_id int,
    staff_id int,
	foreign key (customer_id) references customers(customer_id),
    foreign key (store_id) references stores(store_id),
    foreign key (staff_id) references staffs(staff_id)
);

create table order_items (
    order_id int,
    item_id int,
    product_id int,
    quantity INT,
    list_price decimal(10,2),
    discount decimal(4,2),
    primary key (order_id, item_id),
    foreign key (order_id) references orders(order_id)
);

--  using production databse for second initialization

use production;

-- creating tables in production

create table categories (
    category_id int primary key,
    category_name varchar(50)
);

create table brands (
    brand_id int primary key,
    brand_name varchar(50)
);

create table products (
    product_id int primary key,
    product_name varchar(100),
    brand_id int,
    category_id int,
    model_year int,
    list_price DECIMAL(10,2),
    foreign key (brand_id) references brands(brand_id),
    foreign key (category_id) references categories(category_id)
);

create table stocks (
    store_id int,
    product_id int,
    quantity int,
    primary key (store_id, product_id)
);
-- time to insert the values for each table in sales!

use sales;

-- inserting values into...

insert into customers values
(1, 'Rahul', 'Sharma', '987654321', 'rahul@gmail.com', 'MG Road', 'Bangalore', 'KA', '560001'),
(2, 'Anita', 'Verma', '912345678', 'anita@gmail.com', 'Park Street', 'Kolkata', 'WB', '700016'),
(3, 'Suresh', 'Patel', '998877665', 'suresh@gmail.com', 'CG Road', 'Ahmedabad', 'GJ', '380009'),
(4, 'Pooja', 'Nair', '987650123', 'pooja@gmail.com', 'Marine Drive', 'Mumbai', 'MH', '400001'),
(5, 'Arjun', 'Reddy', '901234567', 'arjun@gmail.com', 'Banjara Hills', 'Hyderabad', 'TS', '500034'),
(6, 'Kavya', 'Iyer', '909090909', 'kavya@gmail.com', 'Anna Nagar', 'Chennai', 'TN', '600040');

insert into stores values
(1, 'Central Store', '080123456', 'central@store.com', 'Brigade Road', 'Bangalore', 'KA', '560025'),
(2, 'City Store', '033234567', 'city@store.com', 'Salt Lake', 'Kolkata', 'WB', '700091'),
(3, 'Metro Store', '022345678', 'metro@store.com', 'Andheri', 'Mumbai', 'MH', '400053'),
(4, 'Tech Store', '040456789', 'tech@store.com', 'Hitech City', 'Hyderabad', 'TS', '500081'),
(5, 'Smart Store', '044567890', 'smart@store.com', 'T Nagar', 'Chennai', 'TN', '600017'),
(6, 'Digital Store', '079678901', 'digital@store.com', 'Navrangpura', 'Ahmedabad', 'GJ', '380009');

insert into staffs values
(1, 'Amit', 'Kumar', 'amit@store.com', '900001111', TRUE, 1, NULL),
(2, 'Neha', 'Singh', 'neha@store.com', '900002222', TRUE, 1, 1),
(3, 'Ravi', 'Das', 'ravi@store.com', '900003333', TRUE, 2, NULL),
(4, 'Sneha', 'Mehta', 'sneha@store.com', '900004444', TRUE, 3, 3),
(5, 'Vikas', 'Rao', 'vikas@store.com', '900005555', TRUE, 4, NULL),
(6, 'Anjali', 'Menon', 'anjali@store.com', '900006666', TRUE, 5, 5);

insert into orders values
(101, 1, 'Shipped', '2024-01-10', '2024-01-15', '2024-01-12', 1, 1),
(102, 2, 'Pending', '2024-01-11', '2024-01-16', NULL, 2, 3),
(103, 3, 'Delivered', '2024-01-12', '2024-01-17', '2024-01-16', 3, 4),
(104, 4, 'Shipped', '2024-01-13', '2024-01-18', '2024-01-15', 4, 5),
(105, 5, 'Pending', '2024-01-14', '2024-01-19', NULL, 5, 6),
(106, 6, 'Delivered', '2024-01-15', '2024-01-20', '2024-01-18', 6, 2);

insert into order_items values
(101, 1, 1001, 2, 45000.00, 0.10),
(101, 2, 1002, 1, 55000.00, 0.05),
(102, 1, 1003, 1, 30000.00, 0.00),
(103, 1, 1004, 3, 1500.00, 0.05),
(104, 1, 1005, 1, 65000.00, 0.08),
(105, 1, 1006, 2, 2500.00, 0.02);

-- time to insert the values for each table in production!

use production;

-- inserting values into...

insert into categories values
(1, 'Electronics'),
(2, 'Accessories'),
(3, 'Computers'),
(4, 'Mobiles'),
(5, 'Audio'),
(6, 'Wearables');

insert into brands values
(1, 'Samsung'),
(2, 'Apple'),
(3, 'Dell'),
(4, 'HP'),
(5, 'Sony'),
(6, 'Boat');

insert into products values
(1001, 'Samsung Galaxy S23', 1, 4, 2024, 45000.00),
(1002, 'Apple iPhone 14', 2, 4, 2023, 55000.00),
(1003, 'Dell Wireless Mouse', 3, 2, 2024, 30000.00),
(1004, 'Boat Earbuds', 6, 5, 2024, 1500.00),
(1005, 'Sony Headphones', 5, 5, 2023, 65000.00),
(1006, 'HP Laptop Bag', 4, 2, 2024, 2500.00);

insert into stocks values
(1, 1001, 50),
(1, 1002, 30),
(2, 1003, 100),
(3, 1004, 200),
(4, 1005, 40),
(5, 1006, 150);

-- to access a particular database
use sales;

-- to display all tables in particular database
show tables;

-- to display all content in table " CUSTOMERS " 
select * from customers;

-- to display certain content in new column
select first_name, last_name from customers as Cname;

-- to display address nodes as one single column
select street,city,state from customers as Address;

-- to display all id of customers from table
select customer_id from customers;

-- to diaplay all customer first name starts with a
select * from customers where first_name like 'a%';

-- to display all customer first name ends with a
select * from customers where first_name like '%a';

-- to display all content in the table " ORDER_ITEMS "
select * from order_items;

-- to display order item table primary keys
select order_id, item_id from order_items as primary_keys;

-- to display the price list between the values from 1500 to 45000
select * from order_items where list_price between 1500 and 45000;

-- to display the price list which is not in values of 1500 to 45000
select * from order_items where list_price not between 1500 and 45000;




















