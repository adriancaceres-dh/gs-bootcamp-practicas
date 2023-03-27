-- Seleccionar el nombre, el puesto y la localidad de los departamentos donde trabajan los vendedores.

SELECT e.nombre, e.puesto, d.localidad
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment;

-- Visualizar los departamentos con por lo menos o más de tres empleados.

SELECT d.*, COUNT(*) total_empleados
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
GROUP BY d.iddepartment
HAVING total_empleados >= 3;

-- Mostrar el nombre, salario y nombre del departamento de los empleados que tengan el mismo puesto que ‘Mito Barchuk’.

SELECT * FROM Employee;

SELECT e.nombre, e.salario, d.nombreDepartamento
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
WHERE e.puesto = (SELECT puesto FROM employee WHERE nombre = "Mito" AND apellido = "Barchuk");

SELECT e.nombre, e.salario, d.nombreDepartamento
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
WHERE e.puesto = (SELECT puesto FROM employee WHERE nombre = "Cesar" AND apellido = "Piñero");

-- Mostrar los datos de los empleados que trabajan en el departamento de contabilidad, ordenados por nombre.

SELECT e.*
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
WHERE d.nombreDepartamento = "Contabilidad"
ORDER BY e.nombre ASC;

-- Mostrar el nombre del empleado que tiene el salario más bajo.

SELECT * FROM employee;

SELECT e.nombre, MIN(e.salario)
FROM employee e
GROUP BY e.nombre;

-- OPCION VALIDA PERO MENOS PERFORMANTE EN TABLAS GRANDES
SELECT e.nombre, e.salario
FROM employee e
WHERE e.salario = (SELECT MIN(salario) FROM employee);

-- OPCION VALIDA PERO MAS PERFORMANTE EN TABLAS GRANDES
SELECT e.nombre, e.salario
FROM employee e
ORDER BY e.salario ASC
LIMIT 1;


-- Mostrar los datos del empleado que tiene el salario más alto en el departamento de ‘Ventas’.

SELECT e.*
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
WHERE d.nombreDepartamento = "Ventas"
ORDER BY e.salario DESC
LIMIT 1;

SELECT e.*
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
WHERE d.nombreDepartamento = "Ventas" AND e.salario = (
	SELECT MAX(salario) FROM employee e JOIN department d
	ON e.idDepartamento = d.iddepartment WHERE d.nombreDepartamento = "Ventas");seriesseries