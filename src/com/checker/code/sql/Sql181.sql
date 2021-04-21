SELECT e1.Name as Employee
FROM Employee e1 JOIN  Employee e2
ON e2.ID = e1.ManagerId AND e1.Salary > e2.Salary;