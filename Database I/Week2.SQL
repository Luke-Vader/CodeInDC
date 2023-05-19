-- Find the names and the projects names for the employees

select employee.FirstName, employee.LastName, p.ProjectName
from employee
inner join assignment a on a.EmployeeNumber = EMPLOYEE.EmployeeNumber
inner join project p on p.ProjectID = a.ProjectID;


-- This also works the same way and is much easier to read
select FirstName, LastName, ProjectName
from Employee e, Project p, assignment a
where e.EmployeeNumber = a.EmployeeNumber
and a.ProjectID = p.ProjectID;

-- Give me a list of employees working in the finance or Accounting department and has a Supervisor
select * from EMPLOYEE
where Department IN('Finance', 'Accounting')
and Supervisor is not Null;

-- Give me a list of employees who work in the finance, accounting and legal department
select * from employee
where Department in ('Finance', 'Accounting', 'Legal');

-- List of employees who do not have a Supervisor
select * from employee 
where supervisor is null;

-- list of employees assigned to a project (use sub-query)
select * from employee
where EmployeeNumber in (select EmployeeNumber from ASSIGNMENT);

-- employee with max hours worked 
select EMPLOYEE.FirstName as FirstName, max(project.MaxHours) as MaxHours 
from employee, project, assignment
where employee.EmployeeNumber = ASSIGNMENT.EmployeeNumber
and ASSIGNMENT.ProjectID = PROJECT.ProjectID
group by FirstName
order by MaxHours desc;


