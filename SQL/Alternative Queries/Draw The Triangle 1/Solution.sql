/*
P(R) represents a pattern drawn by Julia in R rows. The following pattern represents P(5):

* * * * *
* * * *
* * *
* *
*
Write a query to print the pattern P(20).
 */

SET @i = 21;
SELECT REPEAT('* ', @i := @i-1) FROM INFORMATION_SCHEMA.TABLES;