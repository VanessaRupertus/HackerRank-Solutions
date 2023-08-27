/*
 Query the average population for all cities in CITY, rounded down to the nearest integer.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |
 */

SELECT FLOOR(AVG(POPULATION)) FROM CITY;