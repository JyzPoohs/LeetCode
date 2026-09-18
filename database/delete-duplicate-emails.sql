DELETE FROM person WHERE id IN (
  SELECT id FROM (
    SELECT p2.id FROM person p1, person p2 WHERE p1.email = p2.email AND p1.id < p2.id  ) AS ids
);