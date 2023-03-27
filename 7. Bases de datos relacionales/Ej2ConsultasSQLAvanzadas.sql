#Ej 2. Consultas Avanzadas SQL

# 1- Mostrar el título y el nombre del género de todas las series.
SELECT series.title, genres.name
FROM series INNER JOIN genres
ON series.genre_id = genres.id;

# 2- Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT episodes.title AS "Título de los Episodios", actors.first_name AS "Nombre de Actores", actors.last_name AS "Apellido de Actores"
FROM actors right JOIN episodes
ON actors.id = episodes.id
ORDER BY actors.first_name ASC;

# 3- Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
SELECT s.title, COUNT(*) total_series
FROM series ser INNER JOIN seasons s
ON ser.id = s.serie_id
GROUP BY s.number;

# 4- Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, 
#siempre que sea mayor o igual a 3.
SELECT g.name, COUNT(*) total_movies
FROM movies m JOIN genres g 
ON m.genre_id = g.id
GROUP BY m.genre_id
HAVING total_movies >3;

# 5- Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la 
# guerra de las galaxias y que estos no se repitan.
SELECT DISTINCT a.first_name, a.last_name AS actores
FROM movies m JOIN actors a
WHERE m.title LIKE "%guerra de las galaxias%" ORDER BY a.first_name ASC;



