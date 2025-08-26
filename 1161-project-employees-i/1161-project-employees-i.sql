# Write your MySQL query statement below
select p.project_id,round(avg(experience_years),2) as Average_years 
from project p join employee e 
ON p.employee_id = e.employee_id
GROUP BY p.project_id;