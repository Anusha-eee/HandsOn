DECLARE
    CURSOR c_customers IS
        SELECT CustomerID, Name, Balance, IsVIP
        FROM Customers;
BEGIN
    FOR r_cust IN c_customers LOOP
        IF r_cust.Balance > 10000.00 THEN
            UPDATE Customers
            SET IsVIP = 'T'
            WHERE CustomerID = r_cust.CustomerID;
            DBMS_OUTPUT.PUT_LINE('Promoted Customer: ' || r_cust.Name || ' (ID: ' || r_cust.CustomerID || ') to VIP status.');
        END IF;
    END LOOP;
    COMMIT;
END;
/
