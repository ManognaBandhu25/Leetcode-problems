select r.contest_id,
ROUND(COUNT(distinct r.user_id) * 100.0 / (select count(*) from Users), 2) AS percentage
from Register r
group by r.contest_id
order by percentage desc,r.contest_id;