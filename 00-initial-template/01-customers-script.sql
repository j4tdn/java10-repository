CREATE DATABASE  IF NOT EXISTS `web_customer_tracker` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `web_customer_tracker`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: web_customer_tracker
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (3,'David','Rana','davidrana@gmail.com'),(4,'Mary','Public','marypublic@yahoo.com'),(5,'Maxwell','Dixon','max@tpbank.com'),(8,'Tony','Dan','danm-tp@gmail.com'),(22,'Quyen','Phan','quyen.ngoc.phan@mgm-tp.com'),(24,'Vu','Nguyen','vunguyen-cpm@gmail.com'),(26,'Clark','Berg','quyen.ngoc.phan@mgm-tp.com'),(27,'Nata','Warachip','natawa@gmail.com'),(28,'Keiko','Walker','qoci@mailinator.com'),(29,'Elmo','Mccray','fisi@mailinator.com'),(30,'Hilary','Pugh','sowyfeledi@mailinator.com'),(31,'Colton','Horne','zahasecit@mailinator.com'),(32,'Tobias','Cardenas','qojy@mailinator.com'),(33,'Sheila','Bartlett','dufe@mailinator.com'),(35,'Linus','Chambers','fabuvypabi@mailinator.com'),(36,'Kevyn','Bates','pobe@mailinator.com'),(37,'Garth','Hurst','cinug@mailinator.com'),(38,'Leila','Rocha','kozakovyj@mailinator.com'),(39,'Yvonne','Benjamin','pirapyta@mailinator.com'),(40,'Lucy','Clayton','xifisid@mailinator.com');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-09 13:18:37
