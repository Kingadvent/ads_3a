SELECT first_name, salary+1000 FROM hr.employees

SELECT first_name, salary AS "SALARIO", (salary*10)/100 AS "10%", salary+((salary*10)/100) AS "SALARIO COM AUMENTO" FROM hr.employees

SELECT * FROM hr.employees WHERE first_name = 'Steven'
SELECT * FROM hr.employees WHERE employee_id = 100
SELECT * FROM hr.departments WHERE department_name = 'Marketing'

SELECT first_name AS "NOME",
salary AS "SALARIO",
(salary*10)/100 AS '10%',
salary*((salary*10)/100) AS "SALARIO COM AUMENTO"
FROM hr.employees WHERE departmente_id = 60

SELECT * FROM hr.employees WHERE salary < 10000 ANDA salary > 5000
SELECT frist_nam,salary FROM hr.employees WHERE salary between 500 AS 10000

SELECT department_id, department_name FROM hr.departments WHERE department_name = 'Administration' OR department_name = 'Marketing'

SELECT department_id, department_name
FROM hr.departments WHERE department_name IN('Administration','Marketing')

SELECT department_id, department_name
FROM hr.departments WHERE department_name LIKE 'F%e'

SELECT employee_id, first_name, job_id, manager_id FROM hr.employees WHERE manager_id IS NOT NULL