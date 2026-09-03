# Write your MySQL query statement below
Select user_id, Concat(Upper(Left(name,1)), Lower(Substring(name,2))) As name
from Users order by user_id