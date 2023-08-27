/*
You did such a great job helping Julia with her last coding contest challenge
that she wants you to work on this one, too!

The total score of a hacker is the sum of their maximum scores for all of the challenges.
Write a query to print the hacker_id, name, and total score of the hackers ordered by
the descending score. If more than one hacker achieved the same total score, then sort
the result by ascending hacker_id. Exclude all hackers with a total score of 0 from your result.

Input Format

The following tables contain contest data:

Hackers: The hacker_id is the id of the hacker, and name is the name of the hacker.

Submissions: The submission_id is the id of the submission, hacker_id is the id of
the hacker who made the submission, challenge_id is the id of the challenge for which
the submission belongs to, and score is the score of the submission.
 */

SELECT HS.HACKER_ID, HS.NAME, SUM(HS.SCORE) AS TOTAL_SCORE
FROM
    (SELECT HACKERS.HACKER_ID, HACKERS.NAME, SUBMISSIONS.CHALLENGE_ID, MAX(SCORE) AS SCORE
     FROM HACKERS INNER JOIN SUBMISSIONS ON HACKERS.HACKER_ID = SUBMISSIONS.HACKER_ID
     GROUP BY HACKERS.NAME, HACKERS.HACKER_ID, SUBMISSIONS.CHALLENGE_ID) AS HS
WHERE HS.HACKER_ID NOT IN
      (SELECT HACKERS.HACKER_ID
       FROM HACKERS INNER JOIN SUBMISSIONS ON HACKERS.HACKER_ID = SUBMISSIONS.HACKER_ID
       GROUP BY HACKERS.HACKER_ID
       HAVING SUM(SUBMISSIONS.SCORE) = 0)
GROUP BY HS.HACKER_ID, HS.NAME
ORDER BY TOTAL_SCORE DESC, HS.HACKER_ID ASC;