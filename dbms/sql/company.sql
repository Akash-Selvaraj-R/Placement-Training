CREATE TABLE company (
    Emp_name VARCHAR(50), 
    Emp_id VARCHAR(20),
    Emp_no VARCHAR(15),
    Emp_dept VARCHAR(50),
    Email VARCHAR(100),
    Salary DECIMAL(12, 2),
    Joining_date DATE,
    Gender BOOLEAN,
    Is_Active BOOLEAN
    );

INSERT INTO company 
(Emp_name, Emp_id, Emp_no, Emp_dept, Email, Salary, Joining_date, Gender, Is_Active)
VALUES
    ('Josh', 'H101', '9876543210', 'Product Manager', 'josh.kumar@work.in', 120000.00, '2024-01-15', TRUE, TRUE),
    
    ('Esther', 'H102', '8765432109', 'Human Resources', 'esther.w@work.in', 95000.50, '2024-03-20', FALSE, TRUE),
    
    ('Akash', 'H103', '7654321098', 'HR Assistant', 'akash.singh@work.in', 75000.00, '2024-05-10', TRUE, TRUE),
    
    ('Lydia', 'H104', '7788663344', 'Domain Sector 4D Lead', 'lydia.thomas@work.in', 110000.00, '2024-06-01', FALSE, TRUE),
    
    ('Disha', 'H105', '9922773366', 'Domain Sector 3C Analyst', 'disha.patel@work.in', 105000.00, '2024-07-12', FALSE, TRUE),
    
    ('Eve', 'H106', '8822773344', 'Marketing Coordinator', 'eve.johnson@work.in', 90000.00, '2024-08-05', FALSE, TRUE),
    
    ('Raj', 'H107', '9123456789', 'Finance Manager', 'raj.mehta@work.in', 130000.00, '2025-02-01', TRUE, FALSE),
    
    ('Priya', 'H108', '8234567890', 'IT Support', 'priya.sharma@work.in', 80000.00, '2025-04-15', FALSE, TRUE),
    
    ('Alex', 'H109', '7345678901', 'Research Coordinator', 'alex.rivera@work.in', 85000.00, '2025-09-20', NULL, TRUE),
    
    ('Vikram', 'H110', '6456789012', 'Operations Head', 'vikram.reddy@work.in', 140000.00, '2025-11-01', TRUE, TRUE);

-- just inserting the rows without providing any Contact value;

use srmcollege;
INSERT INTO company 
(Emp_name, Emp_id, Emp_dept, Email, Salary, Joining_date, Gender, Is_Active)
VALUES
    ('Abhi', 'H111', 'Project Lead Manager', 'abhi.yadav@work.in', 74000.00, '2023-04-12', TRUE, TRUE);
    
select * from company;

-- ensuring the updation provides no erros while inserting to avoid external updates

set sql_safe_updates = 0;

-- setting more and more table values to get updated by user while providing as input
update company set Emp_no = '8855226655' where Emp_id = 'H111';
update company set Gender = 1 where Emp_id = 'H109';
update company set Salary = 80000.00 where Emp_id = 'H103';

