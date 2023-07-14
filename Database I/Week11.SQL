CREATE TABLE Customer(
	CustomerID						Int IDENTITY(1, 1),
	LastName			CHAR(25)		NOT NULL,
	FirstName			CHAR(25)		NOT NULL,
	Phone				CHAR(12)		NULL,
	Email				VARCHAR(100)		NULL,
	Balance				MONEY			NOT NULL,
	CONSTRAINT			CUSTOMER_PK		PRIMARY KEY(CustomerID)
	);

	
INSERT INTO CUSTOMER (LastName, FirstName, Phone, Email, Balance) 
	VALUES('Downs', 'Marsha', '555-537-8765', 'Marsha.Downs@somewhere.com',1000);
INSERT INTO CUSTOMER (LastName, FirstName, Phone, Email, Balance) 
	VALUES('James', 'Richard & Co', '555-537-7654', 'Richard.James@somewhere.com',4000);
INSERT INTO CUSTOMER (LastName, FirstName, Phone, Email,  Balance) 
	VALUES('Frier', 'Liz', '555-537-6543', 'Liz.Frier@somewhere.com',3500);
INSERT INTO CUSTOMER (LastName, FirstName, Email,  Balance)
	VALUES('Trent', 'Miles', 'Miles.Trent@somewhere.com',10000);

/* Transaction-SQL Statement aka T-SQL */
/* Explicit-Transaction  */

/* Isolate the transaction */
SET IMPLICIT_TRANSACTIONS OFF;
BEGIN TRANSACTION

/* Declare and initialize variables  */
DECLARE @MyBalance MONEY;
DECLARE @MyWithdrawal MONEY;
SET @MyBalance = 0;
SET @MyWithdrawal = 0;

/* We get CustomerID from their bank card  */
SELECT @MyBalance = Balance
FROM Customer
WHERE Customer.CustomerID = 2;

/* We get withdrawal amount from the customer input  */
SET @MyWithdrawal = 6000;

IF @MyBalance > @MyWithdrawal
	UPDATE Customer
	SET Balance = @MyBalance - @MyWithdrawal
        WHERE Customer.CustomerID = 2;

COMMIT TRAN;                                    /* this confirms the end of the transaction */

/* ROLLBACK; */

	SELECT *
	FROM Customer;

	UPDATE Customer
	SET Balance = 4000
        WHERE Customer.CustomerID = 2;