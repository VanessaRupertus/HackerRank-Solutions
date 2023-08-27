/*
Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically
and displayed underneath its corresponding Occupation. The output column headers
should be Doctor, Professor, Singer, and Actor, respectively.

Note: Print NULL when there are no more names corresponding to an occupation.

    OCCUPATIONS
|NAME       |String|
|OCCUPATION |String|
 */

SET @d = 0, @p = 0, @s = 0, @a = 0;
SELECT MIN(Doctor), MIN(Professor), MIN(Singer), MIN(Actor)
FROM
    (
        SELECT
            CASE WHEN OCCUPATION = 'Doctor' THEN NAME END AS Doctor,
            CASE WHEN OCCUPATION = 'Professor' THEN NAME END AS Professor,
            CASE WHEN OCCUPATION = 'Singer' THEN NAME END AS Singer,
            CASE WHEN OCCUPATION = 'Actor' THEN NAME END AS Actor,
            CASE
                WHEN OCCUPATION = 'Doctor' THEN (@d := @d + 1)
                WHEN OCCUPATION = 'Professor' THEN (@p := @p + 1)
                WHEN OCCUPATION = 'Singer' THEN (@s := @s + 1)
                WHEN OCCUPATION = 'Actor' THEN (@a := @a + 1)
                END AS ROW_NUM
        FROM OCCUPATIONS
        ORDER BY NAME
    ) AS TEMP
GROUP BY ROW_NUM;