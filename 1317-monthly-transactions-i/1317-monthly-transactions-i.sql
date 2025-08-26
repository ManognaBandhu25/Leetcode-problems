select 
  DATE_FORMAT(trans_date, '%Y-%m') AS month,
  country,
  count(*) AS trans_count,
  sum(state = 'approved') AS approved_count,
  sum(amount) AS trans_total_amount,
  sum(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_total_amount
from Transactions
group by month, country;
