/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost:3306
 Source Schema         : filmsystem

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 09/10/2020 17:37:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for filminfo
-- ----------------------------
DROP TABLE IF EXISTS `filminfo`;
CREATE TABLE `filminfo` (
  `filmId` int(10) NOT NULL AUTO_INCREMENT,
  `filmName` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL,
  `filmType` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL,
  `filmRole` varchar(50) COLLATE utf8_czech_ci DEFAULT NULL,
  `filmPrice` float(10,2) DEFAULT NULL,
  `filmStock` int(10) DEFAULT NULL,
  PRIMARY KEY (`filmId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;

-- ----------------------------
-- Records of filminfo
-- ----------------------------
BEGIN;
INSERT INTO `filminfo` VALUES (1, '人在囧途', '喜剧', '王宝强', 50.00, 10);
INSERT INTO `filminfo` VALUES (2, '叶问3', '功夫', '甄子丹', 80.00, 10);
INSERT INTO `filminfo` VALUES (3, '功夫熊猫3', '喜剧', '阿宝', 100.00, 10);
COMMIT;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userId` int(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL,
  `userPwd` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL,
  `userPhone` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL,
  `userEmail` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL,
  `userBalance` decimal(30,2) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
BEGIN;
INSERT INTO `userinfo` VALUES (1, 'huangxiaoming', '123456', '13232145678', 'huangxiaoming@163.com', 1000.00);
INSERT INTO `userinfo` VALUES (2, 'zhaowei', '654321', '13745678909', 'zhaowei@qq.com', 500.00);
INSERT INTO `userinfo` VALUES (3, 'chenkun', '123456', '13523456789', 'chenkun@126.com', 200.00);
INSERT INTO `userinfo` VALUES (100, 'root', '1', NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
