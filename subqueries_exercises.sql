USE employees;

# SELECT employees.employees.hire_date FROM employees WHERE (employees.employees.emp_no = 101010);

SELECT CONCAT(employees.employees.last_name, ', ', employees.employees.first_name) AS name FROM employees WHERE (employees.employees.hire_date = '1990-10-22');
# Find all the employees with the same hire date as employee 101010 using a subquery.
#
# 69 Rows
#
# Find all the titles held by all employees with the first name Aamod.
#

SELECT titles.title, CONCAT(last_name, ', ', first_name) FROM titles JOIN employees as e on titles.emp_no = e.emp_no WHERE (first_name IN ('Aamod'));


# 314 total titles, 6 unique titles
#
# Find all the current department managers that are female.

SELECT CONCAT(last_name, ', ', first_name) AS NAME, gender FROM employees WHERE employees.gender = 'F';
#
# +------------+------------+
# | first_name | last_name  |
# +------------+------------+
# | Isamu      | Legleitner |
# | Karsten    | Sigstam    |
# | Leon       | DasSarma   |
# | Hilary     | Kambil     |
# +------------+------------+