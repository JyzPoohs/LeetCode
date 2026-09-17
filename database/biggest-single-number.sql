# Write your MySQL query statement below
SELECT max(num) AS num FROM mynumbers WHERE num IN (
    SELECT num FROM mynumbers GROUP BY num HAVING count(num) = 1
);