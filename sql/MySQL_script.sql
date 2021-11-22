create database contactdb;

CREATE TABLE `animals`
(
    `id`      bigint      NOT NULL AUTO_INCREMENT,
    `name`    varchar(45) NOT NULL,
    `age`     int(3),
    `deleted` int(1)      NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8