# Write your MySQL query statement below
SELECT a1.player_id, a2.first_login FROM activity a1
INNER JOIN (
    SELECT player_id, MIN(event_date) AS first_login FROM activity GROUP BY player_id
) a2 ON a1.player_id = a2.player_id AND a1.event_date = a2. first_login;