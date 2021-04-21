SELECT max(Salary) as SecondHighestSalary
FROM Employee
WHERE Salary < (SELECT max(Salary) FROM Employee)

# 官方解法,但速度更慢
-- SELECT
--     IFNULL(
--         (
--             SELECT DISTINCT Salary
--             FROM Employee
--             ORDER BY Salary DESC
--             LIMIT 1 OFFSET 1
--         ),NULL
--     ) AS  SecondHighestSalary;