# Write your MySQL query statement below
Select MAX(salary) As SecondHighestSalary
from(
Select salary,
    Dense_Rank() Over(order by salary desc) As rnk
    from Employee
)As temp where rnk = 2;