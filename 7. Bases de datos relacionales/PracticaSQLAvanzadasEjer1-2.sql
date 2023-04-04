-- Practica Individual

-- EJERCICIO 1 
-- 1. A que se denomina JOIN en una base de datos y para que se utiliza?
-- Permite combinar registros de diferentes tablas

-- 2. Explicar dos tipos de JOIN.
-- LEFT JOIN Retorna todas las filas de la tabla izquierda que coincidan con las filas de la tabla derecha
-- FULL JOIN Retorna todas las filas de la tabla derecha y tambien las filas de la tabla izquierda

-- 3. Para que se utiliza el GROUP BY?
-- Agrupa los resultados segun las columnas indicadas

-- 4. Para que se utiliza el HAVING?
-- Se utiliza para incluir condiciones con algunas funciones SQL

-- 5. Escribir una cosnulta generica para cada uno de los siguientes diagramas. 
SELECT movies.*, actors.first_name, actors.last_name FROM movies INNER JOIN actors ON movies.id = actors.favorite_movie_id;

SELECT * FROM movies LEFT JOIN actors ON movies.id = actors.favorite_movie_id;


-- EJERCICIO 2

# Mostrar el titulo y el nombre del genero de todas las series
SELECT series.title, genres.name FROM series INNER JOIN genres ON series.genre_id = genres.id;

# Mostrar el título de los episodios, el nombre y apellido de los actores que trabajan en cada uno de ellos.
SELECT episodes.title, actors.first_name, actors.last_name FROM episodes LEFT JOIN actors ON episodes.id = actors.id;

# Mostrar el título de todas las series y el total de temporadas que tiene cada una de ellas.
SELECT series.title, seasons.number FROM series LEFT JOIN seasons ON series.id = seasons.serie_id;

# Mostrar el nombre de todos los géneros y la cantidad total de películas por cada uno, siempre que sea mayor o igual a 3.
SELECT genres.name, count(*) total_movies FROM movies JOIN genres ON genres.id = movies.genre_id GROUP BY movies.genre_id HAVING total_movies >=3;

# Mostrar sólo el nombre y apellido de los actores que trabajan en todas las películas de la guerra de las galaxias y que estos no se repitan.
SELECT actors.first_name, actors.last_name, movies.title FROM actors JOIN movies ON actors.id = movies.id WHERE movies.title = ( SELECT title FROM movies WHERE title = "Avatar");