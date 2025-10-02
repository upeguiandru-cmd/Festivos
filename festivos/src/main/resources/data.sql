-- Tipos de Festivos
INSERT INTO TipoFestivo (Tipo) VALUES ('Religioso');
INSERT INTO TipoFestivo (Tipo) VALUES ('Civil');

-- Países
INSERT INTO Pais (Nombre) VALUES ('Colombia');
INSERT INTO Pais (Nombre) VALUES ('México');

-- Festivos de Colombia
INSERT INTO Festivo (IdPais, Nombre, Dia, Mes, DiasPascua, IdTipo)
VALUES (1, 'Día de la Independencia', 20, 7, 0, 2);

INSERT INTO Festivo (IdPais, Nombre, Dia, Mes, DiasPascua, IdTipo)
VALUES (1, 'Domingo de Pascua', 0, 0, 0, 1);

-- Festivos de México
INSERT INTO Festivo (IdPais, Nombre, Dia, Mes, DiasPascua, IdTipo)
VALUES (2, 'Día de la Revolución', 20, 11, 0, 2);

INSERT INTO Festivo (IdPais, Nombre, Dia, Mes, DiasPascua, IdTipo)
VALUES (2, 'Viernes Santo', 0, 0, -2, 1);
