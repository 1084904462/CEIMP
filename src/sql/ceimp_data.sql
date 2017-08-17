/*
Navicat MySQL Data Transfer

Source Server         : weige
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ceimp

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-08-17 12:13:07
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
-- Table structure for `art_competition`
-- ----------------------------
DROP TABLE IF EXISTS `art_competition`;
CREATE TABLE `art_competition` (
  `competition_id` int(20) NOT NULL AUTO_INCREMENT,
  `competition_name` varchar(100) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`competition_id`),
  UNIQUE KEY `competition_id` (`competition_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of art_competition
-- ----------------------------
INSERT INTO `art_competition` VALUES ('1', '奥运会', '1502941333');
INSERT INTO `art_competition` VALUES ('2', '市运会', '1502941333');
INSERT INTO `art_competition` VALUES ('3', '校运会', '1502941333');

-- ----------------------------
-- Table structure for `art_competition_score`
-- ----------------------------
DROP TABLE IF EXISTS `art_competition_score`;
CREATE TABLE `art_competition_score` (
  `score_id` int(20) NOT NULL AUTO_INCREMENT,
  `competition_level_id` int(20) NOT NULL,
  `award_level_id` int(20) NOT NULL,
  `score` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`score_id`),
  UNIQUE KEY `score_id` (`score_id`) USING BTREE,
  KEY `competition_level_id` (`competition_level_id`),
  KEY `award_level_id` (`award_level_id`),
  CONSTRAINT `art_competition_score_ibfk_1` FOREIGN KEY (`competition_level_id`) REFERENCES `competition_level` (`competition_level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `art_competition_score_ibfk_2` FOREIGN KEY (`award_level_id`) REFERENCES `award_level` (`award_level_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of art_competition_score
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of award
-- ----------------------------
INSERT INTO `award` VALUES ('1', '1150299070', '1', '2017', '1502936646');
INSERT INTO `award` VALUES ('2', '1150299070', '2', '2017', '1502936646');
INSERT INTO `award` VALUES ('3', '1150299071', '1', '2017', '1502936646');
INSERT INTO `award` VALUES ('4', '1150299071', '3', '2017', '1502936646');
INSERT INTO `award` VALUES ('5', '1150299072', '2', '2017', '1502936646');

-- ----------------------------
-- Table structure for `award_level`
-- ----------------------------
DROP TABLE IF EXISTS `award_level`;
CREATE TABLE `award_level` (
  `award_level_id` int(20) NOT NULL AUTO_INCREMENT,
  `level` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`award_level_id`),
  UNIQUE KEY `award_level_id` (`award_level_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of award_level
-- ----------------------------
INSERT INTO `award_level` VALUES ('1', '特等奖', '1502940228');
INSERT INTO `award_level` VALUES ('2', '一等奖', '1502940228');
INSERT INTO `award_level` VALUES ('3', '二等奖', '1502940228');
INSERT INTO `award_level` VALUES ('4', '三等奖', '1502940228');
INSERT INTO `award_level` VALUES ('5', '参赛奖', '1502940228');

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
INSERT INTO `classes` VALUES ('1', '软件工程', '151', '1', '1502933694');
INSERT INTO `classes` VALUES ('2', '软件工程', '152', '1', '1502933695');
INSERT INTO `classes` VALUES ('3', '数字媒体技术', '151', '1', '1502933695');
INSERT INTO `classes` VALUES ('4', '应用物理学', '151', '2', '1502933695');

-- ----------------------------
-- Table structure for `class_manager`
-- ----------------------------
DROP TABLE IF EXISTS `class_manager`;
CREATE TABLE `class_manager` (
  `class_manager_id` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
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
INSERT INTO `class_manager` VALUES ('1150299071', '123456', '1', '1502934503');
INSERT INTO `class_manager` VALUES ('1150299072', '999999', '2', '1502934503');
INSERT INTO `class_manager` VALUES ('1150299073', '666666', '3', '1502934504');

-- ----------------------------
-- Table structure for `class_score`
-- ----------------------------
DROP TABLE IF EXISTS `class_score`;
CREATE TABLE `class_score` (
  `class_score_id` int(20) NOT NULL AUTO_INCREMENT,
  `class_id` int(20) NOT NULL,
  `user_id` varchar(20) NOT NULL,
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
-- Table structure for `competition_input`
-- ----------------------------
DROP TABLE IF EXISTS `competition_input`;
CREATE TABLE `competition_input` (
  `input_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `competition_id` int(20) NOT NULL,
  `evidence` varchar(100) NOT NULL,
  `competition_level_id` int(20) NOT NULL,
  `award_level_id` int(20) NOT NULL,
  `competition_type` int(20) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`input_id`),
  UNIQUE KEY `input_id` (`input_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `award_level_id` (`award_level_id`),
  KEY `competition_level_id` (`competition_level_id`),
  CONSTRAINT `competition_input_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_2` FOREIGN KEY (`award_level_id`) REFERENCES `award_level` (`award_level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_3` FOREIGN KEY (`competition_level_id`) REFERENCES `competition_level` (`competition_level_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_input
-- ----------------------------

-- ----------------------------
-- Table structure for `competition_level`
-- ----------------------------
DROP TABLE IF EXISTS `competition_level`;
CREATE TABLE `competition_level` (
  `competition_level_id` int(20) NOT NULL AUTO_INCREMENT,
  `level` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`competition_level_id`),
  UNIQUE KEY `competition_level_id` (`competition_level_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_level
-- ----------------------------
INSERT INTO `competition_level` VALUES ('1', '国家级', '1502940067');
INSERT INTO `competition_level` VALUES ('2', '省级', '1502940067');
INSERT INTO `competition_level` VALUES ('3', '市级', '1502940067');
INSERT INTO `competition_level` VALUES ('4', '校级', '1502940068');
INSERT INTO `competition_level` VALUES ('5', '院级', '1502940068');

-- ----------------------------
-- Table structure for `competition_level_connection`
-- ----------------------------
DROP TABLE IF EXISTS `competition_level_connection`;
CREATE TABLE `competition_level_connection` (
  `connection_id` int(20) NOT NULL AUTO_INCREMENT,
  `competition_id` int(20) NOT NULL,
  `level_id` int(20) NOT NULL,
  `competition_type` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`connection_id`),
  UNIQUE KEY `connection_id` (`connection_id`) USING BTREE,
  KEY `level_id` (`level_id`),
  CONSTRAINT `competition_level_connection_ibfk_1` FOREIGN KEY (`level_id`) REFERENCES `competition_level` (`competition_level_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_level_connection
-- ----------------------------

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
  `content` varchar(500) NOT NULL,
  `weight` double NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`class_id`),
  UNIQUE KEY `class_id` (`class_id`) USING BTREE,
  KEY `form_id` (`form_id`),
  CONSTRAINT `evaluation_class_ibfk_1` FOREIGN KEY (`form_id`) REFERENCES `evaluation_form` (`form_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_class
-- ----------------------------

-- ----------------------------
-- Table structure for `evaluation_form`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation_form`;
CREATE TABLE `evaluation_form` (
  `form_id` int(20) NOT NULL AUTO_INCREMENT,
  `form_name` varchar(100) NOT NULL,
  `content` varchar(500) NOT NULL,
  `publishing_unit` varchar(20) NOT NULL,
  `school_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`form_id`),
  UNIQUE KEY `form_id` (`form_id`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `evaluation_form_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_form
-- ----------------------------

-- ----------------------------
-- Table structure for `evaluation_item`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation_item`;
CREATE TABLE `evaluation_item` (
  `item_id` int(20) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(100) NOT NULL,
  `class_id` int(20) NOT NULL,
  `max_score` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`item_id`),
  UNIQUE KEY `item_id` (`item_id`) USING BTREE,
  KEY `class_id` (`class_id`),
  CONSTRAINT `evaluation_item_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `evaluation_class` (`class_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_item
-- ----------------------------

-- ----------------------------
-- Table structure for `evaluation_point`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation_point`;
CREATE TABLE `evaluation_point` (
  `point_id` int(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(500) NOT NULL,
  `remark` varchar(500) DEFAULT NULL,
  `score` int(20) NOT NULL,
  `item_id` int(20) NOT NULL,
  `calculate_type` int(20) NOT NULL,
  `input_type` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`point_id`),
  UNIQUE KEY `point_id` (`point_id`) USING BTREE,
  KEY `item_id` (`item_id`),
  CONSTRAINT `evaluation_point_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `evaluation_item` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_point
-- ----------------------------

-- ----------------------------
-- Table structure for `fill_in_type`
-- ----------------------------
DROP TABLE IF EXISTS `fill_in_type`;
CREATE TABLE `fill_in_type` (
  `fill_in_type_id` int(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`fill_in_type_id`),
  UNIQUE KEY `fill_in_type_id` (`fill_in_type_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fill_in_type
-- ----------------------------
INSERT INTO `fill_in_type` VALUES ('1', '单行文本', '1502935291');
INSERT INTO `fill_in_type` VALUES ('2', '多行文本', '1502935292');

-- ----------------------------
-- Table structure for `import_item`
-- ----------------------------
DROP TABLE IF EXISTS `import_item`;
CREATE TABLE `import_item` (
  `import_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `exam_fail` int(20) NOT NULL,
  `make_up` int(20) NOT NULL,
  `cet4` int(20) NOT NULL,
  `pe` double NOT NULL,
  `gpa` double NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`import_id`),
  UNIQUE KEY `import_id` (`import_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of import_item
-- ----------------------------
INSERT INTO `import_item` VALUES ('1', '1150299070', '0', '0', '1', '90', '3.4', '2017', '1502936616');
INSERT INTO `import_item` VALUES ('2', '1150299071', '1', '0', '1', '79', '3.6', '2017', '1502936616');
INSERT INTO `import_item` VALUES ('3', '1150299072', '1', '1', '0', '80', '3.5', '2017', '1502936616');
INSERT INTO `import_item` VALUES ('4', '1150299073', '0', '0', '1', '85', '3.2', '2017', '1502936616');

-- ----------------------------
-- Table structure for `item_score`
-- ----------------------------
DROP TABLE IF EXISTS `item_score`;
CREATE TABLE `item_score` (
  `item_score_id` int(20) NOT NULL AUTO_INCREMENT,
  `item_id` int(20) NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `score` int(20) NOT NULL,
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
  `point_id` int(20) NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `score` int(20) NOT NULL,
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
  `review_status_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `status` int(20) NOT NULL,
  `review_type_id` int(20) NOT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`review_status_id`),
  UNIQUE KEY `review_status_id` (`review_status_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `review_type_id` (`review_type_id`),
  CONSTRAINT `review_status_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `review_status_ibfk_2` FOREIGN KEY (`review_type_id`) REFERENCES `review_type` (`review_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
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
  CONSTRAINT `review_time_ibfk_1` FOREIGN KEY (`review_type_id`) REFERENCES `review_type` (`review_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of review_time
-- ----------------------------

-- ----------------------------
-- Table structure for `review_type`
-- ----------------------------
DROP TABLE IF EXISTS `review_type`;
CREATE TABLE `review_type` (
  `review_type_id` int(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`review_type_id`),
  UNIQUE KEY `review_type_id` (`review_type_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of review_type
-- ----------------------------
INSERT INTO `review_type` VALUES ('1', '一审', '1502938516');
INSERT INTO `review_type` VALUES ('2', '二审', '1502938516');
INSERT INTO `review_type` VALUES ('3', '三审', '1502938517');

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
INSERT INTO `scholarship` VALUES ('1', '省政府奖学金', '0.04', '1502934925');
INSERT INTO `scholarship` VALUES ('2', '国家奖学金', '0.05', '1502934926');
INSERT INTO `scholarship` VALUES ('3', '校一等奖学金', '0.08', '1502934926');

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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scholarship_block
-- ----------------------------
INSERT INTO `scholarship_block` VALUES ('1', '个人基本信息', '1', '1502935163');
INSERT INTO `scholarship_block` VALUES ('2', '学习情况', '1', '1502935163');
INSERT INTO `scholarship_block` VALUES ('3', '大学期间主要获奖情况', '1', '1502935163');
INSERT INTO `scholarship_block` VALUES ('4', '推荐理由', '1', '1502935163');
INSERT INTO `scholarship_block` VALUES ('5', '院系意见', '1', '1502935163');
INSERT INTO `scholarship_block` VALUES ('6', '个人基本信息', '2', '1502935163');
INSERT INTO `scholarship_block` VALUES ('7', '大学期间主要成就', '2', '1502935163');
INSERT INTO `scholarship_block` VALUES ('8', '学生基本信息', '3', '1502935163');

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
  CONSTRAINT `scholarship_item_ibfk_2` FOREIGN KEY (`fill_in_type_id`) REFERENCES `fill_in_type` (`fill_in_type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scholarship_item
-- ----------------------------
INSERT INTO `scholarship_item` VALUES ('1', '学校', '1', '1', '', '1502935617');
INSERT INTO `scholarship_item` VALUES ('2', '院系', '1', '1', '就读学院', '1502935617');
INSERT INTO `scholarship_item` VALUES ('3', '成绩排名', '2', '1', '名次/总人数', '1502935617');
INSERT INTO `scholarship_item` VALUES ('4', '奖项名称', '3', '1', '', '1502935617');
INSERT INTO `scholarship_item` VALUES ('5', '推荐理由', '4', '2', '', '1502935618');
INSERT INTO `scholarship_item` VALUES ('6', '院系意见', '5', '2', '', '1502935618');
INSERT INTO `scholarship_item` VALUES ('7', '学号', '6', '1', '', '1502935618');

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
INSERT INTO `school` VALUES ('1', '信息与电子工程学院', '1502933353');
INSERT INTO `school` VALUES ('2', '理学院', '1502933354');

-- ----------------------------
-- Table structure for `school_manager`
-- ----------------------------
DROP TABLE IF EXISTS `school_manager`;
CREATE TABLE `school_manager` (
  `school_manager_id` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
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
INSERT INTO `school_manager` VALUES ('1150299070', '888666', '1', '1502934555');

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
-- Table structure for `technology_competition`
-- ----------------------------
DROP TABLE IF EXISTS `technology_competition`;
CREATE TABLE `technology_competition` (
  `competition_id` int(20) NOT NULL AUTO_INCREMENT,
  `competition_name` varchar(100) NOT NULL,
  `competition_type_id` int(20) NOT NULL,
  `school_id` int(20) NOT NULL,
  `organizer` varchar(100) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`competition_id`),
  UNIQUE KEY `competition_id` (`competition_id`) USING BTREE,
  KEY `competition_type_id` (`competition_type_id`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `technology_competition_ibfk_1` FOREIGN KEY (`competition_type_id`) REFERENCES `technology_competition_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `technology_competition_ibfk_2` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of technology_competition
-- ----------------------------

-- ----------------------------
-- Table structure for `technology_competition_score`
-- ----------------------------
DROP TABLE IF EXISTS `technology_competition_score`;
CREATE TABLE `technology_competition_score` (
  `score_id` int(20) NOT NULL AUTO_INCREMENT,
  `competition_level_id` int(20) NOT NULL,
  `award_level_id` int(20) NOT NULL,
  `competition_type_id` int(20) NOT NULL,
  `score` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`score_id`),
  UNIQUE KEY `score_id` (`score_id`) USING BTREE,
  KEY `competition_level_id` (`competition_level_id`),
  KEY `award_level_id` (`award_level_id`),
  KEY `competition_type_id` (`competition_type_id`),
  CONSTRAINT `technology_competition_score_ibfk_1` FOREIGN KEY (`competition_level_id`) REFERENCES `competition_level` (`competition_level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `technology_competition_score_ibfk_2` FOREIGN KEY (`award_level_id`) REFERENCES `award_level` (`award_level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `technology_competition_score_ibfk_3` FOREIGN KEY (`competition_type_id`) REFERENCES `technology_competition_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of technology_competition_score
-- ----------------------------

-- ----------------------------
-- Table structure for `technology_competition_type`
-- ----------------------------
DROP TABLE IF EXISTS `technology_competition_type`;
CREATE TABLE `technology_competition_type` (
  `type_id` int(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`type_id`),
  UNIQUE KEY `type_id` (`type_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of technology_competition_type
-- ----------------------------
INSERT INTO `technology_competition_type` VALUES ('1', 'A', '1502940068');
INSERT INTO `technology_competition_type` VALUES ('2', 'B', '1502940068');
INSERT INTO `technology_competition_type` VALUES ('3', 'C', '1502940068');

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
  `password` varchar(20) NOT NULL,
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
INSERT INTO `users` VALUES ('1150299070', '陈伟', '888666', '1', '1502934343');
INSERT INTO `users` VALUES ('1150299071', '林创伟', '123456', '1', '1502934343');
INSERT INTO `users` VALUES ('1150299072', '蔡靖楠', '999999', '2', '1502934343');
INSERT INTO `users` VALUES ('1150299073', '陈立', '666666', '3', '1502934343');
