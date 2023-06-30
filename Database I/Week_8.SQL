BEGIN TRAN;                        //to begin the transaction

SELECT Salary FOR UPDATE            //FOR UPDATE will lock the Employee.Salary field
FROM Employee
WHERE EmployeeNumber = 101;

IF Salary > 10000                  //Conditional operator 
ROLLBACK                            //Undo for SQL Transactions
ELSE UPDATE Employee SET Salary TO 100000
    WHERE EmployeeNumber = 101;

COMMIT TRAN;                        //Write to DISK(DB)
