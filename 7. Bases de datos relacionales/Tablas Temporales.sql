-- EJEMPLO SIN TABLA TEMPORAL CON QUERY COST DE mas o menos 3.0
SELECT e.nombre, e.salario, d.nombreDepartamento
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
WHERE e.puesto = (SELECT puesto FROM employee WHERE nombre = "Cesar" AND apellido = "Piñero");

-- USAR TABLAS TEMPORALES

CREATE TEMPORARY TABLE employeeXdepartment 
SELECT *
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment;

SELECT * from employeeXdepartment;

-- USAR INDEX PARA NOMBRE Y APELLIDO

CREATE INDEX nombreCompleto_idx
ON employee (nombre, apellido);

CREATE INDEX puestoEmployee_idx
ON employeeXdepartment (puesto);


-- EJEMPLO CON TABLA TEMPORAL CON QUERY COST DE 1.90
-- AL APLICAR INDEXES EL QUERY COST BAJA A 0.70
SELECT nombre, salario, nombreDepartamento
FROM employeeXdepartment
WHERE puesto = (SELECT puesto FROM employee WHERE nombre = "Mito" AND apellido = "Barchuk");