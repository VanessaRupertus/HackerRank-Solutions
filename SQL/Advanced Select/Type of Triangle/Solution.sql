/*
Write a query identifying the type of each record in the TRIANGLES table using its three side lengths.
Output one of the following statements for each record in the table:

Equilateral: It's a triangle with 3 sides of equal length.
Isosceles: It's a triangle with 2 sides of equal length.
Scalene: It's a triangle with 3 sides of differing lengths.
Not A Triangle: The given values of A, B, and C don't form a triangle.

The table:

TRIANGLES
|A  |Int|
|B  |Int|
|C  |Int|

Sample Output:

Isosceles
Equilateral
Scalene
Not A Triangle

 */

SELECT CASE
           WHEN A + B > C AND A + B > C AND C + B > A THEN
               CASE
                   WHEN A = B AND A = C THEN "Equilateral"
                   WHEN A = B OR A = C OR B = C THEN "Isosceles"
                   WHEN A != B AND A != C AND B != C THEN "Scalene"
                   END
           ELSE "Not A Triangle"
           END
FROM TRIANGLES;