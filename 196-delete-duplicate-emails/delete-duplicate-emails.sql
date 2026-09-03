# Write your MySQL query statement below
Delete From Person
where id Not IN( 
Select id from
        (
        SELECT MIN(id) As id
        FROM Person
        GROUP BY email
        ) As temp
)