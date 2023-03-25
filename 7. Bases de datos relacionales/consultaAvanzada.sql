USE movies_db;

#Agregar una película a la tabla movies.
INSERT INTO movies(title,rating,awards,release_date,length,genre_id) VALUES("Tonto y retonto",8.5,1,"1996-05-02 00:00:00",90,1);

#Agregar un género a la tabla genres.
INSERT INTO genres(name,ranking,active) VALUES("Alta Comedia",14,1);

#Asociar a la película del punto 1. con el género creado en el punto 2.
UPDATE movies SET genre_id = 13 WHERE id = 22;

#Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1.
UPDATE actors SET favorite_movie_id = 22 WHERE id = 30;

#Crear una tabla temporal copia de la tabla movies.
CREATE TEMPORARY TABLE movies_temp
SELECT * FROM movies;

SELECT * FROM movies_temp;

#Eliminar de esa tabla temporal todas las películas que hayan ganado menos de 5 awards.
SET sql_safe_updates = 0;

DELETE FROM movies_temp WHERE awards < 5 AND id > 0;

#Obtener la lista de todos los géneros que tengan al menos una película.

SELECT g.name, COUNT(*) CantPeliculas
FROM genres g JOIN movies m
ON m.genre_id = g.id
GROUP BY g.name
HAVING CantPeliculas >= 1;

#Obtener la lista de actores cuya película favorita haya ganado más de 3 awards.
SELECT ac.first_name Nombre, ac.last_name Apellido, mo.title Película, mo.awards Premios
FROM actors ac JOIN movies mo
ON ac.favorite_movie_id = mo.id
WHERE mo.awards > 3;

#Crear un índice sobre el nombre en la tabla movies.
CREATE INDEX nombre_index
ON movies(title);

#Chequee que el índice fue creado correctamente.
SELECT title FROM movies WHERE title = "Titanic";

#En la base de datos movies ¿Existiría una mejora notable al crear índices? Analizar y justificar la respuesta.
SELECT title, release_date FROM series where title = "The Walking Dead"; #Query cost: 0.85.

CREATE INDEX titulo_estreno_index
ON series(title,release_date);

SELECT title, release_date FROM series where title = "The Walking Dead"; #Query cost: 0.35

-- En el ej anterior, sin index creato el costo d ela query es de 0.85 mientras que con el index creado es de 0.35;

#