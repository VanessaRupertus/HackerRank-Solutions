/*
 Query the average population of all cities in CITY where District is California.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |
 */

SELECT AVG(POPULATION) FROM CITY WHERE DISTRICT="California";