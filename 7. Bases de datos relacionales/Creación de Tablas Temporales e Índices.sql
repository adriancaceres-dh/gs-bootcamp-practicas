#Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD” 
#y guardar en la misma los episodios de todas las temporadas de “The Walking Dead”.


CREATE TEMPORARY TABLE TWD
SELECT series.title AS serie, seasons.title AS temporada, episodes.title AS capitulo
FROM episodes JOIN seasons JOIN series
ON series.id = seasons.serie_id AND episodes.season_id = seasons.id
WHERE series.title = "The Walking Dead";

SELECT * FROM TWD;

#Realizar una consulta a la tabla temporal para ver los episodios de la primera temporada.
SELECT * FROM TWD
WHERE temporada = "Primer Temporada";

#En la base de datos “movies”, seleccionar una tabla donde crear un índice y luego chequear la creación del mismo.
CREATE INDEX nombreApellido_autor
ON actors(first_name,last_name);

SELECT first_name, last_name FROM actors;
