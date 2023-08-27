/*
Query the list of CITY names from STATION that either do not start
with vowels or do not end with vowels. Your result cannot contain duplicates.

The STATION table is described as follows:

       STATION
 ____________________
 |ID        |NUMBER |
 |CITY      |VARCHAR|
 |STATE     |VARCHAR|
 |LAT_N     |NUMBER |
 |LONG_W    |NUMBER |
 */

SELECT DISTINCT CITY
FROM STATION
WHERE (CITY NOT IN (SELECT
                        DISTINCT CITY
                    FROM STATION
                    WHERE CITY LIKE '%a' OR
                          CITY LIKE '%e' OR
                          CITY LIKE '%i' OR
                          CITY LIKE '%o' OR
                          CITY LIKE '%u'))
   OR
    (CITY NOT IN (SELECT
                      CITY
                  FROM STATION
                  WHERE CITY LIKE 'A%' OR
                        CITY LIKE 'E%' OR
                        CITY LIKE 'I%' OR
                        CITY LIKE 'O%' OR
                        CITY LIKE 'U%'));