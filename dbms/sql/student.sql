create database SRMcollege;
use SRMcollege;
create table student
(
St_id int,
St_name varchar(40),
Regno varchar(20),
Ph_no int,
Dept varchar(30)
);
desc student;
insert into student (St_id, St_name, Regno, Ph_no, Dept)
values
    (101, 'Alice ', 'CS001', 987654321, 'CSE'),
    (102, 'Bob', 'CS002', 876543210, 'CSE'),
    (103, 'Charlie', 'CS003', 765432109, 'GT'),
    (104, 'Brown', 'CS004', 778866334, 'AIML'),
    (105, 'Johnson', 'CS005', 992277336, 'IT'),
    (106, 'Smith', 'CS006', 882277334, 'ECE');

select * from student;

use srmCollege;

desc student;
select * from Student;
 
 -- for safer preview
commit;

-- now trying to insert the duplicaed values
insert into student (St_id, St_name, Regno, Ph_no, Dept)
values
( '107' , 'Yinlin' , 'CS1001' , '987654321' , 'CSE');

-- this one creates a new row in student tablw

alter table student add unique key(Regno);
update student set Regno = 'CS1007' where St_id = '107'; 

-- updated woth key values and now this wont cause any error while updating

delete from student where St_name = 'Yinlin';

-- trying to print the value we deleted to ensure its deleted

select Stname from student where St_id = '107';

-- causes error of : 11:59:29	select Stname from student where St_id = '107' LIMIT 0, 1000	Error Code: 1054. Unknown column 'Stname' in 'field list'	0.016 sec
-- to fix this we forget the id which we imported to call

select * from student; 

-- it prints without error
