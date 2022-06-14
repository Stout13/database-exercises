USE employees;

SELECT employees.employees.hire_date FROM employees WHERE (employees.employees.emp_no = 101010);

SELECT CONCAT(employees.employees.last_name, ', ', employees.employees.first_name) AS name FROM employees WHERE (employees.employees.hire_date = '1990-10-22');
# Find all the employees with the same hire date as employee 101010 using a subquery.
#
# 69 Rows
#
# Find all the titles held by all employees with the first name Aamod.
#
# 314 total titles, 6 unique titles
#
# Find all the current department managers that are female.