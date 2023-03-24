SELECT * FROM movies_db.series;

-- Mostrar el título y el nombre del género de todas las series.
SELECT s.title, g.name
FROM series s
JOIN genres g ON s.genre_id = g.id;

-- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.



-- Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
SELECT s.title, COUNT(*) AS total_seasons
FROM series s
JOIN seasons ss ON s.id = ss.serie_id
GROUP BY s.id

-- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.
SELECT g.name, COUNT(*) AS total_movies
FROM movies m
JOIN genres g ON m.genre_id = g.id
GROUP BY g.id
HAVING total_movies >= 3;

-- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan.


