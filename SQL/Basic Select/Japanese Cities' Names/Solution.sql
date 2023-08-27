/*
Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |

 */

SELECT NAME FROM CITY WHERE COUNTRYCODE="JPN";