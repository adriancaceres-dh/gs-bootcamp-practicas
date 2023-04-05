select * from movies;
select*from genres;

-- Consultas SQL Avanzadas
-- EJERCICIO 1:
-- 1 - Agregar una película a la tabla movies
INSERT INTO movies (id, created_at, updated_at, title, rating, awards, release_date, length, genre_id)
VALUES ('22', null, null, 'Orgullo y prejuicio', '7.5', '2', '2005-10-04 00:00:00', '180', '3');

-- 2 - Agregar un género a la tabla genres
INSERT INTO genres (id, created_at, updated_at, name, ranking, active)
VALUES ('13', '2016-08-04 00:00:00', null, 'Drama', '13', '1');

-- Asociar a la película del punto 1. con el género creado en el punto 2
SELECT movies.title, genres.name
FROM movies
JOIN genres ON movies.genre_id = genres.id;

UPDATE movies
SET genre_id = "3"
WHERE id = "22";

-- Modificar la tabla actors para que al menos un actor tenga como favorita la película agregada en el punto 1
UPDATE actors
SET actor.id = '22'
WHERE actor_id = (
  SELECT actor_id
  FROM movie_id
  WHERE movie_id = (
    SELECT movie_id
    FROM movies
    WHERE title = 'Orgullo y prejuicio'
  )
  LIMIT 1
);



