CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Balance DECIMAL(15, 2),
    IsVIP CHAR(1) DEFAULT 'F'
);
CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    LoanAmount DECIMAL(15, 2),
    InterestRate DECIMAL(5, 2),
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerID INT,
    AccountType VARCHAR(50),
    Balance DECIMAL(15, 2),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(100),
    Salary DECIMAL(15, 2),
    Department VARCHAR(50),
    PerformanceScore INT
);
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (1, 'Alice Smith', 65, 5000.00, 'F');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (2, 'Bob Jones', 45, 12000.00, 'F');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (3, 'Charlie Brown', 62, 15000.00, 'F');
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, DueDate) VALUES (101, 1, 50000.00, 7.50, SYSDATE + 15);
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, DueDate) VALUES (102, 2, 20000.00, 6.00, SYSDATE + 45);
INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, DueDate) VALUES (103, 3, 35000.00, 8.00, SYSDATE + 10);
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance) VALUES (1001, 1, 'Savings', 5000.00);
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance) VALUES (1002, 2, 'Savings', 12000.00);
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance) VALUES (1003, 3, 'Checking', 15000.00);
INSERT INTO Employees (EmployeeID, Name, Salary, Department, PerformanceScore) VALUES (501, 'John Doe', 60000.00, 'Sales', 4);
INSERT INTO Employees (EmployeeID, Name, Salary, Department, PerformanceScore) VALUES (502, 'Jane Doe', 75000.00, 'Sales', 5);
INSERT INTO Employees (EmployeeID, Name, Salary, Department, PerformanceScore) VALUES (503, 'Jim Green', 50000.00, 'IT', 3);
COMMIT;
