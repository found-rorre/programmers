WITH CTE AS (
    SELECT
        APNT_NO,
        PT_NO,
        MDDR_ID AS DR_ID,
        APNT_YMD
    FROM
        APPOINTMENT
    WHERE
        MCDP_CD = 'CS' AND
        DATE_FORMAT(APNT_YMD, '%Y-%m-%d') = '2022-04-13'  AND
        APNT_CNCL_YN = 'N'
)
    
SELECT
    APNT_NO,
    PT_NAME,
    PT_NO,
    MCDP_CD,
    DR_NAME,
    APNT_YMD
FROM
    CTE
JOIN
    PATIENT USING(PT_NO)
JOIN
    DOCTOR USING(DR_ID)
ORDER BY
    APNT_YMD
    