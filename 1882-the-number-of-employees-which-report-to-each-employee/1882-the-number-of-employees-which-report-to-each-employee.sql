SELECT e1.employee_id, e1.name, count(e2.reports_to) AS reports_count, 
round(avg(e2.age)) as average_age
from employees e1 join employees e2 
ON e1.employee_id = e2.reports_to
GROUP BY employee_id having count(e2.reports_to)>0
ORDER BY e1.employee_id;
