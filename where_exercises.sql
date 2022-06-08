# Create a file named where_exercises.sql. Make sure to use the employees database before you begin.
# Find all employees with first names 'Irena', 'Vidya', or 'Maya' — 709 rows (Hint: Use IN).
# Find all employees whose last name starts with 'E' — 7,330 rows.
# Find all employees with a 'q' in their last name — 1,873 rows.

USE employees;

SELECT * FROM employees WHERE (employees.employees.first_name LIKE ('Irena')
                            OR employees.employees.first_name LIKE ('Vidya')
                            OR employees.employees.first_name LIKE ('Maya')
                            OR employees.employees.last_name LIKE ('E%')
                            OR employees.employees.last_name LIKE ('%q%'))
                            AND employees.employees.gender IN ('M');

SELECT * FROM employees WHERE (employees.employees.first_name LIKE ('Irena')
    OR employees.employees.first_name LIKE ('Vidya')
    OR employees.employees.first_name LIKE ('Maya')
    OR employees.employees.last_name LIKE ('%q%'))
#     OR employees.employees.last_name LIKE ('%Q%'))
                            AND employees.employees.gender IN ('M')
                            AND employees.employees.last_name LIKE ('E%')
                            AND employees.employees.last_name LIKE ('%E')
                            AND NOT employees.employees.last_name LIKE ('%qu%');


# Duplicate the previous query and update it to find all employees whose last name
# starts and ends with 'E'


# SELECT * FROM employees WHERE employees.employees.last_name LIKE ('E%');
#
# SELECT * FROM employees WHERE (employees.employees.last_name LIKE ('%q%') OR employees.employees.last_name LIKE ('%Q%'));
#
# SELECT * FROM employees WHERE (employees.employees.last_name) LIKE ()