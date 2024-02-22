-- 이번 문제는 온전히 내가 풀지 못했다.


-- BTWEEN 함수는 잘 사용했는데 CASE 문을 사용하지 못했다..
-- 자주 쓰지는 않았지만 알고는 있었는데 실질적으로 써본적이 없어서 활용하지 못한것 같다.
-- 다른 사람의 풀이를 보면서 바인딩 변수에 대해서 알게 되었는데 이 부분에 대해서는 좀 더 찾아보고 정리 해봐야겠다.




SELECT 
    CAR_ID,
    CASE  
        WHEN CAR_ID IN (
            SELECT CAR_ID
            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
            WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE
        ) THEN '대여중'
        ELSE '대여 가능'
    END AS AVAILABILITY
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY 
    CAR_ID
ORDER BY 
    CAR_ID DESC
