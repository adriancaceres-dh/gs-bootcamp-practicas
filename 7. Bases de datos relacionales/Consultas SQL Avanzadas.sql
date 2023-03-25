USE movies_db;
#Agregar una película a la tabla movies.
INSERT INTO movies(title,rating,awards,release_date,length,genre_id) VALUES("Diario de una Pasion",9.0,12,"2004-10-28 00:00:00",124,3);

#Agregar un género a la tabla genres.
INSERT INTO genres(name,ranking,active) VALUES("Cine mudo",13,1);

#Asociar a la película del punto 1. con el género creado en el punto 2.
UPDATE movies SET genre_id = 13 WHERE id = 3;

#Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1.
UPDATE actors SET favorite_movie_id = 22 WHERE id = 4;

#Crear una tabla temporal copia de la tabla movies.
CREATE TEMPORARY TABLE copia_movies
SELECT * FROM movies;
SELECT * FROM copia_movies;

#Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.
DELETE FROM copia_movies WHERE awards < 5 AND id > 0;

#Obtener la lista de todos los géneros que tengan al menos una película.
SELECT g.name, COUNT(*) cantidadPelis
FROM genres g JOIN movies m
ON m.genre_id = g.id
GROUP BY g.name
HAVING cantidadPelis >= 1;

#Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.
SELECT a.first_name Nombre, a.last_name Apellido, m.title Película, m.awards Premios
FROM actors a JOIN movies m
ON a.favorite_movie_id = m.id
WHERE m.awards > 3;

#Crear un índice sobre el nombre en la tabla movies.
CREATE INDEX movies_index
ON movies(title);

#Chequee que el índice fue creado correctamente.
SELECT title FROM movies WHERE title = "Parque Jurasico";


