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


-- Volcando estructura de base de datos para pokemon
CREATE DATABASE IF NOT EXISTS `pokemon` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `pokemon`;

-- Volcando estructura para tabla pokemon.entrenadores
CREATE TABLE IF NOT EXISTS `entrenadores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL DEFAULT '',
  `apellidos` varchar(100) NOT NULL DEFAULT '',
  `origen` varchar(50) NOT NULL DEFAULT '',
  `email` varchar(50) NOT NULL DEFAULT '',
  `edad` varchar(3) NOT NULL DEFAULT '',
  `nick` varchar(50) NOT NULL DEFAULT '',
  `password` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla pokemon.entrenadores: ~0 rows (aproximadamente)
DELETE FROM `entrenadores`;
/*!40000 ALTER TABLE `entrenadores` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrenadores` ENABLE KEYS */;

-- Volcando estructura para tabla pokemon.entrenadores_medallas
CREATE TABLE IF NOT EXISTS `entrenadores_medallas` (
  `entrenadores_id` int(11) NOT NULL,
  `medallas_id` int(11) NOT NULL,
  PRIMARY KEY (`entrenadores_id`,`medallas_id`),
  KEY `FK_medallas_entrenadores` (`medallas_id`),
  CONSTRAINT `FK_entrenadores_medallas` FOREIGN KEY (`entrenadores_id`) REFERENCES `entrenadores` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_medallas_entrenadores` FOREIGN KEY (`medallas_id`) REFERENCES `medallas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla pokemon.entrenadores_medallas: ~0 rows (aproximadamente)
DELETE FROM `entrenadores_medallas`;
/*!40000 ALTER TABLE `entrenadores_medallas` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrenadores_medallas` ENABLE KEYS */;

-- Volcando estructura para tabla pokemon.entrenadores_pokemons
CREATE TABLE IF NOT EXISTS `entrenadores_pokemons` (
  `entrenadores_id` int(11) NOT NULL,
  `pokemons_id` int(11) NOT NULL,
  PRIMARY KEY (`entrenadores_id`,`pokemons_id`),
  KEY `FK_entrenadores_pokemons_pokemons` (`pokemons_id`),
  CONSTRAINT `FK__entrenadores` FOREIGN KEY (`entrenadores_id`) REFERENCES `entrenadores` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_entrenadores_pokemons_pokemons` FOREIGN KEY (`pokemons_id`) REFERENCES `pokemons` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla pokemon.entrenadores_pokemons: ~0 rows (aproximadamente)
DELETE FROM `entrenadores_pokemons`;
/*!40000 ALTER TABLE `entrenadores_pokemons` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrenadores_pokemons` ENABLE KEYS */;

-- Volcando estructura para tabla pokemon.medallas
CREATE TABLE IF NOT EXISTS `medallas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `gimnasio` varchar(50) NOT NULL,
  `entrenador` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla pokemon.medallas: ~0 rows (aproximadamente)
DELETE FROM `medallas`;
/*!40000 ALTER TABLE `medallas` DISABLE KEYS */;
/*!40000 ALTER TABLE `medallas` ENABLE KEYS */;

-- Volcando estructura para tabla pokemon.pokemons
CREATE TABLE IF NOT EXISTS `pokemons` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `sexo` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla pokemon.pokemons: ~0 rows (aproximadamente)
DELETE FROM `pokemons`;
/*!40000 ALTER TABLE `pokemons` DISABLE KEYS */;
/*!40000 ALTER TABLE `pokemons` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
