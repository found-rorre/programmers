/*
비트 연산자 사용하는 SQL문

비트 연선자에 대해 잘 몰라 공부하고 문제를 풀었다.
비트 연산자로 하는 기본 문제일텐데 모르니깐 손도 될수 없었다.

진법문제인가하고 CONV함수와 LENGTH함수를 찾아보고 정리해봣는데

일단 해설을 보고 머리에 정리하는게 좋을 것 같아 정답공유를 보고 풀었다.
*/


SELECT
    ID,
    EMAIL,
    FIRST_NAME,
    LAST_NAME
FROM
    DEVELOPERS 
WHERE
    SKILL_CODE & (
        SELECT
            SUM(CODE)
        FROM
            SKILLCODES
        WHERE
            NAME IN ('C#', 'Python')
    )
ORDER BY
    ID
