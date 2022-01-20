CREATE TABLE country
(
    id        SERIAL                   NOT NULL PRIMARY KEY,
    country   VARCHAR(250)             NOT NULL,
    president VARCHAR(250)             NOT NULL,
    kod       VARCHAR(250)             NOT NULL
);
INSERT INTO country (country, president, kod)
VALUES ('Kyrgyzstan', 'Sadyr Japarov', '+996'),
       ('USA', 'Joe Biden', '+1'),
       ('Russia', 'Vladimir Putin', '+7'),
       ('France', 'Emmanuel Macron', '+33'),
       ('Germany', 'Frank-Walter Steinmeier', '+49');

CREATE TABLE city
(
    id        SERIAL                    NOT NULL PRIMARY KEY,
    name      VARCHAR(250)              NOT NULL,
    naselenie VARCHAR(250)              NOT NULL,
    ploshad   VARCHAR(250)              NOT NULL
);
INSERT INTO city(name, naselenie, ploshad)
VALUES ('Bishkek', '1 088 900', '127 км²'),
       ('New York', '8 419 000', '783,8 км²'),
       ('Moscow', '11 920 000', '2 511 км²'),
       ('Paris', '2 161 000', '105,4 км²'),
       ('Berlin', '3 645 000', '891,8 км²');

CREATE TABLE mayor
(
    id            SERIAL       NOT NULL PRIMARY KEY,
    first_name    VARCHAR(250) NOT NULL,
    last_name     VARCHAR(250) NOT NULL,
    gender        VARCHAR(250) NOT NULL,
    date_of_birth VARCHAR      NOT NULL,
    phone_num     VARCHAR(250) NOT NULL
);
INSERT INTO mayor (first_name, last_name, gender, date_of_birth, phone_num)
VALUES ('Aibek', 'Junushaliev', 'Male', '07/06/1976', '+996 509 111 002'),
       ('Eric', 'Adams', 'Male', '09/01/1960', '+1 347 325 0385'),
       ('Sergei', 'Sobyanin', 'Male', '10/09/1994', '+7 922 111 05 00'),
       ('Ann', 'Hidalgo', 'Female', '06/19/1959', '+33 1 47 20 39 25'),
       ('Franziska', 'Giffey', 'Female', '05/03/1978', '+49 30 7178 9427');