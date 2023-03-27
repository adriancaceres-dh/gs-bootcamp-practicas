#Ej 1. Consultas Avanzadas SQL

# 1- ¿A qué se denomina JOIN en una base de datos y para qué se utiliza?
# A la combinación de una tabla con otra tabla y se utiliza para obtener datos de varias tablas relacionadas entre sí.alter

# 2- Explicar dos tipos de JOIN.
# Left Join y Right Join: Estos tipos de Join NO EXCLUYEN resultados de alguna de las dos tablas.
# Left: Lo que indica es: que la tabla que está a la izquierda va a ser aceptada a pesar de no tener vínculo.
# Right: Lo que indica es: que la tabla que está a la derecha va a ser aceptada a pesar de no tener vínculo con la tabla buscada.

# 3- ¿Para qué se utiliza el GROUP BY?
# Para agrupar registros/resultados.

# 4- ¿Para qué se utiliza el HAVING? 
# Para filtrar datos.

# 5- Escribir una consulta genérica para cada uno de los siguientes diagramas: 
# Left Table/Right Table (medio en gris)
SELECT movies.*, actors.first_name, actors.last_name
FROM movies INNER JOIN actors
ON movies.id = actors.favorite_movie_id;

# Left Table/Right Table (Left todo gris y el medio en gris)
SELECT * FROM movies m LEFT JOIN actors a ON m.id = a.favorite_movie_id; 




