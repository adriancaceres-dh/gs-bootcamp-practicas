#Listar los datos de los autores.
SELECT * FROM autor;

#Listar nombre y edad de los estudiantes.
SELECT e.nombre, e.edad
FROM estudiante e;

#¿Qué estudiantes pertenecen a la carrera informática?
SELECT * 
FROM estudiante e
WHERE e.carrera = "Informática";

#¿Qué autores son de nacionalidad francesa o italiana?
SELECT * 
FROM autor a
WHERE a.nacionalidad = "Italia" OR a.nacionalidad = "Francia";

#¿Qué libros no son del área de internet?
SELECT * 
FROM libro l
WHERE l.area != "Internet";

#Listar los libros de la editorial Salamandra.
SELECT * 
FROM libro l
WHERE l.editorial = "Salamandra";

#Listar los datos de los estudiantes cuya edad es mayor al promedio.
SELECT e.*
FROM estudiante e
WHERE e.edad > (SELECT AVG(EDAD) FROM estudiante);

#Listar los nombres de los estudiantes cuyo apellido comience con la letra F.
SELECT * FROM estudiante
WHERE apellido LIKE "F%"; 

#Listar los autores del libro “El Universo: Guía de viaje”. (Se debe listar solamente los nombres).
