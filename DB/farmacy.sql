CREATE DATABASE  IF NOT EXISTS `pharmecy` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `pharmecy`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: pharmecy
-- ------------------------------------------------------
-- Server version	8.0.17

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
  `customerId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `phone` varchar(200) NOT NULL,
  `email` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`customerId`),
  UNIQUE KEY `phone_UNIQUE` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Abu Hossain','01516718442',NULL,NULL),(2,'Shamim','01325263632',NULL,NULL),(3,'Shamim','01325632652',NULL,NULL),(4,'Khoka','012365489',NULL,NULL),(5,'Jahir','01523654891',NULL,NULL),(6,'Farzana','01402565656',NULL,NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `damage`
--

DROP TABLE IF EXISTS `damage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `damage` (
  `damageId` int(11) NOT NULL AUTO_INCREMENT,
  `damageDate` date DEFAULT NULL,
  `supllierId` int(11) DEFAULT NULL,
  `medicineName` varchar(200) DEFAULT NULL,
  `paking` int(11) DEFAULT NULL,
  `genericName` varchar(200) DEFAULT NULL,
  `batchId` int(11) DEFAULT NULL,
  `exDate` date DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `mrp` double DEFAULT NULL,
  `purchaseRate` double DEFAULT NULL,
  PRIMARY KEY (`damageId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `damage`
--

LOCK TABLES `damage` WRITE;
/*!40000 ALTER TABLE `damage` DISABLE KEYS */;
/*!40000 ALTER TABLE `damage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expired`
--

DROP TABLE IF EXISTS `expired`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expired` (
  `purchasId` int(11) NOT NULL AUTO_INCREMENT,
  `supllierId` int(11) DEFAULT NULL,
  `medicineName` varchar(200) DEFAULT NULL,
  `paking` int(11) DEFAULT NULL,
  `genericName` varchar(200) DEFAULT NULL,
  `batchId` varchar(200) DEFAULT NULL,
  `exDate` date DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `mrp` double DEFAULT NULL,
  `purchaseRate` double DEFAULT NULL,
  PRIMARY KEY (`purchasId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expired`
--

LOCK TABLES `expired` WRITE;
/*!40000 ALTER TABLE `expired` DISABLE KEYS */;
/*!40000 ALTER TABLE `expired` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purshase`
--

DROP TABLE IF EXISTS `purshase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purshase` (
  `purshasId` int(11) NOT NULL AUTO_INCREMENT,
  `pursDate` date DEFAULT NULL,
  `supllierId` int(11) DEFAULT NULL,
  `medicineName` varchar(200) DEFAULT NULL,
  `paking` int(11) DEFAULT NULL,
  `genericName` varchar(200) DEFAULT NULL,
  `batchId` varchar(100) DEFAULT NULL,
  `exDate` date DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `mrp` int(11) DEFAULT NULL,
  `purchaseRate` double DEFAULT NULL,
  `invoice` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`purshasId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purshase`
--

LOCK TABLES `purshase` WRITE;
/*!40000 ALTER TABLE `purshase` DISABLE KEYS */;
INSERT INTO `purshase` VALUES (6,'2024-06-04',3,'Rupatadine',1,'Rupa','R1560','2024-11-30',20,75,60,'100010'),(7,'2024-06-04',1,'Paracitamol',10,'Dymando','B1250','2024-12-31',200,12,8,'100010'),(8,'2024-06-07',1,'reneta',10,'ff','1ewww','2024-07-13',100,300,270,'100010');
/*!40000 ALTER TABLE `purshase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `return_customer`
--

DROP TABLE IF EXISTS `return_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `return_customer` (
  `cus_returnId` int(11) NOT NULL AUTO_INCREMENT,
  `stockId` int(11) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `rate` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `saleDate` date DEFAULT NULL,
  `customerId` int(11) DEFAULT NULL,
  PRIMARY KEY (`cus_returnId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `return_customer`
--

LOCK TABLES `return_customer` WRITE;
/*!40000 ALTER TABLE `return_customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `return_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `return_purchase`
--

DROP TABLE IF EXISTS `return_purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `return_purchase` (
  `returnId` int(11) NOT NULL AUTO_INCREMENT,
  `supplier` varchar(255) DEFAULT NULL,
  `medicineName` varchar(255) DEFAULT NULL,
  `paking` int(11) DEFAULT NULL,
  `genericName` varchar(200) DEFAULT NULL,
  `batchId` varchar(255) DEFAULT NULL,
  `exDate` date DEFAULT NULL,
  `pursDate` date DEFAULT NULL,
  `invoice` varchar(255) DEFAULT NULL,
  `returnQty` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `purchaseRate` double DEFAULT NULL,
  PRIMARY KEY (`returnId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `return_purchase`
--

LOCK TABLES `return_purchase` WRITE;
/*!40000 ALTER TABLE `return_purchase` DISABLE KEYS */;
/*!40000 ALTER TABLE `return_purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sale`
--

DROP TABLE IF EXISTS `sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sale` (
  `saleId` int(11) NOT NULL AUTO_INCREMENT,
  `stockId` int(11) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `rate` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `saleDate` varchar(200) DEFAULT NULL,
  `customerId` int(11) DEFAULT NULL,
  `invoice_no` int(11) DEFAULT NULL,
  PRIMARY KEY (`saleId`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sale`
--

LOCK TABLES `sale` WRITE;
/*!40000 ALTER TABLE `sale` DISABLE KEYS */;
INSERT INTO `sale` VALUES (1,7,1,75,75,'2024-06-06',1,NULL),(2,7,1,75,75,'2024-06-06',1,NULL),(3,8,5,1.2,6,'2024-06-06',1,10000),(4,7,2,75,150,'2024-06-06',0,10000),(5,8,5,1.2,6,'2024-06-06',0,10000),(6,7,1,75,75,'2024-06-06',4,10000),(7,8,5,1.2,6,'2024-06-06',4,10000),(8,7,1,75,75,'2024-06-06',5,10000),(9,8,5,1.2,6,'2024-06-06',6,10000),(10,7,1,75,75,'2024-06-06',6,10000),(11,8,15,1.2,18,'2024-06-06',6,10000),(12,7,2,54,108,'2024-06-06',3,10000),(13,8,2,54,108,'2024-06-06',3,10000),(14,7,1,54,54,'2024-06-06',3,10000),(15,8,1,54,54,'2024-06-06',3,10000),(16,8,1,54,54,'2024-07-06',3,10000),(17,7,1,54,54,'2024-07-06',3,10000),(18,8,1,54,54,'2024-07-07',3,10001);
/*!40000 ALTER TABLE `sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock` (
  `stockId` int(11) NOT NULL AUTO_INCREMENT,
  `medicineName` varchar(200) DEFAULT NULL,
  `paking` int(11) DEFAULT NULL,
  `genericName` varchar(200) DEFAULT NULL,
  `batchId` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ex_date` varchar(200) DEFAULT NULL,
  `supllier` varchar(200) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `mrp` varchar(200) DEFAULT NULL,
  `rate` double DEFAULT NULL,
  PRIMARY KEY (`stockId`),
  UNIQUE KEY `batchId_UNIQUE` (`batchId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (7,'Rupatadine',1,'Rupa','R1560','2024-12-30','Aristopharma',5,'75',54),(8,'Paracitamol',10,'Dymando','B1250','2024-12-31','Reneta',172,'12',54),(9,'reneta',10,'ff','1ewww','2024-07-13','Reneta',100,'300',5);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `supllierId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `o_phone` varchar(100) DEFAULT NULL,
  `contactPersion` varchar(200) DEFAULT NULL,
  `contactPersionPhone` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`supllierId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,'Reneta','reneta@email.com','01711010101','Rasel','01513020202'),(2,'Square','squarefarma@email.com','01401515251','Shahnur','01302121212'),(3,'Aristopharma','aristopharma@email.com','01403052525','Al-Helal','01406060606');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) DEFAULT NULL,
  `password` varchar(300) DEFAULT NULL,
  `role` varchar(200) DEFAULT NULL,
  `emp_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'abu','abu','admin',101);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-08  8:51:32
