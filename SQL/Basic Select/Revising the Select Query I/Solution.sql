/*Query all columns for all American cities in the CITY table with populations larger than 100000.
The CountryCode for America is USA.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |

 */

SELECT * FROM CITY WHERE POPULATION > 100000 AND COUNTRYCODE="USA";