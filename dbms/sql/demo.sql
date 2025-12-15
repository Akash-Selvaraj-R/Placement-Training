use demo;

show tables;
create table person1
(
id int not null,
first_name varchar(30) not null,
last_name varchar(30) not null,
age int);

desc person1;

create table person2
(
id int not null,
first_name varchar(30) not null,
last_name varchar(30),
age int,
unique(id));

desc person2;

create table person3
(
id int not null,
first_name varchar(10) not null,
last_name varchar(30),
age int,
foreign key (id) references person2(id));

use demo;
show tables;
desc person2;
desc person3;