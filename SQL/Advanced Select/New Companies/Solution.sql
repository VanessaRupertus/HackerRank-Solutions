/*
Amber's conglomerate corporation just acquired some new companies.
Each of the companies follows this hierarchy:

Founder --> Lead Manager --> Senior Manager --> Manager --> Employee

Given the table schemas below (available for viewing on HackerRank), write a query to print the company_code,
founder name, total number of lead managers, total number of senior managers,
total number of managers, and total number of employees. Order your output by ascending company_code.

Note:

The tables may contain duplicate records.
The company_code is string, so the sorting should not be numeric.
For example, if the company_codes are C_1, C_2, and C_10,
then the ascending company_codes will be C_1, C_10, and C_2.
 */

SELECT
    c.COMPANY_CODE,
    c.FOUNDER,
    COUNT(DISTINCT e.LEAD_MANAGER_CODE),
    COUNT(DISTINCT e.SENIOR_MANAGER_CODE),
    COUNT(DISTINCT e.MANAGER_CODE),
    COUNT(DISTINCT e.EMPLOYEE_CODE) FROM COMPANY c
    JOIN EMPLOYEE e ON c.COMPANY_CODE = e.COMPANY_CODE
GROUP BY c.COMPANY_CODE, c.FOUNDER
ORDER BY c.COMPANY_CODE;