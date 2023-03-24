#Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD” y 
#guardar en la misma los episodios de todas las temporadas de “The Walking Dead”.

CREATE TEMPORARY TABLE TWD
SELECT se.title AS Serie, s.title AS Temporada, e.title AS Capítulo
FROM episodes e JOIN seasons s JOIN series se
ON se.id = s.serie_id AND e.season_id = s.id 
WHERE se.title = "The Walking Dead";

SELECT * FROM TWD;

#Realizar una consulta a la tabla temporal para ver los episodios de la primera temporada.
SELECT * FROM TWD
WHERE Temporada = "Primer Temporada";

#En la base de datos “movies”, seleccionar una tabla donde crear un índice y luego chequear la creación del mismo. 
CREATE INDEX nombreApellido_autor
ON actors(first_name,last_name);

SELECT first_name, last_name FROM actors;



