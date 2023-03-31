CREATE TEMPORARY TABLE TWD2
SELECT *
FROM series JOIN seasons 
ON series.id = seasons.serie_id
WHERE series.title = (SELECT title FROM series WHERE title = 'The Walking Dead');

SELECT * FROM TWD