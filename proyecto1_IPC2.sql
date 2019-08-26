-- MariaDB dump 10.17  Distrib 10.4.6-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: proyecto1_IPC2
-- ------------------------------------------------------
-- Server version	10.4.6-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `AR_S`
--

DROP TABLE IF EXISTS `AR_S`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AR_S` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `AR_S_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AR_S`
--

LOCK TABLES `AR_S` WRITE;
/*!40000 ALTER TABLE `AR_S` DISABLE KEYS */;
/*!40000 ALTER TABLE `AR_S` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CH_ZH`
--

DROP TABLE IF EXISTS `CH_ZH`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CH_ZH` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `CH_ZH_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CH_ZH`
--

LOCK TABLES `CH_ZH` WRITE;
/*!40000 ALTER TABLE `CH_ZH` DISABLE KEYS */;
INSERT INTO `CH_ZH` VALUES (2,28,8,7,'Alemania','Hamburgo',0,'2019-08-26 00:36:11','2019-08-26 09:38:31',135.90),(3,26,1,7,'Alemania','Hamburgo',0,'2019-08-26 00:40:10','2019-08-26 09:38:34',135.90),(4,40,9,7,'Alemania','Hamburgo',1,'2019-08-26 02:16:21',NULL,0.00);
/*!40000 ALTER TABLE `CH_ZH` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CO_AMA`
--

DROP TABLE IF EXISTS `CO_AMA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CO_AMA` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `CO_AMA_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CO_AMA`
--

