/*
Given the CITY and COUNTRY tables, query the names of all the continents
(COUNTRY.Continent) and their respective average city populations
(CITY.Population) rounded down to the nearest integer.

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

SELECT COUNTRY.CONTINENT, FLOOR(AVG(CITY.POPULATION))
FROM CITY INNER JOIN COUNTRY ON CITY.COUNTRYCODE = COUNTRY.CODE
GROUP BY COUNTRY.CONTINENT;