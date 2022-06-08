USE codeup_test_db;

SELECT 'all the things' AS 'flip-flaps';
SELECT * FROM codeup_test_db.albums;
SELECT  'all the albums released before 1980' AS 'classics';
SELECT * FROM codeup_test_db.albums WHERE albums.releaseDate < 1980;
SELECT 'bad thriller' AS 'dangerous';
SELECT * FROM codeup_test_db.albums WHERE albums.artist = 'Michael Jackson';
UPDATE albums SET sales = sales*10;
UPDATE albums SET releaseDate = (CASE
                                     WHEN albums.releaseDate < 1980
                                         THEN replace(releaseDate, releaseDate, releaseDate-100)
                                     ELSE releaseDate
    END
    );
UPDATE albums SET artist = (CASE
                                WHEN albums.artist = 'Michael Jackson'
                                    THEN replace(artist, artist, 'Peter Jackson')
                                ELSE artist
    END
    );