LOCK TABLES `CO_AMA` WRITE;
/*!40000 ALTER TABLE `CO_AMA` DISABLE KEYS */;
INSERT INTO `CO_AMA` VALUES (1,4,5,4,'Brasil','Rio de Janeirio',0,'2019-08-25 15:59:04','2019-08-25 16:16:10',12.30),(2,10,6,4,'Brasil','Rio de Janeirio',0,'2019-08-26 09:38:09','2019-08-26 09:39:15',12.30),(3,17,4,4,'Brasil','Rio de Janeirio',1,'2019-08-26 09:38:12',NULL,0.00),(4,3,3,4,'Brasil','Rio de Janeirio',1,'2019-08-26 09:38:16',NULL,0.00);
/*!40000 ALTER TABLE `CO_AMA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CR_SJ`
--

DROP TABLE IF EXISTS `CR_SJ`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CR_SJ` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `CR_SJ_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CR_SJ`
--

LOCK TABLES `CR_SJ` WRITE;
/*!40000 ALTER TABLE `CR_SJ` DISABLE KEYS */;
INSERT INTO `CR_SJ` VALUES (1,4,5,4,'Brasil','Rio de Janeirio',0,'2019-08-24 16:16:15','2019-08-25 14:24:26',8.30),(2,10,6,4,'Brasil','Rio de Janeirio',0,'2019-08-24 16:16:15','2019-08-25 15:54:10',189.80),(3,17,4,4,'Brasil','Rio de Janeirio',0,'2019-08-24 16:16:15','2019-08-26 00:42:32',264.00),(4,3,3,4,'Brasil','Rio de Janeirio',0,'2019-08-24 16:16:15','2019-08-26 09:37:05',338.30),(5,16,2,4,'Brasil','Rio de Janeirio',0,'2019-08-24 16:16:15','2019-08-26 09:37:21',338.30),(6,1,1,2,'Colombia','Santander',0,'2019-08-25 14:35:29','2019-08-26 09:37:27',156.80),(7,33,4,4,'Brasil','Rio de Janeirio',0,'2019-08-25 23:15:03','2019-08-26 09:37:35',82.50),(8,34,2,4,'Brasil','Rio de Janeirio',1,'2019-08-26 00:42:35',NULL,0.00),(9,35,7,4,'Brasil','Rio de Janeirio',1,'2019-08-26 09:37:06',NULL,0.00),(10,36,2,4,'Brasil','Rio de Janeirio',1,'2019-08-26 09:37:23',NULL,0.00),(11,47,3,4,'Brasil','Rio de Janeirio',1,'2019-08-26 09:37:29',NULL,0.00),(12,56,5,4,'Brasil','Rio de Janeirio',1,'2019-08-26 09:37:36',NULL,0.00);
/*!40000 ALTER TABLE `CR_SJ` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DE_BE`
--

DROP TABLE IF EXISTS `DE_BE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DE_BE` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `DE_BE_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DE_BE`
--

LOCK TABLES `DE_BE` WRITE;
/*!40000 ALTER TABLE `DE_BE` DISABLE KEYS */;
/*!40000 ALTER TABLE `DE_BE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ES_AN`
--

DROP TABLE IF EXISTS `ES_AN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ES_AN` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `ES_AN_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ES_AN`
--

LOCK TABLES `ES_AN` WRITE;
/*!40000 ALTER TABLE `ES_AN` DISABLE KEYS */;
INSERT INTO `ES_AN` VALUES (1,7,1,5,'Alemania','Hamburgo',0,'2019-08-25 14:41:38','2019-08-25 18:55:25',49.00),(2,14,7,5,'Alemania','Hamburgo',0,'2019-08-25 14:42:06','2019-08-26 02:11:23',147.00),(3,6,4,5,'Alemania','Hamburgo',0,'2019-08-26 00:42:49','2019-08-26 02:17:25',24.50),(4,11,6,5,'Alemania','Hamburgo',0,'2019-08-26 00:43:16','2019-08-26 00:43:19',392.00),(5,15,1,5,'Alemania','Hamburgo',0,'2019-08-26 00:43:28','2019-08-26 09:27:49',110.30),(6,23,1,5,'Alemania','Hamburgo',0,'2019-08-26 00:43:39','2019-08-26 00:43:42',98.00);
/*!40000 ALTER TABLE `ES_AN` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FR_75`
--

DROP TABLE IF EXISTS `FR_75`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FR_75` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `FR_75_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FR_75`
--

LOCK TABLES `FR_75` WRITE;
/*!40000 ALTER TABLE `FR_75` DISABLE KEYS */;
/*!40000 ALTER TABLE `FR_75` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FR_COR`
--

DROP TABLE IF EXISTS `FR_COR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FR_COR` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `FR_COR_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FR_COR`
--

LOCK TABLES `FR_COR` WRITE;
/*!40000 ALTER TABLE `FR_COR` DISABLE KEYS */;
INSERT INTO `FR_COR` VALUES (1,7,1,5,'Alemania','Hamburgo',0,'2019-08-25 18:55:25','2019-08-26 02:34:31',122.00),(3,11,6,5,'Alemania','Hamburgo',0,'2019-08-26 00:43:19','2019-08-26 00:43:21',488.00),(4,23,1,5,'Alemania','Hamburgo',0,'2019-08-26 00:43:42','2019-08-26 00:43:47',122.00),(5,14,7,5,'Alemania','Hamburgo',0,'2019-08-26 02:11:23','2019-08-26 09:31:57',106.80),(6,6,4,5,'Alemania','Hamburgo',1,'2019-08-26 02:17:25',NULL,0.00),(7,15,1,5,'Alemania','Hamburgo',1,'2019-08-26 09:27:49',NULL,0.00),(8,28,8,7,'Alemania','Hamburgo',1,'2019-08-26 09:38:31',NULL,0.00),(9,26,1,7,'Alemania','Hamburgo',1,'2019-08-26 09:38:34',NULL,0.00);
/*!40000 ALTER TABLE `FR_COR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GB_LON`
--

DROP TABLE IF EXISTS `GB_LON`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GB_LON` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `GB_LON_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GB_LON`
--

LOCK TABLES `GB_LON` WRITE;
/*!40000 ALTER TABLE `GB_LON` DISABLE KEYS */;
/*!40000 ALTER TABLE `GB_LON` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GR_D`
--

DROP TABLE IF EXISTS `GR_D`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GR_D` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `GR_D_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GR_D`
--

LOCK TABLES `GR_D` WRITE;
/*!40000 ALTER TABLE `GR_D` DISABLE KEYS */;
/*!40000 ALTER TABLE `GR_D` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HN_DC`
--

DROP TABLE IF EXISTS `HN_DC`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `HN_DC` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `HN_DC_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HN_DC`
--

LOCK TABLES `HN_DC` WRITE;
/*!40000 ALTER TABLE `HN_DC` DISABLE KEYS */;
INSERT INTO `HN_DC` VALUES (1,1,1,2,'Colombia','Santander',0,'2019-08-24 16:16:15','2019-08-25 14:35:29',9.50),(2,9,5,2,'Colombia','Santander',1,'2019-08-24 16:16:15',NULL,0.00),(3,13,7,2,'Colombia','Santander',1,'2019-08-24 16:16:15',NULL,0.00),(4,8,3,2,'Colombia','Santander',1,'2019-08-24 16:16:15',NULL,0.00),(5,5,4,3,'Ecuador','Santa Elena',1,'2019-08-25 14:35:29',NULL,0.00),(6,2,2,3,'Ecuador','Santa Elena',1,'2019-08-25 23:03:37',NULL,0.00),(7,12,4,3,'Ecuador','Santa Elena',1,'2019-08-25 23:03:41',NULL,0.00),(8,30,2,2,'Colombia','Santander',1,'2019-08-25 23:09:37',NULL,0.00);
/*!40000 ALTER TABLE `HN_DC` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `IT_62`
--

DROP TABLE IF EXISTS `IT_62`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `IT_62` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `IT_62_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `IT_62`
--

LOCK TABLES `IT_62` WRITE;
/*!40000 ALTER TABLE `IT_62` DISABLE KEYS */;
INSERT INTO `IT_62` VALUES (1,26,1,7,'Alemania','Hamburgo',0,'2019-08-26 00:30:06','2019-08-26 00:40:10',12.30),(3,28,8,7,'Alemania','Hamburgo',0,'2019-08-26 00:35:47','2019-08-26 00:36:11',24.50),(4,40,9,7,'Alemania','Hamburgo',0,'2019-08-26 00:39:22','2019-08-26 02:16:21',24.50),(5,11,6,5,'Alemania','Hamburgo',0,'2019-08-26 00:43:21','2019-08-26 02:16:35',24.50),(6,23,1,5,'Alemania','Hamburgo',0,'2019-08-26 00:43:47','2019-08-26 02:17:05',24.50),(7,7,1,5,'Alemania','Hamburgo',0,'2019-08-26 02:34:31','2019-08-26 09:32:23',85.80),(8,14,7,5,'Alemania','Hamburgo',1,'2019-08-26 09:31:57',NULL,0.00),(9,44,2,7,'Alemania','Hamburgo',1,'2019-08-26 09:35:18',NULL,0.00),(10,48,4,7,'Alemania','Hamburgo',1,'2019-08-26 09:41:42',NULL,0.00);
/*!40000 ALTER TABLE `IT_62` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MX_CMX`
--

DROP TABLE IF EXISTS `MX_CMX`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MX_CMX` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `MX_CMX_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MX_CMX`
--

LOCK TABLES `MX_CMX` WRITE;
/*!40000 ALTER TABLE `MX_CMX` DISABLE KEYS */;
INSERT INTO `MX_CMX` VALUES (1,26,1,7,'Alemania','Hamburgo',0,'2019-08-25 22:55:08','2019-08-26 00:30:06',15.00),(2,28,8,7,'Alemania','Hamburgo',0,'2019-08-25 22:57:44','2019-08-26 00:35:47',15.00),(3,29,8,9,'Estados Unidos','Washington D.C.',0,'2019-08-25 23:03:45','2019-08-26 00:36:35',7.50),(4,40,9,7,'Alemania','Hamburgo',0,'2019-08-25 23:24:43','2019-08-26 00:39:21',7.50),(5,41,5,9,'Estados Unidos','Washington D.C.',0,'2019-08-25 23:26:06','2019-08-26 02:12:33',22.50),(6,42,4,9,'Estados Unidos','Washington D.C.',0,'2019-08-25 23:26:40','2019-08-26 09:28:14',75.00),(7,43,1,9,'Estados Unidos','Washington D.C.',0,'2019-08-25 23:27:09','2019-08-26 09:30:01',75.00),(8,44,2,7,'Alemania','Hamburgo',0,'2019-08-26 00:30:10','2019-08-26 09:35:18',67.50),(9,48,4,7,'Alemania','Hamburgo',0,'2019-08-26 00:35:49','2019-08-26 09:41:42',67.50),(10,55,3,9,'Estados Unidos','Washington D.C.',1,'2019-08-26 00:36:37',NULL,0.00),(11,19,1,6,'Estados Unidos','Las Vegas Nevada',1,'2019-08-26 09:34:15',NULL,0.00),(12,20,3,6,'Estados Unidos','Las Vegas Nevada',1,'2019-08-26 09:34:34',NULL,0.00),(13,21,5,6,'Estados Unidos','Las Vegas Nevada',1,'2019-08-26 09:34:40',NULL,0.00),(14,25,6,6,'Estados Unidos','Las Vegas Nevada',1,'2019-08-26 09:34:45',NULL,0.00);
/*!40000 ALTER TABLE `MX_CMX` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MX_HID`
--

DROP TABLE IF EXISTS `MX_HID`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MX_HID` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `MX_HID_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MX_HID`
--

LOCK TABLES `MX_HID` WRITE;
/*!40000 ALTER TABLE `MX_HID` DISABLE KEYS */;
INSERT INTO `MX_HID` VALUES (2,19,1,6,'Estados Unidos','Las Vegas Nevada',0,'2019-08-24 19:14:36','2019-08-26 09:34:15',313.50),(3,20,3,6,'Estados Unidos','Las Vegas Nevada',0,'2019-08-24 19:18:54','2019-08-26 09:34:34',313.50),(4,21,5,6,'Estados Unidos','Las Vegas Nevada',0,'2019-08-24 19:20:18','2019-08-26 09:34:40',313.50),(5,25,6,6,'Estados Unidos','Las Vegas Nevada',0,'2019-08-25 23:03:43','2019-08-26 09:34:45',82.50),(6,49,5,6,'Estados Unidos','Las Vegas Nevada',1,'2019-08-26 02:11:25',NULL,0.00),(7,22,7,6,'Estados Unidos','Las Vegas Nevada',1,'2019-08-26 09:34:17',NULL,0.00);
/*!40000 ALTER TABLE `MX_HID` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `NI_MN`
--

DROP TABLE IF EXISTS `NI_MN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `NI_MN` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `NI_MN_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `NI_MN`
--

LOCK TABLES `NI_MN` WRITE;
/*!40000 ALTER TABLE `NI_MN` DISABLE KEYS */;
/*!40000 ALTER TABLE `NI_MN` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PA_8`
--

DROP TABLE IF EXISTS `PA_8`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PA_8` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `PA_8_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PA_8`
--

LOCK TABLES `PA_8` WRITE;
/*!40000 ALTER TABLE `PA_8` DISABLE KEYS */;
INSERT INTO `PA_8` VALUES (1,4,5,4,'Brasil','Rio de Janeirio',0,'2019-08-25 14:24:26','2019-08-25 15:59:04',168.80),(2,10,6,4,'Brasil','Rio de Janeirio',0,'2019-08-25 15:54:10','2019-08-26 09:38:09',121.50),(3,17,4,4,'Brasil','Rio de Janeirio',0,'2019-08-26 00:42:33','2019-08-26 09:38:12',60.80),(4,3,3,4,'Brasil','Rio de Janeirio',0,'2019-08-26 09:37:05','2019-08-26 09:38:16',6.80),(5,16,2,4,'Brasil','Rio de Janeirio',1,'2019-08-26 09:37:21',NULL,0.00),(6,1,1,2,'Colombia','Santander',1,'2019-08-26 09:37:27',NULL,0.00),(7,33,4,4,'Brasil','Rio de Janeirio',1,'2019-08-26 09:37:35',NULL,0.00);
/*!40000 ALTER TABLE `PA_8` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PE_LAL`
--

DROP TABLE IF EXISTS `PE_LAL`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PE_LAL` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `PE_LAL_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PE_LAL`
--

LOCK TABLES `PE_LAL` WRITE;
/*!40000 ALTER TABLE `PE_LAL` DISABLE KEYS */;
/*!40000 ALTER TABLE `PE_LAL` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PT_LI`
--

DROP TABLE IF EXISTS `PT_LI`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PT_LI` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `PT_LI_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PT_LI`
--

LOCK TABLES `PT_LI` WRITE;
/*!40000 ALTER TABLE `PT_LI` DISABLE KEYS */;
/*!40000 ALTER TABLE `PT_LI` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SV_SS`
--

DROP TABLE IF EXISTS `SV_SS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SV_SS` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `SV_SS_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SV_SS`
--

LOCK TABLES `SV_SS` WRITE;
/*!40000 ALTER TABLE `SV_SS` DISABLE KEYS */;
/*!40000 ALTER TABLE `SV_SS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `US_75001`
--

DROP TABLE IF EXISTS `US_75001`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `US_75001` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `US_75001_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `US_75001`
--

LOCK TABLES `US_75001` WRITE;
/*!40000 ALTER TABLE `US_75001` DISABLE KEYS */;
INSERT INTO `US_75001` VALUES (1,24,5,8,'Rusia','Moscú',1,'2019-08-25 22:41:56',NULL,0.00),(2,27,6,8,'Rusia','Moscú',1,'2019-08-25 22:57:14',NULL,0.00),(3,37,4,8,'Rusia','Moscú',1,'2019-08-25 23:17:05',NULL,0.00),(4,50,3,8,'Rusia','Moscú',1,'2019-08-25 23:38:02',NULL,0.00),(5,51,1,10,'Suecia','Estocolmo',1,'2019-08-25 23:56:18',NULL,0.00),(6,52,4,10,'Suecia','Estocolmo',1,'2019-08-25 23:56:30',NULL,0.00);
/*!40000 ALTER TABLE `US_75001` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `US_79901`
--

DROP TABLE IF EXISTS `US_79901`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `US_79901` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `US_79901_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `US_79901`
--

LOCK TABLES `US_79901` WRITE;
/*!40000 ALTER TABLE `US_79901` DISABLE KEYS */;
INSERT INTO `US_79901` VALUES (1,29,8,9,'Estados Unidos','Washington D.C.',1,'2019-08-26 00:36:35',NULL,0.00),(2,41,5,9,'Estados Unidos','Washington D.C.',1,'2019-08-26 02:12:33',NULL,0.00),(3,42,4,9,'Estados Unidos','Washington D.C.',1,'2019-08-26 09:28:14',NULL,0.00),(4,43,1,9,'Estados Unidos','Washington D.C.',1,'2019-08-26 09:30:01',NULL,0.00);
/*!40000 ALTER TABLE `US_79901` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `US_90209`
--

DROP TABLE IF EXISTS `US_90209`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `US_90209` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `idEnvio` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idRuta` int(11) DEFAULT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `estado` tinyint(1) DEFAULT 0,
  `fechaIngreso` datetime DEFAULT NULL,
  `fechaSalida` datetime DEFAULT NULL,
  `costoTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  KEY `idEnvio` (`idEnvio`),
  CONSTRAINT `US_90209_ibfk_1` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `US_90209`
--

LOCK TABLES `US_90209` WRITE;
/*!40000 ALTER TABLE `US_90209` DISABLE KEYS */;
INSERT INTO `US_90209` VALUES (1,7,1,5,'Alemania','Hamburgo',0,'2019-08-24 16:16:15','2019-08-25 14:41:38',12.30),(2,14,7,5,'Alemania','Hamburgo',0,'2019-08-24 16:16:15','2019-08-25 14:42:06',12.30),(3,6,4,5,'Alemania','Hamburgo',0,'2019-08-24 16:16:15','2019-08-26 00:42:49',392.00),(4,11,6,5,'Alemania','Hamburgo',0,'2019-08-24 16:16:15','2019-08-26 00:43:16',392.00),(5,15,1,5,'Alemania','Hamburgo',0,'2019-08-25 14:41:38','2019-08-26 00:43:28',122.50),(6,23,1,5,'Alemania','Hamburgo',0,'2019-08-25 16:18:28','2019-08-26 00:43:39',98.00),(7,38,1,5,'Alemania','Hamburgo',1,'2019-08-25 23:20:57',NULL,0.00),(8,39,9,5,'Alemania','Hamburgo',1,'2019-08-25 23:22:19',NULL,0.00);
/*!40000 ALTER TABLE `US_90209` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nit` int(11) DEFAULT NULL,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `telefono` int(11) DEFAULT NULL,
  `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `direccion` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,87654321,'Diana Carolina Castillo',22231234,'diana1@gmail.com','2da Calle 3ra Avenida 1-18, Totonicapan'),(2,12345678,'Maria Luisa Gonzalez',77661163,'marialuisa@gmail.com','3ra Calle 4ta Avenida 1-23 Zona 1, Guatemala'),(3,79959962,'Cesar Reginaldo Tzoc Alvarado',77661163,'cesar201420927@cunoc.edu.gt','Final Zona Palin 5-09, Totonicapan'),(4,98786858,'Jorge Lopez Castro',77660000,'jorge01@hotmail.com','Final Zona 0, Guatemala'),(5,12332112,'Juan Jose cabrera Lopez',77660001,'juanjo13@gmail.com','4ta. Calle 3ra Av, 5-19 Zona 1, Totonicapan'),(6,98078912,'Mario Lopez Aguilar',77651234,'mario12@hotmail.com','14 Av 4ta Calle, Zona 4 Quetzaltenango'),(7,67891234,'Marta Maria Perez Sanchez',22345667,'martatita@hotmail.com','Ciudad de Guatemala'),(8,56473890,'Juan Gabriel Delgado',77660099,'juanga_sol@gmail.com','12 Av 3ra Calle 5-59, Ciudad de Guatemala'),(9,56788765,'Juan Manuel Perez Lopez',77661163,'juanmapl@gmail.com','3ra Calle 12Av, Zona 2 Quetzaltenango');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `envios`
--

DROP TABLE IF EXISTS `envios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `envios` (
  `idEnvios` int(11) NOT NULL AUTO_INCREMENT,
  `id_Cliente` int(11) DEFAULT NULL,
  `peso` decimal(10,2) NOT NULL,
  `categoria` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ingreso` date NOT NULL,
  `priorizar` tinyint(1) NOT NULL DEFAULT 0,
  `id_Ruta` int(11) DEFAULT NULL,
  `cod_D` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `paisD` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ciudad_D` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ubicacion` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `montoPriorizar` decimal(10,2) DEFAULT NULL,
  `montoPeso` decimal(10,2) DEFAULT NULL,
  `montoDestino` decimal(10,2) DEFAULT NULL,
  `montoTotal` decimal(10,2) DEFAULT NULL,
  `costo` decimal(12,2) DEFAULT 0.00,
  PRIMARY KEY (`idEnvios`),
  KEY `FK_IDRUTA` (`id_Ruta`),
  KEY `idCliente` (`id_Cliente`),
  CONSTRAINT `FK_IDRUTA` FOREIGN KEY (`id_Ruta`) REFERENCES `rutas` (`idRutas`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `envios_ibfk_1` FOREIGN KEY (`id_Cliente`) REFERENCES `clientes` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `envios`
--

LOCK TABLES `envios` WRITE;
/*!40000 ALTER TABLE `envios` DISABLE KEYS */;
INSERT INTO `envios` VALUES (1,1,12.25,'Documentos','2019-08-12',1,2,'CO-SAN','Colombia','Santander','PA-8',35.00,192.90,100.25,328.15,166.30),(2,2,24.50,'Automotriz','2019-08-12',0,3,'EC-SE','Ecuador','Santa Elena','HN-DC',0.00,385.90,110.50,496.40,0.00),(3,3,17.65,'Tecnologia','2019-08-12',0,4,'BR-RJ','Brasil','Rio de Janeirio','CO-AMA',0.00,278.00,140.25,418.25,345.10),(4,5,20.00,'Quimicos','2019-08-12',1,4,'BR-RJ','Brasil','Rio de Janeirio','Bod. Destino',35.00,315.00,140.25,490.25,189.40),(5,4,16.25,'Quimicos','2019-08-12',1,3,'EC-SE','Ecuador','Santa Elena','HN-DC',35.00,255.90,110.50,401.40,0.00),(6,4,13.75,'Quimicos','2019-08-13',0,5,'DE-HH','Alemania','Hamburgo','FR-COR',0.00,216.60,165.00,381.60,416.50),(7,1,29.75,'Tecnologia','2019-08-13',1,5,'DE-HH','Alemania','Hamburgo','Bod. Destino',35.00,468.60,165.00,668.60,269.10),(8,3,17.25,'Documentos','2019-08-13',0,2,'CO-SAN','Colombia','Santander','HN-DC',0.00,271.70,100.25,371.95,0.00),(9,5,33.75,'Salud','2019-08-13',1,2,'CO-SAN','Colombia','Santander','HN-DC',35.00,531.60,100.25,666.85,0.00),(10,6,1.25,'Documentos','2019-08-13',1,4,'BR-RJ','Brasil','Rio de Janeirio','Bod. Destino',35.00,19.70,140.25,194.95,323.60),(11,6,14.84,'Manufactura','2019-08-13',0,5,'DE-HH','Alemania','Hamburgo','Entregado',0.00,233.70,165.00,398.70,1296.50),(12,4,21.90,'Automotriz','2019-08-13',0,3,'EC-SE','Ecuador','Santa Elena','HN-DC',0.00,344.90,110.50,455.40,0.00),(13,7,16.00,'Documentos','2019-08-13',1,2,'CO-SAN','Colombia','Santander','HN-DC',35.00,252.00,100.25,387.25,0.00),(14,7,33.00,'Manufactura','2019-08-14',1,5,'DE-HH','Alemania','Hamburgo','IT-62',35.00,519.80,165.00,719.80,266.10),(15,1,12.30,'Quimicos','2019-08-13',0,5,'DE-HH','Alemania','Hamburgo','FR-COR',0.00,193.70,165.00,358.70,232.80),(16,2,50.00,'Documentos','2019-08-13',0,4,'BR-RJ','Brasil','Rio de Janeirio','PA-8',0.00,787.50,140.25,927.75,338.30),(17,4,60.00,'Automotriz','2019-08-13',1,4,'BR-RJ','Brasil','Rio de Janeirio','CO-AMA',35.00,945.00,140.25,1120.25,324.80),(19,1,1.75,'Documentos','2019-08-14',1,6,'US-89044','Estados Unidos','Las Vegas Nevada','MX-CMX',35.00,27.60,125.25,187.85,313.50),(20,3,13.26,'Quimicos','2019-08-14',0,6,'US-89044','Estados Unidos','Las Vegas Nevada','MX-CMX',0.00,208.80,125.25,334.05,313.50),(21,5,12.85,'Comercio','2019-08-14',1,6,'US-89044','Estados Unidos','Las Vegas Nevada','MX-CMX',35.00,202.40,125.25,362.65,313.50),(22,7,0.75,'Documentos','2019-08-14',0,6,'US-89044','Estados Unidos','Las Vegas Nevada','MX-HID',0.00,11.80,125.25,137.05,0.00),(23,1,21.20,'Documentos','2019-08-25',0,5,'DE-HH','Alemania','Hamburgo','Bod. Destino',0.00,333.90,165.00,498.90,342.50),(24,5,12.35,'Quimicos','2019-08-25',0,8,'RU-MOCK','Rusia','Moscú','US-75001',0.00,194.50,175.00,369.50,0.00),(25,6,31.00,'Automotriz','2019-08-25',1,6,'US-89044','Estados Unidos','Las Vegas Nevada','MX-CMX',35.00,488.30,125.25,648.55,82.50),(26,1,21.10,'Manufactura','2019-08-25',1,7,'DE-HH','Alemania','Hamburgo','FR-COR',75.00,332.30,165.00,572.30,163.20),(27,6,20.00,'Documentos','2019-08-25',0,8,'RU-MOCK','Rusia','Moscú','US-75001',0.00,315.00,175.00,490.00,0.00),(28,8,23.45,'Documentos','2019-08-25',1,7,'DE-HH','Alemania','Hamburgo','FR-COR',75.00,369.30,165.00,609.30,175.40),(29,8,21.75,'Comercio','2019-08-25',1,9,'US-20001','Estados Unidos','Washington D.C.','US-79901',75.00,342.60,185.50,603.10,7.50),(30,2,30.00,'Quimicos','2019-08-25',1,2,'CO-SAN','Colombia','Santander','HN-DC',75.00,472.50,100.25,647.75,0.00),(31,1,25.10,'Documentos','2019-08-25',1,1,'EC-SE','Ecuador','Santa Elena','Bodega',75.00,395.30,110.50,580.80,0.00),(32,6,12.98,'Manufactura','2019-08-25',0,1,'CO-SAN','Colombia','Santander','Bodega',0.00,204.40,100.25,304.65,0.00),(33,4,12.00,'Documentos','2019-08-25',1,4,'BR-RJ','Brasil','Rio de Janeirio','PA-8',75.00,189.00,140.25,404.25,82.50),(34,2,33.00,'Documentos','2019-08-25',1,4,'BR-RJ','Brasil','Rio de Janeirio','CR-SJ',75.00,519.80,140.25,735.05,0.00),(35,7,1.99,'Documentos','2019-08-25',1,4,'BR-RJ','Brasil','Rio de Janeirio','CR-SJ',75.00,31.30,140.25,246.55,0.00),(36,2,21.12,'Documentos','2019-08-25',1,4,'BR-RJ','Brasil','Rio de Janeirio','CR-SJ',75.00,332.60,140.25,547.85,0.00),(37,4,2.29,'Documentos','2019-08-25',1,8,'RU-MOCK','Rusia','Moscú','US-75001',75.00,36.10,175.00,286.10,0.00),(38,1,12.45,'Documentos','2019-08-25',1,5,'DE-HH','Alemania','Hamburgo','US-90209',75.00,196.10,165.00,436.10,0.00),(39,9,65.99,'Documentos','2019-08-25',1,5,'DE-HH','Alemania','Hamburgo','US-90209',75.00,1039.30,165.00,1279.30,0.00),(40,9,45.85,'Automotriz','2019-08-25',1,7,'DE-HH','Alemania','Hamburgo','CH-ZH',75.00,722.10,165.00,962.10,32.00),(41,5,50.10,'Manufactura','2019-08-25',1,9,'US-20001','Estados Unidos','Washington D.C.','US-79901',75.00,789.10,185.50,1049.60,22.50),(42,4,12.75,'Documentos','2019-08-25',1,9,'US-20001','Estados Unidos','Washington D.C.','US-79901',75.00,200.80,185.50,461.30,75.00),(43,1,25.90,'Documentos','2019-08-25',0,9,'US-20001','Estados Unidos','Washington D.C.','US-79901',0.00,407.90,185.50,593.40,75.00),(44,2,50.10,'Documentos','2019-08-25',1,7,'DE-HH','Alemania','Hamburgo','IT-62',75.00,789.10,165.00,1029.10,67.50),(45,1,12.00,'Documentos','2019-08-25',1,1,'CO-SAN','Colombia','Santander','Bodega',75.00,189.00,145.00,409.00,0.00),(46,2,123.00,'Documentos','2019-08-25',1,1,'EC-SE','Ecuador','Santa Elena','Bodega',75.00,1937.30,130.25,2142.55,0.00),(47,3,17.98,'Documentos','2019-08-25',1,4,'BR-RJ','Brasil','Rio de Janeirio','CR-SJ',75.00,283.20,140.25,498.45,0.00),(48,4,344.50,'Quimicos','2019-08-25',1,7,'DE-HH','Alemania','Hamburgo','IT-62',75.00,5425.90,165.00,5665.90,67.50),(49,5,35.90,'Documentos','2019-08-25',1,6,'US-89044','Estados Unidos','Las Vegas Nevada','MX-HID',75.00,565.40,149.50,789.90,0.00),(50,3,17.90,'Documentos','2019-08-25',1,8,'RU-MOCK','Rusia','Moscú','US-75001',75.00,281.90,175.00,531.90,0.00),(51,1,24.00,'Documentos','2019-08-25',1,10,'SE-AB','Suecia','Estocolmo','US-75001',75.00,378.00,201.75,654.75,0.00),(52,4,32.00,'Documentos','2019-08-25',0,10,'SE-AB','Suecia','Estocolmo','US-75001',0.00,504.00,201.75,705.75,0.00),(53,4,34.90,'Documentos','2019-08-25',1,1,'RU-MOCK','Rusia','Moscú','Bodega',75.00,549.70,175.00,799.70,0.00),(54,1,32.00,'Documentos','2019-08-26',1,1,'SE-AB','Suecia','Estocolmo','Bodega',75.00,504.00,201.75,780.75,0.00),(55,3,12.00,'Documentos','2019-08-26',1,9,'US-20001','Estados Unidos','Washington D.C.','MX-CMX',75.00,189.00,185.50,449.50,0.00),(56,5,10.99,'Documentos','2019-08-26',0,4,'BR-RJ','Brasil','Rio de Janeirio','CR-SJ',0.00,173.10,140.25,313.35,0.00),(57,1,12.32,'Documentos','2019-08-26',0,1,'CO-SAN','Colombia','Santander','Bodega',0.00,261.80,145.00,406.80,0.00),(58,4,25.00,'Documentos','2019-08-26',1,1,'BR-RJ','Brasil','Rio de Janeirio','Bodega',75.00,531.30,140.25,746.55,0.00),(59,5,45.00,'Documentos','2019-08-26',1,1,'BR-RJ','Brasil','Rio de Janeirio','Bodega',75.00,956.30,140.25,1171.55,0.00),(60,1,14.79,'Automotriz','2019-08-26',1,1,'RU-MOCK','Rusia','Moscú','Bodega',75.00,314.30,175.00,564.30,0.00),(61,1,30.00,'Manufactura','2019-08-26',1,1,'SE-AB','Suecia','Estocolmo','Bodega',75.00,637.50,201.75,914.25,0.00);
/*!40000 ALTER TABLE `envios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturas`
--

DROP TABLE IF EXISTS `facturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facturas` (
  `noFactura` int(11) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) DEFAULT NULL,
  `nitCliente` int(11) DEFAULT NULL,
  `nombre` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `direccion` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fecha` date NOT NULL,
  `idEnvio` int(11) NOT NULL,
  `montoTotal` decimal(10,2) NOT NULL,
  PRIMARY KEY (`noFactura`),
  KEY `idEnvio` (`idEnvio`),
  KEY `idCliente` (`idCliente`),
  CONSTRAINT `facturas_ibfk_2` FOREIGN KEY (`idEnvio`) REFERENCES `envios` (`idEnvios`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `facturas_ibfk_3` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturas`
--

LOCK TABLES `facturas` WRITE;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `precios`
--

DROP TABLE IF EXISTS `precios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `precios` (
  `idPrecio` int(11) NOT NULL AUTO_INCREMENT,
  `tipoDePago` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  PRIMARY KEY (`idPrecio`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `precios`
--

LOCK TABLES `precios` WRITE;
/*!40000 ALTER TABLE `precios` DISABLE KEYS */;
INSERT INTO `precios` VALUES (1,'PrecioPorLibra',21.25),(2,'PrecioPriorizacion',75.00),(3,'TarifaOperacion',10.00);
/*!40000 ALTER TABLE `precios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puntosDeControl`
--

DROP TABLE IF EXISTS `puntosDeControl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `puntosDeControl` (
  `codigo` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pais_P` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ciudad_P` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tarifa` decimal(10,2) DEFAULT NULL,
  `tamañoBodega` int(2) NOT NULL,
  `encargado` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `encargado` (`encargado`),
  CONSTRAINT `puntosDeControl_ibfk_1` FOREIGN KEY (`encargado`) REFERENCES `usuarios` (`usuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puntosDeControl`
--

LOCK TABLES `puntosDeControl` WRITE;
/*!40000 ALTER TABLE `puntosDeControl` DISABLE KEYS */;
INSERT INTO `puntosDeControl` VALUES ('AR-S','Argentina','Santiago',11.20,6,'alex26'),('CH-ZH','Suiza','Zúrich',15.10,7,'torres1'),('CO-AMA','Colombia','Amazonas',12.25,6,'tigre66'),('CR-SJ','Costa Rica','San José',8.25,5,'pedro01'),('DE-BE','Alemania','Berlin',14.20,6,'frank007'),('ES-AN','España','Andalucía',12.25,5,'alex26'),('FR-75','Francia','Paris',12.25,6,'b'),('FR-COR','Francia','Córgeca',15.25,5,'b'),('GB-LON','Gran Bretaña','Londres',15.10,6,'tigre66'),('GR-D','Grecias','Periferia de Epiro',15.25,5,'alex26'),('HN-DC','Honduras','Tegucigalpa',9.50,7,'juanjo21'),('IT-62','Italia','Lacio',12.25,5,'alex26'),('MX-CMX','México','Ciudad de México',7.50,7,'alex26'),('MX-HID','México','Hidalgo',8.25,5,'frank007'),('NI-MN','Nicaragua','Managua',7.25,5,'juanito12'),('PA-8','Panamá','Panamá',6.75,6,'torres1'),('PE-LAL','Perú','La Libertad',12.25,6,'frank007'),('PT-LI','Portugal','Lisboa',12.25,6,'juanito12'),('SV-SS','El Salvador','San Salvador',8.75,6,'torres1'),('US-75001','Estados Unidos','Dallas, Texas',12.25,6,'juanjo21'),('US-79901','Estados Unidos','El Paso, Texas',12.25,6,'juanjo21'),('US-90209','Estados Unidos','LA, California',12.25,6,'pedro01');
/*!40000 ALTER TABLE `puntosDeControl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rutas`
--

DROP TABLE IF EXISTS `rutas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rutas` (
  `idRutas` int(11) NOT NULL AUTO_INCREMENT,
  `Destino` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pais` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ciudad` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `puntosC` int(2) NOT NULL,
  `pc1` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pc2` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pc3` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pc4` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pc5` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idRutas`),
  KEY `FK_PC1` (`pc1`),
  KEY `FK_PC2` (`pc2`),
  KEY `FK_PC3` (`pc3`),
  KEY `FK_PC4` (`pc4`),
  KEY `FK_PC5` (`pc5`),
  CONSTRAINT `FK_PC1` FOREIGN KEY (`pc1`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PC2` FOREIGN KEY (`pc2`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PC3` FOREIGN KEY (`pc3`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PC4` FOREIGN KEY (`pc4`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_PC5` FOREIGN KEY (`pc5`) REFERENCES `puntosDeControl` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rutas`
--

LOCK TABLES `rutas` WRITE;
/*!40000 ALTER TABLE `rutas` DISABLE KEYS */;
INSERT INTO `rutas` VALUES (1,'Bodega','Bodega','Bodega',0.00,0,NULL,NULL,NULL,NULL,NULL),(2,'CO-SAN','Colombia','Santander',145.00,3,'HN-DC','CR-SJ','PA-8',NULL,NULL),(3,'EC-SE','Ecuador','Santa Elena',130.25,5,'HN-DC','NI-MN','CR-SJ','PA-8','CO-AMA'),(4,'BR-RJ','Brasil','Rio de Janeirio',140.25,3,'CR-SJ','PA-8','CO-AMA',NULL,NULL),(5,'DE-HH','Alemania','Hamburgo',165.00,4,'US-90209','ES-AN','FR-COR','IT-62',NULL),(6,'US-89044','Estados Unidos','Las Vegas Nevada',149.50,3,'MX-HID','MX-CMX','US-79901',NULL,NULL),(7,'DE-HH','Alemania','Hamburgo',165.00,4,'MX-CMX','IT-62','CH-ZH','FR-COR',NULL),(8,'RU-MOCK','Rusia','Moscú',175.00,4,'US-75001','PT-LI','FR-75','GB-LON',NULL),(9,'US-20001','Estados Unidos','Washington D.C.',185.50,3,'MX-CMX','US-79901','US-90209',NULL,NULL),(10,'SE-AB','Suecia','Estocolmo',201.75,5,'US-75001','PT-LI','ES-AN','FR-75','DE-BE');
/*!40000 ALTER TABLE `rutas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `usuario` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `contraseña` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tipoUsuario` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nombre` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apellidos` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('a','a','Recepcionista','a','a'),('alex26','queso','Operador','Alexander','Tzoc'),('b','b','Operador','b','b'),('cesar31','1234cinco','Administrador','Cesar','Tzoc'),('cesar9401','123321','Administrador','César','Tzoc Alvarado'),('chente66','qwerty','Recepcionista','Vicente','Fernandez'),('frank007','xyz','Operador','Frank','Martin'),('jose13','abc123','Administrador','Jose','Delgado'),('juanito12','1234','Operador','Juan','Perez'),('juanjo21','123321','Operador','Juan Jose','Gutierrez'),('migue31','4321','Recepcionista','Miguel','Mateos'),('pedro01','abcde','Operador','Pedro','Perez'),('tigre66','abc123','Operador','Jose','Perez Leon'),('torres1','asdf','Operador','Luis','Torres');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-26 13:27:20
