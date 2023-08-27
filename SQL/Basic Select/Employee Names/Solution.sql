/*
 Write a query that prints a list of employee names (i.e.: the name attribute)
 from the Employee table in alphabetical order.

        EMPLOYEE
 |employee_id   |integer|
 |name          |string |
 |months        |integer|
 |salary        |integer|
 */

SELECT name FROM EMPLOYEE ORDER BY name ASC;