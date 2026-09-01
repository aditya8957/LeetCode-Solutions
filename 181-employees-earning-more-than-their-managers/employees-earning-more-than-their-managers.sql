# Write your MySQL query statement below
SELECT e.name As Employee
FROM Employee e
JOIN Employee m
on e.managerId = m.id
where e.salary > m.salary