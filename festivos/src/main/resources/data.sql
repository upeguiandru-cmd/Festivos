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
-- Países
INSERT INTO pais (id, nombre) VALUES (1, 'Colombia');
INSERT INTO pais (id, nombre) VALUES (2, 'México');

-- Tipos de festivo
INSERT INTO tipofestivo (id, tipo) VALUES (1, 'Religioso');
INSERT INTO tipofestivo (id, tipo) VALUES (2, 'Civil');

-- Festivos de Colombia
INSERT INTO festivo (id, idpais, nombre, dia, mes, dias_pascua, idtipo)
VALUES (1, 1, 'Día de la Independencia', 20, 7, NULL, 2);

INSERT INTO festivo (id, idpais, nombre, dia, mes, dias_pascua, idtipo)
VALUES (2, 1, 'Navidad', 25, 12, NULL, 1);

-- Festivos de México
INSERT INTO festivo (id, idpais, nombre, dia, mes, dias_pascua, idtipo)
VALUES (3, 2, 'Día de la Revolución', 20, 11, NULL, 2);

INSERT INTO festivo (id, idpais, nombre, dia, mes, dias_pascua, idtipo)
VALUES (4, 2, 'Viernes Santo', 0, 0, NULL, 1);

