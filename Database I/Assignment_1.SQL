-- Q1
SELECT a.FirstName AS emp_firstnmae,
a.LastName AS emp_lastname,
b.FirstName AS sup_firstname,
b.LastName AS sup_lastname
FROM employee a, employee b
WHERE a.Supervisor = b.EmployeeNumber;

--Q2
SELECT emp.FirstName, emp.LastName, emp.Position, SUM(asmt.HoursWorked) AS Total_Hrs
FROM employee AS emp, assignment AS asmt
WHERE Position LIKE 'OPS%'
GROUP BY FirstName, LastName, Position;

-- Q3
SELECT dept.DepartmentName, dept.DepartmentPhone
FROM department AS dept, project AS proj
WHERE EXISTS (SELECT StartDate FROM project 
WHERE proj.StartDate BETWEEN '20190501' AND '20190530'
OR proj.EndDate BETWEEN '20190501' AND '20190530')
AND dept.DepartmentName = proj.Department;

--Q4
SELECT * FROM project
where department IN 
	(SELECT ALL department FROM project
	GROUP BY department, maxhours
	HAVING COUNT(*) > 1)
ORDER BY department DESC;

--Q4 (Correct)
SELECT DISTINCT Department, maxhours
FROM project p1
WHERE MaxHours = ALL(
	SELECT MaxHours
	FROM project p2
	WHERE p1.Department = p2.Department)


--Q5
SELECT firstname, lastname
FROM employee AS e, assignment AS a, project AS p
WHERE e.employeenumber = a.employeenumber
AND a.projectid = p.projectid
AND ( p.startdate <= '20190705'
	AND p.enddate <= '20190705')
INTERSECT
SELECT firstname, lastname
FROM employee AS e, assignment AS a, project AS p
WHERE e.employeenumber = a.employeenumber
AND a.projectid = p.projectid
AND ( p.startdate >= '20190705'
	AND p.enddate >= '20190705');