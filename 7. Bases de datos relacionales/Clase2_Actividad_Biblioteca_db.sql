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
SELECT a.nombre
FROM autor a JOIN libro l JOIN libroautor la
ON la.id_Autor = a.idautor AND la.id_Libro = l.idlibro
WHERE l.titulo = "El Universo: Guía de viaje";

#¿Qué libros se prestaron al lector “Filippo Galli”?
SELECT l.titulo, p.fechaPrestamo, e.nombre, e.apellido
FROM prestamo p JOIN libro l JOIN estudiante e
ON p.id_Lector = e.idLector AND p.id_Libro = l.idlibro
WHERE e.nombre = "Galli" AND e.apellido = "Filippo";

#Listar el nombre del estudiante de menor edad.
SELECT e.nombre, e.apellido, e.edad 
FROM estudiante e
WHERE e.edad < 18;

#Listar nombres de los estudiantes a los que se prestaron libros de Base de Datos.
SELECT e.nombre, l.titulo, l.area
FROM prestamo p JOIN estudiante e JOIN libro l
ON p.id_Lector = e.idLector AND p.id_Libro = l.idlibro
WHERE l.area = "Base de Datos";

#Listar los libros que pertenecen a la autora J.K. Rowling.
SELECT l.titulo, a.nombre
FROM libro l JOIN libroautor la JOIN autor a
ON la.id_Autor = a.idautor AND la.id_Libro = l.idlibro
WHERE a.nombre = "Agatha Christie";









