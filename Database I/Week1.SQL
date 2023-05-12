-- Queries ran on W3 Schools demo DB

SELECT * FROM Orders, Customers
where Customers.CustomerID = Orders.CustomerID;

SELECT * FROM Orders OD, Customers CR
where CR.CustomerID = OD.CustomerID;

SELECT * FROM Products PR, Suppliers SR
WHERE PR.SupplierID = SR.SupplierID;

SELECT * FROM Products PR, Suppliers SR, Categories CG
WHERE PR.SupplierID = SR.SupplierID
AND PR.CategoryID = CG.CategoryID;

SELECT * FROM Customers
WHERE City = 'Berlin'
OR City = 'London';

-- When using the set method it is considered to be a an OR operator
SELECT * FROM Customers
WHERE City IN('Berlin', 'London');

SELECT * FROM Customers
WHERE City IN('Berlin', 'London', 'Paris')
ORDER BY Address;

-- Using NOT for sets and conditions
SELECT * FROM Customers
WHERE City NOT IN('Berlin', 'London', 'Paris')
ORDER BY CustomerID DESC;