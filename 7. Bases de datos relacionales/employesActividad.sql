#Seleccionar el nombre, el puesto y la localidad de los departamentos donde trabajan los vendedores.
SELECT e.nombre, e.puesto, d.localidad
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment;

#Visualizar los departamentos con 3 o mas empleados.
SELECT d.nombreDepartamento, COUNT(*) cant_employee
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
GROUP BY d.nombreDepartamento
HAVING cant_employee >= 3;

#Mostrar el nombre, salario y nombre del departamento de los empleados que tengan el mismo puesto que ‘Cesar Piñero’.
SELECT * FROM employee;

SELECT e.nombre, e.salario, d.nombreDepartamento
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
WHERE e.puesto = (SELECT puesto FROM employee WHERE nombre = "Cesar" AND apellido = "Piñero");

#Mostrar los datos de los empleados que trabajan en el departamento de contabilidad, ordenados por nombre.
SELECT *
FROM employee e JOIN department d
ON e.idDepartamento = d.iddepartment
WHERE d.nombreDepartamento = "Contabilidad"
ORDER BY e.nombre;

#Mostrar el nombre del empleado que tiene el salario más bajo.
SELECT e.nombre, e.salario
FROM employee e
WHERE e.salario = (SELECT MIN(salario) FROM employee);

SELECT e.nombre, e.salario
FROM employee e
ORDER BY e.salario ASC
LIMIT 1;

#Mostrar los datos del empleado que tiene el salario más alto en el departamento de ‘Ventas’.
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
	ON e.idDepartamento = d.iddepartment WHERE d.nombreDepartamento = "Ventas");