/*
Navicat MySQL Data Transfer

Source Server         : huangxiongxing
Source Server Version : 50155
Source Host           : localhost:3306
Source Database       : testdb

Target Server Type    : MYSQL
Target Server Version : 50155
File Encoding         : 65001

Date: 2013-07-25 20:38:51
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `t_test`
-- ----------------------------
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test` (
  `T_ID` varchar(18) NOT NULL,
  `T_USER_NAME` varchar(100) NOT NULL,
  `T_CREATOR` varchar(30) DEFAULT NULL,
  `T_IS_TRUE` bit(1) DEFAULT NULL,
  `T_AGE` int(2) DEFAULT NULL,
  `T_AMOUNT` decimal(3,0) DEFAULT NULL,
  `T_CREATE_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`T_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_test
-- ----------------------------
