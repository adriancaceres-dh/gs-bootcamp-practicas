INSERT INTO persona (nombre, apellido, documento, edad, fecha_nacimiento, salario, genero)
VALUES ('Jean', 'Cardo', '40960162', 25, '1998/02/05', 12000.5, 'M');

INSERT INTO cliente (numero_tarjeta, email, person_id)
VALUES ('3000000', 'jeancaardo@gmail.com', 1);

INSERT INTO factura (fecha_facturacion, client_id)
VALUES ('1998/02/05', 1);

INSERT INTO factura (fecha_facturacion, client_id)
VALUES ('1999/02/05', 1);

INSERT INTO factura (fecha_facturacion, client_id)
VALUES ('2000/02/05', 1);

INSERT INTO producto (descripcion, nombre)
VALUES ('Son tomates, posta', 'tomates');

INSERT INTO producto (descripcion, nombre)
VALUES ('Son cebollas, posta', 'cebollas');

INSERT INTO producto (descripcion, nombre)
VALUES ('Son morrones, posta', 'morrones');

INSERT INTO factura_products (invoice_id, products_id)
VALUES (1, 1);

INSERT INTO factura_products (invoice_id, products_id)
VALUES (1, 2);

INSERT INTO factura_products (invoice_id, products_id)
VALUES (1, 3);

INSERT INTO factura_products (invoice_id, products_id)
VALUES (2, 1);

INSERT INTO factura_products (invoice_id, products_id)
VALUES (2, 2);

INSERT INTO factura_products (invoice_id, products_id)
VALUES (3, 1);