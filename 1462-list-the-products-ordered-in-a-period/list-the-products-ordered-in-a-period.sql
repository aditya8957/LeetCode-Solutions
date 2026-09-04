# Write your MySQL query statement below
Select p.product_name, Sum(o.unit) As unit from Products as p
Inner Join orders as o
on p.product_id = o.product_id
where YEAR(o.order_date) = "2020" AND MONTH(o.order_date) = "2"
GROUP BY p.product_id
Having Sum(unit) >= 100;