CREATE DATABASE bassjude_dyplomy CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

DROP DATABASE bassjude_dyplomy;

value="drop-and-create"/>
        value="update"/>

ALTER TABLE studenci MODIFY numer_indeksu varchar(10) UNIQUE NOT NULL;
ALTER TABLE studenci MODIFY imie varchar(50) NOT NULL;
ALTER TABLE studenci MODIFY nazwisko varchar(100) NOT NULL;

ALTER TABLE stopien_naukowy MODIFY nazwa varchar(50) NOT NULL;

INSERT INTO `studenci` (`numer_indeksu`, `imie`, `nazwisko`) VALUES
('0000000000', 'Adam', 'Pierzchała'),
('0000000001', 'Piotr', 'Fronczewski'),
('0000000002', 'Andrzej', 'Duda'),
('0000000003', 'Mikołaj', 'Iksiński'),
('0000000004', 'Aneta', 'Wędzonka'),
('0000000005', 'Amelia', 'Pierzchała'),
('0000000006', 'Halina', 'Mroziak'),
('0000000007', 'Krzysztof', 'Nowicki'),
('0000000008', 'Anna', 'Piasecka'),
('0000000009', 'Piotr', 'Kowalski'),
('0000000010', 'Jarosław', 'Boberek'),
('0000000011', 'Wojciech', 'Malajkat'),
('0000000012', 'Cezary', 'Pazura'),
('0000000013', 'Janusz', 'Gajos'),
('0000000014', 'Jan', 'Nowicki'),
('0000000015', 'Mirosław', 'Baka'),
('0000000016', 'Jacek', 'Braciak'),
('0000000017', 'Tomasz', 'Sapryk'),
('0000000018', 'Stanisław', 'Górka'),
('0000000019', 'Bartosz', 'Gelner'),
('0000000020', 'Janina', 'Górecka');

INSERT INTO `stopien_naukowy` (`nazwa`) VALUES
('profesor'),
('doktor'),
('magister'),
('inżynier'),
('licencjat');