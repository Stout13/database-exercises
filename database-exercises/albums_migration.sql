CREATE TABLE albums (
                         `id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         artist varchar(255),
                         recordName varchar(255),
                         releaseDate int(255),
                         sales dec(7,3),
                         genre varchar(255)
);

# id — auto-incrementing unsigned integer primary key
# artist — string for storing the recording artist name
# name — string for storing a record name
# release_date — integer representing year record was released
# sales — floating point value for number of records sold (in millions)
# genre — string for storing the record's genre(s)





