# Write your MySQL query statement below
SELECT e.name AS Employee FROM employee e JOIN employee b ON e.managerId = b.id WHERE e.salary > b.salary;

