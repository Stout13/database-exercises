USE join_test_db;
# list of roles along with the number of users that have a given role
# select count of role_id from users
# select count(*) as users from users

SELECT COUNT(*), roles.name FROM roles JOIN users ON roles.id = users.role_id GROUP BY roles.name;
# JOIN roles ON users.role_id GROUP BY
# SELECT COUNT(*), roles.name FROM roles GROUP BY roles.name;




#     JOIN users u ON roles.id = u.role_id GROUP BY role_id;
# SELECT roles.name FROM roles JOIN users u on roles.id = u.role_id GROUP BY roles.name;
# SELECT COUNT(role_id), role_id FROM users JOIN roles r on users.role_id = r.id GROUP BY role_id;


