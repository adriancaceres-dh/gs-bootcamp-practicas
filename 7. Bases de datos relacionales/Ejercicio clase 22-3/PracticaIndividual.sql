use demo;
-- agregar en una tabla 
SELECT * FROM usuarios;

INSERT INTO usuarios VALUES 
('1', 'valentina', 'vallejos');

SELECT * FROM usuarios;

-- Agregas más
SELECT * FROM usuarios;
INSERT INTO usuarios (idusuarios, nombre, apellido) VALUES
('2', 'Valentina', 'Vallejos'),
('3', 'Roman', 'Pitton'),
('4', 'Susana', 'Podio'),
('5', 'Silvina', 'Col');
SELECT * FROM usuarios;

-- Eliminar un usuario
DELETE FROM usuarios WHERE idusuarios = 1;
select * FROM usuarios;