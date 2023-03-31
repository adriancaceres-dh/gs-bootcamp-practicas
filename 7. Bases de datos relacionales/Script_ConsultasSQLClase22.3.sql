# Mostrar todos los registros de la tabla de movies. 
use movies_db;
SELECT * FROM movies;

# Mostrar el nombre, apellido y rating de todos los actores.
SELECT first_name, last_name, rating FROM actors;

# Mostrar el título de todas las series y usar alias para que tanto el nombre de la 
# tabla como el campo estén en español.
SELECT title as titulo from series;

# Mostrar el nombre y apellido de los actores cuyo rating sea mayor a 7.5.
SELECT first_name, last_name, rating FROM actors where rating > 7.5;

# Mostrar el título de las películas, el rating y los premios de las películas 
# con un rating mayor a 7.5 y con más de dos premios.
SELECT title, rating, awards FROM movies where rating > 7.5 AND awards > 2;

# Mostrar el título de las películas y el rating ordenadas por rating en forma ascendente.
SELECT title, rating FROM movies ORDER BY rating ASC;

#Mostrar los titulos de las primeras tres peliculas en la base de datos.
SELECT id, title FROM movies WHERE id <= 3;

#Mostrar el top 5 de las peliculas con mayor rating.
SELECT title, rating FROM movies ORDER BY rating DESC LIMIT 5;

#Listar los primeros 10 actores. 
SELECT id, first_name FROM actors WHERE id <= 10;

#Mostrar el titulo y rating de todas las peliculas cuyo titulo sea de Toy Story. 
SELECT title, rating FROM movies WHERE title LIKE "Toy Story%";

# Mostrar a todos los actores cuyos nombres empiezan con Sam. 
SELECT first_name, last_name FROM actors WHERE first_name LIKE 'Sam%';

# Mostrar el titulo de las peliculas que salieron entre el 2004 y 2008
SELECT title, release_date FROM movies WHERE release_date BETWEEN '2004-01-01' AND '2008-12-31';

#Traer el titulo de las peliculas con el rating mayor a 3, con mas de 1 premio y con  
# fecha de lanzamiento entre el ano 1988 al 2009. Ordenar los resultados por rating. 
SELECT title AS titulo FROM movies WHERE rating > 3 AND awards > 1 AND release_date BETWEEN '1988-01-01' AND '2009-12-31' ORDER BY rating DESC;