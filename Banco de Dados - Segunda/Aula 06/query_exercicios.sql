--exercicio 1a
select min(salary) from hr.employees;
--exercicio 1b
select max(salary) from hr.employees;
--exercicio 1c
select avg(salary) from hr.employees;
--exercicio 1d
select sum(salary), job_id from hr.employees group by job_id;
--exercicio 1e
select avg(salary), department_id from hr.employees group by department_id;
--exercicio 1f
select avg(salary), department_id from hr.employees where department_id > 80 group by department_id;

--exercicio 2
select min(salary), manager_id from hr.employees
where manager_id is not null
and salary > 6000
group by manager_id
order by manager_id desc

--exercicio 3