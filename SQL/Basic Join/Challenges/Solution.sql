/*
Julia asked her students to create some coding challenges. Write a query to print
the hacker_id, name, and the total number of challenges created by each student.
Sort your results by the total number of challenges in descending order. If more
than one student created the same number of challenges, then sort the result by hacker_id.
If more than one student created the same number of challenges and the count is less
than the maximum number of challenges created, then exclude those students from the result.

Input Format

The following tables contain challenge data:

Hackers: The hacker_id is the id of the hacker, and name is the name of the hacker.

Challenges: The challenge_id is the id of the challenge, and hacker_id is the id
of the student who created the challenge.
 */

SELECT c.HACKER_ID, h.NAME, COUNT(c.CHALLENGE_ID) AS CHAL_COUNT
FROM HACKERS AS h JOIN CHALLENGES AS c ON h.HACKER_ID = c.HACKER_ID
GROUP BY c.HACKER_ID, h.NAME
HAVING CHAL_COUNT = (SELECT COUNT(c1.CHALLENGE_ID) FROM CHALLENGES AS c1 GROUP BY c1.HACKER_ID
                     ORDER BY COUNT(*) desc limit 1) OR
        CHAL_COUNT NOT IN (SELECT COUNT(c2.CHALLENGE_ID) FROM CHALLENGES AS c2 GROUP BY c2.HACKER_ID
                           HAVING c2.HACKER_ID <> c.HACKER_ID)
ORDER BY CHAL_COUNT DESC, c.HACKER_ID;