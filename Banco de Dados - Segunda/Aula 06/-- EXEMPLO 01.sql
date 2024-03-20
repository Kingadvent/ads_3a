-- EXEMPLO 01
SELECT employee_id, last_name, job_id, salary FROM hr.employees
WHERE salary >= 10000 AND job_id like '%MAN%'

-- EXEMPLO 02
SELECT employee_id, last_name, job_id, salary FROM hr.employees
WHERE salary >= 10000 OR job_id like '%MAN%'

-- EXEMPLO 03
SELECT employee_id, last_name, job_id, salary FROM hr.employees ORDER BY last_name
    
SELECT employee_id, last_name, job_id, salary FROM hr.employees ORDER BY last_name ASC
    
SELECT employee_id, last_name, job_id, salary FROM hr.employees ORDER BY last_name DESC

-- EXEMPLO 04
SELECT last_name || ' possuí o id ' || employee_id || ' e ganha R$' || salary || ' por mês' 
    AS "CONCATENADO"
    FROM hr.employees

-- EXEMPLO 05
SELECT SUM(salary) FROM hr.employees -- SOMA DOS SALARIOS
SELECT MAX(salary) FROM hr.employees -- SALARIO MAXIMO
SELECT MIN(salary) FROM hr.employees -- SALARIO MINIMO
SELECT COUNT(*) FROM hr.employees -- CONTAGEM
SELECT AVG(salary) FROM hr.employees -- MEDIA

SELECT SUM(salary),MIN(salary),MAX(salary),AVG(salary),COUNT(*) FROM hr.employees

SELECT COUNT(*) FROM hr.employees WHERE department_id = 10

-- EXEMPLO 06 // POR DEPARTAMENTO
SELECT department_id,AVG(salary) FROM hr.employees
GROUP BY department_id
ORDER BY department_id

SELECT department_id,COUNT(*) FROM hr.employees
GROUP BY department_id
ORDER BY department_id

SELECT * FROM hr.departments WHERE department_id = 80