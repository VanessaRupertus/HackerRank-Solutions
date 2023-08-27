/*
Query the difference between the maximum and minimum populations in CITY.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |
 */

SELECT MAX(POPULATION)-MIN(POPULATION) AS DIFFERENCE FROM CITY;