/*
You are given a table, Functions, containing two columns: X and Y.

Two pairs (X1, Y1) and (X2, Y2) are said to be symmetric pairs if X1 = Y2 and X2 = Y1.

Write a query to output all such symmetric pairs in ascending order by the value of X.
List the rows such that X1 ≤ Y1.
*/

SELECT F.X, F.Y FROM FUNCTIONS AS F
WHERE F.X = F.Y AND
        (SELECT COUNT(*) FROM FUNCTIONS WHERE X = F.X AND Y = F.Y) > 1
UNION
SELECT F.X, F.Y FROM FUNCTIONS AS F
WHERE EXISTS(SELECT X, Y FROM FUNCTIONS WHERE F.X = Y AND F.Y = X AND F.X < X)
ORDER BY X;