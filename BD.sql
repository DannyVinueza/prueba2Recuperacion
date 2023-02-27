USE recuperacion;

CREATE TABLE `recuperacion`.`dias` (
  `iddias` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `dias` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`iddias`));

INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('1');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('2');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('3');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('4');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('5');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('6');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('7');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('8');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('9');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('10');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('11');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('12');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('13');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('14');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('15');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('16');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('17');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('18');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('19');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('20');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('21');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('22');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('23');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('24');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('25');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('26');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('27');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('28');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('29');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('30');
INSERT INTO `recuperacion`.`dias` (`dias`) VALUES ('31');

CREATE TABLE `recuperacion`.`mes` (
  `idmes` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `mes` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`idmes`));

INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Enero');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Febrero');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Marzo');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Abril');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Mayo');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Junio');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Julio');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Agosto');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Septiembre');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Octubre');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Noviembre');
INSERT INTO `recuperacion`.`mes` (`mes`) VALUES ('Diciembre');

CREATE TABLE `recuperacion`.`anio` (
  `idanio` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `anio` INT NOT NULL,
  PRIMARY KEY (`idanio`));

CREATE TABLE `recuperacion`.`fecha` (
  `idfecha` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `fecha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idfecha`));


