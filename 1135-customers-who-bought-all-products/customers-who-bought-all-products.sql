# Write your MySQL query statement below
select customer_id from customer
group by customer_id
Having count(Distinct product_key) = (Select Count(*) from product)


