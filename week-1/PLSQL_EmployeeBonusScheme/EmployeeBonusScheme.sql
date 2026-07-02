CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept VARCHAR2,
    p_bonus_percent NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary * (1 + (p_bonus_percent / 100))
    WHERE Department = p_dept;
    DBMS_OUTPUT.PUT_LINE('Applied ' || p_bonus_percent || '% bonus to employees in department: ' || p_dept);
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error updating employee bonus: ' || SQLERRM);
END;
/
