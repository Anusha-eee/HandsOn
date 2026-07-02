DECLARE
    CURSOR c_senior_loans IS
        SELECT l.LoanID, l.InterestRate, c.Name, c.Age
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE c.Age > 60;
BEGIN
    FOR r_loan IN c_senior_loans LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1.0
        WHERE LoanID = r_loan.LoanID;
        DBMS_OUTPUT.PUT_LINE('Applied 1% discount to Loan ID: ' || r_loan.LoanID || ' for customer ' || r_loan.Name || ' (Age: ' || r_loan.Age || '). New Rate: ' || (r_loan.InterestRate - 1.0) || '%');
    END LOOP;
    COMMIT;
END;
/
