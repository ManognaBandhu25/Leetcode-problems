with temp as (select id,num,
lead(num,1) over (order by id) as sn,
lead(num,2) over(order by id) as tn
from Logs)
select distinct num as ConsecutiveNums 
from temp where (num=sn) and (num=tn)