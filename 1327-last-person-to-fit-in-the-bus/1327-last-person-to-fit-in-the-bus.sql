# Write your MySQL query statement below
with temp as(select person_name,weight,turn,sum(weight) over(order by turn)as total
from Queue)
select person_name from temp where total<=1000
order by total desc
limit 1;