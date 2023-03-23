USE movies_db;
SELECT * FROM series;

# Mostrar el título y el nombre del género de todas las series.
SELECT s.title, g.name genero 
FROM series s JOIN genres g 
ON s.genre_id = g.id;

# Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT e.title titulo, a.first_name nombre, a.last_name apellido
FROM episodes e JOIN actor_episode ae JOIN actors a
ON e.id = ae.episode_id AND a.id = ae.actor_id;

SELECT * FROM episodes;
SELECT * FROM actor_episode;
SELECT * FROM actors;
SELECT * FROM seasons;

# Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.

SELECT series.title titulo, COUNT(*) total_temporadas
FROM series JOIN seasons 
ON series.id = seasons.serie_id
GROUP BY serie_id;

# Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.
SELECT genres.name, COUNT(*) cantidad_peliculas
FROM movies JOIN genres
ON movies.genre_id = genres.id
GROUP BY genres.name
HAVING cantidad_peliculas >= 3;

# Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias 
# y que estos no se repitan.
SELECT actors.first_name nombre, actors.last_name apellido
FROM movies JOIN actor_movie JOIN actors
ON movies.id = actor_movie.movie_id AND actor_movie.actor_id = actors.id
WHERE movies.title LIKE 'La Guerra de las galaxias%'
GROUP BY actors.id;

SELECT * FROM movies