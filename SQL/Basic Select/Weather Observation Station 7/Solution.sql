/*
Query the list of CITY names ending with vowels (a, e, i, o, u)
from STATION. Your result cannot contain duplicates.

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
WHERE CITY LIKE '%a' OR CITY LIKE '%e' OR CITY LIKE '%i' OR CITY LIKE '%o' OR CITY LIKE '%u';