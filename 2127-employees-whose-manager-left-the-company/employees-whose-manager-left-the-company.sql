# Write your MySQL query statement below
Select employee_id from
(select * from Employees
where salary < 30000) t
where manager_id Not In (
    Select employee_id from 
    Employees
)
order by employee_id