SELECT 'delete later than 91' AS 'mid-century-modern';
DELETE FROM albums WHERE releaseDate > 1991;
SELECT 'delete disco' AS 'mid-century-modern';
DELETE FROM albums WHERE genre = 'disco';
SELECT 'delete Whitney' AS 'bodyguard';
DELETE FROM albums WHERE artist = 'Whitney Houston';

