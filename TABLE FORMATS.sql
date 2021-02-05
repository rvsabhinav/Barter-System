-- MySQL dump 10.13  Distrib 5.7.19, for Win32 (AMD64)
--
-- Host: localhost    Database: bs
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bkbids`
--

DROP TABLE IF EXISTS `bkbids`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bkbids` (
  `stkID` varchar(6) NOT NULL,
  `bk_usrNm` varchar(20) NOT NULL,
  `bidder_usrNm` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bkbids`
--

LOCK TABLES `bkbids` WRITE;
/*!40000 ALTER TABLE `bkbids` DISABLE KEYS */;
/*!40000 ALTER TABLE `bkbids` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `from_usrNm` varchar(20) NOT NULL,
  `to_usrNm` varchar(20) NOT NULL,
  `messAge` blob,
  `from_type` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stockdetails`
--

DROP TABLE IF EXISTS `stockdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stockdetails` (
  `stockID` varchar(6) NOT NULL,
  `bkNm` varchar(30) NOT NULL,
  `usrNm` varchar(30) NOT NULL,
  `bkAuth` varchar(30) DEFAULT NULL,
  `RSX` varchar(1) DEFAULT NULL,
  `RSXValue` varchar(3) DEFAULT NULL,
  `bkPic` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`stockID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stockdetails`
--

LOCK TABLES `stockdetails` WRITE;
/*!40000 ALTER TABLE `stockdetails` DISABLE KEYS */;
INSERT INTO `stockdetails` VALUES ('R001','MATHEMATICS','may','R.D.Sharma','R','10','PIC'),('R002','Concepts of Physics','meet','H.C.Verma','R','20','PIC'),('R003','Rotational Mechanics','ran','B.M.Sharma','R','5','PIC'),('S001','Half Girl-Friend','kun','Chetan Bhagat','S','100','PIC'),('S002','Immortals of Meluha','random','Amish Tripathi','S','200','PIC'),('S003','Chotta Bheem','kun','Kunal Rathi','S','500','PIC');
/*!40000 ALTER TABLE `stockdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usrdetails`
--

DROP TABLE IF EXISTS `usrdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usrdetails` (
  `uNm` varchar(30) DEFAULT NULL,
  `usrNm` varchar(20) NOT NULL,
  `usrContact` int(11) DEFAULT NULL,
  `usrPassword` varchar(40) NOT NULL,
  `usrPics` varchar(250) NOT NULL DEFAULT 'D:\\Soft_Wares\\Netbeans\\NetBeans 8.2\\Projects\\BarterSystem\\BarterSystem\\src\\Pics\\default.png',
  PRIMARY KEY (`usrNm`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usrdetails`
--

LOCK TABLES `usrdetails` WRITE;
/*!40000 ALTER TABLE `usrdetails` DISABLE KEYS */;
INSERT INTO `usrdetails` VALUES ('Kunal','kun',12345,'al','D:meetm'),('Mayank','may',12345678,'ank','D:SoftwareDistribution'),('Mate Murky','meet',123445,'mate','D:Soft_WaresNetbeansNetBeans 8.2ProjectsBarterSystemBarterSystemsrcPicsdefault.png'),('Random','ran',12345,'dom','D:WindowsApps'),('Another','random',12233,'random','C:UsersmeetmVideosCaptures'),('Tanmai','tan',1234567,'mai','D:Soft_WaresNetbeansNetBeans 8.2ProjectsBarterSystemBarterSystemsrcPicsdefault.png');
/*!40000 ALTER TABLE `usrdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `whoisonline`
--

DROP TABLE IF EXISTS `whoisonline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `whoisonline` (
  `online_User` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `whoisonline`
--

LOCK TABLES `whoisonline` WRITE;
/*!40000 ALTER TABLE `whoisonline` DISABLE KEYS */;
/*!40000 ALTER TABLE `whoisonline` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-24 19:57:10
