-- Assumption is that the database is already created and the user has the necessary permissions to create tables and insert data into the tables.

-- The script will insert data into the table.


SELECT id, name, age, salary
FROM employees
WHERE age > 30 AND salary > 50000;
