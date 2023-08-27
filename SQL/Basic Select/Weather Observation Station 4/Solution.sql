/*
Find the difference between the total number of CITY entries in the table and the
number of distinct CITY entries in the table.

The STATION table is described as follows:

       STATION
 ____________________
 |ID        |NUMBER |
 |CITY      |VARCHAR|
 |STATE     |VARCHAR|
 |LAT_N     |NUMBER |
 |LONG_W    |NUMBER |
 */

SELECT COUNT(CITY) - COUNT(DISTINCT CITY) FROM STATION;