/*Query the NAME field for all American cities in the CITY table with populations
  larger than 120000. The CountryCode for America is USA.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |

 */

SELECT NAME FROM CITY WHERE POPULATION > 120000 AND COUNTRYCODE="USA";