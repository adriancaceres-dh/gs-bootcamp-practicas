#Mostrar el título y el nombre del género de todas las series.
SELECT s.title AS series, g.name AS genres
FROM series s JOIN genres g
ON s.genre_id = g.id;

#Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT episodes.title, actors.last_name, actors.first_name
FROM episodes JOIN actors JOIN actor_episode
ON actor_episode.actor_id = actor_id AND actor_episode.episode_id = episode_id;

#Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
SELECT series.title, COUNT(*) Temporadas
FROM series JOIN seasons
ON series.id = seasons.serie_id
GROUP BY series.title;

#Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.
SELECT genres.name, COUNT(*) Peliculas
FROM genres JOIN movies
ON genres.id = movies.genre_id
GROUP BY genres.name
HAVING Peliculas >=3;

#Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan.
SELECT actors.last_name, actors.first_name 
FROM movies JOIN actors JOIN actor_movie
ON actors.id = actor_movie.actor_id AND actor_movie.id = movies.id
WHERE movies.title LIKE 'La guerra de las galaxias%'
GROUP BY actors.id

