/*
Query the list of CITY names from STATION that do not end with vowels.
Your result cannot contain duplicates.

The STATION table is described as follows:

       STATION
 ____________________
 |ID        |NUMBER |
 |CITY      |VARCHAR|
 |STATE     |VARCHAR|
 |LAT_N     |NUMBER |
 |LONG_W    |NUMBER |
 */

SELECT DISTINCT CITY FROM STATION WHERE LOWER(SUBSTR(CITY, LENGTH(CITY), 1)) NOT IN ('a','e','i','o','u');