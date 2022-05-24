-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.19-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para sanluis
CREATE DATABASE IF NOT EXISTS `sanluis` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `sanluis`;

-- Volcando estructura para tabla sanluis.asignaturas
CREATE TABLE IF NOT EXISTS `asignaturas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `horas` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla sanluis.asignaturas: ~2 rows (aproximadamente)
DELETE FROM `asignaturas`;
/*!40000 ALTER TABLE `asignaturas` DISABLE KEYS */;
INSERT INTO `asignaturas` (`id`, `nombre`, `horas`) VALUES
	(1, 'Programación', 210),
	(2, 'Bases de datos', 20);
/*!40000 ALTER TABLE `asignaturas` ENABLE KEYS */;

-- Volcando estructura para tabla sanluis.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `usuario` (`usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla sanluis.usuarios: ~2 rows (aproximadamente)
DELETE FROM `usuarios`;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`id`, `nombre`, `apellidos`, `email`, `telefono`, `dni`, `usuario`, `password`) VALUES
	(2, 'Alberto', 'Perez', 'aperz@gmail.com', '666666666', '7651233Y', 'alberto', '1234'),
	(3, 'Juan Vicente', 'Cachorro', 'cachorro@gmail.com', '666777333', '34565119H', 'tumorenito', '1234');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

-- Volcando estructura para tabla sanluis.usuarios_asignaturas
CREATE TABLE IF NOT EXISTS `usuarios_asignaturas` (
  `usuarios_id` int(11) NOT NULL,
  `asignaturas_id` int(11) NOT NULL,
  `nota` decimal(20,6) DEFAULT NULL,
  PRIMARY KEY (`usuarios_id`,`asignaturas_id`),
  KEY `FK_alumnos_asignaturas_asignaturas` (`asignaturas_id`),
  CONSTRAINT `FK_alumnos_asignaturas_asignaturas` FOREIGN KEY (`asignaturas_id`) REFERENCES `asignaturas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_alumnos_asignaturas_usuarios` FOREIGN KEY (`usuarios_id`) REFERENCES `usuarios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla sanluis.usuarios_asignaturas: ~3 rows (aproximadamente)
DELETE FROM `usuarios_asignaturas`;
/*!40000 ALTER TABLE `usuarios_asignaturas` DISABLE KEYS */;
INSERT INTO `usuarios_asignaturas` (`usuarios_id`, `asignaturas_id`, `nota`) VALUES
	(2, 1, 10.000000),
	(2, 2, 10.000000),
	(3, 1, 4.500000);
/*!40000 ALTER TABLE `usuarios_asignaturas` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
