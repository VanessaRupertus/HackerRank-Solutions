/*
A median is defined as a number separating the higher half of a
data set from the lower half. Query the median of the Northern
Latitudes (LAT_N) from STATION and round your answer to 4 decimal places.

       STATION
 ____________________
 |ID        |NUMBER |
 |CITY      |VARCHAR|
 |STATE     |VARCHAR|
 |LAT_N     |NUMBER |
 |LONG_W    |NUMBER |
 */

SELECT ROUND(LAT_N, 4) FROM
    (SELECT LAT_N, ROW_NUMBER() OVER (ORDER BY LAT_N) as ROWNU
     FROM STATION) AS X
WHERE ROWNU = (SELECT ROUND((COUNT(LAT_N)+1)/2,0) FROM STATION);