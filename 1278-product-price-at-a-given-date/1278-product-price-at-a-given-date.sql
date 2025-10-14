# Write your MySQL query statement below
select p.product_id, COALESCE(pr.new_price,10) as price
from(select distinct product_id from products) p
left join products pr
on p.product_id=pr.product_id
and pr.change_date=(
    select max(change_date)
    from products p2
    where p2.product_id = p.product_id
    and p2.change_date<='2019-08-16'
);