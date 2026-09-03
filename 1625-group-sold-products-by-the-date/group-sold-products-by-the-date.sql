# Write your MySQL query statement below
Select sell_date,Count(distinct product) As num_sold,
GROUP_CONCAT(DISTINCT product ORDER BY product) AS products
from Activities
GROUP BY sell_date
order by sell_date