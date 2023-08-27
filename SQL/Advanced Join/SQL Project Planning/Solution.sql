/*
You are given a table, Projects, containing three columns: Task_ID, Start_Date and End_Date.
It is guaranteed that the difference between the End_Date and the Start_Date is equal to 1
day for each row in the table.

If the End_Date of the tasks are consecutive, then they are part of the same project.
Samantha is interested in finding the total number of different projects completed.

Write a query to output the start and end dates of projects listed by the number of
days it took to complete the project in ascending order. If there is more than one project
that have the same number of completion days, then order by the start date of the project.
 */

SELECT
    START_DATE,
    MIN(END_DATE)
FROM
    (SELECT
         P2.START_DATE
     FROM PROJECTS AS P1
              RIGHT JOIN PROJECTS AS P2 ON P2.START_DATE = P1.END_DATE
     WHERE P1.START_DATE IS NULL) AS SD,
    (SELECT
         P1.END_DATE
     FROM PROJECTS AS P1
              LEFT JOIN PROJECTS AS P2 ON P2.START_DATE = P1.END_DATE
     WHERE P2.END_DATE IS NULL) AS ED
WHERE START_DATE < END_DATE
GROUP BY START_DATE
ORDER BY DATEDIFF(MIN(END_DATE), START_DATE), START_DATE;