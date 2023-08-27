/*
Samantha interviews many candidates from different colleges using
coding challenges and contests. Write a query to print the contest_id,
hacker_id, name, and the sums of total_submissions, total_accepted_submissions,
total_views, and total_unique_views for each contest sorted by contest_id.
Exclude the contest from the result if all four sums are 0.

Note: A specific contest can be used to screen candidates at more than one
college, but each college only holds 1 screening contest.

The following tables hold interview data:

Contests: The contest_id is the id of the contest, hacker_id is the id
of the hacker who created the contest, and name is the name of the hacker.

Colleges: The college_id is the id of the college, and contest_id is the
id of the contest that Samantha used to screen the candidates.

Challenges: The challenge_id is the id of the challenge that belongs
to one of the contests whose contest_id Samantha forgot, and college_id
is the id of the college where the challenge was given to candidates.

View_Stats: The challenge_id is the id of the challenge, total_views
is the number of times the challenge was viewed by candidates, and
total_unique_views is the number of times the challenge was viewed by unique candidates.

Submission_Stats: The challenge_id is the id of the challenge, total_submissions
is the number of submissions for the challenge, and total_accepted_submission
is the number of submissions that achieved full scores.
 */

SELECT
    C.CONTEST_ID,
    C.HACKER_ID,
    C.NAME,
    SUM(SG.TOTAL_SUBMISSIONS),
    SUM(SG.TOTAL_ACCEPTED_SUBMISSIONS),
    SUM(VG.TOTAL_VIEWS),
    SUM(VG.TOTAL_UNIQUE_VIEWS)
FROM CONTESTS AS C
         JOIN
     COLLEGES AS CL ON C.CONTEST_ID = CL.CONTEST_ID
         JOIN
     CHALLENGES AS CH ON CL.COLLEGE_ID = CH.COLLEGE_ID
         LEFT JOIN
     (SELECT SS.CHALLENGE_ID,
             SUM(SS.TOTAL_SUBMISSIONS) AS TOTAL_SUBMISSIONS,
             SUM(SS.TOTAL_ACCEPTED_SUBMISSIONS) AS TOTAL_ACCEPTED_SUBMISSIONS
      FROM  SUBMISSION_STATS AS SS
      GROUP BY SS.CHALLENGE_ID) AS SG
     ON CH.CHALLENGE_ID = SG.CHALLENGE_ID
         LEFT JOIN
     (SELECT
          VS.CHALLENGE_ID,
          SUM(VS.TOTAL_VIEWS) AS TOTAL_VIEWS,
          SUM(TOTAL_UNIQUE_VIEWS) AS TOTAL_UNIQUE_VIEWS
      FROM VIEW_STATS AS VS
      GROUP BY VS.CHALLENGE_ID) AS VG
     ON CH.CHALLENGE_ID = VG.CHALLENGE_ID
GROUP BY C.CONTEST_ID, C.HACKER_ID, C.NAME
HAVING
            SUM(SG.TOTAL_SUBMISSIONS) +
            SUM(SG.TOTAL_ACCEPTED_SUBMISSIONS) +
            SUM(VG.TOTAL_VIEWS) +
            SUM(VG.TOTAL_UNIQUE_VIEWS)  > 0
ORDER BY C.CONTEST_ID;