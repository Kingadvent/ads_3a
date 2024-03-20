CREATE TABLE Funcionarios
(
    cd_func NUMBER(10) PRIMARY KEY,
    nm_func VARCHAR(10),
    idade NUMBER(2)
);

-- INPLICITO (TEM QUE TER TODOS OS VALUES)
INSERT INTO Funcionarios VALUES (1, 'Luiz', 40);
INSERT INTO Funcionarios VALUES (2, 'Joao', 21);
INSERT INTO Funcionarios VALUES (3, 'Paulo');
-- EXPLICITO (SELECIONA A ORDEM E CONSEGUE DEIXAR NULL)
INSERT INTO Funcionarios (cd_func, nm_func, idade) VALUES (3, 'Paulo', 22);
INSERT INTO Funcionarios (nm_func, cd_func, idade) VALUES ('Jose',4,72);
INSERT INTO Funcionarios (cd_func, nm_func) VALUES (5, 'Fabio');

SELECT * FROM Funcionarios
ORDER BY cd_func