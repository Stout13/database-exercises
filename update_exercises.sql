USE codeup_test_db;

SELECT 'all the things' AS 'flip-flaps';
SELECT * FROM codeup_test_db.albums;
SELECT  'all the albums released before 1980' AS 'classics';
SELECT * FROM codeup_test_db.albums WHERE albums.releaseDate < 1980;
SELECT 'bad thriller' AS 'dangerous';
SELECT * FROM codeup_test_db.albums WHERE albums.artist = 'Michael Jackson';