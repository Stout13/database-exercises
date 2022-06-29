# Don't use aliases in WHERE clauses.

# It is not permissible to refer to a column alias in a WHERE clause,
# because the column value might not yet be determined
# when the WHERE clause is executed. This query will
# fail with an error:

# SELECT birth
# _date, CONCAT(first_name, ' ', last_name)
# AS full_name, gender
# FROM employees
# WHERE hire_date='1985-01-01'
#   AND full_name='Arie Staelin';

# Create a new file named aliases_exercises.sql.

# Use the employees database.

USE employees;
# Return 10 employees in a result set named 'full_name' in the format of 'last name, first name' for each employee.

SELECT birth_date AS DOB, CONCAT(emp_no, ' - ', last_name, ', ', first_name) AS 'employee_number,last_name,first_name' FROM employees ORDER BY emp_no LIMIT 10;

# Add the date of birth for each employee as 'DOB' to the query.
#
# Update the query to format full name to include the employee number so it is formatted as 'employee number - last name, first name'.
#
# The final result should look like this: