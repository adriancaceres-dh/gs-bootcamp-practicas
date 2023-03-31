INSERT INTO duenio (edad, email, fecha_nacimiento, nombre, telefono)
VALUES(25, 'jean.cardo@digitalhouse.com', '1998-02-05', 'jean', '1231123123');

INSERT INTO duenio (edad, email, fecha_nacimiento, nombre, telefono)
VALUES(30, 'maria.cardo@digitalhouse.com', '1993-02-05', 'maria', '1231123123');

INSERT INTO duenio (edad, email, fecha_nacimiento, nombre, telefono)
VALUES(50, 'filomena.cardo@digitalhouse.com', '1973-02-05', 'filomena', '1231123123');


INSERT INTO veterinario (especialidad, horario, matricula, nombre, telefono)
VALUES('oncologo animal', '9hs a 23hs', 'ABC123', 'marco', '1231123123');

INSERT INTO veterinario (especialidad, horario, matricula, nombre, telefono)
VALUES('epinefrologa animal', '12hs a 16hs', 'XYZ789', 'gabi', '1231123123');



INSERT INTO mascota (edad, nombre, raza, tipo_animal, duenio_id, veterinario_id)
VALUES (5, 'nala', 'golden retriver', 'perro', 1, 1);

INSERT INTO mascota (edad, nombre, raza, tipo_animal, duenio_id, veterinario_id)
VALUES (25, 'negra', 'pastor aleman', 'perro', 1, 2);

INSERT INTO mascota (edad, nombre, raza, tipo_animal, duenio_id, veterinario_id)
VALUES (6, 'pequi', 'pequines', 'perro', 1, 1);

INSERT INTO mascota (edad, nombre, raza, tipo_animal, duenio_id, veterinario_id)
VALUES (15, 'lila', 'saharenze', 'elefante', 1, 2);

INSERT INTO mascota (edad, nombre, raza, tipo_animal, duenio_id, veterinario_id)
VALUES (3, 'yummy', 'de la calle', 'gato', 2, 1);