CREATE DATABASE  IF NOT EXISTS `interviewscheduling` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `interviewscheduling`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: interviewscheduling
-- ------------------------------------------------------
-- Server version	5.7.20-log

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
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `appointment` (
  `AppointmentID` varchar(45) NOT NULL,
  PRIMARY KEY (`AppointmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` VALUES ('0');
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `EID` varchar(45) NOT NULL,
  `FirstName` varchar(45) DEFAULT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`EID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('001','Ai','One','ai.one@exxonMobil.com','12345678'),('002','Bi','Two','bi.two@exxonMobil.com','12345678'),('003','Ci','Three','ci.three@exxonMobil.com','12345678'),('004','Di','Four','di.four@exxonMobil.com','12345678');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interviewee`
--

DROP TABLE IF EXISTS `interviewee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `interviewee` (
  `EEID` varchar(45) NOT NULL,
  `AppoinmentID` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`EEID`),
  KEY `AppoinmentID` (`AppoinmentID`),
  CONSTRAINT `interviewee_ibfk_1` FOREIGN KEY (`EEID`) REFERENCES `employee` (`EID`),
  CONSTRAINT `interviewee_ibfk_2` FOREIGN KEY (`AppoinmentID`) REFERENCES `appointment` (`AppointmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interviewee`
--

LOCK TABLES `interviewee` WRITE;
/*!40000 ALTER TABLE `interviewee` DISABLE KEYS */;
INSERT INTO `interviewee` VALUES ('004',NULL),('003','0');
/*!40000 ALTER TABLE `interviewee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interviewer`
--

DROP TABLE IF EXISTS `interviewer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `interviewer` (
  `ERID` varchar(45) NOT NULL,
  PRIMARY KEY (`ERID`),
  CONSTRAINT `interviewer_ibfk_1` FOREIGN KEY (`ERID`) REFERENCES `employee` (`EID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interviewer`
--

LOCK TABLES `interviewer` WRITE;
/*!40000 ALTER TABLE `interviewer` DISABLE KEYS */;
INSERT INTO `interviewer` VALUES ('001'),('002');
/*!40000 ALTER TABLE `interviewer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interviewerteam`
--

DROP TABLE IF EXISTS `interviewerteam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `interviewerteam` (
  `Interviewer_ERID` varchar(45) NOT NULL,
  `Appointment_AppointmentID` varchar(45) NOT NULL,
  KEY `fk_InterviewerTeam_Interviewer1_idx` (`Interviewer_ERID`),
  KEY `Appointment_AppointmentID` (`Appointment_AppointmentID`),
  CONSTRAINT `fk_InterviewerTeam_Interviewer1` FOREIGN KEY (`Interviewer_ERID`) REFERENCES `interviewer` (`ERID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `interviewerteam_ibfk_1` FOREIGN KEY (`Appointment_AppointmentID`) REFERENCES `appointment` (`AppointmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interviewerteam`
--

LOCK TABLES `interviewerteam` WRITE;
/*!40000 ALTER TABLE `interviewerteam` DISABLE KEYS */;
INSERT INTO `interviewerteam` VALUES ('001','0'),('002','0');
/*!40000 ALTER TABLE `interviewerteam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `Role` varchar(45) DEFAULT NULL,
  `EID` varchar(45) DEFAULT NULL,
  KEY `EID` (`EID`),
  CONSTRAINT `project_ibfk_1` FOREIGN KEY (`EID`) REFERENCES `employee` (`EID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES ('Interviewer','001'),('Interviewer','002'),('Interviewee','003'),('Interviewee','004');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `TimeSlots` varchar(45) NOT NULL,
  `AppoinmentID` varchar(25) DEFAULT NULL,
  `Interviewers` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`TimeSlots`),
  KEY `AppoinmentID` (`AppoinmentID`),
  CONSTRAINT `room_ibfk_1` FOREIGN KEY (`AppoinmentID`) REFERENCES `appointment` (`AppointmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES ('2019/04/03 09:30AM-10:00AM',NULL,'001'),('2019/04/03 10:00AM-10:30AM',NULL,'001'),('2019/04/03 10:30AM-11:00AM',NULL,'001'),('2019/04/03 11:00AM-11:30AM',NULL,'001'),('2019/09/09 10:00AM-10:30AM','0','001,002'),('2019/09/09 10:30AM-11:00AM',NULL,'001,002'),('2019/09/09 11:00AM-11:30AM',NULL,'002,'),('2019/09/09 11:30AM-12:00PM',NULL,'001,002'),('2019/09/10 10:30AM-11:00AM',NULL,'001'),('2019/09/10 11:00AM-11:30AM',NULL,'001');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-11 13:17:01
