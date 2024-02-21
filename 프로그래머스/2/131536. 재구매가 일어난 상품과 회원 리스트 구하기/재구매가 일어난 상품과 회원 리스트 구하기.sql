-- having절을 적절히 쓸줄 아는가에 대한 문제인줄 알았지만
-- group by절에 두 인수를 넣는것이 생각보다 어려웠다.
-- 정리가 완전히 되고 맞춘 문제는 아니라 이와 같은 예시 문제를 더 풀어봐야겠다.

select user_id, product_id
from ONLINE_SALE
group by user_id, product_id
having count(product_id) > 1
order by user_id, product_id desc
