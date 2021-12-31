CREATE DATABASE  IF NOT EXISTS `web_customer_tracker` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `web_customer_tracker`;


DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;

INSERT INTO `customer` VALUES 
	(1,'Vu','Nguyen','vunguyen@gmail.com'),
	(2,'Adam','Tom','adamtom@gmail.com'),
	(3,'Hans','Crause','hanscrause@gmail.com'),
	(4,'Terry','Dann','terrydann@gmail.com'),
	(5,'John','Carrick','johncarrick@gmail.com'),
	(6,'Max','Honhem','maxhonhem@gmail.com'),
	