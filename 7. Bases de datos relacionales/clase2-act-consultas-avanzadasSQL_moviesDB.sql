#Mostrar el título y el nombre del género de todas las series.
SELECT s.title AS Serie, g.name AS Género
FROM series s JOIN genres g
ON s.genre_id = g.id;

#Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT e.title AS Episodio, a.first_name AS "Nombre Actor", a.last_name AS "Apellido Actor"
FROM episodes e JOIN actors a JOIN actor_episode ae
ON ae.actor_id = a.id AND ae.episode_id = e.id;

#Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
SELECT s.title AS Serie, COUNT(*) CantTemporadas
FROM series s JOIN seasons t
ON s.id = t.serie_id
GROUP BY s.title;

#Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.
SELECT g.name AS Género, COUNT(*) AS CantPeliculas
FROM genres g JOIN movies m
ON g.id =  m.genre_id
GROUP BY g.name
HAVING CantPeliculas >= 3;

#Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan.
SELECT a.first_name, a.last_name
FROM movies m JOIN actors a JOIN actor_movie am
ON a.id = am.actor_id AND m.id = am.movie_id
WHERE m.title LIKE "La guerra de las galaxias%"
GROUP BY a.id;

