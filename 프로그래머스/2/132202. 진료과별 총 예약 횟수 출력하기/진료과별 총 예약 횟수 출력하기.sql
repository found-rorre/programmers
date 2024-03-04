 -- 기본형

SELECT
    MCDP_CD AS '진료과코드',
    COUNT(MCDP_CD) AS '5월예약건수'
FROM
    APPOINTMENT
WHERE
    APNT_YMD LIKE '2022-05%'
GROUP BY
    MCDP_CD
ORDER BY
    COUNT(MCDP_CD), MCDP_CD

-- GROUP BY 나 ORDER BY 에 별칭을 사용할 경우
-- (`) 벡틱을 사용한다.


SELECT
    MCDP_CD AS '진료과코드',
    COUNT(MCDP_CD) AS '5월예약건수'
FROM
    APPOINTMENT
WHERE
    APNT_YMD LIKE '2022-05%'
GROUP BY
    `진료과코드`
ORDER BY
    `5월예약건수`, `진료과코드`


-- 열의 번호를 사용하는 경우
-- 작성자는 편할 수 있지만 차후 유지보수를 위해서는 지양하는 방식

SELECT
    MCDP_CD AS '진료과코드',
    COUNT(MCDP_CD) AS '5월예약건수'
FROM
    APPOINTMENT
WHERE
    APNT_YMD LIKE '2022-05%'
GROUP BY
    `진료과코드`
ORDER BY
    2, 1

