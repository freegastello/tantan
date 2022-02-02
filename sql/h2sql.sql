CREATE TABLE `tantandb`.`customer` (
                                       `id` BIGINT NOT NULL AUTO_INCREMENT,
                                       `firstName` VARCHAR(45) NULL,
                                       `lastName` VARCHAR(45) NULL,
                                       `email` VARCHAR(45) NULL,
                                       PRIMARY KEY (`id`));

INSERT INTO tantandb.customer (firstName, lastName, email) VALUES ('Egorka', 'Glushko', 'egor@sa.ru');

SELECT * FROM tantandb.customer;



