-- 2
SELECT * FROM cadastro

-- 3
SELECT nome,sobrenome FROM cadastro

-- 4
SELECT * FROM cadastro WHERE nome IN('Marina','Eduardo')

-- 5
SELECT NOME, SOBRENOME, SALARIO, (SALARIO*12) as "ANUAL", ENDERECO, DT_CADASTRO FROM cadastro

-- 6
SELECT NOME,SOBRENOME ,((SALARIO*10)/100) as "10%" FROM cadastro

-- 7
SELECT * FROM cadastro WHERE SALARIO between 4000 and 5000

-- 8
SELECT * FROM cadastro WHERE SALARIO >= 4000

-- 9 
SELECT * FROM cadastro WHERE SALARIO IN(4000,8000)

-- 10
SELECT * FROM cadastro WHERE NOME LIKE '%a%'

-- 11
SELECT * FROM cadastro WHERE NOME LIKE 'M%'

-- 12
SELECT * FROM cadastro WHERE NOME = 'Marcelo'

-- 13
SELECT * FROM cadastro WHERE NOME NOT IN('Carlos','Fernando')

-- 14
SELECT * FROM cadastro WHERE SALARIO <> 1000