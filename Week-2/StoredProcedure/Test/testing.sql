SET SERVEROUTPUT ON;

BEGIN
    ProcessMonthlyInterest;
END;
/

BEGIN
    UpdateEmployeeBonus('IT',10);
END;
/

BEGIN
    TransferFunds(101,102,2000);
END;
/