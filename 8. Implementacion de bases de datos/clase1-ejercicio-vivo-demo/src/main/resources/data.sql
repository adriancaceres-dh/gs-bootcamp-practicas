INSERT INTO persona(nombre,apellido,documento,edad,fecha_nacimiento, salario, genre)
VALUES ('Luciano', 'Festa', '36365939', 31, '1992/01/24', 350000.5, 'M');

INSERT INTO persona(nombre,apellido,documento,edad,fecha_nacimiento, salario, genre)
VALUES ('Sofía', 'Ramos', '38884160', 27, '1995/07/12', 400000.0, 'F');

INSERT INTO cliente(numero_tarjeta,email,person_id)
VALUES ('4815481586858685', 'lucho@hotmail.com', 1);

INSERT INTO cliente(numero_tarjeta,email,person_id)
VALUES ('4705470585748574', 'sofiaramos@hotmail.com', 2);

INSERT INTO factura(fecha, client_id)
VALUES ('2023/01/15', 1);

INSERT INTO factura(fecha, client_id)
VALUES ('2023/02/27', 1);

INSERT INTO factura(fecha, client_id)
VALUES ('2023/03/20', 1);

INSERT INTO factura(fecha, client_id)
VALUES ('2022/12/15', 2);

INSERT INTO factura(fecha, client_id)
VALUES ('2023/01/24', 2);

INSERT INTO factura(fecha, client_id)
VALUES ('2023/03/05', 2);

INSERT INTO producto(descripcion, nombre)
VALUES('El Kg, sale $1500 y es perita.', 'Tomate');

INSERT INTO producto(descripcion, nombre)
VALUES('El Kg sale $1100 y es lechuga crespa.', 'Lechuga');

INSERT INTO producto(descripcion, nombre)
VALUES('Es el apodo del dueño de la feria', 'Zapallito');

INSERT INTO producto(descripcion, nombre)
VALUES('Es lo que le falta a Colón para no irse a la B.', 'Huevo');

INSERT INTO producto_invoices(products_id, invoices_id)
VALUES (1,1);

INSERT INTO producto_invoices(products_id, invoices_id)
VALUES (2,1);

INSERT INTO producto_invoices(products_id, invoices_id)
VALUES (4,4);

INSERT INTO producto_invoices(products_id, invoices_id)
VALUES (3,4);

INSERT INTO producto_invoices(products_id, invoices_id)
VALUES (3,1);

INSERT INTO producto_invoices(products_id, invoices_id)
VALUES (4,2);