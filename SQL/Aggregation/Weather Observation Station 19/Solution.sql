/*
Consider P1(a, b) and P2(c, d) to be two points on a 2D plane where (a, b)
are the respective minimum and maximum values of Northern Latitude (LAT_N)
and (c, d) are the respective minimum and maximum values of Western Longitude (LONG_W) in STATION.

Query the Euclidean Distance between points P1 and P2 and format your answer to display 4 decimal digits.

       STATION
 ____________________
 |ID        |NUMBER |
 |CITY      |VARCHAR|
 |STATE     |VARCHAR|
 |LAT_N     |NUMBER |
 |LONG_W    |NUMBER |
 */

SELECT ROUND(SQRT((P.A-P.B) * (P.A-P.B) + (P.C-P.D) * (P.C-P.D)), 4)
FROM (SELECT MIN(LAT_N) AS A, MAX(LAT_N) AS B , MIN(LONG_W) AS C , MAX(LONG_W) AS D FROM STATION) AS P;