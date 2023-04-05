-- Creación de Tablas Temporales e Índices
 -- EJERCICIO 1:

-- Con la base de datos “movies”, se propone crear una tabla temporal llamada “TWD” y guardar en la misma los episodios 
-- de todas las temporadas de “The Walking Dead”

CREATE TEMPORARY TABLE TWD AS
SELECT *
FROM movies
WHERE title LIKE 'The Walking Dead%';

-- Realizar una consulta a la tabla temporal para ver los episodios de la primera temporada

SELECT *
FROM TWD
WHERE season.id = 2;

-- EJERCICIO 2:

-- En la base de datos “movies”, seleccionar una tabla donde crear un índice y luego chequear la creación del mismo
CREATE INDEX nombreCompleto_idx
ON actors (first_name, last_name);

-- Analizar por qué crearía un índice en la tabla indicada y con qué criterio se elige/n el/los campos
-- ver clase


