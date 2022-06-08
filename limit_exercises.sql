USE employees;

SELECT DISTINCT employees.employees.last_name FROM employees ORDER BY last_name DESC LIMIT 10;

SELECT emp_no FROM employees.salaries ORDER BY employees.salaries.salary  DESC LIMIT 5 OFFSET 5;
