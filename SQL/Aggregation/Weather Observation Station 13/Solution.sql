/*
Query the sum of Northern Latitudes (LAT_N) from STATION
having values greater than 38.7880 and less than 137.2345.
Truncate your answer to 4 decimal places.

       STATION
 ____________________
 |ID        |NUMBER |
 |CITY      |VARCHAR|
 |STATE     |VARCHAR|
 |LAT_N     |NUMBER |
 |LONG_W    |NUMBER |
 */

SELECT ROUND(SUM(LAT_N), 4) FROM STATION WHERE LAT_N > 38.788 AND LAT_N < 137.2345;