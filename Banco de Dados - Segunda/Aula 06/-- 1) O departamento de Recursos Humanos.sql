-- 1) O departamento de Recursos Humanos exige alguns relatórios de alguns determinados departamentos.
-- a) Exibir o menor salário da empresa.
SELECT MIN(salary) FROM hr.employees
    
-- b) Exibir o maior salário da empresa
SELECT MAX(salary) FROM hr.employees
    
-- c) Exibir a média salarial da empresa.
SELECT AVG(salary) FROM hr.employees
    
-- d) Exibir a somatória do salário agrupada por cargo
SELECT job_id, SUM(salary) FROM hr.employees
GROUP BY job_id
    
-- e) Exibir a média salarial de cada departamento (department_id)
SELECT department_id,AVG(salary) FROM hr.employees
GROUP BY department_id
    
-- f) Exibir a média salarial dos funcionários com ID de departamento maior que 80
SELECT AVG(salary) FROM hr.employees 
WHERE department_id > 80


-- 2) Crie um relatório para exibir o número do gerente e o salário do funcionário com menor
-- remuneração desse gerente. Exclua todas as pessoas cujo gerente seja desconhecido. Exclua
-- todos os grupos em que o salário seja menor ou igual a 6000. Classifique a saída em ordem
-- decrescente.
SELECT manager_id,MIN(salary) FROM hr.employees
WHERE manager_id IS NOT NULL AND salary > 6000
GROUP BY manager_id
ORDER BY MIN(salary) DESC

--3) Inserir 10 novos funcionários na tabela Clientes criada na aula, sendo 5 no modo implícito e 5
-- no modo explícito. Atentar quanto a obrigatoriedade de registros.

--3) Inserir 10 novos funcionários na tabela Clientes criada na aula, sendo 5 no modo implícito e 5
-- no modo explícito. Atentar quanto a obrigatoriedade de registros.
CREATE TABLE cadastro
(

  nome VARCHAR2(30),

  sobrenome VARCHAR2(30),

  salario NUMBER(10,2),

  endereco VARCHAR2(30),

  dt_cadastro DATE

);

INSERT INTO cadastro VALUES('Lucas','Silva',1500,'São Paulo', SYSDATE);
INSERT INTO cadastro VALUES('Leandro','Silva',8000,'Rio de Janeiro', SYSDATE);
INSERT INTO cadastro VALUES('Vanderley','Oliveira',7500,'Piraju', SYSDATE);
INSERT INTO cadastro VALUES('Vanderley','Junior',3500,'São Paulo', SYSDATE);
INSERT INTO cadastro VALUES('Zezinha','Silva',2500,'3 Fronteiras', SYSDATE);

INSERT INTO cadastro (nome,sobrenome,salario,endereco,dt_cadastro) VALUES('Zenaide','Silva',3200, 'Rio de Janeiro', SYSDATE);
INSERT INTO cadastro (nome,sobrenome,salario,endereco,dt_cadastro) VALUES('Lana','Silva',3200, 'São Paulo', SYSDATE);
INSERT INTO cadastro (nome,sobrenome,salario,endereco,dt_cadastro) VALUES('Vinicius','Silva',3200, 'São Paulo', SYSDATE);
INSERT INTO cadastro (nome,sobrenome,salario,endereco,dt_cadastro) VALUES('Lucca','Oliveira',3200, 'São Paulo', SYSDATE);
INSERT INTO cadastro (nome,sobrenome,salario,endereco,dt_cadastro) VALUES('Maria','Luiza',3200, 'São Paulo', SYSDATE);

SELECT * FROM cadastro

