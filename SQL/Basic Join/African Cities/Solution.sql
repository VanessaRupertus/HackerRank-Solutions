/*
Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.

            CITY
  _______________________
  |ID           |NUMBER |
  |NAME         |VARCHAR|
  |COUNTRYCODE  |VARCHAR|
  |DISTRICT     |VARCHAR|
  |POPULATION   |NUMBER |

          COUNTRY
  _______________________
  |CODE         |VARCHAR|
  |NAME         |VARCHAR|
  |CONTINENT    |VARCHAR|
  |REGION       |VARCHAR|
  |SURFACEAREA  |NUMBER |
  |INDEPYEAR    |NUMBER |
  |POPULATION   |NUMBER |
  |LIFEEXPECTANCY|NUMBER |
  |GNP          |NUMBER |
  |GNPOLD       |NUMBER |
  |LOCALNAME    |NUMBER |
  |GOVERNMENTFORM|NUMBER |
  |HEADOFSTATE   |NUMBER |
  |CAPITAL      |NUMBER |
  |CODE2        |NUMBER |

 */

SELECT CITY.NAME FROM CITY
INNER JOIN COUNTRY ON CITY.COUNTRYCODE = COUNTRY.CODE
WHERE COUNTRY.CONTINENT = "Africa";