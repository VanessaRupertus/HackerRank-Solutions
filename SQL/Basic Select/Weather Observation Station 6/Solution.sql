/*
Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u)
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
WHERE CITY LIKE 'A%' OR CITY LIKE 'E%' OR CITY LIKE 'I%' OR CITY LIKE 'O%' OR CITY LIKE 'U%';