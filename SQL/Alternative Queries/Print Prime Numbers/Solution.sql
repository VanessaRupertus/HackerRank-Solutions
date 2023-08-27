/*
Write a query to print all prime numbers less than or equal to 1000.
Print your result on a single line, and use the ampersand (&) character
as your separator (instead of a space).

For example, the output for all prime numbers <= 10 would be:

2&3&5&7
 */

SELECT GROUP_CONCAT(NUM_B SEPARATOR '&')
FROM (
         SELECT @num:=@num+1 AS NUM_B FROM
                INFORMATION_SCHEMA.TABLES T1,
                INFORMATION_SCHEMA.TABLES T2,
                (SELECT @num:=1) TMP1
     ) TEMP_NUMS
WHERE NUM_B<=1000 AND NOT EXISTS(
    SELECT * FROM (
                      SELECT @nu:=@nu+1 AS NUM_A FROM
                      INFORMATION_SCHEMA.TABLES T1,
                      INFORMATION_SCHEMA.TABLES T2,
                      (SELECT @nu:=1) TMP2
                      LIMIT 1000
                  ) ALL_NUMS
    WHERE FLOOR(NUM_B/NUM_A)=(NUM_B/NUM_A) AND NUM_A<NUM_B AND NUM_A>1
);