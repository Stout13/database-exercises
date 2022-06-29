USE codeup_test_db;
SELECT 'The name of all albums by Pink Floyd' AS 'hello';
SELECT * FROM codeup_test_db.albums WHERE artist = 'Pink Floyd';
SELECT releaseDate FROM codeup_test_db.albums WHERE recordName = 'Sgt. Pepper''s Lonely Hearts Club Band';
SELECT genre FROM codeup_test_db.albums WHERE recordName = 'Nevermind';
SELECT recordName FROM codeup_test_db.albums WHERE releaseDate > 1989;
SELECT recordName FROM codeup_test_db.albums WHERE sales > 20;

