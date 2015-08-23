# CREATE SCHEMA `events`
#   DEFAULT CHARACTER SET utf8
#   COLLATE utf8_unicode_ci;


DROP TABLE IF EXISTS `clients`;

CREATE TABLE `clients` (
  `clientId` INT(11)      NOT NULL AUTO_INCREMENT,
  `login`    CHAR(75)  NOT NULL,
  `passHash` VARCHAR(64)  NULL,
  `name`     VARCHAR(64)  NULL,
  `phone`    VARCHAR(150) NULL,
  `email`    VARCHAR(150) NULL,

  PRIMARY KEY (`clientId`),
  UNIQUE INDEX `clientId_UNIQUE` (`clientId` ASC),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE utf8_unicode_ci;
