CREATE TABLE Employee (
    Emp_id INT PRIMARY KEY AUTO_INCREMENT,
    Emp_name VARCHAR(50) NOT NULL, 
    Empno VARCHAR(20) UNIQUE NOT NULL,
    Emp_no VARCHAR(15),
    Emp_dept VARCHAR(50) NOT NULL,
    Email VARCHAR(100),
    Salary DECIMAL(12, 2) DEFAULT 0.00,
    Joining_date DATE DEFAULT (CURRENT_DATE),
    Gender ENUM('Male', 'Female', 'Other'),
    Status ENUM('Active', 'Inactive', 'On Leave') DEFAULT 'Active'
);

INSERT INTO Employee (Emp_name, Empno, Emp_no, Emp_dept, Email, Salary, Joining_date, Gender, Status)
VALUES
    ('Josh', 'H101', '9876543210', 'Product Manager', 'josh@work.in', 120000.00, '2024-01-15', 'Male', 'Active'),
    ('Esther', 'H102', '8765432109', 'HR', 'esther@work.in', 95000.50, '2024-03-20', 'Female', 'Active'),
    ('Akash', 'H103', '7654321098', 'Co-HR', 'akash@work.in', 85000.00, '2024-05-10', 'Male', 'Active'),
    ('Lydia', 'H104', '7788663344', 'Domain Sector 4D', 'lydia@work.in', 110000.00, '2024-06-01', 'Female', 'Active'),
    ('Disha', 'H105', '9922773366', 'Domain Sector 3C', 'disha@work.in', 105000.00, '2024-07-12', 'Female', 'Active'),
    ('Eve', 'H106', '8822773344', 'Marketing', 'eve@work.in', 90000.00, '2024-08-05', 'Female', 'Active');

select * from Employee;