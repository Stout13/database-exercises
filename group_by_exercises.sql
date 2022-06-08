# Create a new file named group_by_exercises.sql.
# In your script, use DISTINCT to find the unique titles in the titles table. Your results should look like:
#
USE employees;

SELECT DISTINCT title FROM employees.titles;

SELECT DISTINCT last_name FROM employees WHERE employees.employees.last_name LIKE ('%E')
AND employees.employees.last_name LIKE ('E%') GROUP BY last_name ORDER BY last_name ASC;

SELECT DISTINCT last_name, first_name FROM employees WHERE employees.employees.last_name LIKE ('%E')
                                                       AND employees.employees.last_name LIKE ('E%') ORDER BY first_name ASC;

SELECT COUNT(DISTINCT last_name) FROM employees WHERE (employees.employees.last_name LIKE ('%q%')
AND employees.employees.last_name NOT LIKE ('%qu%'));

SELECT COUNT(*), gender FROM employees WHERE employees.employees.last_name OR employees.employees.first_name IN ('Irena', 'Vidya', 'Maya') GROUP BY gender;

# Senior Engineer
# Staff
# Engineer
# Senior Staff
# Assistant Engineer
# Technique Leader
# Manager
# Find your query for employees whose last names start and end with 'E'. Update the query to find just the unique last names that start and end with 'E' using GROUP BY. The results should be:


# Eldridge
# Erbe
# Erde
# Erie
# Etalle
# Update your previous query to now find unique combinations of first and last name where the last name starts and ends with 'E'. You should get 846 rows.
#
#     Find the unique last names with a 'q' but not 'qu'. Your results should be:
#
#
#     Chleq
#     Lindqvist
#     Qiwen
#     Add a COUNT() to your results and use ORDER BY to make it easier to find employees whose unusual name is shared with others.
#
#
# 189 Chleq
# 190 Lindqvist
# 168 Qiwen
# Update your query for 'Irena', 'Vidya', or 'Maya'. Use count(*) and GROUP BY to find the number of employees for each gender with those names. Your results should be: