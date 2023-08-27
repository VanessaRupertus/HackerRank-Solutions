/*
 Query a count of the number of cities in CITY having a Population larger than 100,000.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |
 */

SELECT COUNT(DISTINCT NAME) FROM CITY WHERE POPULATION>100000;