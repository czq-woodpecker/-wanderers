/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.1.32-community : Database - pets
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pets` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `pets`;

/*Table structure for table `t_admin` */

DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `nickname` varchar(10) DEFAULT NULL,
  `level` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_admin` */

insert  into `t_admin`(`id`,`username`,`password`,`nickname`,`level`) values (1,'admin','admin','admin','1');

/*Table structure for table `t_cats` */

DROP TABLE IF EXISTS `t_cats`;

CREATE TABLE `t_cats` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `kind` varchar(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `habit` varchar(200) DEFAULT NULL,
  `hobby` varchar(200) DEFAULT NULL,
  `photoAddress` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_cats` */

insert  into `t_cats`(`id`,`name`,`kind`,`sex`,`habit`,`hobby`,`photoAddress`) values (1,'cat','cat','公','无','无',NULL);

/*Table structure for table `t_dogs` */

DROP TABLE IF EXISTS `t_dogs`;

CREATE TABLE `t_dogs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `kind` varchar(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `habit` varchar(200) DEFAULT NULL,
  `hobby` varchar(200) DEFAULT NULL,
  `photoAddress` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_dogs` */

insert  into `t_dogs`(`id`,`name`,`kind`,`sex`,`habit`,`hobby`,`photoAddress`) values (1,'dog','dog','公','无','无',NULL);

/*Table structure for table `t_exchange` */

DROP TABLE IF EXISTS `t_exchange`;

CREATE TABLE `t_exchange` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `publisher` varchar(20) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_exchange` */

insert  into `t_exchange`(`id`,`title`,`publisher`,`time`) values (1,'问题','1','2017-02-26 22:53:20');

/*Table structure for table `t_exchangedetails` */

DROP TABLE IF EXISTS `t_exchangedetails`;

CREATE TABLE `t_exchangedetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exchangeId` int(11) DEFAULT NULL,
  `answerId` int(11) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `exchangeId` (`exchangeId`),
  CONSTRAINT `t_exchangedetails_ibfk_1` FOREIGN KEY (`exchangeId`) REFERENCES `t_exchange` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_exchangedetails` */

insert  into `t_exchangedetails`(`id`,`exchangeId`,`answerId`,`content`) values (1,1,1,'测试');

/*Table structure for table `t_straycats` */

DROP TABLE IF EXISTS `t_straycats`;

CREATE TABLE `t_straycats` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `kind` varchar(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `color` varchar(10) DEFAULT NULL,
  `hobby` varchar(200) DEFAULT NULL,
  `foundAddress` varchar(100) DEFAULT NULL,
  `ownerId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ownerId` (`ownerId`),
  CONSTRAINT `t_straycats_ibfk_1` FOREIGN KEY (`ownerId`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_straycats` */

insert  into `t_straycats`(`id`,`name`,`kind`,`sex`,`color`,`hobby`,`foundAddress`,`ownerId`) values (1,'strayCats','cats','公','蓝色','无','广技师',1);

/*Table structure for table `t_straydogs` */

DROP TABLE IF EXISTS `t_straydogs`;

CREATE TABLE `t_straydogs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `kind` varchar(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `color` varchar(10) DEFAULT NULL,
  `hobby` varchar(200) DEFAULT NULL,
  `foundAddress` varchar(100) DEFAULT NULL,
  `ownerId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ownerId` (`ownerId`),
  CONSTRAINT `t_straydogs_ibfk_1` FOREIGN KEY (`ownerId`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_straydogs` */

insert  into `t_straydogs`(`id`,`name`,`kind`,`sex`,`color`,`hobby`,`foundAddress`,`ownerId`) values (1,'strayDogs','dog','公','蓝色','无','七栋',NULL);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `nickname` varchar(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `adoptedPets` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`username`,`password`,`nickname`,`sex`,`address`,`adoptedPets`) values (1,'user','user','user','男','广技师','无');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
