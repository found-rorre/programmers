-- 문제가 쉬어보여 들어갔다가 별 이상한 짓 다해본 문제

-- IN 함수와 서브 커리를 이용해야 한 문제였다.
-- IN 함수를 여러 열과 여러 개의 값을 비교할 때 사용할 수 있는데 이때 서브 커리를 활용해야한다.


SELECT
    FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM 
    REST_INFO
WHERE
    (FOOD_TYPE, FAVORITES) IN (
        SELECT FOOD_TYPE, MAX(FAVORITES)
        FROM REST_INFO 
        GROUP BY FOOD_TYPE
    )
ORDER BY
    FOOD_TYPE DESC
