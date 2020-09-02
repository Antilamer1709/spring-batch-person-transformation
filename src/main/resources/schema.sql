DROP TABLE PUBLIC.people IF EXISTS;

CREATE TABLE PUBLIC.people  (
    person_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);


INSERT INTO PUBLIC.people (first_name, last_name) VALUES ('Cat1', 'Dog1');
INSERT INTO PUBLIC.people (first_name, last_name) VALUES ('Cat2', 'Dog2');
INSERT INTO PUBLIC.people (first_name, last_name) VALUES ('Cat3', 'Dog3');
INSERT INTO PUBLIC.people (first_name, last_name) VALUES ('Cat4', 'Dog4');
INSERT INTO PUBLIC.people (first_name, last_name) VALUES ('Cat5', 'Dog5');
INSERT INTO PUBLIC.people (first_name, last_name) VALUES ('Cat6', 'Dog6');
INSERT INTO PUBLIC.people (first_name, last_name) VALUES ('Cat7', 'Dog7');
INSERT INTO PUBLIC.people (first_name, last_name) VALUES ('Cat8', 'Dog8');
INSERT INTO PUBLIC.people (first_name, last_name) VALUES ('Cat9', 'Dog9');