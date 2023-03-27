#EJERCICIO - CONSULTAS DB

# 1- Mostrar todos los registros de la tabla de movies.alter
SELECT * FROM movies;

# 2- Mostrar el nombre, apellido y rating de todos los actores.
SELECT first_name, last_name, rating FROM actors;

# 3- Mostrar el título de todas las series y usar alias para que tanto el nombre de la tabla como el campo estén en español.
SELECT title AS título_series FROM series; 

# 4- Mostrar el nombre y apellido de los actores cuyo rating sea mayor a 7.5.
SELECT first_name, last_name FROM actors WHERE rating >7.5;

# 5- Mostrar el título de las películas, el rating y los premios de las películas con un rating mayor a 7.5 y con más de dos premios.
SELECT title, rating, awards FROM movies WHERE rating > 7.5 AND awards >2;

# 6- Mostrar el título de las películas y el rating ordenadas por rating en forma ascendente.
SELECT title, rating FROM movies ORDER BY rating ASC;

# 7- Mostrar los títulos de las primeras tres películas en la base de datos.
SELECT title FROM movies LIMIT 3;

# 8- Mostrar el top 5 de las películas con mayor rating.
SELECT title, rating FROM movies WHERE rating >9 ORDER BY rating ASC LIMIT 5;

# 9- Listar los primeros 10 actores.
SELECT id, first_name FROM actors ORDER BY id ASC LIMIT 10;

#10- Mostrar el título y rating de todas las películas cuyo título sea de Toy Story.
SELECT title, rating FROM movies WHERE title LIKE '%Toy Story%'; 

# 10- Mostrar a todos los actores cuyos nombres empiezan con Sam.
SELECT * FROM actors WHERE first_name LIKE '%Sam';

# 11- Mostrar el título de las películas que salieron entre el 2004 y 2008.
SELECT title FROM movies WHERE DATE_FORMAT(release_date, '%Y')BETWEEN 2004 AND 2008 ORDER BY release_date ASC;

# 12- Traer el título de las películas con el rating mayor a 3, con más de 1 premio y con fecha 
# de lanzamiento entre el año 1988 al 2009. Ordenar los resultados por rating.

SELECT title, rating, awards FROM movies WHERE rating >3 AND awards >1 AND DATE_FORMAT(release_date, '%Y')BETWEEN 1988 AND 2009 ORDER BY rating ASC;
