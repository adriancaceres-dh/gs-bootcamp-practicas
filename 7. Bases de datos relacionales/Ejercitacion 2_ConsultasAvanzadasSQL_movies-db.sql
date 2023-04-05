-- EJERCICIO 1: JOIN Y SUBCONSULTAS
-- Escribir una consulta genérica para cada uno de los siguientes diagramas
-- INNER JOIN
SELECT * FROM movies;
SELECT * FROM actors;

SELECT movies.title, actors.first_name, actors.last_name
FROM movies JOIN actors
ON movies.id = actors.favorite_movie_id
WHERE movies.title = 'Avatar';

-- LEFT JOIN

SELECT movies.rating, movies.title, actors.first_name, actors.last_name
FROM movies LEFT JOIN actors
ON movies.id = actors.favorite_movie_id
WHERE movies.rating > 9
ORDER BY movies.rating DESC;

-- Ejercicio 2:
-- Mostrar el título y el nombre del género de todas las series

SELECT movies.title, genres.name
FROM movies
JOIN genres ON movies.genre_id = genres.id;

-- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT episodes.title, actors.first_name, actors.last_name
FROM episodes
JOIN actors ON episodes.id = actors.id
ORDER BY episodes.title;

-- Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas

SELECT series.title, count(seasons.serie_id) AS Total_Temporadas
FROM series
LEFT JOIN seasons ON series.id = seasons.serie_id
GROUP BY series.id
ORDER BY series.title;

-- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3

SELECT genres.name, COUNT(movies.genre_id) AS Total_Peliculas
FROM genres
JOIN movies ON movies.genre_id = genres.id
GROUP BY genres.id
HAVING COUNT(movies.genre_id) >= 3
ORDER BY genres.name;

-- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y 
-- que estos no se repitan

SELECT DISTINCT actors.first_name, actors.last_name
FROM actors
JOIN actor_movie on actors.id = actor_movie.actor_id
JOIN movies ON movies.id = actor_movie.movie_id
WHERE movies.title LIKE "La Guerra de las Galaxias%"


