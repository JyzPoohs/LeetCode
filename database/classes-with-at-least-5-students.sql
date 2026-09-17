# Write your MySQL query statement below
SELECT class FROM courses GROUP BY class HAVINg count(class) > 5;