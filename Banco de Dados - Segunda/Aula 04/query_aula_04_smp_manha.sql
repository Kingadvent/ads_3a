--01
SELECT * FROM hr.locations
--02
SELECT * FROM hr.departments
--03
SELECT * FROM hr.countries
--04  
SELECT * FROM hr.jobs
--05
SELECT * FROM hr.regions
--06
SELECT * FROM hr.employees
--07
SELECT * FROM hr.job_history

SELECT * FROM hr.departments
SELECT DEPARTMENT_ID FROM hr.departments.
SELECT DEPARTMENT_ID, DEPARTMENT_NAME FROM hr.departments
SELECT DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID FROM hr.departments

SELECT 
MANAGER_ID, 
DEPARTMENT_ID, 
LOCATION_ID, 
DEPARTMENT_NAME 
FROM hr.departments

--01 – Selecione os campos LOCATION_ID, CITY E STATE PROVINCE da tabela LOCATIONS.
SELECT * FROM hr.locations

SELECT 
LOCATION_ID,		
CITY,	
STATE_PROVINCE	
FROM hr.locations

--02  Selecione os campos DEPARTMENT_ID, DEPARTMENT_NAME e MANAGER_ID da tabela DEPARTMENTS.
SELECT 
DEPARTMENT_ID, 
DEPARTMENT_NAME,
MANAGER_ID
FROM hr.departments

--03 Selecione os campos COUNTRY_ID e  COUNTRY NAME da tabela COUNTRIES.
SELECT country_id, country_name FROM hr.countries

--04 Selecione os campos JOB_TITLE e MAX_SALARY da tabela JOBS
SELECT job_title, max_salary FROM hr.jobs

--05 Selecione o campo REGION_NAME da tabela REGIONS.
SELECT region_name FROM hr.regions

--06 Selecione os campos EMPLOYEE_ID, FIRST_NAME, LAST_NAME e SALARY da tabela EMPLOYEES.
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY FROM hr.employees

--07 Selecione os camps EMPLOYEE_ID, START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID da tabela JOB_HISTORY
SELECT EMPLOYEE_ID, START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID FROM hr.job_history

--01 – Selecione os campos LOCATION_ID, CITY E STATE PROVINCE da tabela LOCATIONS.
SELECT * FROM hr.locations

SELECT 
l.LOCATION_ID "COD LOCALIZACAO",	
l.STREET_ADDRESS "ENDERECO",
l.POSTAL_CODE "CEP",
l.CITY "CIDADE",	
l.STATE_PROVINCE "ESTADO",
l.COUNTRY_ID "CODIGO DO PAÍS"
FROM hr.locations l

--02  Selecione os campos DEPARTMENT_ID, DEPARTMENT_NAME e MANAGER_ID da tabela DEPARTMENTS.
SELECT 
d.DEPARTMENT_ID  "CODIGO", 
d.DEPARTMENT_NAME  "DEPARTAMENTO",
d.MANAGER_ID  "CODIGO DO GERENTE", 
d.LOCATION_ID  "CODIGO DA LOCALIDADE" 
FROM hr.departments d

--03 Selecione os campos COUNTRY_ID e  COUNTRY NAME da tabela COUNTRIES.
SELECT 
c.country_id "CODIGO", 
c.country_name "PAÍS",
c.region_id "CODIGO DA REGIÃO"
FROM hr.countries c


--04 Selecione os campos JOB_TITLE e MAX_SALARY da tabela JOBS
SELECT 
j.job_id "CODIGO CARGO", 
j.job_title "NOME DO CARGO", 
j.min_salary "MENOR SALARIO", 
j.max_salary "MAIOR SALARIO"
FROM hr.jobs j


--05 Selecione o campo REGION_NAME da tabela REGIONS.
SELECT 
r.region_id "Codigo da Regiao", 
r.region_name "Nome da Regiao" 
FROM hr.regions r


--06 Selecione os campos EMPLOYEE_ID, FIRST_NAME, LAST_NAME e SALARY da tabela EMPLOYEES.
SELECT 
e.EMPLOYEE_ID "COD FUNCIONARIO",
e.FIRST_NAME "NOME",	
e.LAST_NAME "SOBRENOME",	
e.EMAIL "EMAIL",	
e.PHONE_NUMBER "TELEFONE",	
e.HIRE_DATE "DATA DE INICIO",	
e.JOB_ID "COD CARGO",	
e.SALARY "SALARIO",	
e.COMMISSION_PCT "COMISSAO",	
e.MANAGER_ID "COD GERENTE",	
e.DEPARTMENT_ID "COD DEPTO" 
FROM hr.employees e

--07 Selecione os camps EMPLOYEE_ID, START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID da tabela JOB_HISTORY
SELECT 
jh.EMPLOYEE_ID "COD FUNC", 
jh.START_DATE "DATA INICIO", 
jh.END_DATE "DATA FIM", 
jh.JOB_ID "COD CARGO", 
jh.DEPARTMENT_ID "COD DEPTO"
FROM hr.job_history jh







