/*
Query all attributes of every Japanese city in the CITY table.
The COUNTRYCODE for Japan is JPN.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |

 */

SELECT * FROM CITY WHERE COUNTRYCODE="JPN";