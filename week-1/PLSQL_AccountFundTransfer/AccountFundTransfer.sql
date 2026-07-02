CREATE OR REPLACE PROCEDURE TransferFunds (
    p_src_account_id INT,
    p_dest_account_id INT,
    p_amount NUMBER
) AS
    v_src_balance NUMBER;
BEGIN
    SELECT Balance INTO v_src_balance
    FROM Accounts
    WHERE AccountID = p_src_account_id;
    IF v_src_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Transfer Failed: Source Account ' || p_src_account_id || ' has insufficient balance. Current: ' || v_src_balance || ', Requested: ' || p_amount);
        RETURN;
    END IF;
    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_src_account_id;
    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_dest_account_id;
    DBMS_OUTPUT.PUT_LINE('Successfully transferred $' || p_amount || ' from Account ' || p_src_account_id || ' to Account ' || p_dest_account_id || '.');
    COMMIT;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Transfer Failed: One or both account IDs do not exist.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error performing transfer: ' || SQLERRM);
END;
/
