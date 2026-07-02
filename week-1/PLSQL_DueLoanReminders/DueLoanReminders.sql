DECLARE
    CURSOR c_due_loans IS
        SELECT l.LoanID, l.DueDate, c.Name
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR r_due IN c_due_loans LOOP
        DBMS_OUTPUT.PUT_LINE('REMINDER: Loan ID ' || r_due.LoanID || ' for customer ' || r_due.Name || ' is due on ' || TO_CHAR(r_due.DueDate, 'YYYY-MM-DD') || '. Please arrange payment.');
    END LOOP;
END;
/
