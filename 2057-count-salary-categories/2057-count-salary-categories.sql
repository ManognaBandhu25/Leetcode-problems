# Write your MySQL query statement below
select 'Low Salary' as category,
ifnull (sum(income<20000),0) as accounts_count 
from accounts
union
select 'Average Salary' as category,
ifnull (sum(income between 20000 and 50000),0) as accounts_count 
from accounts
union
select 'High Salary' as category,
ifnull (sum(income>50000),0) as accounts_count 
from accounts
