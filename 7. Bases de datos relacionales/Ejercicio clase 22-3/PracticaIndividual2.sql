SELECT * FROM movies_db.movies;
-- Practicas
SELECT COUNT(*), mo.title, mo.rating
From movies mo INNER JOIN actors a
ON mo.id = a.favorite_movie_id
GROUP BY mo.title, mo.rating;

-- Practica 2
