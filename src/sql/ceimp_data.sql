/*
Navicat MySQL Data Transfer

Source Server         : weige
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ceimp

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-08-18 14:45:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `accumulate_input`
-- ----------------------------
DROP TABLE IF EXISTS `accumulate_input`;
CREATE TABLE `accumulate_input` (
  `input_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `point_id` int(20) NOT NULL,
  `evidence` varchar(100) NOT NULL,
  `times` int(20) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`input_id`),
  UNIQUE KEY `input_id` (`input_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `point_id` (`point_id`),
  CONSTRAINT `accumulate_input_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `accumulate_input_ibfk_2` FOREIGN KEY (`point_id`) REFERENCES `evaluation_point` (`point_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of accumulate_input
-- ----------------------------

-- ----------------------------
-- Table structure for `award`
-- ----------------------------
DROP TABLE IF EXISTS `award`;
CREATE TABLE `award` (
  `award_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `scholarship_id` int(20) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`award_id`),
  UNIQUE KEY `award_id` (`award_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `scholarship_id` (`scholarship_id`),
  CONSTRAINT `award_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `award_ibfk_2` FOREIGN KEY (`scholarship_id`) REFERENCES `scholarship` (`scholarship_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of award
-- ----------------------------
INSERT INTO `award` VALUES ('1', '1150299070', '1', '2017', '1502972891');
INSERT INTO `award` VALUES ('2', '1150299070', '2', '2017', '1502972891');
INSERT INTO `award` VALUES ('3', '1150299071', '3', '2017', '1502972891');
INSERT INTO `award` VALUES ('4', '1150299234', '1', '2017', '1502972891');
INSERT INTO `award` VALUES ('5', '1150299234', '3', '2017', '1502972891');
INSERT INTO `award` VALUES ('6', '1150299256', '2', '2017', '1502972891');

-- ----------------------------
-- Table structure for `award_level`
-- ----------------------------
DROP TABLE IF EXISTS `award_level`;
CREATE TABLE `award_level` (
  `level_id` int(20) NOT NULL AUTO_INCREMENT,
  `level` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`level_id`),
  UNIQUE KEY `level_id` (`level_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of award_level
-- ----------------------------
INSERT INTO `award_level` VALUES ('1', '特等奖', '1502973081');
INSERT INTO `award_level` VALUES ('2', '一等奖', '1502973081');
INSERT INTO `award_level` VALUES ('3', '二等奖', '1502973081');
INSERT INTO `award_level` VALUES ('4', '三等奖', '1502973081');
INSERT INTO `award_level` VALUES ('5', '参赛奖', '1502973081');

-- ----------------------------
-- Table structure for `classes`
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `class_id` int(20) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(100) NOT NULL,
  `class_num` int(20) NOT NULL,
  `school_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`class_id`),
  UNIQUE KEY `class_id` (`class_id`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `classes_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO `classes` VALUES ('1', '软件工程', '151', '1', '1502971893');
INSERT INTO `classes` VALUES ('2', '软件工程', '152', '1', '1502971893');
INSERT INTO `classes` VALUES ('3', '通信工程', '151', '1', '1502971893');
INSERT INTO `classes` VALUES ('4', '应用物理学', '151', '2', '1502971893');

-- ----------------------------
-- Table structure for `class_manager`
-- ----------------------------
DROP TABLE IF EXISTS `class_manager`;
CREATE TABLE `class_manager` (
  `class_manager_id` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `class_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`class_manager_id`),
  UNIQUE KEY `class_manager_id` (`class_manager_id`) USING BTREE,
  KEY `class_id` (`class_id`),
  CONSTRAINT `class_manager_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classes` (`class_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_manager
-- ----------------------------
INSERT INTO `class_manager` VALUES ('1150299234', 'MTIzNDU2', '1', '1502972250');
INSERT INTO `class_manager` VALUES ('1150299256', 'NjY2NjY2', '2', '1502972250');

-- ----------------------------
-- Table structure for `class_score`
-- ----------------------------
DROP TABLE IF EXISTS `class_score`;
CREATE TABLE `class_score` (
  `class_score_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `class_id` int(20) NOT NULL,
  `score` double NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`class_score_id`),
  UNIQUE KEY `class_score_id` (`class_score_id`) USING BTREE,
  KEY `class_id` (`class_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `class_score_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `evaluation_class` (`class_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `class_score_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_score
-- ----------------------------

-- ----------------------------
-- Table structure for `competition`
-- ----------------------------
DROP TABLE IF EXISTS `competition`;
CREATE TABLE `competition` (
  `competition_id` int(20) NOT NULL AUTO_INCREMENT,
  `competition_name` varchar(100) NOT NULL,
  `organizer` varchar(100) DEFAULT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`competition_id`),
  UNIQUE KEY `competition_id` (`competition_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition
-- ----------------------------
INSERT INTO `competition` VALUES ('1', '浙江省大学生程序设计竞赛', '信息学院', '1502973444');
INSERT INTO `competition` VALUES ('2', '全国数学建模竞赛', '理学院', '1502973444');
INSERT INTO `competition` VALUES ('3', '大学生服务外包竞赛', '信息学院', '1502973444');
INSERT INTO `competition` VALUES ('4', '浙江省大学生高数竞赛', '理学院', '1502973444');

-- ----------------------------
-- Table structure for `competition_input`
-- ----------------------------
DROP TABLE IF EXISTS `competition_input`;
CREATE TABLE `competition_input` (
  `input_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `competition_id` int(20) NOT NULL,
  `competition_type_id` int(20) NOT NULL,
  `competition_level_id` int(20) NOT NULL,
  `award_level_id` int(20) NOT NULL,
  `evidence` varchar(100) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`input_id`),
  UNIQUE KEY `input_id` (`input_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `competition_id` (`competition_id`),
  KEY `competition_type_id` (`competition_type_id`),
  KEY `competition_level_id` (`competition_level_id`),
  KEY `award_level_id` (`award_level_id`),
  CONSTRAINT `competition_input_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_2` FOREIGN KEY (`competition_id`) REFERENCES `competition` (`competition_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_3` FOREIGN KEY (`competition_type_id`) REFERENCES `competition_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_4` FOREIGN KEY (`competition_level_id`) REFERENCES `competition_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_5` FOREIGN KEY (`award_level_id`) REFERENCES `award_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_input
-- ----------------------------

-- ----------------------------
-- Table structure for `competition_level`
-- ----------------------------
DROP TABLE IF EXISTS `competition_level`;
CREATE TABLE `competition_level` (
  `level_id` int(20) NOT NULL AUTO_INCREMENT,
  `level` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`level_id`),
  UNIQUE KEY `level_id` (`level_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_level
-- ----------------------------
INSERT INTO `competition_level` VALUES ('1', '国家级', '1502973318');
INSERT INTO `competition_level` VALUES ('2', '省级', '1502973318');
INSERT INTO `competition_level` VALUES ('3', '市级', '1502973318');
INSERT INTO `competition_level` VALUES ('4', '校级', '1502973318');
INSERT INTO `competition_level` VALUES ('5', '院级', '1502973318');

-- ----------------------------
-- Table structure for `competition_level_connection`
-- ----------------------------
DROP TABLE IF EXISTS `competition_level_connection`;
CREATE TABLE `competition_level_connection` (
  `connection_id` int(20) NOT NULL AUTO_INCREMENT,
  `competition_id` int(20) NOT NULL,
  `competition_level_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`connection_id`),
  UNIQUE KEY `connection_id` (`connection_id`) USING BTREE,
  KEY `competition_id` (`competition_id`),
  KEY `competition_level_id` (`competition_level_id`),
  CONSTRAINT `competition_level_connection_ibfk_1` FOREIGN KEY (`competition_id`) REFERENCES `competition` (`competition_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_level_connection_ibfk_2` FOREIGN KEY (`competition_level_id`) REFERENCES `competition_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_level_connection
-- ----------------------------
INSERT INTO `competition_level_connection` VALUES ('1', '1', '2', '1502973541');
INSERT INTO `competition_level_connection` VALUES ('2', '2', '1', '1502973541');
INSERT INTO `competition_level_connection` VALUES ('3', '3', '1', '1502973541');
INSERT INTO `competition_level_connection` VALUES ('4', '3', '2', '1502973541');

-- ----------------------------
-- Table structure for `competition_score`
-- ----------------------------
DROP TABLE IF EXISTS `competition_score`;
CREATE TABLE `competition_score` (
  `score_id` int(20) NOT NULL AUTO_INCREMENT,
  `competition_level_id` int(20) NOT NULL,
  `award_level_id` int(20) NOT NULL,
  `competition_type_id` int(20) NOT NULL,
  `score` double NOT NULL,
  `type` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`score_id`),
  UNIQUE KEY `score_id` (`score_id`) USING BTREE,
  KEY `competition_level_id` (`competition_level_id`),
  KEY `award_level_id` (`award_level_id`),
  KEY `competition_type_id` (`competition_type_id`),
  CONSTRAINT `competition_score_ibfk_1` FOREIGN KEY (`competition_level_id`) REFERENCES `competition_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_score_ibfk_2` FOREIGN KEY (`award_level_id`) REFERENCES `award_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_score_ibfk_3` FOREIGN KEY (`competition_type_id`) REFERENCES `competition_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_score
-- ----------------------------
INSERT INTO `competition_score` VALUES ('1', '1', '1', '1', '64', '1', '1502978873');
INSERT INTO `competition_score` VALUES ('2', '1', '2', '1', '56', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('3', '1', '3', '1', '48', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('4', '1', '4', '1', '40', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('5', '2', '1', '1', '40', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('6', '2', '2', '1', '40', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('7', '2', '3', '1', '32', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('8', '2', '4', '1', '24', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('9', '2', '5', '1', '16', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('10', '3', '2', '1', '32', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('11', '3', '3', '1', '24', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('12', '3', '4', '1', '16', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('13', '3', '5', '1', '8', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('14', '4', '2', '1', '16', '1', '1502978874');
INSERT INTO `competition_score` VALUES ('15', '4', '3', '1', '12', '1', '1502978875');
INSERT INTO `competition_score` VALUES ('16', '4', '4', '1', '8', '1', '1502978875');
INSERT INTO `competition_score` VALUES ('17', '4', '5', '1', '4', '1', '1502978875');
INSERT INTO `competition_score` VALUES ('18', '5', '2', '1', '2', '1', '1502978875');
INSERT INTO `competition_score` VALUES ('19', '5', '3', '1', '1', '1', '1502978875');
INSERT INTO `competition_score` VALUES ('20', '5', '4', '1', '0.5', '1', '1502978875');
INSERT INTO `competition_score` VALUES ('21', '1', '1', '2', '44.8', '1', '1502978996');
INSERT INTO `competition_score` VALUES ('22', '1', '2', '2', '39.2', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('23', '1', '3', '2', '33.6', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('24', '1', '4', '2', '28', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('25', '2', '1', '2', '28', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('26', '2', '2', '2', '28', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('27', '2', '3', '2', '22.4', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('28', '2', '4', '2', '16.8', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('29', '2', '5', '2', '11.2', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('30', '3', '2', '2', '22.4', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('31', '3', '3', '2', '16.8', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('32', '3', '4', '2', '11.2', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('33', '3', '5', '2', '5.6', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('34', '4', '2', '2', '11.2', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('35', '4', '3', '2', '8.4', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('36', '4', '4', '2', '5.6', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('37', '4', '5', '2', '2.8', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('38', '5', '2', '2', '1.4', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('39', '5', '3', '2', '0.7', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('40', '5', '4', '2', '0.35', '1', '1502978997');
INSERT INTO `competition_score` VALUES ('41', '1', '1', '3', '32', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('42', '1', '2', '3', '28', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('43', '1', '3', '3', '24', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('44', '1', '4', '3', '20', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('45', '2', '1', '3', '20', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('46', '2', '2', '3', '20', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('47', '2', '3', '3', '16', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('48', '2', '4', '3', '12', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('49', '2', '5', '3', '8', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('50', '3', '2', '3', '16', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('51', '3', '3', '3', '12', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('52', '3', '4', '3', '8', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('53', '3', '5', '3', '4', '1', '1502979158');
INSERT INTO `competition_score` VALUES ('54', '4', '2', '3', '8', '1', '1502979159');
INSERT INTO `competition_score` VALUES ('55', '4', '3', '3', '6', '1', '1502979159');
INSERT INTO `competition_score` VALUES ('56', '4', '4', '3', '4', '1', '1502979159');
INSERT INTO `competition_score` VALUES ('57', '4', '5', '3', '2', '1', '1502979159');
INSERT INTO `competition_score` VALUES ('58', '5', '2', '3', '1', '1', '1502979159');
INSERT INTO `competition_score` VALUES ('59', '5', '3', '3', '0.5', '1', '1502979159');
INSERT INTO `competition_score` VALUES ('60', '5', '4', '3', '0.25', '1', '1502979159');
INSERT INTO `competition_score` VALUES ('61', '1', '1', '1', '20', '2', '1502979634');
INSERT INTO `competition_score` VALUES ('62', '1', '2', '1', '15', '2', '1502979634');
INSERT INTO `competition_score` VALUES ('63', '1', '3', '1', '10', '2', '1502979634');
INSERT INTO `competition_score` VALUES ('64', '1', '4', '1', '6', '2', '1502979634');
INSERT INTO `competition_score` VALUES ('65', '1', '5', '1', '3', '2', '1502979634');
INSERT INTO `competition_score` VALUES ('66', '2', '1', '1', '10', '2', '1502979634');
INSERT INTO `competition_score` VALUES ('67', '2', '2', '1', '8', '2', '1502979634');
INSERT INTO `competition_score` VALUES ('68', '2', '3', '1', '6', '2', '1502979634');
INSERT INTO `competition_score` VALUES ('69', '2', '4', '1', '3', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('70', '2', '5', '1', '1.5', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('71', '3', '1', '1', '7', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('72', '3', '2', '1', '5', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('73', '3', '3', '1', '3', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('74', '3', '4', '1', '2', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('75', '3', '5', '1', '1', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('76', '4', '1', '1', '4', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('77', '4', '2', '1', '3', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('78', '4', '3', '1', '2', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('79', '4', '4', '1', '1', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('80', '4', '5', '1', '0.5', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('81', '5', '2', '1', '2', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('82', '5', '3', '1', '1', '2', '1502979635');
INSERT INTO `competition_score` VALUES ('83', '5', '4', '1', '0.5', '2', '1502979635');

-- ----------------------------
-- Table structure for `competition_type`
-- ----------------------------
DROP TABLE IF EXISTS `competition_type`;
CREATE TABLE `competition_type` (
  `type_id` int(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  `percent` double NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`type_id`),
  UNIQUE KEY `type_id` (`type_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_type
-- ----------------------------
INSERT INTO `competition_type` VALUES ('1', 'A', '1', '1502973241');
INSERT INTO `competition_type` VALUES ('2', 'B', '0.7', '1502973242');
INSERT INTO `competition_type` VALUES ('3', 'C', '0.5', '1502973242');

-- ----------------------------
-- Table structure for `competition_type_connection`
-- ----------------------------
DROP TABLE IF EXISTS `competition_type_connection`;
CREATE TABLE `competition_type_connection` (
  `connection_id` int(20) NOT NULL AUTO_INCREMENT,
  `competition_id` int(20) NOT NULL,
  `competition_type_id` int(20) NOT NULL,
  `school_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`connection_id`),
  UNIQUE KEY `connection_id` (`connection_id`) USING BTREE,
  KEY `competition_id` (`competition_id`),
  KEY `competition_type_id` (`competition_type_id`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `competition_type_connection_ibfk_1` FOREIGN KEY (`competition_id`) REFERENCES `competition` (`competition_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_type_connection_ibfk_2` FOREIGN KEY (`competition_type_id`) REFERENCES `competition_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_type_connection_ibfk_3` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_type_connection
-- ----------------------------
INSERT INTO `competition_type_connection` VALUES ('1', '1', '1', '1', '1502973737');
INSERT INTO `competition_type_connection` VALUES ('2', '2', '1', '1', '1502973737');
INSERT INTO `competition_type_connection` VALUES ('3', '3', '1', '1', '1502973737');
INSERT INTO `competition_type_connection` VALUES ('4', '4', '3', '1', '1502973737');
INSERT INTO `competition_type_connection` VALUES ('5', '2', '1', '2', '1502973738');
INSERT INTO `competition_type_connection` VALUES ('6', '4', '1', '2', '1502973738');

-- ----------------------------
-- Table structure for `double_input`
-- ----------------------------
DROP TABLE IF EXISTS `double_input`;
CREATE TABLE `double_input` (
  `input_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `point_id` int(20) NOT NULL,
  `evidence` varchar(100) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`input_id`),
  UNIQUE KEY `input_id` (`input_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `point_id` (`point_id`),
  CONSTRAINT `double_input_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `double_input_ibfk_2` FOREIGN KEY (`point_id`) REFERENCES `evaluation_point` (`point_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of double_input
-- ----------------------------

-- ----------------------------
-- Table structure for `evaluation_class`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation_class`;
CREATE TABLE `evaluation_class` (
  `class_id` int(20) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(100) NOT NULL,
  `form_id` int(20) NOT NULL,
  `content` varchar(500) DEFAULT NULL,
  `weight` double NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`class_id`),
  UNIQUE KEY `class_id` (`class_id`) USING BTREE,
  KEY `form_id` (`form_id`),
  CONSTRAINT `evaluation_class_ibfk_1` FOREIGN KEY (`form_id`) REFERENCES `evaluation_form` (`form_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_class
-- ----------------------------
INSERT INTO `evaluation_class` VALUES ('1', '品德素质评价', '1', '品德素质评价主要考核思想表现、文明守纪、学习态度、班团工作、社会责任，每个观察点分为“优秀”、“合格”、“不合格”三个等级。品德素质评价总分100分，各观测点考核“优秀”为18-20分，“合格”为14-16分，“不合格”为0-8分。\n        注：“优秀”观察点这一栏评分标准为有一项记18分，有两项记19分，有三项及以上记20分。“合格”观察点这一栏无特殊情况全部为15分。', '0.15', '1503031063');
INSERT INTO `evaluation_class` VALUES ('2', '学业素质评价', '1', '学业素质评价分=学年平均学分绩点×10+50', '0.7', '1503031063');
INSERT INTO `evaluation_class` VALUES ('3', '发展能力评价', '1', '发展能力评价由自主学习、社会实践、组织交流、创新创业和文体特长组成。发展能力评价满分为100分。', '0.15', '1503031063');
INSERT INTO `evaluation_class` VALUES ('4', '理学院测评类', '2', '测评类说明', '1', '1503031063');

-- ----------------------------
-- Table structure for `evaluation_form`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation_form`;
CREATE TABLE `evaluation_form` (
  `form_id` int(20) NOT NULL AUTO_INCREMENT,
  `form_name` varchar(100) NOT NULL,
  `content` varchar(500) DEFAULT NULL,
  `publishing_unit` varchar(20) DEFAULT NULL,
  `school_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`form_id`),
  UNIQUE KEY `form_id` (`form_id`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `evaluation_form_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_form
-- ----------------------------
INSERT INTO `evaluation_form` VALUES ('1', '信息学院2016学年综合素质评价表', '根据学校《浙江科技学院本科学生综合素质评价实施办法》（浙科院学〔2016〕5号），结合我院学生实际，通过学工组会议讨论研究决定，草拟《信息学院2015-2016学年综合素质评价实施细则》，向学院师生征求意见后，现将定稿公布如下：\n        综合素质评价总分=品德素质评价总分×15%（0-15分）+学业素质评价分×70%（0-70分）+发展能力素质评价总分×15%（0-15分）。', '信息学院学工组', '1', '1503030772');
INSERT INTO `evaluation_form` VALUES ('2', '理学院2017年综合素质评价表', '理学院综合测评说明', '理学院学工组', '2', '1503030773');

-- ----------------------------
-- Table structure for `evaluation_item`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation_item`;
CREATE TABLE `evaluation_item` (
  `item_id` int(20) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(100) NOT NULL,
  `class_id` int(20) NOT NULL,
  `max_score` double NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`item_id`),
  UNIQUE KEY `item_id` (`item_id`) USING BTREE,
  KEY `class_id` (`class_id`),
  CONSTRAINT `evaluation_item_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `evaluation_class` (`class_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_item
-- ----------------------------
INSERT INTO `evaluation_item` VALUES ('1', '思想表现', '1', '20', '1503031341');
INSERT INTO `evaluation_item` VALUES ('2', '文明守纪', '1', '20', '1503031342');
INSERT INTO `evaluation_item` VALUES ('3', '学习态度', '1', '20', '1503031342');
INSERT INTO `evaluation_item` VALUES ('4', '班团工作', '1', '20', '1503031342');
INSERT INTO `evaluation_item` VALUES ('5', '社会责任', '1', '20', '1503031342');
INSERT INTO `evaluation_item` VALUES ('6', '学业素质', '2', '100', '1503031587');
INSERT INTO `evaluation_item` VALUES ('7', '自主学习能力', '3', '20', '1503031587');
INSERT INTO `evaluation_item` VALUES ('8', '社会实践能力', '3', '20', '1503031587');
INSERT INTO `evaluation_item` VALUES ('9', '组织交流能力', '3', '10', '1503031587');
INSERT INTO `evaluation_item` VALUES ('10', '创新创业能力', '3', '100', '1503031587');
INSERT INTO `evaluation_item` VALUES ('11', '文体特长', '3', '20', '1503031587');

-- ----------------------------
-- Table structure for `evaluation_point`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation_point`;
CREATE TABLE `evaluation_point` (
  `point_id` int(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(500) NOT NULL,
  `remark` varchar(500) DEFAULT NULL,
  `score` double(20,0) NOT NULL,
  `item_id` int(20) NOT NULL,
  `calculate_type` int(20) NOT NULL,
  `input_type` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`point_id`),
  UNIQUE KEY `point_id` (`point_id`) USING BTREE,
  KEY `item_id` (`item_id`),
  CONSTRAINT `evaluation_point_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `evaluation_item` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_point
-- ----------------------------
INSERT INTO `evaluation_point` VALUES ('1', '中共党员（含中共预备党员）', '但上述个人若在所评学年受到学校处分或受到学校、学院和有关部门通报批评（通报批评的内容涉及学生思想表现情况）的，该项目不得评为“优秀”', '18', '1', '2', '2', '1503032686');
INSERT INTO `evaluation_point` VALUES ('2', '大学一年级被列为入党积极分子', '但上述个人若在所评学年受到学校处分或受到学校、学院和有关部门通报批评（通报批评的内容涉及学生思想表现情况）的，该项目不得评为“优秀”', '18', '1', '2', '2', '1503032686');
INSERT INTO `evaluation_point` VALUES ('3', '大学二年级被列入党员发展计划', '但上述个人若在所评学年受到学校处分或受到学校、学院和有关部门通报批评（通报批评的内容涉及学生思想表现情况）的，该项目不得评为“优秀”', '18', '1', '2', '2', '1503032686');
INSERT INTO `evaluation_point` VALUES ('4', '积极参加团日活动，所在团支部获评校级以上先进团支部等荣誉', '但上述个人若在所评学年受到学校处分或受到学校、学院和有关部门通报批评（通报批评的内容涉及学生思想表现情况）的，该项目不得评为“优秀”', '18', '1', '2', '2', '1503032686');
INSERT INTO `evaluation_point` VALUES ('5', '积极参加院级（含）以上政治理论学习组织或参加思想宣传类活动', '但上述个人若在所评学年受到学校处分或受到学校、学院和有关部门通报批评（通报批评的内容涉及学生思想表现情况）的，该项目不得评为“优秀”', '18', '1', '2', '2', '1503032686');
INSERT INTO `evaluation_point` VALUES ('6', '二级学院认定的其他情况（党校、中研）', '但上述个人若在所评学年受到学校处分或受到学校、学院和有关部门通报批评（通报批评的内容涉及学生思想表现情况）的，该项目不得评为“优秀”', '18', '1', '2', '3', '1503032687');
INSERT INTO `evaluation_point` VALUES ('7', '违反四项基本原则之言行', '', '0', '1', '3', '1', '1503032687');
INSERT INTO `evaluation_point` VALUES ('8', '参加“法轮功”等邪教组织', '', '0', '1', '3', '1', '1503032687');
INSERT INTO `evaluation_point` VALUES ('9', '从事非法的政治、宗教活动', '', '0', '1', '3', '1', '1503032687');
INSERT INTO `evaluation_point` VALUES ('10', '从事非法集会、游行、示威', '', '0', '1', '3', '1', '1503032687');
INSERT INTO `evaluation_point` VALUES ('11', '影响学校正常教学秩序', '经相关部门认定，酌情给分', '10', '1', '3', '1', '1503032687');
INSERT INTO `evaluation_point` VALUES ('12', '有违法或其他严重违规行为', '经相关部门认定，酌情给分', '10', '1', '3', '1', '1503032687');
INSERT INTO `evaluation_point` VALUES ('13', '学生所在寝室月卫生检查成绩曾获优良等级', '优秀（需有文字佐证材料，需经学工组认定）', '18', '2', '2', '2', '1503033261');
INSERT INTO `evaluation_point` VALUES ('14', '有反映助人为乐和学术诚信事迹的', '优秀（需有文字佐证材料，需经学工组认定）', '18', '2', '2', '2', '1503033262');
INSERT INTO `evaluation_point` VALUES ('15', '二级学院认定的其他情况', '优秀（需有文字佐证材料，需经学工组认定）', '18', '2', '2', '3', '1503033262');
INSERT INTO `evaluation_point` VALUES ('16', '所在寝室卫生检查成绩在学年内有月评定记录不及格', '不得评为优秀', '14', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('17', '缴费、还贷等有失信或违约记录', '不得评为优秀', '14', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('18', '在寝室内从事影响他人正常学习、生活和休息的活动或行为，经教育拒不改正', '不得评为优秀', '14', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('19', '诱导或无视他人违纪行为发生', '不得评为优秀', '14', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('20', '有违法犯罪行为', '', '0', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('21', '有学术诚信失范行为', '', '0', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('22', '受到学校警告以上处分', '', '0', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('23', '一学年内受到学校、学院或有关部门1次以上通报批评', '', '0', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('24', '擅自在校外住宿', '', '0', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('25', '所在寝室卫生检查成绩一学年总评为不合格', '因寝室个别成员行为所致的，其他寝室成员不受此条款约束，但需出具宿管中心相关证明', '0', '2', '3', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('26', '晚归（非主观原因除外）经批评教育仍不改正', '经学工组认定，晚归时间为23：30以后，每次扣1分', '-1', '2', '4', '1', '1503033262');
INSERT INTO `evaluation_point` VALUES ('27', '学习刻苦认真，本学年平均学分绩点名次较上学年上升幅度超过同专业年级人数10%', '上述个人若在所评学年违反《浙江科技学院学生课堂行为规范》等制度，受到学校处分或受到学校、学院和有关部门通报批评该项不得评为“优秀”', '18', '3', '2', '2', '1503033556');
INSERT INTO `evaluation_point` VALUES ('28', '所在班级学风优良，获得校级优良学风班等荣誉', '上述个人若在所评学年违反《浙江科技学院学生课堂行为规范》等制度，受到学校处分或受到学校、学院和有关部门通报批评该项不得评为“优秀”', '18', '3', '2', '2', '1503033556');
INSERT INTO `evaluation_point` VALUES ('29', '积极利用图书馆资源，本学年全部学生图书借阅数量列全校前30%的且学业绩点有明显提升', '上述个人若在所评学年违反《浙江科技学院学生课堂行为规范》等制度，受到学校处分或受到学校、学院和有关部门通报批评该项不得评为“优秀”', '18', '3', '2', '2', '1503033556');
INSERT INTO `evaluation_point` VALUES ('30', '平均学分绩点名次在同专业年级后50%，但学习自觉性高、主动性强、态度端正、能积极参加自习、专业竞赛和各级各类学术报告或活动', '上述个人若在所评学年违反《浙江科技学院学生课堂行为规范》等制度，受到学校处分或受到学校、学院和有关部门通报批评该项不得评为“优秀”', '18', '3', '2', '2', '1503033556');
INSERT INTO `evaluation_point` VALUES ('31', '二级学院认定的其他情况', '上述个人若在所评学年违反《浙江科技学院学生课堂行为规范》等制度，受到学校处分或受到学校、学院和有关部门通报批评该项不得评为“优秀”', '18', '3', '2', '3', '1503033557');
INSERT INTO `evaluation_point` VALUES ('32', '本学年有无故旷课、迟到、或带早餐进教室等行为受到学校处分或受到学校、学院和有关部门通报批评', '基准分8分，每旷课2节扣1分，扣完为止，有迟到、带早餐进教室现象每次扣1分', '-1', '3', '4', '1', '1503033557');
INSERT INTO `evaluation_point` VALUES ('33', '担任校院两级学生组织副部长（或相当职务）及以上干部（需出具指导或管理单位相关证明）', '所有的优秀考核比例为50%，合格加18分，担任学生干部职务至少满一年且考核优秀，加19分；担任两个及以上学生干部职务加20分', '18', '4', '2', '2', '1503033819');
INSERT INTO `evaluation_point` VALUES ('34', '担任班级班长、团支书、学习委员等职务(以上学生干部须积极组织学生活动、校际活动或国际交流活动，起到先锋模范作用)', '所有的优秀考核比例为50%，合格加18分，担任学生干部职务至少满一年且考核优秀，加19分；担任两个及以上学生干部职务加20分', '18', '4', '2', '2', '1503033819');
INSERT INTO `evaluation_point` VALUES ('35', '二级学院认定的其他情况', '所有的优秀考核比例为50%，合格加18分，担任学生干部职务至少满一年且考核优秀，加19分；担任两个及以上学生干部职务加20分', '18', '4', '2', '3', '1503033819');
INSERT INTO `evaluation_point` VALUES ('36', '学生干部被选用单位或主管单位考核为不合格的', '所有的优秀考核比例为50%，合格加18分，担任学生干部职务至少满一年且考核优秀，加19分；担任两个及以上学生干部职务加20分', '8', '4', '3', '1', '1503033819');
INSERT INTO `evaluation_point` VALUES ('37', '积极参加各级各类社会实践活动（不含校内勤工助学）、志愿（公益）活动或义务献血', '校报、校网、院网等媒体积极撰文报道的；学院分团委通报表扬的可酌情加分', '18', '5', '2', '2', '1503034027');
INSERT INTO `evaluation_point` VALUES ('38', '参加与所学专业相关的实习活动、实习时间累计超过2周（教学安排的专业实习除外）', '校报、校网、院网等媒体积极撰文报道的；学院分团委通报表扬的可酌情加分', '18', '5', '2', '2', '1503034027');
INSERT INTO `evaluation_point` VALUES ('39', '参加二级学院认定的其他项目并获得肯定性评价', '校报、校网、院网等媒体积极撰文报道的；学院分团委通报表扬的可酌情加分', '18', '5', '2', '3', '1503034027');
INSERT INTO `evaluation_point` VALUES ('40', '主观原因拒不参加社会实践活动、志愿（公益）服务', '', '8', '5', '3', '1', '1503034027');
INSERT INTO `evaluation_point` VALUES ('41', '生涯规划：积极参加各级职业生涯规划竞赛', '', '5', '7', '4', '2', '1503034563');
INSERT INTO `evaluation_point` VALUES ('42', '学科竞赛：积极参加除职业生涯规划竞赛外的学科竞赛', '完成参赛过程的竞赛一项加3分', '3', '7', '4', '2', '1503034563');
INSERT INTO `evaluation_point` VALUES ('43', '辅修课：积极报名参加辅修课', '每完成一门2分', '2', '7', '4', '2', '1503034564');
INSERT INTO `evaluation_point` VALUES ('44', '积极参加学术讲座报告', '每次1分，限加10分', '1', '7', '4', '2', '1503034564');
INSERT INTO `evaluation_point` VALUES ('45', 'CET四级、雅思6分、托福90分，加5分', '', '5', '7', '1', '2', '1503035264');
INSERT INTO `evaluation_point` VALUES ('46', 'CET六级、雅思6.5分、托福100分，加10分', '', '10', '7', '1', '2', '1503035264');
INSERT INTO `evaluation_point` VALUES ('47', '计算机省二级，加5分', '', '5', '7', '1', '2', '1503035264');
INSERT INTO `evaluation_point` VALUES ('48', '计算机省三级，加10分', '', '10', '7', '1', '2', '1503035264');
INSERT INTO `evaluation_point` VALUES ('49', '计算机国家二级，加10分', '', '10', '7', '1', '2', '1503035264');
INSERT INTO `evaluation_point` VALUES ('50', '计算机国家三级，加15分', '', '10', '7', '1', '2', '1503035264');
INSERT INTO `evaluation_point` VALUES ('51', '普通话二乙，加2分', '', '2', '7', '1', '2', '1503035264');
INSERT INTO `evaluation_point` VALUES ('52', '普通话二甲，加3分', '', '3', '7', '1', '2', '1503035265');
INSERT INTO `evaluation_point` VALUES ('53', '普通话一乙，加5分', '', '5', '7', '1', '2', '1503035265');
INSERT INTO `evaluation_point` VALUES ('54', '普通话一甲，加10分', '', '10', '7', '1', '2', '1503035265');
INSERT INTO `evaluation_point` VALUES ('55', '心理咨询师三级，加2分', '', '2', '7', '1', '2', '1503035265');
INSERT INTO `evaluation_point` VALUES ('56', '心理咨询师二级，加5分', '', '5', '7', '1', '2', '1503035265');
INSERT INTO `evaluation_point` VALUES ('57', '心理咨询师一级，加10分', '', '10', '7', '1', '2', '1503035265');
INSERT INTO `evaluation_point` VALUES ('58', '劳动局认证，专业非相关，加2分', '', '2', '7', '1', '2', '1503035265');
INSERT INTO `evaluation_point` VALUES ('59', '劳动局认证，专业相关，加3分', '', '3', '7', '1', '2', '1503035265');
INSERT INTO `evaluation_point` VALUES ('60', '科技立项，国家级，项目负责人，加32分', '', '32', '10', '1', '2', '1503035877');
INSERT INTO `evaluation_point` VALUES ('61', '科技立项，省级，项目负责人，加16分', '', '16', '10', '1', '2', '1503035877');
INSERT INTO `evaluation_point` VALUES ('62', '科技立项，校级，项目负责人，加5分', '', '5', '10', '1', '2', '1503035877');
INSERT INTO `evaluation_point` VALUES ('63', '论文及著作，三大索引，第一作者，加40分', '', '40', '10', '1', '2', '1503035877');
INSERT INTO `evaluation_point` VALUES ('64', '论文及著作，一级学术期刊，第一作者，加30分', '', '30', '10', '1', '2', '1503035877');
INSERT INTO `evaluation_point` VALUES ('65', '论文及著作，二级学术期刊，第一作者，加16分', '', '16', '10', '1', '2', '1503035877');
INSERT INTO `evaluation_point` VALUES ('66', '论文及著作，其他发表的学术期刊，第一作者，加12分', '', '12', '10', '1', '2', '1503035877');
INSERT INTO `evaluation_point` VALUES ('67', '知识产权，发明专利，第一专利人，加40分', '', '40', '10', '1', '2', '1503035878');
INSERT INTO `evaluation_point` VALUES ('68', '知识产权，实用新型/外观设计专利和软件著作权，第一专利人/第一著作权人，加16分', '', '16', '10', '1', '2', '1503035878');
INSERT INTO `evaluation_point` VALUES ('69', '创业，注册公司并开展运营，法定代表人，加32分', '', '32', '10', '1', '2', '1503035878');
INSERT INTO `evaluation_point` VALUES ('70', '产品（成果），技术成果转让，第一转让人，加40分', '', '40', '10', '1', '2', '1503035878');
INSERT INTO `evaluation_point` VALUES ('71', '软件、课件，新产品、软件、课件推广，第一开发人，加16分', '', '16', '10', '1', '2', '1503035878');

-- ----------------------------
-- Table structure for `fill_in_type`
-- ----------------------------
DROP TABLE IF EXISTS `fill_in_type`;
CREATE TABLE `fill_in_type` (
  `type_id` int(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`type_id`),
  UNIQUE KEY `type_id` (`type_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fill_in_type
-- ----------------------------
INSERT INTO `fill_in_type` VALUES ('1', '单行文本', '1502972632');
INSERT INTO `fill_in_type` VALUES ('2', '多行文本', '1502972633');

-- ----------------------------
-- Table structure for `import_item`
-- ----------------------------
DROP TABLE IF EXISTS `import_item`;
CREATE TABLE `import_item` (
  `import_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `exam_fail` int(20) DEFAULT NULL,
  `make_up` int(20) DEFAULT NULL,
  `cet4` int(20) DEFAULT NULL,
  `pe` double DEFAULT NULL,
  `gpa` double DEFAULT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`import_id`),
  UNIQUE KEY `import_id` (`import_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of import_item
-- ----------------------------
INSERT INTO `import_item` VALUES ('1', '1150299070', '0', '0', '1', '90', '3.4', '2017', '1502979974');
INSERT INTO `import_item` VALUES ('2', '1150299071', '0', '0', '1', '83', '2.8', '2017', '1502979974');
INSERT INTO `import_item` VALUES ('3', '1150299072', '1', '0', '0', '85', '3', '2017', '1502979974');
INSERT INTO `import_item` VALUES ('4', '1150299234', '0', '0', '1', '82', '3.3', '2017', '1502979974');
INSERT INTO `import_item` VALUES ('5', '1150299256', '0', '0', '1', '80', '3.1', '2017', '1502979974');

-- ----------------------------
-- Table structure for `item_score`
-- ----------------------------
DROP TABLE IF EXISTS `item_score`;
CREATE TABLE `item_score` (
  `item_score_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `item_id` int(20) NOT NULL,
  `score` double NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`item_score_id`),
  UNIQUE KEY `item_score_id` (`item_score_id`) USING BTREE,
  KEY `item_id` (`item_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `item_score_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `evaluation_item` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `item_score_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item_score
-- ----------------------------

-- ----------------------------
-- Table structure for `point_review`
-- ----------------------------
DROP TABLE IF EXISTS `point_review`;
CREATE TABLE `point_review` (
  `review_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `point_id` int(20) NOT NULL,
  `review_status` int(20) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`review_id`),
  UNIQUE KEY `review_id` (`review_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `point_id` (`point_id`),
  CONSTRAINT `point_review_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `point_review_ibfk_2` FOREIGN KEY (`point_id`) REFERENCES `evaluation_point` (`point_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of point_review
-- ----------------------------

-- ----------------------------
-- Table structure for `point_score`
-- ----------------------------
DROP TABLE IF EXISTS `point_score`;
CREATE TABLE `point_score` (
  `point_score_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `point_id` int(20) NOT NULL,
  `score` double NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`point_score_id`),
  UNIQUE KEY `point_score_id` (`point_score_id`) USING BTREE,
  KEY `point_id` (`point_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `point_score_ibfk_1` FOREIGN KEY (`point_id`) REFERENCES `evaluation_point` (`point_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `point_score_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of point_score
-- ----------------------------

-- ----------------------------
-- Table structure for `review_status`
-- ----------------------------
DROP TABLE IF EXISTS `review_status`;
CREATE TABLE `review_status` (
  `status_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `status` int(20) NOT NULL,
  `review_type_id` int(20) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`status_id`),
  UNIQUE KEY `status_id` (`status_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `review_type_id` (`review_type_id`),
  CONSTRAINT `review_status_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `review_status_ibfk_2` FOREIGN KEY (`review_type_id`) REFERENCES `review_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of review_status
-- ----------------------------

-- ----------------------------
-- Table structure for `review_time`
-- ----------------------------
DROP TABLE IF EXISTS `review_time`;
CREATE TABLE `review_time` (
  `review_time_id` int(20) NOT NULL AUTO_INCREMENT,
  `review_start` bigint(20) NOT NULL,
  `review_end` bigint(20) NOT NULL,
  `review_type_id` int(20) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`review_time_id`),
  UNIQUE KEY `review_time_id` (`review_time_id`) USING BTREE,
  KEY `review_type_id` (`review_type_id`),
  CONSTRAINT `review_time_ibfk_1` FOREIGN KEY (`review_type_id`) REFERENCES `review_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of review_time
-- ----------------------------
INSERT INTO `review_time` VALUES ('1', '1509465600', '1510243200', '1', '2017', '1502980259');
INSERT INTO `review_time` VALUES ('2', '1510329600', '1511107200', '2', '2017', '1502980328');
INSERT INTO `review_time` VALUES ('3', '1511193600', '1511971200', '3', '2017', '1502980329');

-- ----------------------------
-- Table structure for `review_type`
-- ----------------------------
DROP TABLE IF EXISTS `review_type`;
CREATE TABLE `review_type` (
  `type_id` int(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`type_id`),
  UNIQUE KEY `type_id` (`type_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of review_type
-- ----------------------------
INSERT INTO `review_type` VALUES ('1', '一审', '1502973010');
INSERT INTO `review_type` VALUES ('2', '二审', '1502973011');
INSERT INTO `review_type` VALUES ('3', '三审', '1502973011');

-- ----------------------------
-- Table structure for `scholarship`
-- ----------------------------
DROP TABLE IF EXISTS `scholarship`;
CREATE TABLE `scholarship` (
  `scholarship_id` int(20) NOT NULL AUTO_INCREMENT,
  `scholarship_name` varchar(100) NOT NULL,
  `award_percent` double NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`scholarship_id`),
  UNIQUE KEY `scholarship_id` (`scholarship_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scholarship
-- ----------------------------
INSERT INTO `scholarship` VALUES ('1', '省政府奖学金', '0.04', '1502972347');
INSERT INTO `scholarship` VALUES ('2', '国家奖学金', '0.03', '1502972347');
INSERT INTO `scholarship` VALUES ('3', '校一等奖学金', '0.08', '1502972347');

-- ----------------------------
-- Table structure for `scholarship_block`
-- ----------------------------
DROP TABLE IF EXISTS `scholarship_block`;
CREATE TABLE `scholarship_block` (
  `scholarship_block_id` int(20) NOT NULL AUTO_INCREMENT,
  `scholarship_block_name` varchar(100) NOT NULL,
  `scholarship_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`scholarship_block_id`),
  UNIQUE KEY `scholarship_block_id` (`scholarship_block_id`) USING BTREE,
  KEY `scholarship_id` (`scholarship_id`),
  CONSTRAINT `scholarship_block_ibfk_1` FOREIGN KEY (`scholarship_id`) REFERENCES `scholarship` (`scholarship_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scholarship_block
-- ----------------------------
INSERT INTO `scholarship_block` VALUES ('1', '个人基本信息', '1', '1502972550');
INSERT INTO `scholarship_block` VALUES ('2', '学习情况', '1', '1502972550');
INSERT INTO `scholarship_block` VALUES ('3', '大学期间主要获奖情况', '1', '1502972550');
INSERT INTO `scholarship_block` VALUES ('4', '推荐理由', '1', '1502972550');
INSERT INTO `scholarship_block` VALUES ('5', '院系意见', '1', '1502972550');
INSERT INTO `scholarship_block` VALUES ('6', '学生信息', '2', '1502972550');

-- ----------------------------
-- Table structure for `scholarship_item`
-- ----------------------------
DROP TABLE IF EXISTS `scholarship_item`;
CREATE TABLE `scholarship_item` (
  `scholarship_item_id` int(20) NOT NULL AUTO_INCREMENT,
  `scholarship_item_name` varchar(100) NOT NULL,
  `scholarship_block_id` int(20) NOT NULL,
  `fill_in_type_id` int(20) NOT NULL,
  `fill_in_hint` varchar(100) DEFAULT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`scholarship_item_id`),
  UNIQUE KEY `scholarship_item_id` (`scholarship_item_id`) USING BTREE,
  KEY `scholarship_block_id` (`scholarship_block_id`),
  KEY `fill_in_type_id` (`fill_in_type_id`),
  CONSTRAINT `scholarship_item_ibfk_1` FOREIGN KEY (`scholarship_block_id`) REFERENCES `scholarship_block` (`scholarship_block_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `scholarship_item_ibfk_2` FOREIGN KEY (`fill_in_type_id`) REFERENCES `fill_in_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scholarship_item
-- ----------------------------
INSERT INTO `scholarship_item` VALUES ('1', '学校', '1', '1', '', '1502972799');
INSERT INTO `scholarship_item` VALUES ('2', '院系', '1', '1', '就读学院', '1502972799');
INSERT INTO `scholarship_item` VALUES ('3', '成绩排名', '2', '1', '名次/总人数', '1502972799');
INSERT INTO `scholarship_item` VALUES ('4', '日期', '3', '1', '', '1502972799');
INSERT INTO `scholarship_item` VALUES ('5', '推荐理由', '4', '2', '', '1502972799');
INSERT INTO `scholarship_item` VALUES ('6', '院系意见', '5', '2', '', '1502972799');
INSERT INTO `scholarship_item` VALUES ('7', '学号', '6', '1', '', '1502972799');

-- ----------------------------
-- Table structure for `school`
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `school_id` int(20) NOT NULL AUTO_INCREMENT,
  `school_name` varchar(100) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`school_id`),
  UNIQUE KEY `school_id` (`school_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES ('1', '信息与电子工程学院', '1502971810');
INSERT INTO `school` VALUES ('2', '理学院', '1502971810');

-- ----------------------------
-- Table structure for `school_manager`
-- ----------------------------
DROP TABLE IF EXISTS `school_manager`;
CREATE TABLE `school_manager` (
  `school_manager_id` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `school_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`school_manager_id`),
  UNIQUE KEY `school_manager_id` (`school_manager_id`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `school_manager_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school_manager
-- ----------------------------
INSERT INTO `school_manager` VALUES ('1150299070', 'ODg4NjY2', '1', '1502972169');
INSERT INTO `school_manager` VALUES ('1150299072', 'OTk5OTk5', '2', '1502972169');

-- ----------------------------
-- Table structure for `single_input`
-- ----------------------------
DROP TABLE IF EXISTS `single_input`;
CREATE TABLE `single_input` (
  `input_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `point_id` int(20) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`input_id`),
  UNIQUE KEY `input_id` (`input_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `point_id` (`point_id`),
  CONSTRAINT `single_input_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `single_input_ibfk_2` FOREIGN KEY (`point_id`) REFERENCES `evaluation_point` (`point_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of single_input
-- ----------------------------

-- ----------------------------
-- Table structure for `triple_input`
-- ----------------------------
DROP TABLE IF EXISTS `triple_input`;
CREATE TABLE `triple_input` (
  `input_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `point_id` int(20) NOT NULL,
  `evidence` varchar(100) NOT NULL,
  `addition` varchar(100) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`input_id`),
  UNIQUE KEY `input_id` (`input_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `point_id` (`point_id`),
  CONSTRAINT `triple_input_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `triple_input_ibfk_2` FOREIGN KEY (`point_id`) REFERENCES `evaluation_point` (`point_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of triple_input
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_id` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `class_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id` (`user_id`) USING BTREE,
  KEY `class_id` (`class_id`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `classes` (`class_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1150299070', '陈伟', 'ODg4NjY2', '1', '1502972050');
INSERT INTO `users` VALUES ('1150299071', '张三', 'ODg4ODg4', '3', '1502972051');
INSERT INTO `users` VALUES ('1150299072', '李四', 'OTk5OTk5', '4', '1502972051');
INSERT INTO `users` VALUES ('1150299234', '林创伟', 'MTIzNDU2', '1', '1502972050');
INSERT INTO `users` VALUES ('1150299256', '蔡靖楠', 'NjY2NjY2', '2', '1502972050');
