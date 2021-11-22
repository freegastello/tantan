INSERT INTO tantandb.animals (name, age, deleted) VALUES ('First', 22, 0);

SELECT * FROM tantandb.animals;

DELETE FROM tantandb.animals WHERE id = 2;

SELECT * FROM tantandb.animals;

INSERT INTO tantandb.animals (name, age, deleted) VALUES ('Two', 22, 0);