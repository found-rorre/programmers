SELECT
    hour(DATETIME) AS HOUR,
    COUNT(DATETIME) AS COUNT
FROM
    ANIMAL_OUTS
WHERE
    hour(DATETIME) BETWEEN 09 AND 19
GROUP BY
    hour(DATETIME)
ORDER BY
    hour(DATETIME)