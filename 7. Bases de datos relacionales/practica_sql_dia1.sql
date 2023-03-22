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

# 
