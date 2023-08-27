/*
Query the total population of all cities in CITY where District is California.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |
 */

SELECT SUM(POPULATION) FROM CITY WHERE DISTRICT="California";