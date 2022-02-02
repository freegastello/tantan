INSERT INTO tantandb.customer (name, age, deleted) VALUES ('First', 22, 0);

SELECT * FROM tantandb.customer;

DELETE FROM tantandb.customer WHERE id = 2;

SELECT * FROM tantandb.customer;

INSERT INTO tantandb.customer(name, age, deleted) VALUES ('Two', 22, 0);