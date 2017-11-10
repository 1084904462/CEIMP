/*
Navicat MySQL Data Transfer

Source Server         : 114.55.26.150_3306
Source Server Version : 50716
Source Host           : 114.55.26.150:3306
Source Database       : ceimp

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-11-06 13:40:25
*/

SET FOREIGN_KEY_CHECKS=0;

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
-- Table structure for `basic_input`
-- ----------------------------
DROP TABLE IF EXISTS `basic_input`;
CREATE TABLE `basic_input` (
  `input_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `point_id` int(20) DEFAULT NULL,
  `evidence` varchar(500) DEFAULT NULL,
  `times` int(20) DEFAULT NULL,
  `subjective_score` double DEFAULT NULL,
  `addition` varchar(500) DEFAULT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`input_id`),
  UNIQUE KEY `input_id` (`input_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `point_id` (`point_id`),
  CONSTRAINT `basic_input_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `basic_input_ibfk_2` FOREIGN KEY (`point_id`) REFERENCES `evaluation_point` (`point_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basic_input
-- ----------------------------

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
INSERT INTO `class_manager` VALUES ('1150299234', 'UsaeOlczEIGCMzHE5p0/Lg==', '1', '1502972250');
INSERT INTO `class_manager` VALUES ('1150299256', '4QrcOUm6Wau+VuBX8g+IPg==', '2', '1502972250');

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
-- Table structure for `competition`
-- ----------------------------
DROP TABLE IF EXISTS `competition`;
CREATE TABLE `competition` (
  `competition_id` int(20) NOT NULL AUTO_INCREMENT,
  `type` int(20) NOT NULL,
  `competition_name` varchar(100) NOT NULL,
  `school_id` int(20) NOT NULL,
  `competition_level_id` int(20) NOT NULL,
  `competition_type_id` int(20) NOT NULL,
  `is_group` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`competition_id`),
  UNIQUE KEY `competition_id` (`competition_id`) USING BTREE,
  KEY `school_id` (`school_id`),
  KEY `competition_level_id` (`competition_level_id`),
  KEY `competition_type_id` (`competition_type_id`),
  CONSTRAINT `competition_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_ibfk_2` FOREIGN KEY (`competition_level_id`) REFERENCES `competition_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_ibfk_3` FOREIGN KEY (`competition_type_id`) REFERENCES `competition_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition
-- ----------------------------

-- ----------------------------
-- Table structure for `competition_group`
-- ----------------------------
DROP TABLE IF EXISTS `competition_group`;
CREATE TABLE `competition_group` (
  `rank_id` int(20) NOT NULL AUTO_INCREMENT,
  `rank` varchar(20) NOT NULL,
  `percent` double NOT NULL,
  `school_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`rank_id`),
  UNIQUE KEY `rank_id` (`rank_id`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `competition_group_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_group
-- ----------------------------

-- ----------------------------
-- Table structure for `competition_input`
-- ----------------------------
DROP TABLE IF EXISTS `competition_input`;
CREATE TABLE `competition_input` (
  `input_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `competition_id` int(20) DEFAULT NULL,
  `competition_level_id` int(20) NOT NULL,
  `competition_type_id` int(20) NOT NULL,
  `award_level_id` int(20) NOT NULL,
  `is_relevant` int(20) NOT NULL,
  `is_group` int(20) NOT NULL,
  `rank_id` int(20) DEFAULT NULL,
  `evidence` varchar(500) DEFAULT NULL,
  `addition_competition` varchar(100) DEFAULT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`input_id`),
  UNIQUE KEY `input_id` (`input_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `competition_id` (`competition_id`),
  KEY `competition_type_id` (`competition_type_id`),
  KEY `competition_level_id` (`competition_level_id`),
  KEY `award_level_id` (`award_level_id`),
  KEY `rank_id` (`rank_id`),
  CONSTRAINT `competition_input_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_2` FOREIGN KEY (`competition_id`) REFERENCES `competition` (`competition_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_3` FOREIGN KEY (`competition_type_id`) REFERENCES `competition_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_4` FOREIGN KEY (`competition_level_id`) REFERENCES `competition_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_5` FOREIGN KEY (`award_level_id`) REFERENCES `award_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_input_ibfk_6` FOREIGN KEY (`rank_id`) REFERENCES `competition_group` (`rank_id`) ON DELETE CASCADE ON UPDATE CASCADE
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
-- Table structure for `competition_score`
-- ----------------------------
DROP TABLE IF EXISTS `competition_score`;
CREATE TABLE `competition_score` (
  `score_id` int(20) NOT NULL AUTO_INCREMENT,
  `type` int(20) NOT NULL,
  `competition_level_id` int(20) NOT NULL,
  `award_level_id` int(20) NOT NULL,
  `score` double NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`score_id`),
  UNIQUE KEY `score_id` (`score_id`) USING BTREE,
  KEY `competition_level_id` (`competition_level_id`),
  KEY `award_level_id` (`award_level_id`),
  CONSTRAINT `competition_score_ibfk_1` FOREIGN KEY (`competition_level_id`) REFERENCES `competition_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `competition_score_ibfk_2` FOREIGN KEY (`award_level_id`) REFERENCES `award_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of competition_score
-- ----------------------------

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
  `content` varchar(500) DEFAULT NULL,
  `publishing_unit` varchar(20) DEFAULT NULL,
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
  `max_score` double NOT NULL,
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
  `score` double NOT NULL,
  `item_id` int(20) NOT NULL,
  `calculate_type` int(20) NOT NULL,
  `input_type` int(20) NOT NULL,
  `fill_in_type_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`point_id`),
  UNIQUE KEY `point_id` (`point_id`) USING BTREE,
  KEY `item_id` (`item_id`),
  KEY `fill_in_type_id` (`fill_in_type_id`),
  CONSTRAINT `evaluation_point_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `evaluation_item` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `evaluation_point_ibfk_2` FOREIGN KEY (`fill_in_type_id`) REFERENCES `fill_in_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_point
-- ----------------------------

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
  `cet4` double DEFAULT NULL,
  `pe` double DEFAULT NULL,
  `gpa` double DEFAULT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`import_id`),
  UNIQUE KEY `import_id` (`import_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `import_item_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of import_item
-- ----------------------------
INSERT INTO `import_item` VALUES ('1', '1150299070', '0', '0', '1', '90', '3.4', '2017', '1502979974');
INSERT INTO `import_item` VALUES ('2', '1150299071', '0', '0', '1', '83', '2.8', '2017', '1502979974');
INSERT INTO `import_item` VALUES ('4', '1150299234', '0', '0', '1', '82', '3.3', '2017', '1502979974');
INSERT INTO `import_item` VALUES ('5', '1150299256', '0', '0', '1', '80', '3.1', '2017', '1502979974');

-- ----------------------------
-- Table structure for `innovation`
-- ----------------------------
DROP TABLE IF EXISTS `innovation`;
CREATE TABLE `innovation` (
  `innovation_id` int(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(100) NOT NULL,
  `type` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`innovation_id`),
  UNIQUE KEY `innovation_id` (`innovation_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of innovation
-- ----------------------------

-- ----------------------------
-- Table structure for `innovation_input`
-- ----------------------------
DROP TABLE IF EXISTS `innovation_input`;
CREATE TABLE `innovation_input` (
  `input_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `innovation_id` int(20) NOT NULL,
  `content` varchar(500) NOT NULL,
  `level_id` int(20) NOT NULL,
  `require_id` int(20) NOT NULL,
  `evidence` varchar(500) DEFAULT NULL,
  `year_scope` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`input_id`),
  UNIQUE KEY `input_id` (`input_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `innovation_id` (`innovation_id`),
  KEY `level_id` (`level_id`),
  KEY `require_id` (`require_id`),
  CONSTRAINT `innovation_input_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `innovation_input_ibfk_2` FOREIGN KEY (`innovation_id`) REFERENCES `innovation` (`innovation_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `innovation_input_ibfk_3` FOREIGN KEY (`level_id`) REFERENCES `innovation_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `innovation_input_ibfk_4` FOREIGN KEY (`require_id`) REFERENCES `innovation_require` (`require_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of innovation_input
-- ----------------------------

-- ----------------------------
-- Table structure for `innovation_level`
-- ----------------------------
DROP TABLE IF EXISTS `innovation_level`;
CREATE TABLE `innovation_level` (
  `level_id` int(20) NOT NULL AUTO_INCREMENT,
  `level` varchar(100) NOT NULL,
  `innovation_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`level_id`),
  UNIQUE KEY `level_id` (`level_id`) USING BTREE,
  KEY `innovation_id` (`innovation_id`),
  CONSTRAINT `innovation_level_ibfk_1` FOREIGN KEY (`innovation_id`) REFERENCES `innovation` (`innovation_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of innovation_level
-- ----------------------------

-- ----------------------------
-- Table structure for `innovation_require`
-- ----------------------------
DROP TABLE IF EXISTS `innovation_require`;
CREATE TABLE `innovation_require` (
  `require_id` int(20) NOT NULL AUTO_INCREMENT,
  `require` varchar(100) NOT NULL,
  `innovation_id` int(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`require_id`),
  UNIQUE KEY `require_id` (`require_id`) USING BTREE,
  KEY `innovation_id` (`innovation_id`),
  CONSTRAINT `innovation_require_ibfk_1` FOREIGN KEY (`innovation_id`) REFERENCES `innovation` (`innovation_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of innovation_require
-- ----------------------------

-- ----------------------------
-- Table structure for `innovation_score`
-- ----------------------------
DROP TABLE IF EXISTS `innovation_score`;
CREATE TABLE `innovation_score` (
  `score_id` int(20) NOT NULL AUTO_INCREMENT,
  `level_id` int(20) NOT NULL,
  `require_id` int(20) NOT NULL,
  `score` double NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`score_id`),
  UNIQUE KEY `score_id` (`score_id`) USING BTREE,
  KEY `level_id` (`level_id`),
  KEY `require_id` (`require_id`),
  CONSTRAINT `innovation_score_ibfk_1` FOREIGN KEY (`level_id`) REFERENCES `innovation_level` (`level_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `innovation_score_ibfk_2` FOREIGN KEY (`require_id`) REFERENCES `innovation_require` (`require_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of innovation_score
-- ----------------------------

-- ----------------------------
-- Table structure for `input_review`
-- ----------------------------
DROP TABLE IF EXISTS `input_review`;
CREATE TABLE `input_review` (
  `review_id` int(20) NOT NULL AUTO_INCREMENT,
  `input_id` int(20) NOT NULL,
  `input_type` int(20) NOT NULL,
  `review_status` int(20) DEFAULT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`review_id`),
  UNIQUE KEY `review_id` (`review_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of input_review
-- ----------------------------

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
-- Table structure for `manager`
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `manager_id` varchar(20) NOT NULL,
  `password` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1', '1150299070', 'Qpf0SxOVUjUkWySXOZ16kw==');
INSERT INTO `manager` VALUES ('2', '1150299303', 'Qpf0SxOVUjUkWySXOZ16kw==');
INSERT INTO `manager` VALUES ('3', '112021', 'Qpf0SxOVUjUkWySXOZ16kw==');
INSERT INTO `manager` VALUES ('4', '114046', 'Qpf0SxOVUjUkWySXOZ16kw==');

-- ----------------------------
-- Table structure for `national_grant`
-- ----------------------------
DROP TABLE IF EXISTS `national_grant`;
CREATE TABLE `national_grant` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(50) NOT NULL,
  `resident` varchar(100) DEFAULT NULL,
  `income_source` varchar(100) DEFAULT NULL,
  `month_income` varchar(100) DEFAULT NULL,
  `family_sum` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `postal_code` varchar(100) DEFAULT NULL,
  `situation` varchar(100) DEFAULT NULL,
  `f_name1` varchar(100) DEFAULT NULL,
  `age1` varchar(100) DEFAULT NULL,
  `relation1` varchar(100) DEFAULT NULL,
  `work_place1` varchar(100) DEFAULT NULL,
  `f_name2` varchar(100) DEFAULT NULL,
  `age2` varchar(100) DEFAULT NULL,
  `relation2` varchar(100) DEFAULT NULL,
  `work_place2` varchar(100) DEFAULT NULL,
  `f_name3` varchar(100) DEFAULT NULL,
  `age3` varchar(100) DEFAULT NULL,
  `relation3` varchar(100) DEFAULT NULL,
  `work_place3` varchar(100) DEFAULT NULL,
  `f_name4` varchar(100) DEFAULT NULL,
  `age4` varchar(100) DEFAULT NULL,
  `relation4` varchar(100) DEFAULT NULL,
  `work_place4` varchar(100) DEFAULT NULL,
  `f_name5` varchar(100) DEFAULT NULL,
  `age5` varchar(100) DEFAULT NULL,
  `relation5` varchar(100) DEFAULT NULL,
  `work_place5` varchar(100) DEFAULT NULL,
  `apply_reason` varchar(1000) DEFAULT NULL,
  `opinion` varchar(1000) DEFAULT '',
  PRIMARY KEY (`id`,`userId`),
  UNIQUE KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of national_grant
-- ----------------------------
INSERT INTO `national_grant` VALUES ('1', '1160299243', '农村', '主要靠父母务农', '12000', '4', '浙江省丽水市水阁新村', '323000', '家庭经济特别困难', '陈永福', '46', '父女', '务农', '吴晓英', '46', '母女', '务农', '陈劭坤', '11', '姐弟', '上学', '', '', '', '', '', '', '', '', '父亲前年曾出国车祸，动过手术切了肝，之前胆结石也动过手术，这几年身体不怎么好。母亲常年腰痛腿痛，常年就医。家里还有一个弟弟，今年还在上小学，本人还在上大学，支出大。家里主要靠父母亲务农为生。', '同意二档');
INSERT INTO `national_grant` VALUES ('3', '1160299268', '城镇', '主要靠父亲在外打工', '2000', '4', '甘肃省兰州市永登县城关镇青龙路1245号拆迁楼1-601', '730300', '家庭经济特别困难', '赵积全', '46', '父女', '打工', '王永菊', '41', '母女', '无', '赵万善', '10', '姐弟', '永登县城关小学', '', '', '', '', '', '', '', '', '在这大一这一年里我始终保持积极的心态，妥善处理好学习与工作两者之间的关系，而且身为班级的学习委员，一直致力于班级的学风建设。至于家庭情况方面，我们家有四口人，主要经济来源靠父亲，所以我现在向学校申请国家助学金，希望能够帮家里减轻负担，并激励自己更加努力。', '同意二档');
INSERT INTO `national_grant` VALUES ('4', '1160299065', '城镇', '父母亲收入', '3833', '4', '浙江省温州市苍南县灵溪镇江湾路大门四街116号', '325800', '家庭经济一般困难', '陈华型', '45', '父女', '自由职业', '林素月', '40', '母女', '自由职业', '陈国渺', '17', '姐弟', '高中在读', '', '', '', '', '', '', '', '', '本人家庭经济较为困难，无房无车，父母亲都是自由职业者，弟弟和我分别在读高中和大学，家里开销较大，生活拮据。同时，家中因母亲患病花费了很多钱，除此之外还欠债15万。因此特申请国家助学金，以缓解家中的困难。', '同意二档');
INSERT INTO `national_grant` VALUES ('5', '1150299066', '城镇', '父亲一人打工赚钱', '3500', '4', '新疆维吾尔自治区和田地区民丰县索达东路国际商贸城眼镜刻章店', '848599', '家庭经济特别困难', '文干', '46', '父女', '眼镜刻章店', '范芝书', '44', '母女', '无', '文鹏程', '20', '姐弟', '北京工业大学', '', '', '', '', '', '', '', '', '父亲一人打工赚钱，收入不高。母亲无工作。父亲身体不好，身患三种疾病，胆结石，脂肪肝，胸膜炎。母亲身患浅表性胃炎，常年吃药，身体瘦弱。我与弟弟在外上大学，学费高，生活费用高。家中还有三位老人需要赡养。老人体弱多病，无资金来源。', '同意二档');
INSERT INTO `national_grant` VALUES ('6', '1150299097', '农村', '父亲做工，务农', '2500', '4', '浙江省衢州市衢江区樟潭街道沈家振兴西路三巷133号', '324000', '家庭经济特别困难', '吴贤善', '55', '父女', '在家务农', '王根英', '53', '母女', '在家务农', '', '', '', '', '', '', '', '', '', '', '', '', '本人在这一学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，成绩优异，学习成绩靠前。进入大学两年以来，我始终严于律己，向着既定目标不断努力奋斗，由于家庭经济困难，父亲一人的收入无法负担家庭支出以及我的学业支出，故此提出助学金申请，望批准。', '同意二档');
INSERT INTO `national_grant` VALUES ('8', '1160694036', '农村', '务农', '2000', '3', '浙江省台州市三门县珠岙镇岭口村', '317101', '家庭经济一般困难', '俞小奖', '54', '父女', '无', '郑爱粉', '53', '母女', '无', '', '', '', '', '', '', '', '', '', '', '', '', '本人学习态度认真，勤奋刻苦，积极参加学校文体活动和学科竞赛，在学校里遵守纪律，无违纪行为，尊敬老师、团结同学。家庭收入较低，希望申请国家助学金减轻经济负担，同时也能够好好学习。', '同意一档');
INSERT INTO `national_grant` VALUES ('9', '1160692012', '农村', '父母在家劳作', '900', '3', '四川省眉山市东坡区富牛镇', '620860', '家庭经济特别困难', '刘再中', '42', '父女', '务农', '宋维峰', '44', '母女', '务农', '', '', '', '', '', '', '', '', '', '', '', '', '家中父母皆是农民，为家中唯一经济来源，父母收入微薄且不稳定。家中有两位老人皆无劳动力无经济来源。08年地震灾害导致房屋受损重修房屋使家中负债及老人生病的高昂医药费皆大大加重了家中的经济负担，入远不敷出。', '同意二档');
INSERT INTO `national_grant` VALUES ('10', '1160610007', '农村', '父亲工作', '1750', '3', '浙江省宁波市奉化区溪口镇倪家山村', '315501', '家庭经济一般困难', '单志定', '50', '父女', '奉化微分电机有限公司', '许丽', '41', '母女', '在家', '', '', '', '', '', '', '', '', '', '', '', '', '该生在思想方面热爱祖国，遵守法律和校纪校规，诚实守信，道德品质优良，无违纪行为。尊敬师长，严以律己宽以待人。生活方面，该生生活简朴、厉行节俭。该生在校努力上进，学习勤奋，学习成绩优秀，绩点排名在学院前10%以内，家庭情况困难，经学校评定为贫困生。', '同意二档');
INSERT INTO `national_grant` VALUES ('11', '1160299159', '城镇', '父亲工资', '2500', '4', '河南焦作修武银河城10#1#101', '454350', '家庭经济一般困难', '张爱民', '45', '父子', '小学教师', '陈志荣', '43', '母子', '无业', '张剑宇', '23', '兄弟', '中国科学院', '', '', '', '', '', '', '', '', '父亲平时一个人工作，不足以负担我们兄弟二人的学业', '同意一档');
INSERT INTO `national_grant` VALUES ('12', '1160299306', '农村', '母亲在家务农和打零工', '2000', '4', '浙江省衢州市衢江区廿里镇瓦灶村28号', '324012', '家庭经济一般困难', '周仙', '49', '母子', '在家务农', '张彩霞', '25', '姐弟', '温州医科大学专升本', '张彩云', '20', '姐弟', '杭州商业职业技术学院', '', '', '', '', '', '', '', '', '家庭条件困难，早年父亲因病去世，家中欠下外债难以偿还。母亲一人拉扯我们姐弟三人长大。生活艰苦。', '同意一档');
INSERT INTO `national_grant` VALUES ('13', '1160299219', '农村', '父亲在外地打工', '6000', '4', '浙江省宁波市宁海县大佳何镇里袁村', '315621', '家庭经济一般困难', '袁宝忠', '49', '父子', '在家', '袁梅仙', '45', '母子', '在家', '袁彩霞', '23', '姐弟', '浙江省二建建设集团有限公司基础分公司', '', '', '', '', '', '', '', '', '父亲在外地打工，且工作不稳定，经常换工作，自己的身体也不是很好，有肺病再身；母亲因腰间盘突出，不能再工作单位上坚持较长时间，故只能在家里养病；姐姐才刚从大学毕业一年，工作不稳定，一切充满挑战。', '同意二档');
INSERT INTO `national_grant` VALUES ('14', '1160694058', '农村', '父母打工', '1200', '4', '河南省固始县卧龙村', '465200', '家庭经济特别困难', '蒋现成', '48', '父子', '个体', '曹光侠', '48', '母子', '个体', '蒋依婷', '11', '兄妹', '学校', '', '', '', '', '', '', '', '', '家庭收入低，希望以此减轻家庭负担。', '同意一档');
INSERT INTO `national_grant` VALUES ('15', '1160299123', '城镇', '父亲一人在外打工', '3000', '4', '广西省宜州市山谷路76-23号', '546300', '家庭经济一般困难', '刘杰', '52', '父女', '广东省东莞市彩嘉电子厂', '罗艳梅', '45', '母女', '无', '刘越', '10', '姐弟', '广西省宜州市第六小学', '', '', '', '', '', '', '', '', '家弟年幼，父亲年迈，且为家庭唯一劳动力，想为家里减轻一点经济负担', '同意二档');
INSERT INTO `national_grant` VALUES ('16', '1160299336', '农村', '母亲在家务农，主要靠父亲一人工作所得。', '2500', '3', '浙江省湖州市长兴县煤山镇尚儒村尚儒自然村17号', '313117', '家庭经济一般困难', '应斌南', '56', '父子', '无', '张建华', '54', '母子', '无', '', '', '', '', '', '', '', '', '', '', '', '', '非独生子女，虽然姐姐已经出嫁，但我也步入青年，家庭压力还是很大，母亲在家务农，家庭支出全靠父亲一人承担。故希望批准。', '同意二档');
INSERT INTO `national_grant` VALUES ('17', '1160299037', '农村', '打工，务农。', '800', '4', '甘肃省平凉市泾川县红河乡朱段村朱家山组1号', '744300', '家庭经济特别困难', '朱介富', '79', '祖孙', '无', '朱得科', '52', '父子', '在家务农', '朱小琴', '24', '姐弟', '外出打工', '', '', '', '', '', '', '', '', '劳动力缺少，母亲离异，爷爷年事已高，经常吃药，家庭经济入不敷出。', '同意二档');
INSERT INTO `national_grant` VALUES ('18', '1160299230', '农村', '家里靠种水稻维持生计，收入非常不稳定', '2000', '5', '浙江省三门县健跳镇小蒲村', '317111', '家庭经济特别困难', '林后飞', '51', '父子', '种水稻', '丁会平', '50', '母子', '种水稻', '林碧琼', '24', '姐弟', '销售员', '王', '80', '奶孙', '无', '', '', '', '', '家庭经济情况不是很好，父母全靠在农村种水稻来赚钱，父亲有动过一次大手术，身体大不如前，何况家里的劳动都是体力活，母亲比较瘦弱，身体也不是很好，种水稻的收入不是很稳定，家里还有一位老人，仅靠这点收入过的很艰难，因此特申请国家助学金，为家里减轻一点负担。', '同意二档');
INSERT INTO `national_grant` VALUES ('19', '1160610014', '农村', '父亲母亲外出打工与乡镇府的一些助学补助，还有自己跟哥哥的一些零散打工', '25000', '4', '住址青田县章村乡校园路2一|号', '323900', '家庭经济特别困难', '武为明', '47', '父子', '打工', '陈慧芬', '46', '母子', '打工', '武俊杰', '24', '兄弟', '待业（大学刚毕业）', '', '', '', '', '', '', '', '', '父亲早年打工因工伤致使手有残疾，外公长期住院，家庭生意亏损负债，至今仍在还债，兄长还未找到稳定的工作，入不敷出。希望能得到这次助学金可以更好的完成学业，跟减缓家里的一些经济负担。', '同意一档');
INSERT INTO `national_grant` VALUES ('20', '1160299246', '农村', '主要来源于父亲的工作，少部分来源于房屋出租等', '2000', '5', '浙江省天台县坦头镇六另村1组65号', '317206', '家庭经济一般困难', '张崇勤', '63', '父子', '务农', '徐秀女', '52', '母子', '务农', '张清', '28', '兄弟', '待业', '葛六妹', '92', '祖孙', '无', '', '', '', '', '父母的年纪越来越大，但却依旧在为了我上大学的事情而拮据地生活，我不想让他们太过担心，希望能尽可能减轻他们的负担。在学习上，我也从不懈怠，希望自己能够早日学有所成，尽早实现经济独立，回报他们的恩情。\r\n望批准！', '同意二档');
INSERT INTO `national_grant` VALUES ('21', '1160299270', '农村', '父母打工', '6000', '5', '浙江省嘉兴市嘉善县魏塘街道中寒圩村程家小区293号', '314100', '家庭经济一般困难', '沈红', '43', '母女', '上海古典丝绸厂（嘉善分公司）', '费永强', '46', '父女', '', '沈秋根', '68', '祖孙', '', '陈美珍', '64', '祖孙', '', '', '', '', '', '家中爷爷身体不好，腿脚不便，腰椎疾病严重，经常需要入院治疗，医疗开销大。奶奶年纪大，身体状况不佳。家中主要靠父母打工得到的微薄收入，父亲的厂处于起步阶段，无法结算所有工资。为了减轻家中负担，特此提出申请，望学校批准。', '同意一档');
INSERT INTO `national_grant` VALUES ('22', '1160299168', '农村', '工作', '2000', '6', '浙江省湖州市东林镇泉益村施庄官5号', '313002', '家庭经济特别困难', '施忠旗', '46', '父', '浙江湖州东林镇政府', '莫新凤', '44', '母', '在家', '潘如华', '67', '爷爷', '在家', '沈凤妹', '67', '奶奶', '在家', '谈金凤', '88', '曾祖母', '在家', '父亲一人工作支撑家庭，母亲患有类风湿关节炎在家，爷爷奶奶曾祖母年迈，在家，经济十分困难，特此申请。', '同意一档');
INSERT INTO `national_grant` VALUES ('23', '1160299149', '农村', '父亲务农与国家救济', '750', '4', '浙江省丽水市景宁县秋炉乡秋炉村', '323599', '家庭经济特别困难', '陈国元', '54', '父子', '', '陈兰菊', '52', '母子', '', '陈文科', '22', '兄弟', '', '', '', '', '', '', '', '', '', '母亲患癌症多年，依靠药物维生，父亲患有腰间盘突出，不能干重活，哥哥学历过低且身体不好干不了闲置在家，家庭被当地政府列为低保户，家庭极其困苦，依靠国家救济维生，故特此申请助学金。', '同意一档');
INSERT INTO `national_grant` VALUES ('24', '1160299150', '农村', '务农', '5000', '3', '湖北省天门市多宝镇中原村三组', '431722', '家庭经济一般困难', '蔡明涛', '45', '父子', '务农', '邹爱群', '42', '母子', '务农', '', '', '', '', '', '', '', '', '', '', '', '', '母亲在家务农，父亲在外打拼，生活艰苦，收入微薄。', '同意二档');
INSERT INTO `national_grant` VALUES ('25', '1160299064', '农村', '种庄稼', '3000', '5', '河南省洛阳市偃师市邙岭乡东蔡庄', '471944', '家庭经济一般困难', '韩忠利', '49', '父女', '务农', '赵风芍', '49', '母女', '务农', '韩玉梅', '25', '姐妹', '工作', '韩泳帅', '13', '姐弟', '初中生', '', '', '', '', '家里经济比较困难，劳动力不足，父母医药费花费太多，负担太重。', '同意二档');
INSERT INTO `national_grant` VALUES ('26', '1160299001', '农村', '妈妈一些零碎的手工', '2000', '6', '浙江省丽水市青田县高市乡东源头村40号', '323911', '家庭经济一般困难', '殷金雄', '51', '父女', '暂无', '洪友招', '50', '母女', '暂无', '殷大军', '29', '兄妹', '暂无', '蓝陈慧', '24', '嫂姑', '暂无', '殷炜泽', '1', '姑侄', '暂无', '我平时勤奋学习，在期末测验中取得较理想的成绩；工作上认真负责，身为副班长，深受同学们信任，也深受任课老师和辅导员喜爱；生活中与同学相处融洽。在课余时间，参加了许多志愿者活动，帮助他人。同时参与文体活动，获得了“新耀杯”羽毛球赛单打第一和团体第二。', '同意一档');
INSERT INTO `national_grant` VALUES ('27', '1160299063', '城镇', '父亲外出务工', '4000', '5', '浙江省衢州市江山市双塔街道缸甫底村267号', '324100', '家庭经济一般困难', '刘少军', '46', '父女', '务工', '刘永菊', '45', '母女', '家庭妇女', '刘德成', '71', '爷孙', '无', '刘宇航', '13', '姐弟', '江山市城北中学', '', '', '', '', '父母年龄大，劳动力低下，没有固定的工作单位；母亲体弱多病，常年吃药。家中只有父亲一人在外打工，工作极不稳定，还患有腰伤，随时都有失业的风险。家中还有年迈的老人和年幼的弟弟，经济压力极大，所以申请贫困生补助，望批准！', '同意二档');
INSERT INTO `national_grant` VALUES ('28', '1160299256', '农村', '厨师助理', '4000', '5', '慈溪市金一路金山小区194号三单元306室', '315399', '家庭经济一般困难', '陈立兰', '45', '母子', '惠粤轩煲仔饭', '夏真东', '46', '父子', '惠粤轩煲仔饭', '夏东华', '25', '姐弟', '重庆师范大学', '夏迎丁', '3', '兄妹', '无', '', '', '', '', '家里因突发情况欠下债款，父母年事已高，家里妹妹无收入来源，姐姐也在上学，希望能减轻家庭负担', '同意二档');
INSERT INTO `national_grant` VALUES ('29', '1150299221', '农村', '母亲打工', '3000', '4', '浙江省衢州市江山市贺村镇贺村村坞里106号', '324109', '家庭经济一般困难', '毛卓才', '1966', '父亲', '在家', '童小芳', '1969', '母亲', '在家', '毛亚静', '27', '姐妹', '在家', '', '', '', '', '', '', '', '', '父亲身体不好，动过多次手术，医生说不能做累活。家里主要收入来源依靠母亲，但是因为要供我上大学，经济负担还是挺重的。在大二一年的学习中，很幸运这次成绩在本专业综测排名在14名，并获得学业三等奖学金。', '同意二档');
INSERT INTO `national_grant` VALUES ('30', '1150299261', '农村', '父母在杭务工', '6000', '4', '杭州市余杭区文一西路文一社区', '311100', '家庭经济一般困难', '张培凤', '48', '母子', '浙江迪达进出口贸易有限公司', '韩玉龙', '52', '父子', '个体户', '韩程程', '26', '姐弟', '浙江省开化县人民医院', '韩康', '21', '本人', '浙江科技学院', '', '', '', '', '家庭收入较低，父母在杭务工，学生自身患有“强直性脊柱炎”，需要长期治疗', '同意二档');
INSERT INTO `national_grant` VALUES ('31', '1160299260', '城镇', '母亲工资收入', '4000', '3', '河北省唐山市迁安市帝都花苑13-1-704', '064400', '家庭经济一般困难', '顾立军', '45', '母子', '迁安市赵店子镇政府', '马福芹', '76', '祖孙', '无', '', '', '', '', '', '', '', '', '', '', '', '', '父母离异，随母亲生活收入一般。父亲几乎不承担抚养责任。外婆无劳动能力。', '同意一档');
INSERT INTO `national_grant` VALUES ('32', '1151020047', '城镇', '妈妈上班，爸爸外出打工', '5000', '5', '山西省运城市夏县金苑小区', '044400', '家庭经济一般困难', '柳立辉', '46', '父亲', '自主择业', '崔霞', '43', '母亲', '夏县卫生与计划生育局', '柳双学', '74', '爷爷', '', '卫巧叶', '72', '奶奶', '', '', '', '', '', '爷爷奶奶年龄大，爷爷于去年患肾癌住院治疗以及后续治疗花费十几万元高额费用，欠下外债，爸爸下岗无固定收入，因家庭经济困难，申请国家助学金。', '同意一档');
INSERT INTO `national_grant` VALUES ('33', '1150299241', '农村', '父母在外务工', '3500', '5', '浙江省丽水市庆元县岭头乡小际头村洋心路8号', '323800', '家庭经济一般困难', '吴元通', '43', '父子', '外地务工', '吴秋何', '45', '母子', '外地务工', '吴黄标', '81', '爷爷', '农村', '吴华妫', '71', '奶奶', '农村', '吴文彬', '21', '本人', '浙江科技学院', '家住农村，爷爷奶奶年迈，已经没有劳动能力，且爷爷常年生病，需要较多的医药费。父母在外地打工，收入微薄，我还需要学费和生活费，父母经济压力大，所以想申请国家助学金，缓解家里的压力。', '同意二档');
INSERT INTO `national_grant` VALUES ('34', '1150299124', '农村', '务农', '6000', '3', '浙江省兰溪市云山街道大屋基村', '321100', '家庭经济一般困难', '诸庆祥', '53', '父亲', '务农', '吴美姬', '53', '母亲', '务农', '', '', '', '', '', '', '', '', '', '', '', '', '本人出生在农村，父母现在都在家务农，且都有慢性疾病，每年需要支付一定的医疗费用，故生活十分拮据。我从两年前来到本校学习，便认真努力，积极学习各种专业知识，均取得了优异的成绩，且无各种不良作风，考虑到学习生活所需费用，我特此申请国家助学金，希望能够减轻家庭负担。', '同意二档');
INSERT INTO `national_grant` VALUES ('35', '1160299281', '农村', '务农', '1000', '3', '浙江省金华市磐安县维新乡新渠村', '422304', '家庭经济特别困难', '吴小柳', '52', '父子', '务农', '刘顺欣', '50', '母子', '务农', '', '', '', '', '', '', '', '', '', '', '', '', '我家在一个偏远的农村，父母全靠务农维持生计。我父亲还患有高血压，曾经还出过车祸动过手术，身体一天不如一天。父母对我的期望很大，希望我能改善家里的生活，我也不负众望考上了大学。但是大学的生活消费太高了，父母微薄的收入完全不够。因此提出申请，希望能缓解父母的压力。', '同意一档');
INSERT INTO `national_grant` VALUES ('36', '1160299010', '城镇', '父亲在外打工', '1500', '4', '山西省晋城市花园头村回迁楼1单元501', '048000', '家庭经济特别困难', '张广兵', '42', '父子', '务农', '王芳芳', '40', '母子', '', '王莹莹', '19', '兄妹', '', '', '', '', '', '', '', '', '', '母亲失业，家里经济来源只能依靠父亲，而父亲身体不好，经常需要吃药，今年夏天奶奶不小心摔断了腿，花费了许多钱，使家里的状况进一步恶化，所以想减轻家里的负担，因此提出申请助学金，希望批准。', '同意二档');
INSERT INTO `national_grant` VALUES ('37', '1160299258', '农村', '低保', '700', '2', '绍兴市柯桥区齐贤镇陶里村1012号', '312065', '家庭经济特别困难', '俞美定', '47', '母子', '无', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '家中父亲早年去世，失去主要经济来源，母亲又身有残疾，导致家庭经济困难，因此申请助学金', '同意一档');
INSERT INTO `national_grant` VALUES ('38', '1160299328', '农村', '在家务农', '1833', '4', '浙江省金华市兰溪市横溪镇施宅村柳家畈68号', '321118', '家庭经济特别困难', '施新建', '50', '父女', '在家务农', '柳秀娟', '48', '母女', '在家务农', '施俊蓁', '14', '姐弟', '学生', '', '', '', '', '', '', '', '', '父母在家务农，经济条件不乐观，父亲手因意外受伤经常犯痛，不能长时间工作，母亲因车祸在家休养，无工作能力，每月还需支出高额医药费，家庭收入更是不稳定，家中弟弟上初中，大学开销大，全靠父亲一人维持，为了减轻一点父亲的负担，特此申请，望学校批准。', '同意二档');
INSERT INTO `national_grant` VALUES ('39', '1150299065', '农村', '父亲打工', '7000', '3', '浙江省金华市东阳市画水镇黄田畈上康新村', '322100', '家庭经济一般困难', '蒋镇德', '56', '父女', '打工', '蒋锦芳', '53', '母女', '务农', '', '', '', '', '', '', '', '', '', '', '', '', '因父母常年生病，父亲的腿曾断过，目前还不算灵活；母亲吃药住院；早年欠债，目前还未完全还清，故申请助学金，以减轻父母的负担。', '同意二档');
INSERT INTO `national_grant` VALUES ('40', '1150299229', '农村', '母亲打工', '2000', '3', '黑龙江省鹤岗市工农区蔬园乡黎明村', '154100', '家庭经济一般困难', '冯波', '48', '父子', '无', '魏凤云', '48', '母子', '跃龙门火锅', '', '', '', '', '', '', '', '', '', '', '', '', '由于母亲年龄已大，心肝等脏器不好，父亲患有胸膜炎，并且父亲体质差，不能干重活，紧靠母亲打工维持家庭支出，支付学费感到吃力，为了给父母减轻负担，不让父母压力太大，因此提出申请，希望学校予以批准。', '同意二档');
INSERT INTO `national_grant` VALUES ('41', '1160299021', '农村', '打工', '4000', '5', '四川省内江市东兴区石子镇三县村3组', '641107', '家庭经济一般困难', '罗维贵', '50', '父子', '临时工', '郭建珍', '49', '母子', '无工作', '程树容', '72', '婆孙', '无工作', '罗鑫', '28', '兄弟', '临时工', '', '', '', '', '我是来自四川的罗锋，由于家中母亲目前因患有较严重的肩周炎失业，无收入。奶奶患有高血压和冠心病需要长期用药，开销大。父亲和哥哥工资微薄。且哥哥的孩子刚出生，家中收支不抵，负担重，本人希望被给予帮助。特申请国家助学金。', '同意二档');
INSERT INTO `national_grant` VALUES ('42', '1150299176', '城镇', '病退金', '1200', '4', '湖南省永州市冷水滩区文昌路45号', '425000', '家庭经济特别困难', '王艺红', '47', '母亲', '家庭妇女', '唐利华', '47', '父亲', '病退', '唐俊杰', '9', '兄弟', '湖南省永州市冷水滩区二小三年级学生', '', '', '', '', '', '', '', '', '本人家庭困难，母亲常年在家带孩子，父亲病退在家，无工作能力，家庭靠父亲病退金和母亲零工生活，生活艰苦。为了缓解家庭负担，减轻家庭压力，故申请国家助学金，望能审批通过。', '同意一档');
INSERT INTO `national_grant` VALUES ('43', '1150299230', '城镇', '父亲工作', '2000', '3', '安徽省淮南市田家庵区田东南化村9号点式楼7-4', '232001', '家庭经济一般困难', '胡永昌', '47', '父亲', '德邦公司', '吴洁', '47', '母亲', '无', '', '', '', '', '', '', '', '', '', '', '', '', '因母亲心脏不好，全家的经济支柱都来源于父亲，家庭经济较困难。在学习上我努力要求自己，参加各种学科竞赛，并获得浙江省服务外包竞赛一等奖和大学生计算机设计大赛国赛二等奖。为了以后给父母减轻经济负担，申请助学金，希望能给予批准。', '同意二档');
INSERT INTO `national_grant` VALUES ('44', '1150299196', '农村', '务农为主，农闲时做临时建筑工', '1000', '5', '山西省怀仁县集运巷4巷15号', '038300', '家庭经济一般困难', '陈培武', '57', '父亲', '务农', '任满云', '56', '母亲', '务农', '陈学波', '31', '姐姐', '无', '陈学婷', '28', '姐姐', '会计', '', '', '', '', '父母年老体弱，收入勉强维持家用。为减轻家庭负担申请助学金', '同意二档');
INSERT INTO `national_grant` VALUES ('45', '1150299055', '农村', '母亲务农', '1800', '3', '浙江省嵊州市浦口街道屠家埠村', '312400', '家庭经济一般困难', '谢云平', '52', '父亲', '在家', '童仁娟', '53', '母亲', '在家', '', '', '', '', '', '', '', '', '', '', '', '', '父亲生病在家，全家只靠母亲务农的一点收入。为了分担一点家中负担，特提出此申请，希望学校批准。', '同意一档');
INSERT INTO `national_grant` VALUES ('46', '1150299008', '农村', '父亲务农', '2500', '4', '河南省信阳市商城县朱裴店村店头组', '465321', '家庭经济一般困难', '叶祖凤', '52', '母子', '无', '杜传学', '53', '父子', '务农', '杜前进', '21', '兄弟', '无', '', '', '', '', '', '', '', '', '母亲患心脏病、糖尿病，靠吃药维持身体，丧失劳动能力，每年需巨额药费。父亲曾患眼疾，无固定工作，靠务农和做小工养家，是唯一的收入来源，收入低下。弟弟高中辍学，现无固定工作，收入勉强养活自己，不能成为收入来源。家庭整体上入不支出，累计负债9万余元。', '同意二档');
INSERT INTO `national_grant` VALUES ('47', '5161510006', '农村', '务农', '1300', '4', '浙江省淳安县威坪镇汪川村殿下81号', '311715', '家庭经济一般困难', '夏有梅', '75', '祖孙', '无', '郑之烈', '51', '父子', '无', '金圣姣', '41', '母子', '杭州千岛湖妙品食品有限公司', '郑玉弘', '21', '本人', '浙江科技学院', '', '', '', '', '家中共有4人，祖母年事已高，丧失劳动能力，且罹患骨质增生等疾病，每年都要花费几千医药费。所幸父亲可以赚钱养家，但从事自由职业，工作极不稳定，没有可靠的收入来源。而母亲患有骨质增生，经常疼痛难忍，无法上班，收入微薄。加之我每年高昂的学杂费，家中确实经济拮据。', '同意二档');
INSERT INTO `national_grant` VALUES ('48', '1160299259', '农村', '父亲打工', '2500', '4', '浙江省温州市苍南县宜山镇镇前巷31号', '325803', '家庭经济一般困难', '林东旭', '21', '本人', '浙江科技学院', '林心万', '48', '父子', '', '林婷婷', '23', '姐弟', '台州学院', '陈彩女', '78', '祖孙', '', '', '', '', '', '家庭经济困难，仅靠父亲一人收入，家中有两个大学生需要培养，且还有一个年迈的奶奶，没有劳动能力，需要长期服用药物。希望通过这笔助学金能够减轻家里的经济负担，并鼓励自己更加努力地学习，未来改变家庭状况，回报社会。', '同意二档');
INSERT INTO `national_grant` VALUES ('49', '1160299244', '农村', '父母经营小店，姐姐在外打工', '3200', '4', '湖北省黄冈市团风县方高坪镇', '438800', '家庭经济特别困难', '周明章', '50', '父子', '个体经营', '童细凤', '48', '母子', '个体经营', '周静', '24', '姐弟', '赛鼎公司', '', '', '', '', '', '', '', '', '父母经营小店，收入微薄，姐姐在外打工，难以养活自己，父母的压力很大，希望得到国家的帮助', '同意一档');
INSERT INTO `national_grant` VALUES ('50', '1160299047', '农村', '父亲务工', '3900', '2', '浙江丽水庆元阳光路35号', '323800', '家庭经济一般困难', '王定生', '53', '父子', '务工', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '父母离异，家庭收入来源为父亲务工，为减轻父亲压力，特此申请。', '同意二档');
INSERT INTO `national_grant` VALUES ('51', '1160299105', '城镇', '务工', '2500', '3', '安徽省滁州市琅琊区凤凰西路紫薇西村14幢102室', '239000', '家庭经济一般困难', '王新军', '45', '父子', '工厂', '张平', '48', '母子', '失业', '', '', '', '', '', '', '', '', '', '', '', '', '家庭收入来源单一，大学使家庭的经济负担比较大，我也没有其他可以使家庭压力减少的方法，希望可以通过别的途径来使家庭的压力得到一定的减轻。', '同意二档');
INSERT INTO `national_grant` VALUES ('52', '1160492024', '农村', '职工', '2000', '3', '浙江省宁波市象山县城西路44号', '315700', '家庭经济一般困难', '陈益利', '53', '父子', '自由职业', '鲍彩根', '53', '母子', '自由职业', '', '', '', '', '', '', '', '', '', '', '', '', '母亲因车祸丧失劳动能力，父亲体力较差，其收入不足以支撑家庭经济。因此希望考虑到家庭经济的困难，学校能提供助学金已帮助自己顺利完成学业，特向学院申请贫困生助学金。', '同意二档');
INSERT INTO `national_grant` VALUES ('53', '1160299012', '农村', '农业收入', '2500', '4', '浙江省缙云县三溪乡三溪村东雅宅11号', '321404', '家庭经济特别困难', '应培雄', '51', '父子', '务农', '吴新女', '48', '母子', '务农', '应蕉妃', '26', '姐弟', '职工', '', '', '', '', '', '', '', '', '希望减轻家里的经济压力，用成绩证明自己在学校没有浑浑噩噩度日，不让父母伤心、失望，让父母放心。我希望用这个奖学金解决自己的一部分学费，这样加上自己的勤工俭学工资就可以向父母少要点钱，他们就也可以不用这么辛苦。我希望通过我的努力减轻他们的压力。', '同意二档');
INSERT INTO `national_grant` VALUES ('54', '1150299057', '农村', '种田以及父亲打工', '2500', '6', '河南省长垣县樊相镇北樊相村', '453400', '家庭经济一般困难', '张保岗', '42', '父亲', '务农', '李智慧', '42', '母亲', '务农', '张依婷', '13', '妹妹', '长垣县浦西二中', '张西春', '66', '爷爷', '务农', '王爱芳', '62', '奶奶', '务农', '爷爷奶奶身体欠佳，母亲在家照顾他们和妹妹，父亲和母亲文化程度不高，现在家中只有父亲作为经济来源，每月经济紧张，生活十分困难。为了减轻家庭负担以及完成学业，特向学校申请国家助学金。', '同意二档');
INSERT INTO `national_grant` VALUES ('55', '1160299041', '农村', '父亲在家务农', '1150', '3', '浙江省嵊州市崇仁镇升四村239号', '312473', '家庭经济特别困难', '张继忠', '57', '父子', '务农', '周美君', '53', '母子', '务农', '', '', '', '', '', '', '', '', '', '', '', '', '家庭比较困难，父母在家靠务农维持经济。在上一学年中，思想上我遵纪守法，积极进取；学习上勤奋刻苦，认真按时完成作业。在生活中，由于家中贫困的原因，自己也是尽量保持节俭，努力去做一些兼职以减轻父母的负担。现将申请国家助学金!望各位领导加以评判审核并能够批准!', '同意二档');
INSERT INTO `national_grant` VALUES ('56', '1160299016', '农村', '司机父亲及母亲散工的收入', '3000', '4', '浙江省温州市苍南县金乡镇大渔社区溪东路86号', '325805', '家庭经济一般困难', '王照水', '51', '父子', '司机', '曾满琴', '46', '母子', '在家散工', '王晓芬', '25', '姐弟', '在家', '', '', '', '', '', '', '', '', '父亲下肢残疾，母亲因多年劳累积劳成疾，体弱多病，家庭仅仅靠司机父亲及母亲散工的微薄收入维持。大学的学费对于家庭来说是一个很大的负担，所以在此申请助学金以减轻家庭的负担。', '同意二档');
INSERT INTO `national_grant` VALUES ('57', '1160299132', '农村', '务农', '1500', '5', '湖北省襄阳老河口市张集镇闫家村5组', '441800', '家庭经济一般困难', '闫建党', '49', '父子', '务农', '刘明华', '50', '母子', '务农', '李风英', '72', '祖孙', '', '', '', '', '', '', '', '', '', '父母文化水平低，在家务农，以种地为生。挣钱不易，很是艰辛，家里还有年迈的奶奶，常常生病需要人照护。学费七千多再加上平时生活费确实给父母带来沉重负担，暑假没有回去在学校附近找了一份兼职，希望能为父母减轻负担，生活确实不宜，也体会到父母的艰难。希望学校给予帮助。', '同意二档');
INSERT INTO `national_grant` VALUES ('58', '1160299147', '农村', '父母工作收入', '2500', '4', '浙江省衢州市龙游县塔石镇柯泉村109号', '324405', '家庭经济一般困难', '杜建国', '48', '父子', '浙江西子富沃德', '朱小英', '44', '母子', '浙江西子富沃德', '周月仙', '69', '奶奶', '在家', '', '', '', '', '', '', '', '', '父母工作压力大，奶奶身体不好没有经济能力，为了减轻父母的经济负担，特向学校申请助学金', '同意二档');
INSERT INTO `national_grant` VALUES ('59', '1150299303', '城镇', '父亲、母亲打工', '3000', '3', '浙江省丽水市青田县高湾小区一幢二单元501', '323900', '家庭经济特别困难', '周俊瑾', '51', '母亲', '自由职业', '孙军', '48', '父亲', '自由职业', '', '', '', '', '', '', '', '', '', '', '', '', '家庭经济困难，父亲母亲均以打工为生，收入不高，父亲还因胃癌动过手术，欠下30万的欠款。为了能减轻家中的经济负担。特此申请国家助学金。', '同意一档');
INSERT INTO `national_grant` VALUES ('60', '1160299006', '农村', '父亲的薪资', '2000', '5', '浙江省宁波市慈溪市逍林镇福和院村韩中弄7号', '315321', '家庭经济特别困难', '祝玉娣', '68', '爷孙', '在家务农', '岑志根', '70', '爷孙', '在家务农', '岑亚波', '47', '父女', '在家务农', '胡亚群', '44', '母女', '在家务农', '', '', '', '', '我出生在农村，父母在家务农在供我读书，家中爷爷和奶奶一只疾病缠身，母亲身体也不好，我深知父母的难处，所以在一年多的生活中，我始终保持积极向上的乐观心态，努力学习，在校表现良好，积极参加实践活动，提高自己的综合素质。我现真心向学校申请国家助学金，望能为家中减负。', '同意一档');
INSERT INTO `national_grant` VALUES ('61', '1150299291', '农村', '父亲身体不适常年在家修养，偶尔去工地，收入主要来源于母亲筷子厂包装筷子', '2000', '3', '浙江省丽水市庆元县屏都街道余村老街76号', '323805', '家庭经济特别困难', '范树勤', '47', '父子', '工地', '刘庆姿', '43', '母子', '筷子厂', '', '', '', '', '', '', '', '', '', '', '', '', '父亲前几年从二楼摔下断了十一根肋骨，导致如今常年腰痛，常在家调养，不能干粗活。母亲在筷子厂包装筷子，收入甚少，家中经济拮据。', '同意二档');
INSERT INTO `national_grant` VALUES ('62', '1160830050', '城镇', '父亲收入', '3000', '3', '甘肃省兰州市七里河区穴崖子西街43号', '730000', '家庭经济一般困难', '郝建国', '48', '父女', '上海凯泉', '张红梅', '48', '母女', '无工作', '', '', '', '', '', '', '', '', '', '', '', '', '家住偏远落后地区甘肃，母亲体弱，身体状况很差，无法工作，父亲收入微薄，处于不稳定状态，勉强支撑家中开支，家庭经济困难，父母压力较大，想申请助学金来减轻父母负担。同时我会努力学习，以优良成绩汇报国家。', '同意二档');
INSERT INTO `national_grant` VALUES ('63', '1160299155', '农村', '父亲打工赚钱', '2800', '3', '吉林省梅河口市杰宇新村', '135000', '家庭经济一般困难', '陈会发', '45', '父女', '无', '赫英丽', '43', '母女', '无', '', '', '', '', '', '', '', '', '', '', '', '', '虽是农村户口，但家中田地极少，基本靠父亲打工维持生计，母亲身体不好，腰部腿部增生及甲减，需常年吃药，且不能从事久站久坐及劳累的工作。父母在16年冬天出车祸住院，花费巨大，且几个月内无收入来源。', '同意一档');
INSERT INTO `national_grant` VALUES ('64', '1150299088', '农村', '姐姐在镇卫生院打工', '3000', '4', '浙江省兰溪市梅江镇下马源村下马源94号', '321117', '家庭经济特别困难', '严隆标', '50', '父子', '浙江省兰溪市梅江镇下马源村', '楼伏云', '51', '母子', '浙江省兰溪市梅江镇下马源村', '严楼婧', '26', '姐弟', '浙江省兰溪市马达镇马达卫生院', '', '', '', '', '', '', '', '', '我父亲患风湿病，腿脚不便，不能外出打工，平常就在家务农，母亲也在家，没有收入。全家唯一的经济来源是姐姐在镇上卫生院当护士，但工资也不高，每个月就2 3千。我在学校有做校内的勤工助学，学习成绩良好，故申请国家助学金，忘领导同意', '同意二档');
INSERT INTO `national_grant` VALUES ('65', '1150299281', '城镇', '父母务工所得', '3000', '4', '磐安县岗头村299号', '322300', '家庭经济一般困难', '陈时瑞', '48', '父女', '务工', '傅兰英', '44', '母女', '务工', '陈俊宇', '8', '姐弟', '磐安县文溪小学', '', '', '', '', '', '', '', '', '本人在学习上努力勤奋，绩点排名靠前；思想上认识到位，大二转为预备党员；生活上与同学相处融洽，乐于助人。在近一年的社团和学生会工作中认真负责，且多次参加志愿服务活动。希望能够在符合条件的情况下申请助学金，为父母减轻负担，也会在今后的生活学习中，进一步提高自己。', '同意二档');
INSERT INTO `national_grant` VALUES ('66', '1150299184', '农村', '务农', '2000', '4', '山东省临沂市郯城县高峰头镇马场村', '276100', '家庭经济一般困难', '赵开伦', '43', '父亲', '无', '李娜', '45', '母亲', '无', '赵瑞', '19', '弟弟', '无', '', '', '', '', '', '', '', '', '父亲因有伤不能参与工作，家庭收入基本来源于母亲务农，想为家庭减轻一些经济负担。', '同意一档');
INSERT INTO `national_grant` VALUES ('67', '1150299318', '农村', '父亲打工收入', '5000', '3', '浙江省绍兴市上虞区汤浦镇上街新村', '312364', '家庭经济一般困难', '陈岳兴', '55', '父子', '工地', '陈燕燕', '28', '姐弟', '古墩路上班', '', '', '', '', '', '', '', '', '', '', '', '', '几年前母亲重病，为治病欠下许多外债，但仍然不治，现在家庭经济仅靠父亲独力支撑，父亲也年事渐高，体力精力都不及以前，我仍在校读书，尚未能够补贴家用，申请助学金以经济缓解家庭拮据，也为让父亲轻松一些。', '同意一档');
INSERT INTO `national_grant` VALUES ('68', '5151591018', '农村', '务农以及姐姐工作', '5000', '4', '浙江省衢州市常山县同弓乡山边村', '324200', '家庭经济一般困难', '章建华', '56', '爸爸', '务农', '章建妹', '54', '妈妈', '务农', '章红娟', '28', '姐姐', '护士', '', '', '', '', '', '', '', '', '父母年纪较大，体力衰退，姐姐身体不好经常生病请假', '同意二档');
INSERT INTO `national_grant` VALUES ('69', '1150299298', '农村', '母亲的工作', '50000', '4', '浙江金华永康西溪镇龙柏东路40号', '321309', '家庭经济特别困难', '吕高江', '48', '父子', '无', '卢景', '42', '母子', '会计', '吕茜茜', '21', '姐弟', '浙江嘉兴学院', '', '', '', '', '', '', '', '', '父亲因病进行过大手术，虽然成功，但是不能再工作，并且还得定期去医院检查身体，家里的经济来源只有母亲，我和姐姐都在大学，尚未有自给能力。', '同意二档');
INSERT INTO `national_grant` VALUES ('70', '1150299051', '农村', '农田', '1500', '2', '河北省石家庄市藁城市邱头镇东宽亭村', '052160', '家庭经济特别困难', '王永杰', '44', '父亲', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '父母离异，跟随父亲生活，父亲身体不好，无法从事体力劳动，家庭经济困难。', '同意二档');
INSERT INTO `national_grant` VALUES ('71', '1150299034', '农村', '姐姐已婚无力支持家中，母亲失业，收入全靠父亲务农。', '2600', '4', '浙江省诸暨市山下湖镇新长乐村', '311800', '家庭经济一般困难', '何尉', '61', '父亲', '无', '蒋梅花', '50', '母亲', '无', '何敏明', '29', '姐姐', '杭州和图科技信息有限公司', '', '', '', '', '', '', '', '', '父母皆年势已高，母亲失业，父亲以干农活为生，收入甚微且随着年纪增大身体逐渐吃不消；姐姐已婚并育有一子，在杭州无房，是一名公司小职员，无力支持家中经济。前几年家中房子翻新欠下巨债至今未还清。我在校上学经济支出很大，家里不堪重负，望以此减轻压力。', '同意一档');
INSERT INTO `national_grant` VALUES ('72', '1150299316', '城镇', '父亲一人工作收入', '3000', '4', '浙江省宁波市余姚市梨洲街道南园新村58-405', '315400', '家庭经济一般困难', '徐皖军', '49', '父女', '宁波金泰阁安全设备有限公司', '褚丽芬', '45', '母女', '自由职业', '沈胜娣', '70', '奶奶', '无', '', '', '', '', '', '', '', '', '本人家庭情况非常一般，父亲体弱常年劳累承担家庭所有收入支出，奶奶经常生病，家有负债，本人在学校好学不倦，希望能申请到助学金减轻家庭负担。', '同意一档');
INSERT INTO `national_grant` VALUES ('73', '1150299175', '农村', '务农', '3000', '5', '浙江省金华市金东区源东乡长塘村长康路78号', '321000', '家庭经济特别困难', '施秀春', '78', '祖孙', '无', '施红卫', '52', '父子', '长塘村', '施兰芳', '49', '母子', '无', '施俊超', '25', '姐弟', '金华', '', '', '', '', '母亲无收入来源，主要依靠父亲务农收入，还有年迈的奶奶需要照顾,同时本人幼时曾遭遇车祸，致使家中至今仍留有债务，因此申请。', '同意二档');
INSERT INTO `national_grant` VALUES ('74', '1151020005', '城镇', '做些零散的活', '4000', '4', '河南省鹤壁市淇滨区九州路', '458030', '家庭经济一般困难', '管幸强', '42', '父子', '无', '吴莲兰', '45', '母子', '无', '管志芳', '19', '兄妹', '郑州工商', '', '', '', '', '', '', '', '', '减轻家庭开支', '同意二档');
INSERT INTO `national_grant` VALUES ('75', '1160299117', '农村', '父亲开车，母亲临时工。', '4000', '5', '江苏省徐州市丰县师寨镇花园村东南队395号', '221713', '家庭经济一般困难', '董诗梅', '68', '爷孙', '无', '韩大兰', '67', '爷孙', '无', '董淑财', '40', '父子', '无', '任雪珍', '41', '母子', '无', '', '', '', '', '奶奶生病住院，爷爷年迈无工作能力，父母工作压力大，为缓解父母压力，让奶奶更好的养病，故申请助学金。我会无比感激国家的资助，让我能够安心学习。学业有成之后一定会尽力实现自己的社会价值。', '同意二档');
INSERT INTO `national_grant` VALUES ('76', '1160299096', '农村', '父亲工资', '3000', '2', '浙江省奉化区松岙镇后山村洞桥头西32号', '315517', '家庭经济特别困难', '卓宏均', '50', '父子', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '母亲在几年前患癌症去世，父亲为治病背负了不少债务。他作为一个工人的工资也不高，柴米油盐水电吃食扣除后也所剩无几，他一个人扛着太多太多的压力，我想做点力所能及的事为他减轻些负担', '同意二档');
INSERT INTO `national_grant` VALUES ('77', '1160299271', '城镇', '父亲外出打零工赚钱，哥哥工作赚钱', '2125', '5', '山西省太原市古交市建安公司21单元102室', '030200', '家庭经济特别困难', '康安平', '54', '父女', '无', '田海兰', '54', '母女', '无', '康星星', '28', '兄妹', '中国银行', '康新龙', '25', '兄妹', '无', '', '', '', '', '我的家乡在山西，因为山西经济不景气，我的父亲被迫下岗，只能外出打零工。爷爷奶奶年事已高，无法劳动，需赡养。母亲没有工作，且患有高血压与风湿关节炎，需长期服药治疗。二哥被医院查出强直性脊柱炎，需要药物治疗。而我还在上大学，家庭经济负担过重，故申请助学金，望批准。', '同意一档');
INSERT INTO `national_grant` VALUES ('78', '1160299334', '农村', '打工', '2000', '4', '甘肃省定西市安定区内官营镇清溪村', '743000', '家庭经济一般困难', '张天真', '50', '父子', '无', '黄信芳', '49', '母子', '无', '张莺凡', '22', '姐弟', '陇东学院', '', '', '', '', '', '', '', '', '父母患有腰椎间盘突出，不能长时间干重活，有两名在读大学生，开销较大，家中无稳定收入，特此申请。', '同意二档');
INSERT INTO `national_grant` VALUES ('79', '1160299141', '农村', '父母打工工资', '5000', '4', '浙江省金华市兰溪市横溪镇国庆村兰浦路76号', '321118', '家庭经济一般困难', '柳祥庆', '58', '父子', '打工', '王恒仙', '52', '母子', '打工', '黄小球', '87', '祖孙', '无业', '', '', '', '', '', '', '', '', '父母都出过车祸，并且留下隐疾，年事已高，无法做重活。车祸后的医治让家里至今仍有负债。奶奶一条腿无法动弹，生活半自理。特此向学校申请助学金，缓解家庭经济压力', '同意二档');
INSERT INTO `national_grant` VALUES ('80', '1160299144', '农村', '打工', '1900', '3', '山西省临汾市吉县屯里镇桑娥村', '402200', '家庭经济一般困难', '江根宝', '43', '父子', '务农', '李文秀', '41', '母子', '务农', '', '', '', '', '', '', '', '', '', '', '', '', '家庭经济困难，母亲身有残疾，希望能够缓解家庭生活压力', '同意二档');
INSERT INTO `national_grant` VALUES ('81', '1160299262', '城镇', '父母均务农', '5000', '5', '浙江省丽水市庆元县溪沿路', '323800', '家庭经济一般困难', '胡敬奎', '49', '父子', '务农', '胡月花', '49', '母子', '务农', '胡睦程', '75', '祖孙', '无', '吴青恣', '69', '祖孙', '无', '', '', '', '', '庆元县属于浙江省贫困县之一，仍以农业为主。父母均务农，收入较低，还特别辛苦。爷爷奶奶年事已高，身体有些疾病。我希望能为父母分担一点经济压力', '同意二档');
INSERT INTO `national_grant` VALUES ('82', '1150199147', '农村', '父亲外出工地打工,母亲务农', '2500', '4', '浙江省绍兴市柯桥区王坛镇肇湖村326号', '312055', '家庭经济特别困难', '张礼忠', '49', '父子', '不固定', '吴彩银', '53', '母子', '居家', '张娣', '23', '姐弟', '台州学院', '', '', '', '', '', '', '', '', '家里只有父亲外出打工，另无其他经济来源。母亲常年生病，每月需要一定的医药费，而且家里有两个大学生，我读大三，我姐在台州学院读大四。靠父亲的收入实在无力维持家里的经济支出。还需要赡养家里的两位老人。家庭经济不宽裕。因此提出申请，希望予以批准。', '同意二档');
INSERT INTO `national_grant` VALUES ('83', '1150299022', '农村', '父亲在工厂务工', '3500', '4', '浙江省丽水市庆元县屏都街道八都中心街207号', '323805', '家庭经济一般困难', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '一家四口，仅由父亲一人在工厂务工维持生活，奶奶年迈多病，常年需要吃药治疗，母亲身体不好在家，有严重腰病。', '同意一档');
INSERT INTO `national_grant` VALUES ('84', '1150299367', '农村', '母亲务农', '1800', '3', '浙江省温州市苍南县龙港镇童处村154号', '325802', '家庭经济特别困难', '黄美琴', '43', '母子', '在家务农', '童国燃', '45', '父子', '无', '', '', '', '', '', '', '', '', '', '', '', '', '父亲于8年前意外受伤，导致高位截瘫，终生失去劳动，家中生计全由母亲一人维系。', '同意一档');
INSERT INTO `national_grant` VALUES ('85', '1150299118', '农村', '父亲、母亲做小工', '3000', '6', '贵州省仁怀市大坝镇新田村大房组', '564504', '家庭经济一般困难', '杨永坪', '51', '父子', '务农', '何文先', '45', '母子', '务农', '杨第芹', '24', '姐弟', '遵义师范学院学生', '杨英', '22', '姐弟', '务农', '杨第飘', '18', '弟兄', '务农', '由于父母文化水平较低只能做一些农话，家里没有固定收入，爸爸在外做工日晒雨淋比较辛苦。姐姐和我读书需要钱，而母亲的腿不好，只能做做轻便的活，家里的经济重担只能父亲一人承担。特此申请。', '同意一档');
INSERT INTO `national_grant` VALUES ('86', '1150299145', '农村', '务农', '2000', '3', '江西省上饶婺源县中云镇横槎村62号', '333209', '家庭经济特别困难', '黄得娣', '44', '母亲', '无', '潘建华', '18', '弟弟', '天佑中学', '', '', '', '', '', '', '', '', '', '', '', '', '在学习上我勤奋努力，积极上进，认真研习专业知识；生活上，我比较乐于助人，积极参加志愿服务活动；工作上认真用心，积极配合老师的工作，认真完成各类工作。同时家里经济情况有些困难，希望能获得奖学金来减轻家庭负担。', '同意二档');
INSERT INTO `national_grant` VALUES ('87', '1150299396', '农村', '父亲工作', '3000', '3', '浙江省杭州市淳安县威坪镇', '311715', '家庭经济一般困难', '肖开旺', '49', '父亲', '务农', '罗四兰', '47', '母亲', '务农', '', '', '', '', '', '', '', '', '', '', '', '', '家中父母在家务农，收入较低，还要维持我在杭州的学业，更是坚辛，所以在此申请助学金。', '同意二档');
INSERT INTO `national_grant` VALUES ('88', '1150299387', '农村', '母亲在饭店工作', '2500', '4', '安徽省蒙城县坛城镇姜营村大刘庄5栋六号', '233500', '家庭经济一般困难', '刘成武', '48', '父子', '待业', '于红影', '47', '母子', '饭店', '刘志强', '25', '兄弟', '快递', '刘志坚', '23', '本人', '学生', '', '', '', '', '父亲暑假刚动过手术，现今家庭收入全部由母亲承担，希望能够申请助学金，减轻母亲负担。', '同意二档');
INSERT INTO `national_grant` VALUES ('89', '1150299398', '农村', '父母打工', '3000', '4', '丽水市望松县石门村88号', '323400', '家庭经济一般困难', '叶培伟', '', '父子', '', '李苏梅', '', '母子', '', '叶君兰', '', '姐弟', '', '', '', '', '', '', '', '', '', '家庭困难需要帮助。', '同意二档');
INSERT INTO `national_grant` VALUES ('90', '1150299067', '农村', '务农', '4000', '4', '安徽省界首市陶庙镇', '236500', '家庭经济一般困难', '吴坤海', '44', '父女', '务农', '赵兰英', '47', '母女', '务农', '吴晓彤', '14', '姐妹', '学生', '', '', '', '', '', '', '', '', '本人家里共四口人，以务农为生，收入微薄，父亲和母亲身体不好，不足以承担家里的支出。', '同意二档');
INSERT INTO `national_grant` VALUES ('91', '1150299140', '农村', '务农贩卖棉花', '1980', '4', '无固定住址', '325107', '家庭经济一般困难', '李有国', '45', '父亲', '务农', '刘端飞', '44', '母亲', '无业', '李文悦', '12', '兄弟', '桥头镇第二小学', '', '', '', '', '', '', '', '', '父亲远去新疆种植棉花务农，母亲在家待业，除了我一个大学生，家里还需要供养弟弟上学，母亲身体患病，难以治愈，希望学校能够帮助我的家庭减轻负担，我一定会好好学习提高个人品质以感谢学校的资助。', '同意一档');
INSERT INTO `national_grant` VALUES ('92', '1150299249', '农村', '母亲打工赚钱', '2000', '3', '浙江省杭州市富阳区场口镇大路村115号', '311411', '家庭经济一般困难', '叶法兴', '65', '父亲', '无', '陈忠美', '45', '慕青', '无', '', '', '', '', '', '', '', '', '', '', '', '', '父亲年纪大，劳动力低，无收入来源，母亲工厂上班，工资微薄', '同意一档');
INSERT INTO `national_grant` VALUES ('93', '1150299388', '农村', '粮农', '200', '5', '贵州省毕节市纳雍县百兴镇水头上村大树脚组', '553300', '家庭经济一般困难', '龙正举', '48', '父子', '无', '刘艳', '48', '母子', '无', '龙健', '23', '哥哥', '贵州师范大学', '', '', '', '', '', '', '', '', '家中无稳定经济来源。然而祖母年迈，长期需要服用大量药物维持正常的生命活动，父亲有腿疾。加上家中两个孩子同时在上大学，造成了很大的经济负担。因此申请国家助学金，缓解家庭经济压力。', '同意一档');
INSERT INTO `national_grant` VALUES ('94', '1150299049', '农村', '工作', '4800', '5', '浙江省武义县泉溪镇王山头村环村西路31号', '321200', '家庭经济一般困难', '曾月花', '78', '祖孙', '无', '王仲文', '47', '父子', '浙江鹏盛工贸有限公司', '廖筱琴', '43', '母子', '浙江鹏盛工贸有限公司', '王俊霞', '4', '兄妹', '泉溪镇童心幼儿园', '', '', '', '', '奶奶身患残疾，需要父母服侍。还有年幼的妹妹需要父母照顾。父母的收入不高，所以希望通过申请助学金来减轻父母压力。', '同意一档');
INSERT INTO `national_grant` VALUES ('95', '1150299086', '农村', '务农，打工', '7000', '4', '河南省长葛市董村镇纸坊村3组', '461500', '家庭经济一般困难', '王遂岭', '47', '父子', '务农', '张芬', '44', '母子', '务农', '王江宁', '17', '兄弟', '长葛市十一中', '', '', '', '', '', '', '', '', '我家住农村，是一个偏僻小村。家中有爸爸妈妈弟弟和我。爸妈都是地地道道的农民，没有固定收入，家中仅靠父亲务农和母亲在外打工的微薄收入供弟弟和我上学并且维持生活，另外父亲还患有腰间盘突出。为了分担一点家中负担，特此提出申请。希望学校批准。', '同意一档');
INSERT INTO `national_grant` VALUES ('96', '1150299041', '农村', '务农', '3000', '6', '广西玉林市北流市新丰镇观南村六连垌', '537415', '家庭经济特别困难', '谢创贞', '76', '婆孙', '无', '甘良振', '45', '父子', '无', '林世萍', '44', '母子', '无', '甘绍伟', '18', '兄弟', '五邑大学', '甘绍玉', '17', '兄弟', '无', '父母以务农以及打零工为生，平常尚可维持生计，但随着奶奶年老，我与弟弟相继上大学后，家中经济就变得极为拮据，最小的弟弟辍学出去当了学徒。为此，我希望申请国家助学金以减轻家庭负担。', '同意一档');
INSERT INTO `national_grant` VALUES ('97', '1150299343', '农村', '主要以父母常年在外打工为主。', '4000', '6', '甘肃省白银市平川区黄峤乡马饮水村井尔沟四社49号', '730913', '家庭经济特别困难', '冯振孝', '49', '父女', '无', '牛芳', '45', '母女', '无', '冯海璞', '18', '姐弟', '南阳理工学院', '冯海烨', '25', '姐妹', '中国公路工程咨询集团有限公司', '冯海霞', '23', '姐妹', '兰州飞天网景信息产业有限公司', '家中学生较多，学费主要靠助学贷款，家庭主要经济来源主要靠父母常年在外打工。', '同意一档');
INSERT INTO `national_grant` VALUES ('98', '1150299222', '农村', '父亲打工，姐姐打工', '4000', '5', '山西省晋城市高平市野川镇北杨村北房东1巷10号', '048408', '家庭经济一般困难', '邵金中', '44', '父亲', '无', '邵腊平', '42', '母亲', '无', '邵雨燕', '24', '姐姐', '无', '安引兄', '75', '奶奶', '无', '', '', '', '', '家庭收入不高，奶奶与母亲身体不好，需要长期吃药，入不敷出。', '同意二档');
INSERT INTO `national_grant` VALUES ('99', '1150299096', '城镇', '父亲在外打工', '1800', '3', '新疆省阿克苏市拜城县老干所公租房小区7栋2单元301室', '842300', '家庭经济一般困难', '钱志林', '56', '父亲', '无', '张爱民', '49', '母亲', '无', '', '', '', '', '', '', '', '', '', '', '', '', '我的母亲由于身患多种疾病长年打针吃药，今年3月底大病一场后只能在家调养身体，没有任何经济来源。我的父亲是一个被迫下岗的职工，如今只能在外打零工来维持一家人的生计。仅靠父亲一人无法承担得起我高额的学费以及生活费，因此提出申请，希望学校以予批准。', '同意二档');
INSERT INTO `national_grant` VALUES ('100', '1150299099', '农村', '父母务农', '1500', '4', '河南省济源市克井镇大郭付村第一居民组', '459000', '家庭经济特别困难', '杨立平', '44', '父女', '务农', '赵燕梅', '43', '母女', '务农', '杨子都', '13', '姐弟', '学校', '', '', '', '', '', '', '', '', '父母务农，家中生活来源单一，收入少，且父母上了年龄，家中又有个弟弟，正在上学，花钱开销大，母亲生病住院，希望能获得国家助学金，减轻家里负担。', '同意二档');
INSERT INTO `national_grant` VALUES ('101', '1150299013', '城镇', '父母打工挣钱', '3500', '3', '湖北省黄石市花湖大道振兴大道荣昌小区B栋2单元1号', '435000', '家庭经济一般困难', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '母亲是下岗工人失业在家，父亲是工厂工人带病打工，为了减轻家庭负担，申请国家助学金。', '同意二档');
INSERT INTO `national_grant` VALUES ('102', '1150299174', '农村', '种地务农', '500', '4', '黑龙江省大庆市红岗区杏树岗镇中内泡村姜赵屯114号', '163000', '家庭经济一般困难', '马成宝', '48', '父子', '无', '赵洪梅', '46', '母子', '无', '马婷婷', '22', '姐弟', '哈尔滨商业大学', '', '', '', '', '', '', '', '', '我来自农村，生活贫困，希望通过自己的努力减轻家庭的负担。在思想方面，遵纪守法，积极进取；在学习方面，认真按时完成作业，不旷课，不早退，成绩优异；在社会实践方面，乐于参加志愿服务活动，提高自己书本外的能力。因此，申请国家助学金，望批准。', '同意二档');
INSERT INTO `national_grant` VALUES ('103', '1150299237', '城镇', '无稳定职业，包括水电装修', '4000', '3', '四川省达州市渠县渠光路61-14-2', '635200', '家庭经济一般困难', '罗齐明', '47', '父亲', '无稳定职业', '杨琼', '47', '母亲', '无业', '', '', '', '', '', '', '', '', '', '', '', '', '本人思想态度端正，学习认真刻苦，积极参加集体活动，还参与勤工助学。家庭经济收入低，父母年迈且无稳定职业，希望能够获得助学金减轻家里的经济负担，为父母分担压力，希望能够批准我的请求。', '同意二档');
INSERT INTO `national_grant` VALUES ('104', '1150299394', '农村', '父亲打工', '2000', '3', '浙江省天台县南屏乡杨加山村3号', '317200', '家庭经济特别困难', '王国龙', '47', '父子', '打工', '李春英', '45', '母子', '无', '', '', '', '', '', '', '', '', '', '', '', '', '母亲重病治疗，父亲打工，家庭收入微薄。', '同意二档');
INSERT INTO `national_grant` VALUES ('105', '1150299149', '农村', '父亲打工', '3000', '4', '浙江省衢州市开化县塘坞乡洪村村42号', '324307', '家庭经济一般困难', '汪方山', '53', '父亲', '', '严杏花', '51', '母亲', '', '汪小琴', '27', '姐姐', '浙江恒和节能科技工程有限公司', '', '', '', '', '', '', '', '', '家里收入主要依靠父亲打工，但是父亲腿脚不便，且动过手术，身体不好', '同意二档');
INSERT INTO `national_grant` VALUES ('106', '1150299110', '农村', '父母外出务工', '2000', '3', '四川省绵阳市三台县花园镇', '621000', '家庭经济一般困难', '廖长兴', '46', '父子', '宁波宏泰工具有限公司', '徐君', '44', '母子', '宁波宏泰工具有限公司', '', '', '', '', '', '', '', '', '', '', '', '', '父亲因几年前工作时腰部受伤，做过大型手术，劳动能力受到限制，目前家庭主要收入由母亲一人承担，为减轻家里经济负担，特提出申请。', '同意二档');
INSERT INTO `national_grant` VALUES ('107', '1150299280', '农村', '父亲外出做工，母亲在家做些手工活', '2460', '5', '浙江省兰溪市黄店镇朱家村', '321111', '家庭经济特别困难', '朱兆相', '81', '爷爷', '浙江省兰溪市黄店镇朱家村', '鲍如玉', '80', '奶奶', '浙江省兰溪市黄店镇朱家村', '朱纪良', '51', '父亲', '浙江省兰溪市黄店镇朱家村', '刘雅芬', '49', '母亲', '浙江省兰溪市黄店镇朱家村', '', '', '', '', '家里共有5人，爷爷奶奶，父母及本人。俩老人年迈八旬，身体状况差。父亲在外干零活，母亲在家照顾爷爷奶奶。爷爷膝关节骨质增生严重，奶奶高血压，俩老人的年医疗费用负担较重。父亲有颈椎病。我也真心的向学校提出困难补助申请，希望学校能够给予我帮助。', '同意二档');
INSERT INTO `national_grant` VALUES ('108', '1150299287', '农村', '父亲务工及母亲务农的收入', '3000', '5', '四川省成都市新都区军屯镇白碾村', '610500', '家庭经济一般困难', '包昌兴', '78', '祖孙', '成都市新都区军屯镇白碾村', '许淑君', '77', '祖孙', '成都市新都区军屯镇白碾村', '包世兵', '44', '父子', '成都市新都区军屯镇白碾村', '刘利菊', '43', '母子', '成都市新都区军屯镇白碾村', '', '', '', '', '我从小向往大学生活，我努力学习最终得到了这份录取通知书。但奶奶的病和我过去读书的学费已经让家里的经济负担沉重，而高额的学费无疑是雪上加霜，父亲和母亲支撑着整个家庭，我希望向学校申请助学金来减少家庭负担，我会更加努力的学习来报答学校，社会，以及帮助，支持我的人。', '同意二档');
INSERT INTO `national_grant` VALUES ('109', '1150299167', '农村', '务农', '5000', '3', '贵州省遵义县马蹄镇军河村团结组', '563111', '家庭经济特别困难', '蒋志平', '40', '父亲', '务农', '全万秀', '42', '母亲', '务农', '', '', '', '', '', '', '', '', '', '', '', '', '本人来自农村，父母都是农民，家里面的主要经济来源都是通过父母的辛勤劳动，因此家庭经济并不是很富裕，所以希望校领导能够酌情考虑，予以批准。谢谢！', '同意二档');
INSERT INTO `national_grant` VALUES ('110', '1150299059', '城镇', '靠父母打零工为主要经济来源', '2000', '6', '四川省眉山市东坡区老泉街140号', '620010', '家庭经济特别困难', '父亲', '51', '父子', '无', '母亲', '50', '母子', '无', '哥哥', '27', '兄弟', '无', '爷爷', '75', '爷孙', '无', '奶奶', '75', '奶孙', '无', '父亲身体不好，母亲现在患上腰椎盘突出不能干重活，哥哥先天性高度近视，家中年迈的爷爷奶奶还需要抚养，自己读大学增加家中经济负担，为了减轻家里负担特此申请', '同意一档');
INSERT INTO `national_grant` VALUES ('111', '1150299335', '农村', '父亲打工', '3000', '2', '浙江省丽水市松阳县黄公渡村东路23号', '323400', '家庭经济一般困难', '夏土兴', '44', '父子', '名居装饰公司', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '由于父母离异，父亲一个人工作，且挣的钱不多，不仅要赡养爷爷奶奶，还要供我读大学，导致家庭经济比较困难，特此申请，来解决我的困难。', '同意二档');
INSERT INTO `national_grant` VALUES ('112', '1151020021', '农村', '父亲做一些零散的活。', '4000', '4', '湖北省荆门市东宝区屈家岭管理局园艺分场制品厂0042号095', '431821', '家庭经济一般困难', '彭汉明', '47', '父子', '无', '吴庆华', '46', '母子', '无', '彭泽林', '10', '兄弟', '实验小学', '', '', '', '', '', '', '', '', '减少家庭的开支，为家庭减轻部分压力。激励自己好好学习。', '同意一档');
INSERT INTO `national_grant` VALUES ('113', '1150299355', '城镇', '父亲母亲务农，临时散工。', '5000', '4', '浙江省丽水市庆元县坑西村16号', '323800', '家庭经济一般困难', '胡光寿', '49', '父子', '在家务农', '杨小花', '45', '母子', '在家务农', '胡君美', '23', '姐弟', '杭州市第十三中学', '', '', '', '', '', '', '', '', '父亲前几年患肾结石，动了手术，切除右肾。此后，不能干重活，左肾需长期服药以抑制结石。母亲患有脑脂肪瘤，需定期检查和服药，奶奶体弱多病需要供养，家中我仍上大学，加重了生活负担，入不敷出，特此申请。', '同意二档');
INSERT INTO `national_grant` VALUES ('114', '1150299345', '农村', '父亲打工', '2000', '5', '安徽省马鞍山市当涂县石桥镇沛东村光明组14号', '243100', '家庭经济一般困难', '郭荣平', '47', '父女', '自由职业', '谷元华', '47', '母女', '自由职业', '郭圣祾', '10', '姐妹', '学生', '徐承英', '63', '祖孙', '农民', '', '', '', '', '父亲一个打工挣钱供我和妹妹上学，妈妈身体不好，一直都不能上班，爷爷去世了，奶奶一个人做农活，爸爸还有慢性肠胃炎，外婆今年暑假被查出高血脂和脑萎缩，住院半个月又要一直吃药，家里经济压力很大。', '同意二档');
INSERT INTO `national_grant` VALUES ('115', '1151010058', '农村', '父亲在工地做点临时工', '3000', '4', '湖北省黄冈市黄梅县苦竹乡享堂村6组', '435500', '家庭经济特别困难', '胡亚祥', '52', '父子', '工地', '吴带荣', '50', '母子', '无', '胡盼', '24', '姐弟', '实习', '', '', '', '', '', '', '', '', '母亲因几年前被查出患有系统性红斑狼疮，终身服药，每年按时去医院复查，消耗大量检查费和药费，父亲被迫为了照顾母亲就在附近的工地找些临时工来做，但工资极地低并且不稳定，姐姐刚刚从校门出来实习，本人暑假没有回家，一般会在外面找些兼职来做，所以家庭特别困难。', '同意一档');
INSERT INTO `national_grant` VALUES ('116', '1150299264', '城镇', '父亲工资', '3200', '4', '内蒙古包头市青山区幸福路5号街坊6栋51号', '014030', '家庭经济特别困难', '李枝', '42', '母子', '无', '李晓伟', '45', '父子', '中国农业银行', '李丹', '4', '兄妹', '幼儿园', '', '', '', '', '', '', '', '', '家中4口人收入来源仅有父亲工资，母亲患病仍在用药期间（甲状腺癌），妹妹上幼儿园，家庭经济情况特别困难', '同意二档');
INSERT INTO `national_grant` VALUES ('117', '1150299211', '农村', '打工和种地', '3000', '6', '福建省仙游县度尾镇云居村郊下组', '351266', '家庭经济一般困难', '严元水', '78', '祖父', '', '黄吓芹', '76', '祖母', '', '严明仙', '48', '父亲', '', '黄明凤', '46', '母亲', '', '严晓燕', '23', '姐姐', '', '祖母高血压、糖尿病、脑梗塞、半身不遂；母亲照顾祖母，失业在家；祖父年事已高，无劳动能力；家里仅靠父亲独力支持，并且家里因为祖母治病欠债五万多，家庭经济状况拮据，无力负担我的学业支出，望有关部门批准我的申请以减轻家里的负担。', '同意二档');
INSERT INTO `national_grant` VALUES ('118', '1150299371', '城镇', '父母一起打工养家', '20000', '3', '河南省周口市西华县东桥村', '466600', '家庭经济一般困难', '詹东风', '50', '父亲', '无', '理娟', '48', '母亲', '无', '', '', '', '', '', '', '', '', '', '', '', '', '父亲早年在工作中受过工伤，母亲高血压常年不断药，且都是重体力活，早已落下严重的腰伤，随着年龄的增加，微薄收入勉强养家糊口，望学校国家给予资助，助学生完成学业，谢谢', '同意二档');

-- ----------------------------
-- Table structure for `nationalinspirationalscholarship`
-- ----------------------------
DROP TABLE IF EXISTS `nationalinspirationalscholarship`;
CREATE TABLE `nationalinspirationalscholarship` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(50) NOT NULL,
  `date1` varchar(100) DEFAULT NULL,
  `award1` varchar(100) DEFAULT NULL,
  `unit1` varchar(100) DEFAULT NULL,
  `date2` varchar(100) DEFAULT NULL,
  `award2` varchar(100) DEFAULT NULL,
  `unit2` varchar(100) DEFAULT NULL,
  `date3` varchar(100) DEFAULT NULL,
  `award3` varchar(100) DEFAULT NULL,
  `unit3` varchar(100) DEFAULT NULL,
  `date4` varchar(100) DEFAULT NULL,
  `award4` varchar(100) DEFAULT NULL,
  `unit4` varchar(100) DEFAULT NULL,
  `resident` varchar(100) DEFAULT NULL,
  `incomeSource` varchar(100) DEFAULT NULL,
  `monthIncome` varchar(100) DEFAULT NULL,
  `familySum` varchar(100) DEFAULT NULL,
  `address` varchar(1000) DEFAULT NULL,
  `postalCode` varchar(100) DEFAULT NULL,
  `situation` varchar(100) DEFAULT NULL,
  `applyReason` varchar(1000) DEFAULT NULL,
  `opinion` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`,`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nationalinspirationalscholarship
-- ----------------------------
INSERT INTO `nationalinspirationalscholarship` VALUES ('1', '1160299243', '2017年1月', '美丽安吉征文大赛第三名', '人文与国际教育学院', '2016年10月', '校运会跳高第五名', '浙江科技学院体育运动委员会', '', '', '', '', '', '', '农村', '父亲和母亲务农', '12000', '4', '浙江省丽水市水阁新村', '323000', '家庭经济一般困难', '该生虽家庭经济困难，但生活上的困难并没有消磨该生的意志，而是激励该生更加刻苦努力学习，成绩也很突出，在上一学年的专业成绩中也名列前茅，这都充分表明该学生是一个勤奋努力的学生。此外，该生除学习上勤奋努力外，工作上、生活上也都很积极进取，乐观向上。在思想方面，该生积极进取，思想觉悟高。该学生觉得一个人的价值体现，不在于他有多么成功，而在于他对社会贡献的多少。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('2', '1160299011', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '母亲给副食公司打工。', '3000', '5', '河南省信阳市浉河区新华大市场10号楼', '464000', '家庭经济一般困难', '我的家庭是离异家庭，母亲一人带我，父亲不太管我。母亲很辛苦，并且母亲身体也不太好，这么多年来，她一人将我带大，积劳成疾，年纪也变大了，希望能给母亲减轻负担。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('3', '1160299063', '', '', '', '', '', '', '', '', '', '', '', '', '城镇', '父亲外出务工', '4000', '5', '浙江省衢州市江山市双塔街道缸甫底村267号', '324100', '家庭经济一般困难', '父母年龄大 劳动力低下 没有固定的工作单位 母亲体弱多病 常年吃药 只有父亲一人在外打工 工作极不稳定 还患有腰伤 随时都有失业的风险 家中还有年迈的老人和年幼的弟弟 经济压力极大 所以申请贫困生补助 望批准', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('4', '1160299047', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲务工', '3900', '2', '浙江丽水庆元阳光路35号', '323800', '家庭经济一般困难', '父母离异，家庭收入来源为父亲务工，为减轻父亲压力，特此申请。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('5', '1160299268', '2017年6月', '优秀团员', '浙江科技学院', '2017年7月', '军训标兵', '浙江科技学院', '', '', '', '', '', '', '城镇', '主要经济来源靠父亲在外打工', '2000', '4', '甘肃省兰州市永登县城关镇青龙路1245号拆迁楼1-601', '730300', '家庭经济一般困难', '在大一这一年里我始终保持积极的心态，时时以高标准要求自己的同时，妥善处理好学习与工作两者之间的关系，努力做到全面发展。而且身为班级的学习委员，一直致力于班级的学风建设，为同学营造一个良好的学习氛围，以先进班级作为我们班委的奋斗目标，至于家庭情况方面，我们家有四口人，主要经济来源靠父亲，而且父亲身体不是很好，所以我现在向学校申请国家励志奖学金，希望能够帮家里减轻负担并激励自己更加努力。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('6', '1160299041', '2017年5月', '优秀团干部', '共青团浙江科技学院委员会', '', '', '', '', '', '', '', '', '', '农村', '父亲务农，母亲做些手工', '1500', '4', '浙江省绍兴市嵊州市崇仁镇生四村239号', '312473', '家庭经济特别困难', '我是2016级信息学院的学生，父母在家靠务农维持经济。本人在上一学年中思想上遵纪守法，积极进取；学习上勤奋刻苦，积极配合老师工作，认真按时完成作业，不旷课，不早退。作为班委，真心实意为同学们服务，积极参加社团活动，奉献自我。在生活中，由于家中贫困的原因，学费险些贷款，自己也是尽量保持节俭，努力去做一些兼职以减轻父母的负担。现将申请国家励志奖学金!望各位领导加以评判审核并能够批准!', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('7', '1160299021', '2017年5月', '优秀学生干部', '共青团浙江科技学院委员会', '', '', '', '', '', '', '', '', '', '农村', '父亲和哥哥打工', '4000', '5', '四川省内江市东兴区石子镇三县村三组', '641107', '家庭经济一般困难', '我叫罗锋，来自四川内江的一个农村，一学年中努力刻苦，虽基础差，但经过努力成绩能在年级的百分之十五左右。在班任学习委员，在校任校区学生会主席。任职期间产生积极的影响获得校“优秀学生干部”称号，在上学期成为入党积极分子。参加校内的勤工勤学为家中减负，也参加支教等志愿活动。现向学校申请国家励志奖学金希望能够获得，这是对我学习生活中取得成绩和对学校班级作出贡献的肯定，并且能够在学习生活上给予我帮助和鼓励。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('8', '1160299219', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲在外打工', '6000', '4', '浙江省宁波市宁海县大佳何镇里袁村', '315621', '家庭经济一般困难', '虽然家庭经济条件困难，父亲在外打工，无稳定工作，母亲在家养病，但却并没消磨我的意识。在学习上，我积极进取；工作上，担任班级学委，帮助同学解决种种疑难；在思想上，坚持党的基本路线，更好地完善自己。由于家庭经济困难，所以我申请国家励志奖学金，这不仅在经济上给予本人极大的帮助，减轻了父母的负担，同时更是对本人学习上的一种激励。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('9', '1160299012', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '农业收入', '2500', '4', '浙江省缙云县三溪乡三溪村东雅宅11号', '321404', '家庭经济特别困难', '希望通过自己在学校的努力付出减轻家里的经济压力，希望用自己的努力来回报父母，证明自己在学校没有浑浑噩噩度日，不让父母伤心、失望，让父母放心。更加希望能证实自己的努力，激励自己更加努力。我希望用这个奖学金解决自己的一部分学费，这样加上自己的勤工俭学工资就可以向父母少要点钱，他们就也可以不用这么辛苦。虽然现在我还没有能力，但是我希望通过我的努力减轻他们的压力。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('10', '1160299044', '2017年1月', '书院优秀管理干事', '浙江科技学院安吉校区学生事务中心', '', '', '', '', '', '', '', '', '', '农村', '父母在家务农以及打零工', '2000', '4', '浙江省杭州市淳安县千岛湖镇南景路星月湾12幢201', '311700', '家庭经济一般困难', '我来自淳安县一个小山村，现家里有4口人，父亲，母亲，我和妹妹。平时家里没有什么经济收入，主要都靠父母务农以及打零工，家中一直过着清苦贫困的生活。但在我上大学期间的学费和生活费，使得本来困难的家里更加雪上加霜，父母实在不能再承担。为了顺利完成学业，尽量给家里减轻负担。且在校期间我学习刻苦努力，思想积极进步拥护党，乐于奉献，我申请国家励志奖学金,望能批准。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('11', '1160299064', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '种庄稼', '2000', '5', '河南省洛阳市偃师市邙岭乡东蔡庄', '471944', '家庭经济特别困难', '劳动力不足，父母医药费花费太多，负担太重。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('12', '1160299246', '2017年1月', '校“美丽安吉”主题征文一等奖', '浙江科技学院人文与国际教育学院等单位', '', '', '', '', '', '', '', '', '', '农村', '主要来源于父亲的工资，部分来源于房屋出租等少量收入', '2000', '5', '浙江省天台县坦头镇六另村1组65号', '317206', '家庭经济一般困难', '家庭经济较为困难，父母年龄较高，工作供我上学很不容易，为我日夜操劳，因此，我想尽力减轻他们的负担。在学习上，较为刻苦努力，不断地完善自己。\r\n以此申请，望批准。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('13', '1160492076', '2017年5月', '校园心理情景剧大赛二等奖', '浙江科技学院安吉校区学生事务中心', '', '', '', '', '', '', '', '', '', '城镇', '母亲的退休工资', '20400', '2', '浙江省杭州市西湖区文新街道康乐新村12-3-102', '310012', '家庭经济特别困难', '我父亲于2004年去世，家中还有一个哥哥，现已结婚生子，母亲一直体弱多病，现已退休在家，两个人靠一点退休金维持生计，但是我并未因此放弃学习，反而比其他人更勤奋，努力提高自身的专业知识水平，最终取得较好的成绩。而且积极参加学校组织的活动，在校园心理情景剧中获得了二等奖的好成绩。我在思想上积极进取，严于律己，宽以待人。遂向学院申请国家励志奖学金，希望能给予批准。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('14', '1160299230', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '务农，种地', '2000', '5', '浙江省三门县健跳镇小蒲村', '317100', '家庭经济特别困难', '家庭经济状况不是特别的好，父母身体很差，上了大学给家里加重了经济负担，家里还有一位年迈的老人，家里的收入是务农，但是种地的收入很不稳定，靠着这点收入有点艰难，但好在本人大一学年在学校成绩挺好，能够排到前面，因此特申请此奖学金。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('15', '1160299025', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '打工', '3000', '3', '浙江省绍兴市嵊州市崇仁镇张村218号', '312473', '家庭经济特别困难', '因父亲几年前患上癌症晚期，基本丧失劳动能力，而且手术及化疗后还需吃药调理，需要相当的费用。为了减轻家庭的负担，因而申请此奖学金。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('16', '1160692012', '2016年12月', '浙江科技学院第三届英语词汇竞赛', '校大学生科技活动与创新创业教育委员会', '', '', '', '', '', '', '', '', '', '农村', '父母在家劳作', '900', '3', '四川省眉山市东坡区富牛镇宋程村', '620860', '家庭经济特别困难', '平时学习生活中，成绩优秀，尊师敬长，团结同学，积极乐观，生活节俭朴素。思想端正，行为规范，目前是入党积极分子，坚决拥护国家拥护党组织。家中父母皆是农民，为家中唯一经济来源，父母收入微薄且不稳定。家中有两位老人皆无劳动力无经济来源。08年地震灾害导致房屋受损重修房屋使家中负债及老人生病的高昂医药费皆大大加重了家中的经济负担，入远不敷出。', '该生为人稳重，能严于律已，且乐观向上。在学习上，该生善于积极思考问题，勤奋上进，有很好的专业素养，成绩优异。而且乐于奉献、积极投身社会工作，具备团队合作精神，是一个优秀的大学生。经年级推荐，学院评审小组评议，该生符合国家奖学金的评审条件，同意报学校审批。');
INSERT INTO `nationalinspirationalscholarship` VALUES ('17', '1160299010', '', '', '', '', '', '', '', '', '', '', '', '', '城镇', '父亲在外打工', '1500', '4', '山西省晋城市城区钟家庄办事处花园头村50号楼1单元501室', '048000', '家庭经济特别困难', '在过去的一年我始终保持着积极向上的学习心态，始终保持端正、谦虚的学习态度，积极配合老师的教学，努力提高自己的专业知识水平，积极热情的帮助同学们，在大一期间还加入了学校的自律梯队，认真积极的工作，负责同学们的安全问题和生活上遇到的困难，在思想上诚实守信，认真学习党的知识，向党靠拢，但家中的状况艰巨，所以特申请励志奖学金，为家里减轻负担，同时我会更加努力，以求有更好表现，衷心希望校领导批准。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('18', '1160299328', '2017年1月', '2016年度校“美丽安吉”主题征文活动三等奖', '浙江科技学院人文与国际教育学院、校大学生文化素质教育基地', '', '', '', '', '', '', '', '', '', '农村', '在家务农', '1833', '4', '浙江省金华市兰溪市横溪镇施宅村柳家畈68号', '321118', '家庭经济特别困难', '自入学以来，虽然家庭经济困难，但我一直严格要求自己，在各方面不断提升自己。\r\n在学习上，我努力上进，勤奋学习；在思想上，态度端正，积极乐观，认真学习党的知识，努力向党组织靠拢；在工作上，作为班干部，积极配合校领导，为班级建设出一份力；’在生活中，勤俭节约，利用空闲时间做兼职，减轻父母负担，与同学相处融洽。\r\n在以后的日子里，我将更严格的要求自己，向更好的我前进。特此提出申请。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('19', '5161510006', '2017年8月', '2017年全国大学生英语竞赛校三等奖', '浙江科技学院', '', '', '', '', '', '', '', '', '', '农村', '务农', '1300', '4', '浙江省淳安县威坪镇汪川村殿下81号', '311715', '家庭经济一般困难', '我是郑玉弘，一名来自信息学院的学生。我虽然家境贫寒，但是从小立志上大学，做一个对社会有贡献的人。在过去的一年里，我很好地去实践了自己梦想，我思想品德优良，努力学习，刻苦钻研，在学业上取得了不错的成绩。课余时间，我积极参加社团活动，学到不少知识，也增长了社会交往能力。此外，在暑假期间，我参加了公司的实习，不仅锻炼了自己的职业能力，还增长了社会见识，获益匪浅。在今后的学习工作中，我必更加勤奋。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('23', '1150299067', '2016年10月', '国家励志奖学金', '浙江科技学院', '', '', '', '', '', '', '', '', '', '农村', '务农', '3000', '4', '安徽省界首市赵集村', '236500', '家庭经济一般困难', '本人家里共四口人，父母文化水平不高，以务农为生，收入很低不足以支付家庭花费，父亲由于常年体力劳动，患上腰间盘突出，不能干重活，母亲的身体也不好，我和妹妹还要上学，特此申请励志奖学金。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('24', '1150299221', '2017年5月', '十佳团支书', '共青团浙江科技委员会', '2017年4月', '先进个人', '浙江科技学院体育运动委员会', '', '', '', '', '', '', '农村', '母亲打工', '3000', '4', '浙江省衢州市江山贺村镇贺村村坞里106号', '324109', '家庭经济特别困难', '父亲身体不好，动过多次手术，医生说不能做累活。家里主要收入来源依靠母亲，但是因为要供我上大学，经济负担还是挺重的。在大二一年的学习中，很幸运这次成绩在本专业综测排名在14名，并获得学业三等奖学金。在大二一年的工作中，我在担任班级团支书的同时兼任院学生会体育部副部长，认真完成自己的工作，在学习和工作中都有较好的表现，此次有机会能够申请国家励志奖学金，我很感谢学院给我这个机会。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('25', '1150299088', '2017年5月', '浙江科技学院跆拳道锦标赛二等奖', '浙江科技学院体育委员会', '', '', '', '', '', '', '', '', '', '农村', '姐姐在镇卫生院当护士', '2500', '4', '浙江省兰溪市下马源村下马源94号', '321117', '家庭经济特别困难', '我父亲患风湿病，腿脚不便，不能外出打工，平常就在家务农为生，母亲也在家务农，没有收入。全家唯一的经济来源是姐姐在镇上卫生院当护士，但工资也不高，每个月就2 3千。平时我在学校学习的同时也在做校内的勤工助学和一下校外兼职以减轻家庭负担，学习成绩良好，故申请国家励志奖学金，望同意。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('26', '1150299261', '2017年5月', '优秀学生干部', '共青团浙江科技学院委员会', '2017年5月', '汉语口语大赛二等奖', '校大学生文化素质教育基地、校教务处、人文与国际教育学院', '2017年5月', '精英杯演讲赛一等奖', '信息学院分团委', '2016年10月', '精英杯演讲赛一等奖', '信息学院分团委学生会', '农村', '父亲和母亲外来务工', '5000', '4', '衢州市开化县对门村5号', '324300', '家庭经济一般困难', '该生一直以来表现优秀，恪尽职守，严于律己。不仅在学习方面取得优秀成绩，而且积极参与各类活动，工作能力强\r\n在大二获文体优秀奖学金，积极参加学校活动，比如精英杯演讲赛，汉语口语大赛等\r\n积极投身校七大组织之一的“创业俱乐部KAB”和班干部的竞选，担任公关部长一职，在职期间我校KAB荣获“全国十佳KAB创业俱乐部”\r\n但是该生家庭经济困难，为了使该生能够提供机会使其才华得到充分的展现。望能批准该生的申请！', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('27', '1160610007', '2017年6月', '浙江科技学院2017年大学生英语竞赛二等奖', '外国语学院/中德学院', '', '', '', '', '', '', '', '', '', '农村', '父亲打工', '1750', '3', '浙江省宁波市奉化区溪口镇倪家山村', '315501', '家庭经济一般困难', '该生在思想方面热爱祖国，遵守法律和校纪校规，诚实守信，道德品质优良，无违纪行为。尊敬师长，严以律己宽以待人。生活方面，该生生活简朴、厉行节俭。该生在校努力上进，学习勤奋，学习成绩优秀，绩点排名在学院前10%以内，家庭情况困难，经学校评定为贫困生。由于家庭经济困难，特此申请国家励志奖学金，望批准。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('28', '1150299096', '', '', '', '', '', '', '', '', '', '', '', '', '城镇', '父亲在外打工', '1800', '3', '新疆省阿克苏市拜城县老干所公租房小区7栋2单元301室', '842300', '家庭经济一般困难', '我认真地履行大学生应尽的义务，并注意加强文明修养。作为一名入党积极分子，我始终积极向党组织靠拢，时刻以共产党员的标准要求自己。在学习上我认真地去学习每门功课，努力克服学习上的困难，并取得了优异的成绩。在生活方面我与室友和同学保持良好的关系，日常互相帮助，同时也结识了许多的不同年级不同专业的同学，提高了自己的社会交往能力。课余时间我会经常参加一些学校活动和社团活动来丰富自己的大学生活。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('29', '1150299051', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '农田', '1500', '2', '河北省藁城市邱头镇东宽亭村国泰路62号', '052160', '家庭经济特别困难', '本人在2016-2017学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，成绩优异，学习成绩靠前；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自己。在社会实践方面，乐于参加志愿服务活动，主动承接兼职，提高自己书本外的能力。因此，申请国家励志奖学金，望批准。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('31', '1150299065', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲打工', '7000', '3', '浙江省金华市东阳市画水镇黄田畈上康新村', '322100', '家庭经济一般困难', '本人在2016-2017学年中，在学习方面，刻苦努力，获得较好的成绩；在思想上，遵纪守法，积极向上并于2017年5月成为一名预备党员；在生活上，友好待人，努力生活，具有自己独立的思维。能在学习上生活上进行合理的安排。另外我还参加了暑假实践活动，获得院一等奖。特向学校申请国家励志奖学金，它不仅仅会在经济上给予我极大的帮忙，更是对我学习成绩、工作潜力、综合素质的肯定。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('32', '1160299259', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲打工', '2500', '4', '浙江省温州市苍南县宜山镇镇前巷31号', '325803', '家庭经济一般困难', '家庭经济困难，仅靠父亲一人收入，家中有两个大学生需要培养，且还有一个年迈的奶奶，没有劳动能力，需要长期服用药物。希望通过这笔奖学金能够减轻家里的经济负担，并鼓励自己更加努力地学习，未来改变家庭状况，回报社会。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('33', '1150299066', '2016年10月', '国家励志奖学金', '浙江科技学院', '', '', '', '', '', '', '', '', '', '城镇', '父亲一人打工赚钱，收入不高', '3500', '4', '新疆维吾尔自治区和田地区民丰县索达东路国际商贸城眼镜刻章店', '848599', '家庭经济特别困难', '在学习上，我成绩优异，数媒专业绩点排名第6，综测排名第7。在思想上，我尊敬师长，团结同学，热爱祖国，遵守校规，积极乐观。在生活上，我热于参加学校组织的活动，加入学生会，参加暑期社会实践活动。为了减轻家庭负担，我勤工助学，努力学习，争取靠自己。这次申请奖学金不仅是对自己努力的喝彩，也是为家减负。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('34', '1150299124', '2016年10月', '国家励志奖学金', '浙江科技学院', '', '', '', '', '', '', '', '', '', '农村', '务农', '6000', '3', '浙江省兰溪市云山街道大屋基村', '321100', '家庭经济一般困难', '我是信息学院通信151的学生诸承广，在这一年里我始终保持积极的心态，时时以高标准要求自己的同时，妥善处理好学习与工作两者之间的关系，努力做到全面发展。本人在各方面均符合国家励志奖学金的评选条件，故提出该份申请书。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('35', '1150299097', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲务农，做工', '2500', '4', '浙江省衢州市衢江区樟潭街道沈家振兴西路三巷133号', '324000', '家庭经济特别困难', '本人在这一学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，成绩优异，学习成绩靠前；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在文体活动方面，热心参与班级风采展示。进入大学两年以来，我始终严于律己，向着既定目标不断努力奋斗，故提出奖学金的申请。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('36', '1150199147', '2016年10月', '三好学生', '浙江科技学院', '2016年10月', '优秀学生二等奖学金', '浙江科技学院', '2017年7月', '优秀团员', '浙江科技学院', '', '', '', '农村', '父亲外出打工和母亲务农', '2500', '6', '浙江省绍兴市柯桥区王坛镇肇湖村326号', '312055', '家庭经济特别困难', '该同学乐于助人，性格随和，积极参与班级活动，成绩也优异。在大一时成为入党积极分子并在大二下学期顺利成为预备党员。但是该生家庭经济困难，家里唯一的收入只有父亲外出打工，母亲生病，每月需要一定的医药费，而且家里有两个大学生靠父亲的收入实在无力维持家里的经济支出。还需要赡养家里的两位老人。家庭经济不宽裕。为了使该生能够顺利完成学业，望能批准该生的申请！', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('37', '1160492024', '2017年9月', '第三届中国“互联网+”大学生创新创业大赛创意组铜奖', '浙江省大学生创新创业大赛组委会', '2017年9月', '2017年中国大学生计算机设计大赛(校赛)一等奖', '浙江科技学院校大学生科技活动与创新创业教育组委会', '2017年6月', '“外研社杯”全国大学生英语写作大赛校特等奖', '浙江科技学院校大学生科技活动与创新创业教育组委会', '', '', '', '农村', '职工', '2000', '3', '浙江省宁波市象山县城西路44号', '315700', '家庭经济一般困难', '思想上拥护党的政策、遵守党的方针，坚守八荣八耻的价值观，初入学便递交入党申请书；学习上勤奋努力、认真研习专业知识并拓展学习专业课外的知识，英语四六级成绩优异，参加学科竞赛并获奖，发表学术论文且受检索；实践上积极参加各类竞赛并获奖、创新创业项目以及社团活动，在社团内担任干事，有较强的团队合作精神；工作上认真用心、积极配合，独立且准时完成分配的任务；生活上热情诚恳、乐于助人、简洁朴素。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('38', '1150299099', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲外出工作，务农', '1500', '4', '河南省济源市克井镇大郭付村第一居民组', '459000', '家庭经济一般困难', '本人在校成绩优异，位于专业前25%，生活中平时乐于助人，为他人解答，课余时间积极参加学校组织的志愿者活动，奉献爱心；并且加入了学校组织的部门，学习到了新知识，新技能；在暑期社会实践中团结小组成员，齐心协力，获得较好成绩；思想道德上，积极入党，参与学校进行的党课培训。本人综合素质过硬，并且可塑性也强，希望能获得国家励志奖学金，继续努力。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('39', '1150299110', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父母外出打工', '1500', '3', '四川省三台县花园镇一村四组', '621100', '家庭经济一般困难', '在学习方面，本人绩点与大一相比有巨大进步，在大二期间获得了计算机三级证书。 思想方面，大二期间参加了许多志愿活动，获得了许许多多的志愿者优秀证书，获得了三星级志愿者称号，并在这学期成为了一名光荣的预备党员。生活方面，本人勤俭节约，在校期间勤工俭学，暑假期间做临时工减轻父母的经济负担。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('40', '1150299167', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '务农', '5000', '3', '贵州省遵义县马蹄镇军河村团结组', '563111', '家庭经济特别困难', '本人在大学二年级通过不断的努力，补齐了在一年级所欠下的课程，并通过了所有课程且取得了良好的成绩，在学习上认真努力，在班级工作上积极负责，因此有机会评比此次的励志奖学金，并且本人来自农村，父母都是农民，家庭经济并不是很富裕，所以希望校领导能够酌情考虑，予以批准。谢谢！', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('41', '1150299291', '2016年12月', '2016年浙江科技学院英文微电影大赛三等奖', '浙江科技学院外国语学院/中德学院', '2016年10月', '省政府奖学金', '浙江省教育厅', '2016年10月', '三好学生', '浙江科技学院', '2016年10月', '国家励志奖学金', '浙江科技学院', '农村', '主要母亲务工，父亲身体不好', '2000', '3', '浙江省丽水市庆元县屏都街道余村老街76号', '323805', '家庭经济特别困难', '本人在校期间表现优秀，思想上积极进取，积极入党，大一就积极上交了入党申请书，如今成为了一名优秀的入党积极分子。学习上刻苦努力，工作中认真负责。在生活中与同学和睦相处，关系融洽，主动为学习有困难的同学解决问题。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('42', '1150299145', '2017年5月', '星级志愿者', '浙江科技学院', '2016年11月', '优秀团员', '浙江科技学院', '', '', '', '', '', '', '农村', '务农', '2000', '3', '江西省上饶市婺源县中云镇横槎村62号', '333209', '家庭经济特别困难', '在学习上我勤奋努力，积极上进，认真研习专业知识；生活上，我比较乐于助人，积极参加志愿服务活动；工作上认真用心，积极配合老师的工作，认真完成各类工作。同时家里经济情况有些困难，希望能获得奖学金来减轻家庭负担。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('43', '1150299241', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父母打工', '3500', '5', '浙江省丽水市庆元县领头乡小际头村洋心路8号', '323800', '家庭经济一般困难', '本人在大二期间，学习刻苦努力，态度良好，绩点排名和综测排名都在专业的上游，各方面都表现良好，思想端正，积极向上。且本人家庭经济压力比较大，经济来源为父母打工，希望减少家里的经济负担，所以想申请国家励志奖学金。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('44', '1150299174', '2017年10月', '学业优秀一等奖', '浙江科技学院', '', '', '', '', '', '', '', '', '', '农村', '务农种地', '500', '4', '黑龙江省大庆市红岗区杏树岗镇中内泡村姜赵屯114号', '163000', '家庭经济一般困难', '我来自农村，生活贫困，希望通过自己的努力减轻家庭的负担。在思想方面，遵纪守法，积极进取；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，成绩优异；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在社会实践方面，乐于参加志愿服务活动，主动承接兼职，提高自己书本外的能力。因此，申请学年奖学金，望批准。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('45', '1150299175', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '务农', '3000', '5', '浙江省金华市金东区源东乡长塘村长康路78号', '321000', '家庭经济特别困难', '本人学习成绩较为稳定，能够勤奋刻苦，按时完成各项任务。同时能够乐于助人，积极参加各种志愿活动，与人友善，曾无偿献血。另外能够经常反省自己，改正自己的缺点不足之处，有较强的团队精神，积极向上，因此申请国家励志奖学金。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('46', '1150299281', '2017年5月', '优秀学生干部', '共青团浙江科技学院委员会', '', '', '', '', '', '', '', '', '', '城镇', '父母务工所得', '3000', '4', '浙江省金华市磐安县东溪街27-29号', '322300', '家庭经济一般困难', '本人在学习上努力勤奋，认真专研专业知识，不存在挂科情况且绩点排名靠前；思想上认识到位，大二转为预备党员；生活上与同学相处融洽，乐于助人。在近一年的社团和学生会工作中认真负责，主动积极地完成任务，且多次参加志愿服务活动。希望能够在符合条件的情况下申请奖学金，为父母减轻负担，也会在今后的生活学习中，进一步提高自己。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('47', '1150299230', '2017年6月', '浙江省服务外包竞赛一等奖', '浙江省大学生科技竞赛委员会', '2017年8月', '大学生计算机设计大赛国赛二等奖', '中国大学生计算机设计大赛组织委员会', '', '', '', '', '', '', '城镇', '父亲工作', '2000', '5', '安徽省淮南市田家庵区田东南化村9号点式楼7-4', '232001', '家庭经济一般困难', '因母亲心脏不好，全家的经济支柱都来源于父亲，家庭经济较困难。在学习上我努力要求自己，参加各种学科竞赛，并获得浙江省服务外包竞赛一等奖和大学生计算机设计大赛国赛二等奖。为了以后给父母减轻经济负担，申请国家励志奖学金，希望能给予批准。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('48', '1160299093', '2017年1月', '2016年度校“美丽安吉”主题征文比赛中，获一等奖', '人文与国际教育学院，传统村落与美丽乡村文化研究中心', '', '', '', '', '', '', '', '', '', '农村', '香菇种植', '4000', '3', '浙江省丽水市云和县瓦窑西坑边村', '323600', null, '该生在校期间表现良好，学习上，认真努力，积极进取，有很好的专业素养；生活上，乐观向上，团结同学，乐于助人，积极的参加班级的集体活动，有很好的团队意识；思想上，积极正确，拥护党的政策方针，是一名优秀的大学生。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('49', '1160299031', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '个体经营', '6000', '4', '浙江省宁波市宁海县梅林街道花园村花园路199号', '315600', null, '本人自进入浙江科技学院以来，在各方面表现优异，思想乐观，积极上进，拥护党的政策方针。在学校里，乐于帮助同学；暑假里，也去工厂实践打工，减轻家里负担。遂向学院申请奖学金，希望学院能给我这个荣誉，并可以激励我能在接下来的学习和生活中更上一层楼。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('50', '1160299244', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父母经营小店，姐姐在外打工', '3200', '4', '湖北省黄冈市团风县方高坪镇', '438800', '家庭经济特别困难', '父母经营小店，收入微薄，姐姐在外打工，难以养活自己，父母的压力很大，希望得到国家的帮助', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('51', '1150299059', '', '', '', '', '', '', '', '', '', '', '', '', '城镇', '父母打零工为生', '2000', '6', '四川省眉山市东坡区老泉街140号', '620010', '家庭经济特别困难', '母亲有腰椎盘突出，父亲身体不好，哥哥先天残疾家中还有年迈的爷爷奶奶，父母文化水平低全靠打零工为生，自己因为读大学让家中经济不堪重负。为了减轻家里人负担，为更好的学习特此申请', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('52', '1160830050', '', '', '', '', '', '', '', '', '', '', '', '', '城镇', '父亲工资', '3000', '3', '甘肃省兰州市七里河区穴崖子西街43号', '730000', '家庭经济一般困难', '家庭经济困难', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('53', '1160299155', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲打工赚钱', '2700', '3', '吉林省梅河口市杰宇新村', '135000', '家庭经济一般困难', '家里农村户口，母亲身体不好，需常年吃药，并且不能从事劳累的工作。16年冬天父母出车祸住院，花费巨大，且几个月内无收入。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('54', '1160299271', '', '', '', '', '', '', '', '', '', '', '', '', '城镇', '父亲外出打零工赚钱，哥哥打工赚钱。', '2125', '5', '山西省太原市古交市建安公司21单元102室', '030200', '家庭经济特别困难', '我的家乡在山西，因为山西经济不景气，几年前煤矿纷纷关闭，我的父亲被迫下岗，只能外出打零工补贴家用。爷爷奶奶年事已高，无法再进行劳动，需要赡养，而母亲没有工作，且患有多年的高血压与风湿关节炎，需要长期服药治疗。二哥大学毕业后未找到工作，且被医院查出强直性脊柱炎，需要药物治疗，更是给这个家庭雪上加霜。而我还在上大学，家庭经济负担过重，故特向国家申请奖学金，望批准。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('55', '1160299132', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '务农', '1500', '5', '湖北省襄阳老河口市张集镇闫家村5组', '441800', '家庭经济一般困难', 'dd', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('56', '1160299006', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲的薪资', '2000', '5', '浙江省宁波市慈溪市逍林镇福和院村韩中弄7号', '315321', '家庭经济特别困难', '在一年多的生活中，我始终保持积极向上的乐观心态，学习方面，我努力学习，在学期末的时候成绩已名列前茅，各方面的表现也得到了老师和同学的肯定，思想方面，我积极向党组织靠拢，一直以一名优秀党员的标准要求自己，目前已成为一名入党积极分子。同时我积极参加各项实践活动，锻炼自己的综合创新能力，综合素质有了很大的提高。我现真心的向学校申请国家励志奖学金，因为这是对我的极大的肯定和鼓舞。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('57', '1160299262', '', '', '', '', '', '', '', '', '', '', '', '', '城镇', '父母均务农', '5000', '5', '浙江省丽水市庆元县溪沿路', '323800', '家庭经济一般困难', '庆元县属于浙江省较贫困地区，父母都是务农。希望为父母分担一些经济压力。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('58', '1160299117', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '打工', '4000', '5', '江苏省徐州市丰县师寨镇花园村东南队395号', '221713', '家庭经济一般困难', '奶奶患病住院，爷爷无劳动能力，父母工作压力大，故申请国家助学金', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('59', '1150299184', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '务农', '2000', '4', '山东省临沂市郯城县高峰头镇马场村', '276100', '家庭经济一般困难', '父亲近些年来因腰伤不能参与工作，所以家庭收入基本来源于母亲务农，想为家庭减轻一些经济负担。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('60', '1151020021', '2015年12月', '浙江省大学生物理竞赛', '浙江省', '', '', '', '', '', '', '', '', '', '农村', '父亲外出做一些零散的活', '4000', '4', '湖北省荆门市东宝区屈家岭管理区园艺分场制品厂0042号095', '431821', '家庭经济一般困难', '想为家里减轻部分分担，减少家里的开支。也为能够好的鼓励自己学习。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('61', '1150299394', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲打工', '2000', '3', '浙江省天台县南屏乡杨加山村3号', '317200', '家庭经济特别困难', '家庭贫困，母亲重病治疗，家庭收入微薄。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('62', '1151010058', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲在工地做点临时工', '3000', '4', '湖北省黄冈市黄梅县苦竹乡享堂村6组', '435500', '家庭经济特别困难', '母亲因几年前被查出患有系统性红斑狼疮，终身服药，每年按时去医院复查，消耗大量检查费和药费，父亲被迫为了照顾母亲就在附近的工地找些临时工来做，但工资极地低并且不稳定，姐姐刚刚从校门出来实习，也只是勉强养活自己，本人暑假没有回家，一般会在外面找些兼职来做，所以家庭特别困难，故申请助学金，希望能够减轻父亲的负担。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('63', '1150299013', '', '', '', '', '', '', '', '', '', '', '', '', '城镇', '父母打工', '3500', '3', '湖北省黄石市花湖大道振兴大道荣昌小区B栋2单元1号', '435000', '家庭经济一般困难', '母亲下岗失业在家，父亲工厂工人带病打工，为减轻父母经济负担，申请国家助学金。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('64', '1150299387', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '母亲在饭店打工', '2500', '4', '安徽省亳州市蒙城县坛城镇姜营村大刘庄5栋六号', '233500', '家庭经济一般困难', '父亲暑假刚做过手术，家庭负担全部落在母亲身上，希望能够申请助学金，来减轻母亲的负担。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('65', '1150299335', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲打工', '3000', '3', '浙江省丽水市松阳县黄公渡村东路23号', '323400', '家庭经济一般困难', '由于父母离异，父亲一个人工作，且挣的钱不多，不仅要赡养爷爷奶奶，还要供我读大学，导致家庭经济比较困难，特此申请，来解决我的困难。在学习上本人在校期间品行良好，成绩优良，遵纪守法，无违法违纪行为，诚实守信，做事遵守承诺，在工作方面担任班干部一直是尽职尽责，在生活上，本人家庭经济困难，生活简朴，已被认定为贫困家庭，困难学生，家里仅靠父亲打工维持生活', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('66', '1150299149', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲打工', '3000', '4', '浙江省衢州市开化县塘坞乡洪村村42号', '324307', '家庭经济一般困难', '家里收入来源依靠父亲打工，父亲腿脚不便，动过手术。', null);
INSERT INTO `nationalinspirationalscholarship` VALUES ('67', '1150299345', '', '', '', '', '', '', '', '', '', '', '', '', '农村', '父亲打工', '2000', '4', '安徽省马鞍山市当涂县沛东村光明组14号', '243100', '家庭经济一般困难', '父亲一个打工挣钱供我和妹妹上学，妈妈身体不好，一直都不能上班，爷爷去世了，奶奶一个人做农活，爸爸还有慢性肠胃炎，外婆今年暑假被查出高血脂和脑萎缩，住院半个月又要一直吃药，家里经济压力很大。', null);

-- ----------------------------
-- Table structure for `provincialgovernmentscholarship`
-- ----------------------------
DROP TABLE IF EXISTS `provincialgovernmentscholarship`;
CREATE TABLE `provincialgovernmentscholarship` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(50) NOT NULL,
  `date1` varchar(100) DEFAULT NULL,
  `award1` varchar(100) DEFAULT NULL,
  `unit1` varchar(100) DEFAULT NULL,
  `date2` varchar(100) DEFAULT NULL,
  `award2` varchar(100) DEFAULT NULL,
  `unit2` varchar(100) DEFAULT NULL,
  `date3` varchar(100) DEFAULT NULL,
  `award3` varchar(100) DEFAULT NULL,
  `unit3` varchar(100) DEFAULT NULL,
  `date4` varchar(100) DEFAULT NULL,
  `award4` varchar(100) DEFAULT NULL,
  `unit4` varchar(100) DEFAULT NULL,
  `applyReason` varchar(1000) DEFAULT NULL,
  `recommendReason` varchar(1000) DEFAULT NULL,
  `opinion` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`,`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of provincialgovernmentscholarship
-- ----------------------------
INSERT INTO `provincialgovernmentscholarship` VALUES ('3', '1160299261', '2017年10月', '省政府奖学金', '浙江省人民政府', '', '', '', '', '', '', '', '', '', '学习能力强 在校表现优异', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('4', '1160299042', '2017年3月', '校第十四届大学生程序设计竞赛  二等奖', '信息学院', '2016年12月', '校第十四届新生杯程序设计竞赛  二等奖', '信息学院', '2016年12月', '第八届“蓝桥杯”新生选拔赛 三等奖', '信息学院', '', '', '', '本人在2016-2017学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极学习专业知识，认真按时完成作业，不旷课，不早退，成绩优异，学习成绩靠前，除此之外，还积极参加学科竞赛，努力提高专业素养；在班级工作方面，努力工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在文体活动方面，热心参与班级风采展示，积极展示自我风采。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('5', '1160299023', '2017年6月', '2017浙江省大学生高数竞赛工科类一等奖', '浙江省高等数学教学研究院', '2017年3月', '校十四届大学生程序设计竞赛三等奖', '信息学院', '2016年12月', '校第十四届新生杯ACM程序设计竞赛三等奖', '信息学院', '2016年12月', '第八届“蓝桥杯”浙江科技学院新生选拔赛二等奖', '信息学院', '本人在2016-2017学年间，在思想方面，遵纪守法，积极进取，阳光向上；在学习上，勤奋刻苦，积极学习专业知识，认真按时完成作业，不旷课，不早退，成绩优异，经过自己的努力学习，顺利通过所选科目的考试，并取得绩点第9的成绩，除此之外，还积极参加学科竞赛，努力提高专业素养；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在生活中，本人朴素节俭﹑性格开朗，严以律己，宽以待人。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('6', '1160299045', '2017年1月', '第八届“蓝桥杯”校新生选拔赛 二等奖', '校大学生科技活动与创新创业教育委员会', '2017年3月', '校第十四届大学生程序设计竞赛 参赛奖', '信息学院', '2017年6月', '浙江科技学院第五届安吉尔杯微电影主题创作大赛 三等奖', '马克思主义学院', '', '', '', '在学期间，我在各方面表现优异。生活方面，我始终持续着乐观生活态度，与人为善，广交好友。坚持跑步健身。参加轮滑社，锻炼身体、放松娱乐的同时，主动担任教练，组织社团活动。学习方面，始终将学习放在首位，学习成绩名列前茅。积极与老师讨论问题。顺利通过四级六级。参加ACM社，坚持训练，败不气馁，打好编程基本功。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('7', '1160299270', '2017年8月', '中国大学生计算机设计大赛二等奖', '中国大学生计算机设计大赛组委会', '2017年5月', '优秀学生干部', '共青团浙江科技学院委员会', '2017年7月', '军训标兵', '浙江科技学院人民武装部', '2017年3月', '先进个人', '浙江科技学院学生处', '该生在校期间，在思想上，认真学习党的思想方针和工作路线，树立良好的人生观和道德观，积极向党组织靠拢，在第一年就申请加入中国共产党。在学习上，专业成绩在全学院也名列前茅，努力学习专业知识，积极参加学科竞赛，并获得奖项。在工作上，身为班级的团支书，协助班长管理班级，以先进班级作为的奋斗目标。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('8', '1160299311', '2017年8月', '浙江省大学生高等数学（微积分）竞赛工科类二等奖', '浙江省高校高等数学教学研究会', '', '', '', '', '', '', '', '', '', '在校期间，我始终将学习放在首位，学习刻苦认真，担任课代表，尽心尽力为同学服务，积极配合老师工作。各科目测试均取得良好成绩，绩点排名第二，并获得浙江省高数竞赛二等奖。积极听取优秀教师的讲座，注重体育锻炼，寝室卫生检查取得优秀，主动参与学校运动会的方阵项目，全面提高了自身的综合素质。特向学校申请省政府奖学金。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('9', '1160299178', '2016年5月', '第八届蓝桥杯竞赛省二等奖', '全国软件专业人才设计与创业大赛组织委员会', '2017年6月', '大学生英语竞赛校一等奖', '校大学生科技活动与创新创业教育委员会', '', '', '', '', '', '', '尊敬的领导、老师好。在学习期间，我认为我的各方面表现相对比较优异。在学习上，我一直将学习摆在首要位置，大一学年也取得了令人满意的成绩，平均绩点名列前茅，我也积极参加各项竞赛，力争夺奖，同时也通过了46级考试。在生活方面，我用心参加各类学校活动，参加团组织活动，成为入党积极分子，也获得了优秀团员的荣誉。因此特向学校申请省政府奖学金，相信这既是对我经济的帮助也是对我学习成绩、综合素质的肯定。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('10', '1160299032', '2016年12月', '职业汉语水平等级证书', '中国就业培训技术指导中心', '', '', '', '', '', '', '', '', '', '我是来自信息1602的孙梦瑶，现在是软件工程专业。回首大一，作为一名学生，在思想上，我保持积极进步，拥护党和国家,诚实守信；在学习工作上，我严于律己，成绩优异，顺利通过英语四级考试，身为副班长，乐于助人，积极配合辅导员老师的工作。过去的一年，感谢老师们的教诲与同学们的帮助。今后我将更加严格要求自己，以求更突出的表现。路漫漫其修远兮，吾将上下而求索。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('11', '1160580006', '2017年5月', '全国大学生英语竞赛国家级二等奖', '高等学校大学外语教学指导委员会、高等学校大学外语教学研究会', '2017年10月', '校一等奖学金', '浙江科技学院', '2017年10月', '校三好学生', '浙江科技学院', '', '', '', '本人在2016-2017学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，成绩优异，学习成绩靠前；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在文体活动方面，热心参与班级风采展示，积极展示自我风采。因此，我申请省政府奖学金，望批准。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('12', '1160694036', '2017年5月', '全国大学生英语竞赛三等奖', '高等学校大学外语教学指导委员会', '2017年6月', '浙江省大学生英语写作竞赛校三等奖', '浙江科技学院外国语学院/中德学院', '', '', '', '', '', '', '本人学习态度认真，勤奋刻苦，努力提高自己的学习成绩。在大一这一年，积极参加学校组织的各类文体活动，如：校运动会广播操，积极参加学科竞赛，如：大学生英语竞赛，写作竞赛，均获得奖项，同时还通过了英语四六级，并且分数较高。本人还积极参加学校社团和组织，工作踏实认真，在学校里遵守纪律，无违纪行为，尊敬老师、团结同学。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('13', '1160299065', '2017年6月', '浙江科技学院2017年“外研社杯”全国英语写作大赛三等奖', '外国语学院/中德学院 校大学生科技活动与创新创业教育委员会', '2017年6月', '浙江科技学院2017年大学生英语竞赛二等奖', '外国语学院/中德学院 校大学生科技活动与创新创业教育委员会', '', '', '', '', '', '', '本人是浙江科技学院信息学院的一名学生，这一年里，我保持积极乐观的心态，对自己有着较高的要求。我充分利用课余时间来提高自我的综合素养，在学院中名列前茅。我在这一年里面参加了校内的勤工俭学，以减轻父母的负担和压力，有着较强的独立性。在班级上，我担任了班级的团支书，并且获得了学校优秀团干的荣誉，能够为班级出力我感到非常幸运，这一职位锻炼了我的能力。因此，我认为自己达到了申请该奖学金的资格，特此申请。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('14', '1160299136', '2017年8月', '二零一七年浙江省大学生高等数学（微积分）竞赛工科类二等奖', '浙江省高校高等数学教学研究会', '2017年1月', '校“美丽安吉”主题征文活动三等奖', '人文与国际教育学院；校大学生文化素质教育基', '', '', '', '', '', '', '尊敬的领导：\r\n您好！\r\n        我是来自信息与电子工程学院软件工程161班的王鹏程。在浙江科技学院大一一年的生活中，我懂得同时发展我的学习和生活。在学习上，我勤奋刻苦，成绩名列学院前茅，竞赛获奖。在生活中，我积极参加活动，包括志愿、社团方面，更时常帮助身边的同学们一起积极向上 。因此，我特向学校申请省政府奖学金，这将是对我莫大的鼓励和肯定，激励我满怀一颗赤诚之心一直走下去。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('15', '1150299049', '2016年12月', '“蓝桥杯”校内选拔赛三等奖', '校大学生科技活动与创新创业教育委员会', '2017年4月', '优秀团员', '浙江科技学院团委', '2017年9月', '社团活动先进个人', '浙江科技学院团委', '2017年9月', '优秀社团干部', '浙江科技学院团委', '本人在2016-2017学年中，在思想方面，遵纪守法，积极进取，完成了党校学习，成为一名入党积极分子；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，成绩优异，学习成绩靠前，自主学习能力强；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在社会实践方面，乐于参加志愿服务活动，提高自己书本外的能力。因此，申请奖学金，望批准。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('16', '1160299316', '2017年1月', '校“美丽安吉“主题征文比赛二等奖', '人文与国际教育学院', '2017年9月', '2016级军训标兵', '浙江科技学院人民武装部', '', '', '', '', '', '', '入学以来，我始终保持着积极向上的心态，妥善处理各方面的关系，努力做到全面发展。在校期间，学习上，我立足自己的专业，刻苦学习，广泛涉猎，与同学讨论学习心得。经过自己的努力学习，顺利通过所选科目的考试，专业绩点排名学院第四。同时，我积极参加学校组织的活动，作为班干团结同学，维护班级学风建设。我也积极报名参加学科竞赛，充分利用课余时间，参与学院社团的各种活动，各方面综合素质都得到了很大提高。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('17', '1160299188', '2016年12月', '校14届新生杯ACM程序设计竞赛二等奖', '信息学院分团委', '2017年8月', '浙江省大学生高等数学竞赛一等奖', '浙江省高校高等数学教学研究会', '', '', '', '', '', '', '本人张钰恺。在大一时期，态度端正，积极向上。在校严格遵守校规，积极配合工作。尊重师长，乐于助人。上课无迟到旷课，上课认真听讲，课后认真按时完成作业，复习课程及深入思考。身心健康，热爱运动，积极参加活动和学科竞赛，并在浙江省大学生高等数学竞赛荣获一等奖。在这大二时期，我会抓紧时间，认真听好每节课，改变自己的不足，完善自己，争取有更大进步。在此申请省政府奖学金，希望领导批准。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('18', '1150299068', '2016年12月', '二等奖学金', '浙江科技学院', '2016年12月', '三好学生', '浙江科技学院', '2017年5月', '优秀学生干部', '共青团浙江科技学院委员会', '2017年4月', '体育先进个人', '浙江科技学院体育运动委员会', '本人自从升入大学以来，时刻将学习放在首位，学习成绩名列前茅。工作方面，我担任班级团支书，学院中研会会长，用心参加各项活动，并取得的良好的成绩，被评为优秀学生干部、体育先进个人和二星级志愿者。特向学校申请省政府奖学金，它不仅会在经济上给予我帮忙，更是对我学习成绩、工作潜力、综合素质的肯定。如果学院能够给予我这份荣誉，将是对我一种莫大的鼓励，必将激励我今后更加努力，做得更出色，为社会作出更大的贡献！', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('19', '1160299001', '2017年6月', '全国大学生英语竞赛校级二等奖', '校大学生科技活动与创新创业教育委员会', '2017年5月', '第二届“新耀杯”羽毛球赛女单第一名和团体第二名', '安吉校区学生会', '', '', '', '', '', '', '自开学以来，我学习刻苦，阅读过数十本书籍，并在期末测验中取得了优异的成绩；工作上态度认真负责，身为班级的副班长，对班级的管理值得同学们信任，因此深受任课老师和辅导员喜爱；生活中与同学相处融洽，欢声笑语不断。在课余时间，我还参加了许多志愿者活动，为他人提供帮助。同时也不忘运动，参加了“新耀杯”羽毛球赛并且获得了单打第一和团体第二的好成绩。为了锻炼提升自己，我还参加了跆拳道协会并担任副会长的职位。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('20', '1160299006', '2017年1月', '校“美丽安吉”征文活动二等奖', '浙江科技学院', '', '', '', '', '', '', '', '', '', '我在农村长大，生活并不富裕，期望通过自我的努力减轻家庭的负担。学习上刻苦认真，成绩优异，生活方面，在搞好学习的同时，我用心参加校、院的各项活动，并取得良好成绩，曾获得征文活动二等奖。社会实践方面，在课余或假期的时候，我常常参加社会实践活动，例如去小学支教，从而使自我更好地接触社会，了解社会，并得到锻炼，增加社会实践经验。遂申请省政府奖学金，它不仅在经济上给予帮助，更是对我各方面的肯定，望给予批准。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('21', '1150299119', '2016年10月', '优秀学生一等奖', '浙江科技学院', '2016年10月', '三好学生', '浙江科技学院', '2017年10月', '优秀学生一等奖', '浙江科技学院', '2017年10月', '三好学生', '浙江科技学院', '我学习刻苦，学习成绩一直名列年级前茅，连续两年获得一等奖学金，省政府奖学金和三好学生的荣誉。课余时间，我积极参加学院和学校组织的比赛，获得了校数模比赛的二等奖，校蓝桥杯的三等奖。思想上，我要求进步，积极入党，在行为规范上能严格要求自己，入党动机端正，我在大二下学期曾获得了优秀团员的荣誉。社会实践，我积极参加志愿者活动，获得了一星级志愿者等荣誉。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('23', '1150299165', '2017年6月', '第六届浙江省大学生服务外包创新应用大赛本科组三等奖', '浙江省大学生科技竞赛委员会', '2016年11月', '第八届全国大学生数学竞赛一等奖', '中国数学会普及工作委员会', '2017年5月', '浙江科技学院2016年度优秀团员', '共青团浙江科技学院委员会', '2016年12月', '三好学生', '浙江科技学院', '本人自从升入大学以来，时刻将学习放在首位，学习成绩名列前茅。此外，我还担任了班级的学习委员，为老师和同学们服务，从而锻炼自身潜力，全面提高自身综合素质。因此，我特向学校申请省政府奖学金，它不仅仅是一个荣誉，更是对我学习成绩、工作潜力、综合素质的肯定。如果学院能够给予我这份荣誉，将是对我一种莫大的鼓励，必将激励我今后更加努力，做得更出色，为社会作出更大的贡献!', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('24', '1150299182', '2017年5月', '浙江科技学院2016年年度优秀团员', '共青团浙江科技学院委员会', '2017年6月', '国际文化交流协会优秀干事', '留学生管理中心（ISAC）国际文化交流协会（ICCA）', '2016年11月', '第四届心理知识竞赛一等奖', '浙江科技学院信息与电子工程学院大学生心理健康联合会', '', '', '', '叶灵杰同学，大二一学年思想积极向上，学习认真，成绩优秀。他思想上乐观向上，完成了党校的学习，做好成为一名预备党员的准备。学习上刻苦认真，成绩优异，积极参加学校组织的活动。工作上认真负责，认真按照学校要求组织好团日活动主题班会。在这一学年中得到“优秀团员”、“心理知识竞赛一等奖”、“社团优秀干事“等荣誉。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('25', '1150299063', '', '', '', '', '', '', '', '', '', '', '', '', '本人在2016-2017学年中，在思想方面，遵纪守法，积极进取，在2015年提交入党申请，并于16年11月成为一名预备党员；在学习上，努力刻苦，积极配合老师工作，按时完成作业，不旷课，并取得优异的成绩；在班级及社团工作方面，作为组织委员及信息学院中研会副会长，积极为同学们服务，认真组织社团和班级活动，配合辅导老师的工作，真心实意为同学服务。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('26', '1150399100', '2017年5月', '瑜伽表演赛团体三等奖', '浙江科技学院体育部', '2017年5月', '优秀团员', '共青团浙江科技学院委员会', '', '', '', '', '', '', '这学年，我在各方面表现优异。生活方面，我始终持续着乐观生活态度；工作方面，用心认真，担任班级组织委员，关心同学生活和学习，帮助有困难的同学；学习方面，成绩名列前茅；社会实践方面，用心参加社会实践活动。\r\n　　因此，我特向学校申请奖学金，它是对我学习成绩、工作潜力、综合素质的肯定。如果学院能够给予我这份荣誉，将是对我一种莫大的鼓励，必将激励我今后更加努力，做得更出色。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('27', '1150299303', '2017年4月', '第八届蓝桥杯浙江赛区C/C++程序设计大学B组三等奖', '蓝桥杯全国软件和信息技术专业人才大赛', '2017年6月', '浙江省第十四届大学生程序设计竞赛二等奖', '浙江省大学生科技竞赛委员会', '', '', '', '', '', '', '本人大二学年，担任班里学习委员，学习方面，认真刻苦；工作方面，积极负责；思想方面，积极向上，乐于为大众做贡献；生活方面，勤俭节约，作息习惯良好，不打扰室友休息；竞赛方面，获得第八届蓝桥杯浙江省赛C/C++程序设计大学B组三等奖三等奖、浙江省第十四届大学生程序设计竞赛二等奖。特此申请省政府奖学金，望批准。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('28', '1150299082', '2016年12月', '校二等奖学金', '浙江科技学院', '2016年12月', '校三好学生', '浙江科技学院', '', '', '', '', '', '', '我在学习期间各方面表现优异。思想方面，向党组织靠拢，不忘党训，成为一名预备党员；生活方面，我始终持续着乐观生活态度；工作方面，用心认真，担任班级团支书，不忘对同学学习的带动和帮忙；学习方面，始终将学习放在首位，学习成绩名列前茅，通过大学英语四六级和计算机二级等。\r\n　　我特向学校申请省政府奖学金，这是对我学习成绩、工作潜力、综合素质的肯定。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('29', '1150299363', '2017年4月', '第八届蓝桥杯全国软件和信息技术专业人才大赛浙江赛区二等奖', '蓝桥杯全国软件和信息技术专业人才大赛组织委员会', '2017年6月', '第六届浙江省大学生服务外包创新应用大赛一等奖', '浙江省大学生科技竞赛委员会', '2017年5月', '浙江科技学院第三十六届运动会暨第九届跆拳道锦标赛一等奖', '浙江科技学院体育运动委员会', '', '', '', '本人在思想上积极向上，热爱党热爱人民，乐于帮助同学和为人民服务，并且已经成为了一名光荣的预备党员。本人在学习上认真刻苦，上课认真听讲，下课积极实践创新，多次参加学科竞赛并且取得不错的成绩。本人在工作方面，担了任软件工程专业党支委，积极辅助老师完成党建工作。本人在生活方面勤俭节约，时刻保持良好的言谈举止，生活作风优良。因此本人申请省政府奖学金。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('30', '1150299134', '2016年6月', '优秀团员', '浙江科技学院', '2017年6月', '优秀团干部', '浙江科技学院', '', '', '', '', '', '', '现担任数媒学生第一党支部支委，信息学院分团委学生会副主席兼数字媒体技术151班班长。大二期间，获得优秀团干部的称号，作为班长，为班级申请到了校十佳团支部的荣誉，作为学生会副主席，自上任以来，在老师和学长学姐的指导和帮助下，在广大同学的支持下，我积极配合主席开展学院内的工作，努力保质的完成主席分配的各种任务。作为一名在校学生，积极参加各类学科竞赛，浙江省多媒体竞赛，浙江省电子商务大赛。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('31', '1150299388', '', '', '', '', '', '', '', '', '', '', '', '', '本人热爱学习，与人友善，乐于助人。在校期间积极参加各类公益实践、志愿者、运动会等活动。大二时候成为一名光荣的入党积极分子，课堂之外也在实验室跟着专业老师学习,掌握了更多专业技能，并作为第一负责人主持申报立项省级项目新苗，此项目现在也在按计划持续进行中。接下来的大学生活我会更加积极向上，不断提升自己，锻炼自己。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('32', '1150580033', '', '', '', '', '', '', '', '', '', '', '', '', '我在大二一年来，努力学习，绩点相比较大一，上升幅度较大，并且在本专业绩点排名第一。我积极参与各类志愿者活动，并且积极响应学校所开展的活动，新苗立项成功，因此我的综测成绩达到了专业第二。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('33', '1150299040', '2017年6月', '优秀社团干部', '浙江科技学院', '', '', '', '', '', '', '', '', '', '学期间，我在各方面表现优异。思想方面，成为一名预备党员;生活方面，我始终持续着乐观生活态度;工作方面，担任班级组织委员，关心同学;学习方面，始终将学习放在首位;社会实践方面：参加暑期社会实践活动，参加多种志愿者活动，更好的了解社会，锻炼自己。因此，我特向学校申请省政府奖学金，这是对我学习成绩、综合素质的肯定。如果学院能够给予我这份荣誉，将是对我一种莫大的鼓励，必将激励我今后更加努力，做得更出色！', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('34', '1150299347', '2016年10月', '校三好学生', '浙江科技学院', '2016年10月', '校一等奖学金', '浙江科技学院', '2016年10月', '省政府奖学金', '浙江科技学院', '2017年5月', '优秀学生干部', '浙江科技学院', '大一期间我获得过优秀学生干部，省政府奖学金，校一等奖学金，校三好学生等荣誉。在大二我带领过很多志愿活动，例如西湖博览会志愿活动等，参与过很多志愿活动。同时我也积极参与学校的活动，大二期间参与了运动会，虽然没有获得名次，但我觉得重在参与。我有较强的责任心，能认真细心的做好班里以及校内的每一份工作。大二一整年下来我觉得自身做到了品学兼优，因此申请省政府奖学金。', null, null);
INSERT INTO `provincialgovernmentscholarship` VALUES ('35', '1150299346', '', '浙江省大学生服务外包大赛本科组二等奖', '浙江省大学生科技竞赛委员会', '', '互联网大会“优秀志愿者”', '浙江科技学院', '', '2016届暑期社会实践十佳团队', '浙江科技学院', '', '校优秀干部', '浙江科技学院', '我作为一名预备党员，在校各方面更加严于律己。 在学习方面，严格制定标准，积极参加学科竞赛。在工作方面，加入了学生组织，各类大小活动不仅积极配合彼此工作，在自己职责范围内认真尽职。在文体活动方面，曾参与院演讲赛，校运动会多项田径比赛等。进入院主持队，曾主持过迎新晚会，参与暑期社会实践等。自愿参与了各项志愿者活动如世界互联网大会志愿者等。我希望在校期间能一直努力做到不忘初心，砥砺前行！', null, null);

-- ----------------------------
-- Table structure for `review_status`
-- ----------------------------
DROP TABLE IF EXISTS `review_status`;
CREATE TABLE `review_status` (
  `status_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `review_type_id` int(20) NOT NULL,
  `status` int(20) DEFAULT NULL,
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
  `model_name` varchar(20) NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`scholarship_id`),
  UNIQUE KEY `scholarship_id` (`scholarship_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scholarship
-- ----------------------------
INSERT INTO `scholarship` VALUES ('1', '省政府奖学金', '省政府模板', '1502972347');
INSERT INTO `scholarship` VALUES ('2', '国家奖学金', '国家模板', '1502972347');
INSERT INTO `scholarship` VALUES ('3', '校奖学金', '校模板', '1502972347');

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
-- Table structure for `scholarship_opinion`
-- ----------------------------
DROP TABLE IF EXISTS `scholarship_opinion`;
CREATE TABLE `scholarship_opinion` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `manager_id` varchar(50) NOT NULL,
  `national_opinion` varchar(1000) DEFAULT NULL,
  `provincial_recommend` varchar(1000) DEFAULT NULL,
  `provincial_opinion` varchar(1000) DEFAULT NULL,
  `school_opinion` varchar(1000) DEFAULT NULL,
  `triplea_opinion` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`,`manager_id`),
  UNIQUE KEY `id` (`id`) USING BTREE,
  UNIQUE KEY `manager_id` (`manager_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scholarship_opinion
-- ----------------------------
INSERT INTO `scholarship_opinion` VALUES ('1', '114046', '该生积极要求上进，积极参加学校和学院举办的活动；尊敬师长，团结同学，有团队意识和合作精神；该生思想进步、乐于奉献、积极投身社会工作、具备团队合作精神，是一个优秀的大学生。经年级推荐，学院评审小组评议，该生符合国家励志奖学金的评审条件，同意报学校审批。', '', '', '', '');
INSERT INTO `scholarship_opinion` VALUES ('2', '112021', '该生思想上，积极上进，拥护党的政策方针；学习上，善于思考问题，勤奋上进，有很好的专业素养；生活上，乐于奉献，积极投身社会工作，具备团队合作精神，是一名优秀的大学生。经年级推荐，学院评审小组评议，该生符合国家励志奖学金的评审条件，同意报学校审批。', '在2016-2017学年，该生在思想、学习、生活等各方面均表现优异。政治思想上，热爱中国共产党，拥护党的方针、政策和路线；学习上，认真努力，有较强的自学能力和自我管理能力，专业学习主动性强，积极参加各项学科竞赛，学业成绩名列前茅；生活上，吃苦耐劳，朴实大方，认真对待工作，积极参加社会实践活动，与同学相处融洽。综合各方面，该生均符合省政府奖学金申请条件，现推荐其申请省政府奖学金。', '该生思想上，积极上进，拥护党的政策方针；学习上，刻苦钻研，勤奋上进，成绩名列专业前茅；生活上，严格要求自己，并努力帮助他人，获得老师及同学的一致好评。经年级推荐，学院评审小组评议，该生符合省政府奖学金的评审条件，同意报学校审批。', '', '');
INSERT INTO `scholarship_opinion` VALUES ('3', '1150299070', '', '', '', '', '');

-- ----------------------------
-- Table structure for `scholarship_percent`
-- ----------------------------
DROP TABLE IF EXISTS `scholarship_percent`;
CREATE TABLE `scholarship_percent` (
  `percent_id` int(20) NOT NULL AUTO_INCREMENT,
  `scholarship_id` int(20) NOT NULL,
  `level` varchar(20) DEFAULT NULL,
  `percent` double NOT NULL,
  `create_time` bigint(20) NOT NULL,
  PRIMARY KEY (`percent_id`),
  UNIQUE KEY `percent_id` (`percent_id`) USING BTREE,
  KEY `scholarship_id` (`scholarship_id`),
  CONSTRAINT `scholarship_percent_ibfk_1` FOREIGN KEY (`scholarship_id`) REFERENCES `scholarship` (`scholarship_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scholarship_percent
-- ----------------------------
INSERT INTO `scholarship_percent` VALUES ('1', '1', null, '0.04', '1502972347');
INSERT INTO `scholarship_percent` VALUES ('2', '2', null, '0.03', '1502972347');
INSERT INTO `scholarship_percent` VALUES ('3', '3', '一等奖', '0.02', '1502972347');
INSERT INTO `scholarship_percent` VALUES ('4', '3', '二等奖', '0.03', '1502972347');
INSERT INTO `scholarship_percent` VALUES ('5', '3', '三等奖', '0.05', '1502972347');

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
INSERT INTO `school_manager` VALUES ('1150299070', 'ZTLcLq+BaR2y9kFF0eCBzw==', '1', '1502972169');
INSERT INTO `school_manager` VALUES ('1150299072', 'ISGMyneATSuhkiwz4BURBQ==', '2', '1502972169');

-- ----------------------------
-- Table structure for `schoolscholarship`
-- ----------------------------
DROP TABLE IF EXISTS `schoolscholarship`;
CREATE TABLE `schoolscholarship` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(50) DEFAULT NULL,
  `level` varchar(100) DEFAULT NULL,
  `reason` varchar(1000) DEFAULT NULL,
  `opinion` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=172 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of schoolscholarship
-- ----------------------------
INSERT INTO `schoolscholarship` VALUES ('1', '1160299044', '优良学风奖', '该生徐余丰在学习上学习刻苦，积极配合老师工作，按时完成作业，不旷课，成绩良好，学习成绩专业靠前。顺利通过英语四级考试，同时也在学习上为同学们做出表率。在工作方面，他担任劲竹书院梯队干事，积极为同学们服务，认真组织书院活动，配合我们老师的工作，有良好的群众基础，受到同学们一致好评，还获得了优秀干事的荣誉。在思想上保持积极进步，拥护党和国家，遵纪守法，特此申请，望能批准。', null);
INSERT INTO `schoolscholarship` VALUES ('4', '1160299261', '优秀学生一等奖学金', '该生在2016-2017学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，成绩优异，学习成绩靠前；在班级工作方面，努力做好学委工作，协助老师和其他班委工作，真心实意为同学们服务；在社团方面，参与ACM协会，努力提升专业水平，并积极参与校级和省级比赛。因此，申请2016-2017学年校优秀学生一等奖学金，望批准。', null);
INSERT INTO `schoolscholarship` VALUES ('5', '1150299261', '文体优秀奖', '该生一直以来表现优秀，恪尽职守，严于律己。不仅在学习方面取得优秀成绩，而且积极参与各类活动，工作能力强\r\n积极参加学校活动，比如精英杯演讲赛，汉语口语大赛等，获一、二等奖\r\n积极投身校七大组织之一的“创业俱乐部KAB”和班干部的竞选，担任公关部长一职，在职期间我校KAB荣获“全国十佳KAB创业俱乐部”', null);
INSERT INTO `schoolscholarship` VALUES ('6', '1160299270', '优秀学生一等奖学金', '该生在校期间，在思想上，认真学习党的思想方针和工作路线，树立良好的人生观和道德观，积极向党组织靠拢，在第一年就申请加入中国共产党。在学习上，专业成绩在全学院也名列前茅，努力学习专业知识，积极参加学科竞赛，并获得奖项。在工作上，身为班级的团支书，协助班长管理班级，以先进班级作为的奋斗目标。', null);
INSERT INTO `schoolscholarship` VALUES ('7', '1150299096', '优秀学生二等奖学金', '我认真地履行大学生应尽的义务，并注意加强文明修养。作为一名入党积极分子，我始终积极向党组织靠拢，时刻以共产党员的标准要求自己。在学习上我认真地去学习每门功课，努力克服学习上的困难，并取得了优异的成绩。在生活方面我与室友和同学保持良好的关系，日常互相帮助，同时也结识了许多的不同年级不同专业的同学，提高了自己的社会交往能力。课余时间我会经常参加一些学校活动和社团活动来丰富自己的大学生活。', null);
INSERT INTO `schoolscholarship` VALUES ('8', '1160299065', '优秀学生一等奖学金', '该生保持积极乐观的心态，对自己有着较高的要求。该学生充分利用课余时间来提高自该学生的综合素养，在学院中名列前茅。并且在这一年里面参加了校内的勤工俭学，以减轻父母的负担和压力，有着较强的独立性。在班级上，该学生担任了班级的团支书，并且获得了学校优秀团干的荣誉，这一职位锻炼了该学生的能力。因此，该学生达到了申请本项奖学金的资格，特此申请。', null);
INSERT INTO `schoolscholarship` VALUES ('9', '1150299099', '优秀学生三等奖学金', '本人在校成绩优异，位于专业前25%，生活中平时乐于助人，为他人解答，课余时间积极参加学校组织的志愿者活动，奉献爱心；并且加入了学校组织的部门，学习到了新知识，新技能；在暑期社会实践中团结小组成员，齐心协力，获得较好成绩；思想道德上，积极入党，参与学校进行的党课培训。本人综合素质过硬，并且可塑性也强，希望能获得国家励志奖学金，继续努力。', null);
INSERT INTO `schoolscholarship` VALUES ('10', '1150199147', '优秀学生二等奖学金', '该同学在在日常生活上，乐于助人，性格随和，与室友、同班同学关系良好，团结一致。积极参与班级活动，集体荣誉感强，在班级活动中提出好的意见 ，成绩也比较优异。在大一结束的评优中获得学校优秀学生二等奖学金以及三好学生。在大一时成为入党积极分子并在大二下学期顺利成为预备党员。并且顺利通过大学英语六级考试。积极参加学校活动，乐于为这个学院奉献自己的一份力量。', null);
INSERT INTO `schoolscholarship` VALUES ('11', '1160299188', '优秀学生一等奖学金', '该生张钰恺。在大一时期，态度端正，积极向上。在校严格遵守校规，积极配合工作。尊重师长，乐于助人。上课无迟到旷课，上课认真听讲，课后认真按时完成作业，复习课程及深入思考。身心健康，热爱运动，积极参加活动和学科竞赛，并在浙江省大学生高等数学竞赛荣获一等奖。在此申请优秀学生一等奖奖学金，希望领导批准。', null);
INSERT INTO `schoolscholarship` VALUES ('12', '1150299068', '优秀学生一等奖学金', '该生自从升入大学以来，时刻将学习放在首位，学习成绩名列前茅。工作方面，该生担任班级团支书，学院中研会会长，用心参加各项活动，并取得的良好的成绩，被评为优秀学生干部、体育先进个人和二星级志愿者。特向学校申请省政府奖学金，这不仅会在经济上给予帮忙，更是对其学习成绩、工作潜力、综合素质的肯定。如果学院能够给予该生这份荣誉，将是一种莫大的鼓励，必将激励该生今后更加努力，做得更出色，为社会作出更大的贡献！', null);
INSERT INTO `schoolscholarship` VALUES ('13', '1160299326', '学业优秀三等奖学金', '该生在思想上，积极上进，勇于批评与自我批评；在工作上，认真负责，细心谨慎，做好自己的本职工作；在学习上，勤奋努力，学习态度端正，学习目标明确；在生活上，勤俭节约，团结同学，尊敬师长，有较好的人际关系；该同学为人诚实友善，与同学关系融洽，乐于助人，并积极参与各项集体活动。', null);
INSERT INTO `schoolscholarship` VALUES ('14', '1160299023', '优秀学生一等奖学金', '该生戴梁辉在2016-2017学年间；在学习上，勤奋刻苦，积极学习专业知识，认真按时完成作业，不旷课，不早退，成绩优异，经过自己的努力学习，顺利通过所选科目的考试，并取得绩点第9的成绩，除此之外，还积极参加学科竞赛，努力提高专业素养；在生活中，该生朴素节俭﹑性格开朗，严以律己，宽以待人。', null);
INSERT INTO `schoolscholarship` VALUES ('15', '1160299042', '优秀学生一等奖学金', '在2016-2017学年中，该生在思想、学习、生活等各方面均表现优异。在思想方面，遵纪守法，积极进取，阳光向上；学习上，认真努力，有较强的自学能力和自我管理能力，专业学习主动性强，积极参加各项学科竞赛，学业成绩名列前茅；在班级工作方面，努力工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在文体活动方面，热心参与班级风采展示，积极展示自我风采。', null);
INSERT INTO `schoolscholarship` VALUES ('16', '1160299279', '优良学风奖', '该生在2016-2017学年间，在思想方面，积极向上，阳光热情；在学习上，勤奋刻苦，积极学习专业知识，认真按时完成作业，不旷课，不早退，顺利通过各科考试，还积极参加学科竞赛，努力提高专业素养；在社团工作方面，积极参加社团工作，锻炼自身能力和素质，提高社交能力；在生活中，本人朴素节俭﹑乐观向上，刻苦学习。', null);
INSERT INTO `schoolscholarship` VALUES ('17', '1160299311', '优秀学生一等奖学金', '该生在校期间始终将学习放在首位，学习刻苦认真，担任课代表，尽心尽力为同学服务，积极配合老师工作。各科目测试均取得良好成绩，绩点排名第二，并获得浙江省高数竞赛二等奖。积极听取优秀教师的讲座，注重体育锻炼，主动参与学校运动会的方阵项目，全面提高了自身的综合素质。', null);
INSERT INTO `schoolscholarship` VALUES ('18', '1160299178', '优秀学生一等奖学金', '该生在大一学年各方面表现优秀。在学习上，该生一直将学习摆在首要位置，大一学年也取得了令人满意的成绩，平均绩点名列前茅，该生积极参加各项竞赛，同时也通过了四六级考试。在生活方面，该生用心参加各类学校活动，参加团组织活动，成为入党积极分子，获得了优秀团员的荣誉。在社会实践方面，该生也积极参加实习活动，丰富了个人社会经验。因此特向学校申请优秀学生一等奖学金，相信这是对其学习成绩、综合素质的肯定。', null);
INSERT INTO `schoolscholarship` VALUES ('19', '1160299308', '优良学风奖', '该生性格开朗，乐观、自信，在校期间各方面表现良好。学习态度明确，认真学习各种专业知识，成绩优秀，具备一定的英语听说读写的能力，一次性通过国家英语四级考试。发挥自身特长，挖掘自身潜力，逐步提高学习能力和分析处事能力，培养锻炼了一定的组织协调能力和管理能力.生活中，团结同学，积极帮助同学解决各种困难，群众基础好。该生兴趣广泛，创造力强，勇于迎接新的挑战。综上，该生是一名全面发展的优秀大学生。', null);
INSERT INTO `schoolscholarship` VALUES ('20', '1150299102', '优秀学生二等奖学金', '学期间，我在各方面表现优异。生活方面，我始终持续着乐观生活态度，我坚信贫困是暂时的，我有潜力改变生活；工作方面，用心认真，担任志愿者协会干事；学习方面，始终将学习放在首位，学习成绩排名靠前，透过大学英语四六级等；社会实践方面：用心参加社会实践活动，参与各种志愿活动，从而使自我更好的接触社会，了解社会，并得到锻炼，增加实践经验。文体方面：积极参加校运动会并取得名次。', null);
INSERT INTO `schoolscholarship` VALUES ('21', '1160299146', '学业优秀二等奖学金', '该生在2016学年表现优秀，全年无缺勤记录。期末考试无挂科记录并且成绩优异（学均绩点校前20%）。寝室无不良寝室记录并且获得过优秀寝室称号。并且该生在2016年的体质健康检测中取得良好成绩，特此向学校申请学业优秀二等奖。', null);
INSERT INTO `schoolscholarship` VALUES ('22', '1150299286', '优秀学生二等奖学金', '本人在学习上刻苦，积极配合老师工作，按时完成作业，不旷课，成绩优异。在找工作方面，担任学习委员，积极为同学们服务。在思想上保持积极进步。', null);
INSERT INTO `schoolscholarship` VALUES ('23', '1150299072', '优秀学生二等奖学金', '该同学品学兼优，综测排名在专业前列，担任学生会副部长，在学习和工作中表现较为突出。  这一年工作中认真负责，多次参加学院组织的活动，在同时也不忘学习。成绩方面获得省服务外包竞赛三等奖，各类校竞赛也取得不错的成绩该同学表示新的一年会更加努力在学习生活工作中，不辜负老师和同学们的期望。', null);
INSERT INTO `schoolscholarship` VALUES ('24', '1150299119', '优秀学生一等奖学金', '我学习刻苦，学习成绩一直名列年级前茅，连续两年获得一等奖学金，省政府奖学金和三好学生的荣誉。课余时间，我积极参加学院和学校组织的比赛，获得了校数模比赛的二等奖，校蓝桥杯的三等奖。思想上，我要求进步，积极入党，在行为规范上能严格要求自己，入党动机端正，我在大二下学期曾获得了优秀团员的荣誉。社会实践，我积极参加志愿者活动，获得了一星级志愿者等荣誉。', null);
INSERT INTO `schoolscholarship` VALUES ('25', '1150299281', '优秀学生三等奖学金', '本人在学习上努力勤奋，认真专研专业知识，不存在挂科情况且绩点排名靠前；思想上认识到位，大二转为预备党员；生活上与同学相处融洽，乐于助人。在近一年的社团和学生会工作中认真负责，主动积极地完成任务，且多次参加志愿服务活动。希望能够在符合条件的情况下申请奖学金，以此自我勉励，也会在今后的生活学习中，进一步提高自己。', null);
INSERT INTO `schoolscholarship` VALUES ('26', '1150299204', '优秀学生三等奖学金', '本人在2016-2017学年中，在思想方面，遵纪守法，积极进取；在学习方面，勤奋刻苦，认真按时完成作业，不旷课，不早退，乐于参加学科竞赛；在班级工作方面，努力配合班委工作；在文体活动方面，热心参与班级风采展示；在社会实践方面，乐于参加志愿服务活动，提高自己书本外的能力。因此，申请学年奖学金，望批准', null);
INSERT INTO `schoolscholarship` VALUES ('27', '1150299110', '优秀学生三等奖学金', '在学习方面，本人绩点与大一相比有巨大进步，在大二期间获得了计算机三级证书。 思想方面，大二期间参加了许多志愿活动，获得了许许多多的志愿者优秀证书，获得了三星级志愿者称号，并在这学期成为了一名光荣的预备党员。生活方面，本人勤俭节约，在校期间勤工俭学，暑假期间做临时工减轻父母的经济负担。', null);
INSERT INTO `schoolscholarship` VALUES ('29', '1150299300', '学业优秀三等奖学金', '学期间，我在各方面表现优异。思想方面，向党组织靠拢，不忘党训，参与；生活方面，我始终持续着乐观生活态度，学习方面，始终将学习放在首位，学习成绩良好，通过大学英语四级等；社会实践方面：用心参加社会实践活动，积极参与志愿者活动，积极参与校运动会工作，参与献血活动等，从而使自我更好的接触社会，了解社会，并得到锻炼，增加实践经验。', null);
INSERT INTO `schoolscholarship` VALUES ('30', '1160299205', '优良学风奖', '该生在2016-2017学年中，在思想方面，遵纪守法，积极进取，阳光向上;在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，学习成绩还行;在班级工作方面，努力配合班委工作，真心实意为同学们服务;在社团工作方面，积极参加社团工作，奉献自我，锻炼自我;在文体活动方面，热心参与班级风采展示，积极展示自我风采;在社会实践方面，乐于参加志愿服务活动。因此，申请优良学风奖，望批准。', null);
INSERT INTO `schoolscholarship` VALUES ('31', '1150299100', '文体优秀奖', '本人在大二一学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退。身心健康，热爱运动，积极参加活动。在大二下学期，还和同学一起参加了省服务外包竞赛，取得了三等奖。因此，申请文体优秀奖学金，望批准。', null);
INSERT INTO `schoolscholarship` VALUES ('32', '1150299266', '优良学风奖', '本人在2016-2017学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在文体活动方面，热心参与班级风采展示，积极展示自我风采；在社会实践方面，乐于参加志愿服务活动，主动承接兼职，提高自己书本外的能力。因此，申请学年奖学金，望批准。', null);
INSERT INTO `schoolscholarship` VALUES ('33', '1150299389', '优秀学生三等奖学金', '在校期间，在思想方面，我向党组织靠拢，不忘党训；在生活方面，我积极向上，乐观生活，也会不定期的加以锻炼，并且参加学院羽毛球比赛并获团体亚军；工作方面，我用心认真，担任班级生活委员，关心同学生活并且与同学关系融洽，代表班级参加学院双代会；学习方面，我时刻将学习放在第一位，努力刻苦，成绩在专业前30%，还常与同学讨论学习上的问题。', '');
INSERT INTO `schoolscholarship` VALUES ('34', '1150299131', '优良学风奖', '非常荣幸我能有资格去评选奖学金，我一定会继续好好学习，努力拼搏，锐意进取，争取在未来做的更好。为什么要申请奖学金呢？我觉得这不仅仅是一份荣耀，更是一份责任，我觉得我要担负起来，以此来督促自己不断进步，完成自我的突破，而且个人也能得到一定的物质奖励，我觉得十分的高兴，也更加的有动力了！我一定会在接下来的路程中继续认真负责，诸君共勉。', null);
INSERT INTO `schoolscholarship` VALUES ('35', '1160299174', '优秀学生三等奖学金', '该生不断的挑战自我，充实自己，从年少的青涩逐渐走向了成熟。大一加入ACM竞赛社团，认真学习，积极参加各类比赛，积极锻炼，大学以来锐意进取、学习成绩优秀、生活勤俭节约，是一名全面发展的大学生。\r\n在思想方面，该生在校认真学习毛概论，树立了正确的世界观、人生观、价值观。保持与时俱进，积极进步和时时以一名优秀团员的标准严格要求着她自己。时刻关注国内新闻，了解和学习党的路线、方针、政策。', null);
INSERT INTO `schoolscholarship` VALUES ('36', '1160299021', '优秀学生二等奖学金', '该生在2016-2017学年中，学习努力刻苦，虽基础差，但经过努力成绩能在年级的百分之十五左右。工作认真负责，在班任学习委员，在校任校区学生会主席。任职期间产生积极的影响获得校“优秀学生干部”称号，在上学期成为入党积极分子。参加校内的勤工勤学为家中减负，也参加支教、迎新等志愿活动。他全方位发展自己，是一名优秀的学子。', null);
INSERT INTO `schoolscholarship` VALUES ('37', '1150299108', '优秀学生二等奖学金', '在课堂上我始终保持端正、谦虚的学习态度，努力提高自己的专业知识水平，扩展自己各方面的知识，及时补充课堂知识的不足。\r\n要想成为优秀的人，不仅要拥有丰富的知识，而且要具备良好的社会责任感、使命感和个人道德修养。正是这样，励志我成为一名全面发展的人\r\n平时善于和同学沟通，在生活中建立了很好的人际关系，获得了大家的尊重和支持。\r\n今后我要更加严格的要求我自己，以求有更好的表现。做一个对国家，对社会有用的人。', null);
INSERT INTO `schoolscholarship` VALUES ('38', '1150299216', '优秀学生二等奖学金', '我是来自软工151班的征杭勇，现申请校二等奖学金。我自16年九月入学以来，学习较为努力，绩点排名位于专业前列。学习的同时，我也有注意自身的全面发展，积极参加学校学院组织的各项活动，在这两年里我始终要求自己保持着积极向上的心态，时时以一个优秀的大学生的标准来要求自己, 努力使自己做到全面发展,成为一个全面发展的大学生。本人认为在各方面均符合学院二等奖学金的评选条件，故申请我优秀学生二等奖学金。', null);
INSERT INTO `schoolscholarship` VALUES ('39', '1160299001', '优秀学生一等奖学金', '该生殷龙女学习刻苦，并在期末测验中取得了优异的成绩；工作上态度认真负责，身为班级的副班长，对班级的管理值得同学们信任，因此深受任课老师和辅导员喜爱；生活中与同学相处融洽，欢声笑语不断。在课余时间，该生还参加了许多志愿者活动，为他人提供帮助。同时也不忘锻炼提升自己，参加了“新耀杯”羽毛球赛并获得了单打第一和团体第二的好成绩。', null);
INSERT INTO `schoolscholarship` VALUES ('40', '1160299221', '优秀学生二等奖学金', '该生在大一学年中，工作和生活上分别获得科创部干事考核合格，所在寝室月卫生检查成绩屡获优秀的成绩。在学习上通过了CET四级六级考试，取得了职业汉语等级专业中（甲）级并且人力资源部认证，积极参加蓝桥杯校内新生选拔赛并获得三等奖，积极参与了“美丽安吉”征文大赛并获得二等奖。很好的兼顾了学习、工作和生活。', null);
INSERT INTO `schoolscholarship` VALUES ('41', '1150299106', '优秀学生三等奖学金', '本人在校期间，学习认真刻苦，与同学相处融洽，并积极参加学院及社团举办的各种活动。大一时担任篮球助教，并积极参加大一新生篮球赛。在大一学年成绩优异，被评为学业一等奖学金。进入大二，加入了信息学院中研，积极参加工作。在校期间，本人还积极参与各种志愿者活动。', null);
INSERT INTO `schoolscholarship` VALUES ('42', '1150299344', '优秀学生二等奖学金', '本人在2016-2017学年中，在思想方面，遵纪守法，积极进取；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，学习成绩靠前；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在社会实践方面，乐于参加志愿服务活动。因此，申请学年奖学金，望批准。', null);
INSERT INTO `schoolscholarship` VALUES ('43', '1150299001', '文体优秀奖', '大二一年担任信息学院学生会文艺部部长一职，积极参与各项院、校举办的活动。带领文艺部各成员与其他各部门成员协力工作，为本院同学服务，丰富同学们的学习生活。\r\n      于班级，担任了一年的副班长，积极协助班长的工作，为班级同学服务。我想大学不仅是学习书上的知识，更是学会待人接物的多方面提升，希望自己能继续保持一颗热情的心，待生活，待学习，待明天。', null);
INSERT INTO `schoolscholarship` VALUES ('44', '1150299088', '优秀学生三等奖学金', '本人在校期间一直保持着认真谦虚的学习态度，成绩良好，通过了英语四六级以及计算机二级。同时坚持体育锻炼，体侧成绩优秀，在2017年5月份获得了校跆拳道比赛二等奖。平时和同学关系不错，经常相互交流学业，一起出去玩什么的。去年还参与了院学生会，是组织部的副部长，在任期间积极参与学生会组织的各类活动。综上我认为自己有资格申请校优秀学生三等奖学金，望校领导同意。', null);
INSERT INTO `schoolscholarship` VALUES ('45', '1150299346', '优秀学生二等奖学金', '该生作为一名预备党员，在校各方面更加严于律己。 在学习方面，严格制定标准，积极参加学科竞赛。在工作方面，加入了学生组织，各类大小活动不仅积极配合彼此工作，在自己职责范围内认真尽职。在文体活动方面，曾参与院演讲赛，校运动会多项田径比赛等。进入院主持队，曾主持过迎新晚会，参与暑期社会实践等。自愿参与了各项志愿者活动如世界互联网大会志愿者等。该生在校期间能努力做到不忘初心，砥砺前行！', null);
INSERT INTO `schoolscholarship` VALUES ('47', '1160299008', '优秀学生二等奖学金', '该同学学习认真，团结同学，愿意帮助别人，积极参加班级活动和学校组织的讲座，参加了全国大学生英语竞赛并获得了三等奖，大一时通过了cet4和cet6和六级口语b等级。军训期间认真训练，坚持到了最后，参加了最后的方阵检阅。认真学习的同时他也积极参加学生社团，担当了部长的职务，也没把身体锻炼落下。思想道德方面，他热爱祖国，热爱共产党，思想与时俱进。', null);
INSERT INTO `schoolscholarship` VALUES ('49', '1150299193', '优秀学生三等奖学金', '入校以来我虽然没有突出的特长，也还是尽力参加了学校的组织活动并认真完成了任务；学习成绩不算名列前茅，但也把学习摆在首位；社会活动参与不够多，以后会多参加如志愿者活动之类的活动。因此，我特向学校申请国家奖学金，但是它不仅仅会在经济上给予我极大的帮忙，更是对我学习成绩、工作潜力、综合素质的肯定。如果学院能够给予我这份荣誉，将是对我一种莫大的鼓励。', null);
INSERT INTO `schoolscholarship` VALUES ('50', '5151591001', '学业优秀三等奖学金', '大一由2+3转入信息学院，曾在学生会宣传部工作过一年，工作积极主动、认真负责，学习态度端正、积极向上；大二学分绩点排名21，综测排名31名，四六级已过，普通话考试成绩二级乙等。学习努力，为人开朗诚恳，积极参加班级及学校组织活动。', null);
INSERT INTO `schoolscholarship` VALUES ('51', '1150299031', '优秀学生二等奖学金', '我在2016-2017学年中，在学习上勤奋努力，按时完成作业，大二这一学年的绩点排名本专业前5%。在思想方面，我从一名入党积极分子成为了一名光荣的预备党员，我会积极认真的完成自己肩上所承担的责任。在生活中，我积极参加学校里举办的活动，例如运动会方阵，辩论赛，“三学三比”等。我还利用课余时间学习英语，通过了英语六级的考试，并且通过了学校的“春萌”立项。另外我还在暑假参加了“五水共治”暑期社会实践。', null);
INSERT INTO `schoolscholarship` VALUES ('52', '1150299182', '优秀学生一等奖学金', '叶灵杰同学，大二一学年思想积极向上，学习认真，成绩优秀。他思想上乐观向上，完成了党校的学习，做好成为一名预备党员的准备。学习上刻苦认真，成绩优异，积极参加学校组织的活动。工作上认真负责，认真按照学校要求组织好团日活动主题班会。在这一学年中得到“优秀团员”、“心理知识竞赛一等奖”、“社团优秀干事“等荣誉。', null);
INSERT INTO `schoolscholarship` VALUES ('53', '1160299243', '优秀学生二等奖学金', '该同学经常去图书馆看书，课下就去自习室自习，不断巩固自己新学到的知识。在思想政治方面，该同学积极向上，热爱祖国，热爱社会主义中国，热爱中国共产党，拥护中国共产党的领导。在生活方面，该同学坦诚乐观，乐于帮助身边的人。该同学将会继续努力，认真学习，刻苦向上。该同学现真心的向学校申请“三好学生”并希望能够获得。\r\n ', null);
INSERT INTO `schoolscholarship` VALUES ('54', '1160492076', '优秀学生二等奖学金', '该生始终保持积极向上的学习态度，努力提高自身的专业知识水平，最终取得了较好的成绩。还积极参加学校组织的活动，并在校园心理情景剧中获得了二等奖的好成绩。该生在思想上积极进取，和同学相处融洽，互爱互助，思想积极，品行高尚，热爱班级、学校，工作积极努力，热心为集体服务，遵守校规校纪、遵守社会公德和国家法律、法规。 讲文明，有礼貌，讲团结，有爱心， 积极参加各种体育活动。', null);
INSERT INTO `schoolscholarship` VALUES ('55', '1150299190', '优秀学生三等奖学金', '该生在校期间，思想道德素质良好，没有违纪违规的事情。该生在学习上，上课认真听讲，课后及时完成作业，做到不挂科，工作上，该生认真尽职地做好社团的本职工作。生活上，该生能和寝室同学、班级同学和睦相处，并多次参加志愿者活动，积极为社会贡献。且该生在课余生活中，顺利地通过了四六级考试。', null);
INSERT INTO `schoolscholarship` VALUES ('56', '1160299075', '优秀学生三等奖学金', '该生在上一学年里，始终保持积极向上的心态，时刻严格要求自己，努力做到全面发展。在工作方面，该生身为学习委员敬职敬责，贡献自己的力量。在思想方面，该生认真学习党的先进思想，在大一时被评为入党积极分子。在学习方面，该生明确了学习目的，勤于向老师和同学请教、讨论，经过他自己的努力，学习成绩一直保持优异。在生活方面，该生能够做到勤俭节约。', null);
INSERT INTO `schoolscholarship` VALUES ('57', '1160610007', '优秀学生三等奖学金', '该生在思想方面热爱祖国，遵守法律和校纪校规，诚实守信，道德品质优良，无违纪行为。尊敬师长，严以律己宽以待人。生活方面，该生生活简朴、厉行节俭。积极参加体育锻炼，身体健康，体测成绩达到体测标准。学习方面，该生学习勤奋，专业成绩优异，平均绩点为院内前10%。工作方面，该生在校期间参加勤工助学，不迟到、不早退，能做好每个被给予的任务，认真负责。', null);
INSERT INTO `schoolscholarship` VALUES ('58', '1150299384', '优良学风奖', '他在校期间思想表现优秀，积极参与校内外组织的各种活动并表现良好，其中在校级运动会中参与红旗舞的表演以完美的演出得到了校运动会工作表现优秀的通报表扬。在学习上做到不迟到早退，勤勉好学。生活中不乏热情，乐于助人，广交好友，与同学朋友打成一片。工作上在校外兼职，独立自主，踏实上进。', null);
INSERT INTO `schoolscholarship` VALUES ('59', '1160299002', '优秀学生三等奖学金', '该生在校学习态度端正，努力认真；卫生习惯良好，寝室卫生等级始终保持优良；担任班级团支书，工作负责，曾获优秀团干部荣誉，大一上学期提交入党申请书，后被评选为入党积极分子，所在班级曾获十佳团支部及优良学风班的荣誉，多项班会活动也曾获奖；积极参加各类文体活动，曾获“新耀杯”羽毛球女单亚军，“美丽安吉”征文比赛一等奖；积极参加英语角等交流活动。', null);
INSERT INTO `schoolscholarship` VALUES ('60', '1150299161', '优秀学生三等奖学金', '该生入校以来，遵守学校的各项规章制度。在学习上，该生认真做好每一门课的学习工作，并对学习有很好的规划，不旷课，不早退，把学习当作自己的第一任务。在生活中，该生积极参加各种学生间的组织活动，曾在大二这一学年担任院学生会办公室副部长的职务，参与筹划了多项大型活动。该生为人友善，能妥善处理好同学间的关系，在专业期末的各项答辩活动中，与同学配合良好共同合作完成答辩。', null);
INSERT INTO `schoolscholarship` VALUES ('61', '1150299253', '优秀学生三等奖学金', '该学生在校期间，思想素质表现优良，没有做学校规定违规违纪的事情。该学生上课认真听讲，下课课后作业积极完成，做到不挂科，考试不作弊，顺利通过四六级英语考试对学习态度积极。在其他方面，该学生认真尽职的做到本职工作，责任心强，热心互助。在生活上，能与同班同学及寝室同学和睦相处，并积极参加学校组织的志愿者活动，积极为社会做贡献，在暑期也积极参加社会实践，做到修炼个人。', null);
INSERT INTO `schoolscholarship` VALUES ('62', '1150299165', '优秀学生一等奖学金', '他自从升入大学以来，时刻将学习放在首位，学习成绩名列前茅。他还担任了班级的学习委员，为老师和同学们服务，从而锻炼自身潜力，全面提高自身综合素质。此外，他还积极参加学院的活动，例如五月四日的五四毅行，院杯、院代会等等；代表软件工程专业参加学校的团代会等等。', null);
INSERT INTO `schoolscholarship` VALUES ('63', '1150299125', '优秀学生二等奖学金', '陈琪同学在大一年级获得学业优秀奖学金一等奖，在大二年级担任信息学院学生会新媒部副部长及助理团成员，获得了优秀学生干部的称号，在大三的时候当选院团委副书记。作为一名学生干部，她积极投入到学生工作中去，始终用一个学生干部的标准来衡量自己的一言一行。同时，她并没有在学习上停下了脚步，而是不断求知、不断学习、不断进步。', null);
INSERT INTO `schoolscholarship` VALUES ('64', '1160399109', '学业优秀二等奖学金', '该同学在校期间学习认真，思想态度端正，做事认真负责，没有任何违章违纪行为。并且其学习成绩出色，平均绩点达到同专业前20%。该同学与其他同学相处融洽，乐于助人，品行端正，并且积极参加体育锻炼，在体育测试中成绩达标，且其寝室卫生状况良好，在检查中成绩优秀。该同学积极参加学校组织，并已加入信息学院中研会以及信息学院学生会，在学生事务中积极做出自己的贡献。', null);
INSERT INTO `schoolscholarship` VALUES ('65', '1150299126', '优秀学生二等奖学金', '该生在校期间思想上，严于律己，诚实守信，道德品质优良，积极向上。在学习上，态度端正，勤奋踏实，不旷课，不迟到，不早退，有明确的学习目标，遇到问题不放弃，刻苦钻研。在工作上，认真负责，一丝不苟，积极配合班委工作，真心实意帮助同学。在生活中，性格开朗，待人诚恳，品德端正，积极参加学校活动，做好寝室卫生工作，与身边的同学们友好相处，积极帮助他们解决问题。', null);
INSERT INTO `schoolscholarship` VALUES ('66', '1160299121', '优秀学生二等奖学金', '该同学自入学以来一直遵守学校相关规章制度，思想品德素质良思想端正，能吃苦耐劳，注重个人道德修养好。学习上她刻苦努力，上课专心听讲，及时完成相关作业，对问题能深入求解，并与同学积极讨论。作为班干部的一员，协助其他班委共同管理好班级，工作上认真负责，有强烈的集体荣誉感和工作责任心。在生活上，她诚实守信，待人友好，乐于助人，一直以来与同学相处融洽。', null);
INSERT INTO `schoolscholarship` VALUES ('67', '1160299032', '优秀学生二等奖学金', '该生是来自信息1602的孙梦瑶，现在是软件工程专业。在思想上，该生保持积极进步，拥护党和国家，诚实守信；在学习工作上，该生严于律己，成绩优异，顺利通过英语四级考试，身为副班长，该生乐于助人，积极配合辅导员老师的工作。希望今后，该生可以更加严格要求自己，以求更突出的表现。', null);
INSERT INTO `schoolscholarship` VALUES ('68', '1160299338', '学业优秀三等奖学金', '该生在2016-2017学年内，思想积极上进，乐观向上，并评选为入党积极分子；学习努力，成绩优秀，综合测评加权成绩为74.56，为专业前百分之20%；积极参加院内竞赛活动，并获得浙江省大学生数学竞赛一等奖；工作上勤勤恳恳，乐于奉献，在学校工作参与方面积极主动，作为社团主要负责人，也愿意为社团出心出力；生活上乐于助人，具有良好的寝室关系，与班级同学和睦相处共同进步，综测表现优秀。', null);
INSERT INTO `schoolscholarship` VALUES ('70', '1150299004', '优秀学生三等奖学金', '在校期间，她能够积极地学习先进的党的领导思想，关注国家大事，关心国家政策的发布实施。在学习上，她做到勤奋学习，认真上进，以积极的态度学习书本和老师传授的知识，并在课外加以实践，融会贯通。\r\n课余时间，她积极地参加了信息学院志愿者协会，以参加志愿服务活动丰富自己的生活，以帮助他人而获得内心更大的愉悦。此外，她也会积极主动地发展自己的业余爱好，做一些自己感兴趣的事来丰富自己的精神生活。', null);
INSERT INTO `schoolscholarship` VALUES ('72', '1160299184', '优秀学生二等奖学金', '该生是一个十分开朗活泼很爱笑的姑娘，在校遵纪守法，遵守学院各项规章制度，认真完成学业，并在大一期间通过了英语四六级考试。她热爱画画，设计，积极参加学校的设计比赛，在诚信设计比赛中获得第一名，也积极加入学校的各组织，为其出力，认真完成任务。同时，她爱运动爱帮助他人，积极地参与校运动会，也和其他同学一起以浙科院的名义马拉松志愿者活动。', null);
INSERT INTO `schoolscholarship` VALUES ('73', '1150299375', '优秀学生三等奖学金', '在学习上，我督促自己努力学习，专业绩点达到了专业第十五名的成绩，通过了英语六级。\r\n在社会工作中，我上年学荣幸加入了院学生会，成为了生活权益部的一员，积极参与了组织的各项活动，比如迎新晚会，蓝色文化节等工作。\r\n在生活娱乐中，我也积极参与，上半学年参加了运动会的广播操比赛荣获校二等奖；下半学年参与了五四毅行，坚持走完了全程。', null);
INSERT INTO `schoolscholarship` VALUES ('74', '1160299013', '优秀学生二等奖学金', '该生在校期间努力拼搏，奋发进取，在一些方面取得了优异的成绩。在学习上，劳逸结合是他的学习方法，互帮互助，共同进步是他的制胜法宝，好思能动是他前进的源泉。在生活上，他积极参加课外活动，通过运动锻炼身体，而且在学习之余，注重人际交流，不死读书，知识与人际交往齐头并进。在十九大召开期间，他也认真学习党的理论知识，爱党爱国的思想根深蒂固。', null);
INSERT INTO `schoolscholarship` VALUES ('75', '1150299251', '优秀学生三等奖学金', '该同学在学习上认真刻苦，成绩优异，并在校学生会担任学研部干事，积极参与学院、和学校举办的排球赛、垃圾分类大赛等活动，起到了先锋模范作用；在思想上，积极向党组织靠拢，在大二学年发展为预备党员，参加了浙江科技学院团代会；在生活中，该同学乐于助人，遵纪守法，严于律己，积极参见各类志愿活动。', null);
INSERT INTO `schoolscholarship` VALUES ('76', '1150399100', '优秀学生一等奖学金', '这学年，该同学在各方面表现优异。生活方面，始终持续着乐观生活态度；工作方面，用心认真，担任班级组织委员，关心同学生活和学习，帮助有困难的同学；学习方面，成绩名列前茅；社会实践方面，用心参加社会实践活动。\r\n　　因此，特向学校申请奖学金，它是对学习成绩、工作潜力、综合素质的肯定。如果学院能够给予其这份荣誉，将是一种莫大的鼓励，必将激励该同学今后更加努力，做得更出色。', null);
INSERT INTO `schoolscholarship` VALUES ('77', '1160299030', '优秀学生二等奖学金', '该同学为人诚恳，谦虚，随和，乐观向上，有进取心，乐于助人，思想积极要求上进，向党组织靠拢，有良好的心理素质和应变能力，勇于进取，不怕挫折；在平时专业学习上，该生学习刻苦勤奋，认真学习，学习优秀，顺利通过大学英语四级考试，能及时完成老师布置的任务；在工作上，该生，能熟练专业知识，有较强的动手能力；在生活上，该生简朴勤俭，勤劳刻苦。', null);
INSERT INTO `schoolscholarship` VALUES ('78', '1150299320', '优秀学生二等奖学金', '该生在思想上，要求积极上进，热爱祖国、热爱人民，目前是入党积极分子。该生在学习上，刻苦钻研，勤奋好学，积极参加学科竞赛，蓝桥杯，省多媒体竞赛等，学分绩点位列该专业第一。该生在工作上，认真负责，担任数媒152班班长一职，妥善处理班级事情，积极配合学院的工作。在生活上，养成了良好的生活习惯，生活充实而有条理，有严谨的生活态度和良好的生活态度和生活作风，能与同学们和睦相处;', null);
INSERT INTO `schoolscholarship` VALUES ('79', '1160299316', '优秀学生一等奖学金', '该生入学以来始终保持着积极向上的心态，能妥善处理各方面的关系，做到全面发展。在校期间，该生立足自己的专业，刻苦学习，广泛涉猎，与同学讨论学习心得，以优异的成绩通过所选科目的考试，专业绩点排名能达学院第四。同时，该生积极参加学校组织的活动，作为班干团结同学，维护班级学风建设。该生也能积极报名参加学科竞赛，充分利用课余时间，参与学院社团的各种活动，综合表现突出。', null);
INSERT INTO `schoolscholarship` VALUES ('80', '1160299070', '优良学风奖', '该生1998年6月出生，浙江科技学院数字媒体与设计专业2016级学生。学习成绩优秀，分别通过国家英语四、六级等级考试，获得优良学风班，参加暑期实践。\r\n\r\n　　秉承着“诚朴勇毅”的校训，在严谨的学习氛围中，稳步前进，不断进步，取得了优异的成绩，克服了种种困难。虽生活艰苦，但志存高远;虽家境贫寒，但自强不息。君子不可以不弘毅，任重而道远!', null);
INSERT INTO `schoolscholarship` VALUES ('81', '1150299054', '优秀学生二等奖学金', '我积极进取，努力上进，积极参加学校和学院举办的各项活动；我尊敬老师，团结同学，是同学们的好榜样；我有着很强的奉献精神，曾参加过无人机大赛志愿者，并即将参加世界互联网大会志愿者；我积极投身社会工作，具备团队合作精神，在院志协担任副部长，是一个优秀的大学生。现在我希望能申请优秀学生二等奖学金。', null);
INSERT INTO `schoolscholarship` VALUES ('82', '1150299159', '优秀学生二等奖学金', '学习上，他学生以学习为本。该同学上课认真听讲，课后积极复习，并有自己的学习方法，绩点较大一学年有了明显提升。思想上，该同学认真学习各种重要思想，不断提升自身的政治修养。工作上，该同学为人稳重，工作认真踏实，吃苦耐劳。在担任班长期间，该同学认真做好本职工作，主动关心和同学，为班级做出了较大贡献。总而言之，该同学将以百倍的信心和万分的努力去迎接更大的挑战。', null);
INSERT INTO `schoolscholarship` VALUES ('83', '1151020047', '优秀学生二等奖学金', '该生学习态度端正，有较强的自学能力和自我管理能力，在专业学习上主动性强，成绩在专业里名列前茅，工作态度积极，能够很好的处理班级里同学之间的关系，适应能力强，遵守学校的规章制度，了解自己的兴趣爱好，对未来有着自己的想法与见解，有着积极乐观的态度和拼搏的精神。', null);
INSERT INTO `schoolscholarship` VALUES ('84', '1150299158', '优良学风奖', '入校以来，彭子恬同学勤学勤问，刻苦地专心研究专业知识，严格遵守学院的各项规章制度。平时，合理的分配好学习与工作的时间，使自己在顺利的完成工作的同时保证了每天学习计划得以完成。在校期间, 思想、学习、工作、生活等方面都取得了较大的进展。屡次获得校奖学金。并在不断努力使自己成为一名德、智、体等方面全面发展的优秀大学生。', null);
INSERT INTO `schoolscholarship` VALUES ('85', '1150299127', '外语成绩优秀奖', '在英语四六级一次性顺利通过。作为一名团支书，能够积极主动的帮助同学。我懂得拼搏，刻苦勤奋，一丝不苟，有自己的长期计划和短期计划，充分利用课堂和课余时间，提高学习效率，锻炼了意志，有时间我也会去图书馆阅读课外资料，储备知识，扩大知识面。', null);
INSERT INTO `schoolscholarship` VALUES ('86', '1160299063', '优秀学生二等奖学金', '该生在上一学年中，始终保持积极向上的心态，时刻严格要求自己，努力做到全面发展。在思想上，该生认真学习党的先进思想，用正确的理论武装自己的头脑，贯彻党的方针政策。 在学习上，该生明确了学习目的，勤于向老师和同学请教、讨论，经过该生的努力，学习成绩一直保持优异。生活上，积极参加各类活动，投身于社会事业。相信该生会不断的努力，以更优秀的自己去帮助和影响更多的人。', null);
INSERT INTO `schoolscholarship` VALUES ('87', '1160299211', '优秀学生二等奖学金', '该生是一个活泼开朗、乐于助人和认真好学的一个人，经常在课余时间问同学问题以及帮助有需要的同学。在第一学期积极组织班级活动，开展了班级来到安吉第一次春游。她积极参加校级运动会，并且获得了跳高女子组第四名的成绩，为学院争光。她还在微电影的创意比赛中获得一等奖的好成绩，以及在“美丽安吉”征文比赛中获得三等奖的成绩。', null);
INSERT INTO `schoolscholarship` VALUES ('88', '1150299303', '优秀学生一等奖学金', '本人大二学年，担任班里学习委员，学习方面，认真刻苦；工作方面，积极负责；思想方面，积极向上，乐于为大众做贡献；生活方面，勤俭节约，作息习惯良好，不打扰室友休息；竞赛方面，获得第八届蓝桥杯浙江省赛C/C++程序设计大学B组三等奖三等奖、浙江省第十四届大学生程序设计竞赛二等奖。特此申请优秀学生一等奖学金，望批准。', null);
INSERT INTO `schoolscholarship` VALUES ('89', '1150299063', '优秀学生一等奖学金', '该生在各个方面的表现优异，思想方面，遵纪守法，积极进取；在学习上，努力刻苦，积极配合老师工作，按时完成作业，不旷课，取得了优异的成绩；在班级及社团工作方面，作为班级组织委员及信息学院中研会副会长，积极为同学们服务，认真组织社团和班级活动，配合辅导老师的工作，真心实意为同学服务。', null);
INSERT INTO `schoolscholarship` VALUES ('90', '1150299066', '优秀学生二等奖学金', '该生在学习上，成绩优异，在数媒专业位列前茅，绩点排名第6，综测排名第7。在思想上，尊敬师长，团结同学，热爱祖国，遵守校规，积极乐观,并在这学期被评为优秀团员。在生活上，该生热于参加学校组织的活动，在运动会上，自荐参加红旗舞；加入学生会，对组织负责，热心做好每一件事；在假期，积极参加暑期社会实践活动。作为一个贫困生，为了减轻家庭负担，该生勤工助学，努力学习，自强不息。', null);
INSERT INTO `schoolscholarship` VALUES ('91', '1150299112', '优秀学生二等奖学金', '该学生身心健康，品德良好，刻苦学习，在学业上取得了一定的成绩。对待生活他乐观积极向上，与队友在球赛场为专业争光；对待学习他严谨认真，积极参加各类学科竞赛（数学建模比赛等）；对待他人他友善和睦，积极参加志愿者活动为他人服务。', null);
INSERT INTO `schoolscholarship` VALUES ('92', '1150299290', '优秀学生三等奖学金', '该学生在校期间思想表现优秀，在本学期开学成功被选为入党发展对象，并积极参加各种提升自身能力的活动和讲座。学习方面除了认真完成教师布置的作业以外还能积极学习当前软件工程专业的前端技术，在上一年的学业中没有一门功课挂科，并取得专业前20的优秀成绩。生活方面该生勤俭节约，认真刻苦，并且时刻保持着良好的自我形象和个人卫生。', null);
INSERT INTO `schoolscholarship` VALUES ('93', '1160299185', '优秀学生二等奖学金', '该生勤奋向上，踏实进取，学习刻苦认真，取得了良好成绩，主要表现如下：在本学年中中表现突出，成绩显著，被评为“优秀团员”，在英语四六级一次性顺利通过，在生活上，宽于待人，尊敬师长，并在平时积极和同学交流沟通、融洽和睦地相处,在寝室里,能和室友和睦相处。在思想方面，仍然一如既往地向党组织靠拢。', null);
INSERT INTO `schoolscholarship` VALUES ('94', '1150299097', '优秀学生三等奖学金', '本人在这一学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，成绩优异，学习成绩靠前；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在文体活动方面，热心参与班级风采展示。进入大学两年以来，我始终严于律己，向着既定目标不断努力奋斗，故提出奖学金的申请。', null);
INSERT INTO `schoolscholarship` VALUES ('95', '1150299082', '优秀学生一等奖学金', '我在学习期间各方面表现优异。思想方面，向党组织靠拢，不忘党训，成为一名预备党员；生活方面，我始终持续着乐观生活态度；工作方面，用心认真，担任班级团支书，不忘对同学学习的带动和帮忙；学习方面，始终将学习放在首位，学习成绩名列前茅，通过大学英语四六级和计算机二级等，曾获得二等校二等奖学金和三好学生荣誉。\r\n　　我特向学校申请省政府奖学金，这是对我学习成绩、工作潜力、综合素质的肯定。', null);
INSERT INTO `schoolscholarship` VALUES ('96', '1160299005', '文体优秀奖', '该生自入学以来，一直遵守学校的各项规章制度，具有良好的思想道德品质。有强烈的集体荣誉感和工作责任心，坚持实事求事的原则。 该生思想端正，能吃苦耐劳，注重个人道德修养，养成良好的生活作风，乐于助人。在校期间，该生一直勤奋学习，刻苦钻研，将理论与实践相结合起来，由于有良好的学习作风和明确的学习目标，并在文艺和体育上获得了不小的荣誉，积极参加了校运动会，并且她带领的团队夺得校园心理剧大赛一等奖。', null);
INSERT INTO `schoolscholarship` VALUES ('97', '1160610060', '外语成绩优秀奖', '该生在校期间，表现良好，学习态度端正，没有出现过迟到旷课早退的现象。学习成绩也较为良好，外语成绩尤为突出。积极参加学生工作，在转专业前班级担任了一个学期的学习委员，并且在翠竹自管会中担任了学习部部长一职，参与组织了翠趣竹音，知行堂等一系列活动。生活习惯良好，所住寝室评得四好四无寝室。思想端正，在第二个学期成功被评为入党积极分子。', null);
INSERT INTO `schoolscholarship` VALUES ('98', '1160299136', '优秀学生一等奖学金', '在2016-2017学年，该生在思想、学习、生活等各方面表现优异。政治思想上，热爱中国共产党，拥护党的方针、政策和路线；学习上，认真努力，有较强的自学能力和自我管理能力，专业学习主动性强，积极参加各项学科竞赛，学业成绩名列前茅；生活上，吃苦耐劳，朴实大方，认真对待工作，积极参加社会实践活动，与同学相处融洽。', null);
INSERT INTO `schoolscholarship` VALUES ('99', '1150299363', '优秀学生一等奖学金', '在思想上，该同学保持积极向上的思想，热爱党热爱人民，乐于帮助同学和为人民服务，并且已经成为了一名光荣的预备党员。在学习上，该同学十分刻苦，上课认真听讲，下课积极实践创新，多次参加学科竞赛并且取得不错的成绩。在工作方面，该同学担任软件工程专业党支委，积极辅助老师完成党建工作。在生活方面，该同学勤俭节约，时刻保持良好的言谈举止，生活作风优良。', null);
INSERT INTO `schoolscholarship` VALUES ('100', '1150299040', '优秀学生一等奖学金', '学期间，我在各方面表现优异。思想方面，成为一名预备党员;生活方面，我始终持续着乐观生活态度;工作方面，担任班级组织委员，关心同学;学习方面，始终将学习放在首位;社会实践方面：参加暑期社会实践活动，参加多种志愿者活动，更好的了解社会，锻炼自己。因此，我特向学校申请国家奖学金，这是对我学习成绩、综合素质的肯定。如果学院能够给予我这份荣誉，将是对我一种莫大的鼓励，必将激励我今后更加努力，做得更出色！', null);
INSERT INTO `schoolscholarship` VALUES ('101', '1150299291', '优良学风奖', '该生在校期间表现优秀，思想上积极进取，积极入党，大一就积极上交了入党申请书，如今成为了一名优秀的入党积极分子。学习上刻苦努力，成绩优秀，工作中认真负责，积极完成班级任务。在生活中与同学和睦相处，关系融洽，主动为学习有困难的同学解决问题，并在课余时间参加志愿者活动。', null);
INSERT INTO `schoolscholarship` VALUES ('102', '1150299282', '优秀学生三等奖学金', '在思想上，积极向上，不断提高自身政治素养；学习上，成绩良好，学习努力认真；此外积极参加各类学科竞赛，并取得优秀的成绩；', null);
INSERT INTO `schoolscholarship` VALUES ('103', '1150299049', '优秀学生一等奖学金', '本人在2016-2017学年中，在思想方面，遵纪守法，积极进取，完成了党校学习，成为一名入党积极分子；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，成绩优异，学习成绩靠前，自主学习能力强；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在社会实践方面，乐于参加志愿服务活动，提高自己书本外的能力。因此，申请奖学金，望批准。', null);
INSERT INTO `schoolscholarship` VALUES ('104', '1150299254', '优秀学生三等奖学金', '于大二学年担任班级团支部书记，院学生会记者团副部长，疯狂演说营会长，校辩论队主力成员。学业方面，学分绩点专业排名第八，综合测评总分专业排名第一。组织工作方面，乐于助人，工作认真负责。在班级中积极组织班级团日活动，并带领班级获校十佳团日活动。积极参加院校甚至省级组织的各项比赛活动，获校辩论赛冠军， 2017年浙江省大学生禁毒防艾辩论赛二等奖，校英文微电影大赛三等奖，校英语演讲比赛二等奖。', null);
INSERT INTO `schoolscholarship` VALUES ('105', '1150299162', '优秀学生三等奖学金', '1.担任院学生会宣传部副部长为学院各类活动设计海报\r\n2.积极参加学院举行的各类竞赛和活动\r\n3.学习成绩提升明显', null);
INSERT INTO `schoolscholarship` VALUES ('106', '1160299298', '优秀学生三等奖学金', '该生在大一为信息1611班班长，且考核优秀。所在寝室与班级氛围良好，班级曾获安全教育主题班会优秀奖，寝室月卫生检查多次优秀。大一被列为入党积极分子并获得党校结业证书，于校运动会上活动100m第六，200m第三的优秀成绩。积极参加讲座；并于大一学年获得优秀团员、优秀标兵荣誉；参加浙江科技学院英文电影配音比赛，获得三等奖。该生曾从事校企合作实践活动，担任“安吉智慧教育云课堂助理教师”并获得荣誉证书。', null);
INSERT INTO `schoolscholarship` VALUES ('107', '1150580033', '优秀学生一等奖学金', '该生在校期间，在思想上，紧跟习大大的脚步；在学习上，把学习当作自己的第一任务，从来不肯放松一丝一毫，认真完成老师上课布置的任务，在课下好好复习；热爱集体，遵纪守法，热爱集体，尊敬老师，团结同学，积极参加各种社团活动和志愿者活动；追求自我发展，追求创新，申报了新苗，立项成功，申请了发明型专利。', null);
INSERT INTO `schoolscholarship` VALUES ('108', '1150299260', '文体优秀奖', '《学生体质健康标准》测试成绩达到优秀', null);
INSERT INTO `schoolscholarship` VALUES ('109', '1160299152', '优秀学生二等奖学金', '该生在2016-2017学年内，思想积极上进，学习努力，学分绩点加权学业成绩为84.48，成绩优秀，位于学院前20%；积极参加社会实践和志愿者活动，品德素质，考核中思想表现项、文明守纪项、社会责任项评为优秀；社会工作能力较强，在志愿者服务参与方面有较好表现；综合表现优秀。', null);
INSERT INTO `schoolscholarship` VALUES ('110', '1160299130', '外语成绩优秀奖', '该生在过去一年以来，严格遵守校纪校规，尊敬师长。\r\n  在思想修养上，热爱祖国，热爱人民，坚决拥护共产党领导和社会主义制度，遵纪守法，爱护公共财产，团结同学，乐于助人。\r\n  在生活上，追求简单平凡的生活，并养成良好的生活习惯和正派的作风。\r\n  在学习上，严格要求自己，基本上牢固的掌握了一些专业知识。\r\n  在工作上，认真负责，有较好的组织能力，责任心强。', null);
INSERT INTO `schoolscholarship` VALUES ('111', '1150299255', '学业优秀三等奖学金', '本人在2016到2017学年遵纪守法，积极进取，阳光向上，在学习上学习刻苦，积极配合老师工作，按时完成作业，不旷课，成绩优异，学习成绩专业靠前。顺利通过英语四级考试，同时也在学习上为同学们做出表率。在班级工作方面积极配合班委工作，实心实意为同学们服务。在思想上保持积极进步，拥护党和国家，遵纪守法。努力做一个合格的国家接班人。', null);
INSERT INTO `schoolscholarship` VALUES ('112', '1150299098', '优良学风奖', '在2016-2017学年中，在思想方面遵纪守法积极进取。在学习方面，勤奋刻苦，认真按时完成作业，不旷课不早退。在班级工作方面，努力配合班委工作。同时积极参加社团活动，奉献自我锻炼自我。在文体活动方面，积极参与班级风采展示。在社会实践方面，乐于参加志愿服务活动，主动寻找兼职，提高自己书本外的能力。', null);
INSERT INTO `schoolscholarship` VALUES ('113', '1160299059', '优秀学生二等奖学金', '在2016-2017学年，该生在思想、学习、生活等各方面均表现优异。政治思想上热爱共产党；学习上认真刻苦，专业学习主动性强，学业成绩名列前茅；生活上，吃苦耐劳，朴实大方，认真对待工作，与同学相处融洽。综合各方面，该生均符合优秀学生二等奖学金申请条件，现推荐其申请优秀学生二等奖学金。', null);
INSERT INTO `schoolscholarship` VALUES ('114', '1160299299', '优秀学生二等奖学金', '该生自入校以来能严格遵守学院的各项规章制度，严于律己，尊敬师长。她积极投身于班级、学校的社交活动，从不同角度锻炼自己，使自己的组织、管理能力及团队合作精神得到很大的提高。思想上：她积极要求上进，不断提高政治素养 。学习上：她勤学苦练，刻苦钻研专业知识；努力进取，自主独立，不骄不躁。工作上：她能尽量做到一丝不苟，认真踏实，和同学相处的十分融洽，积极参加学校的各项活动。', null);
INSERT INTO `schoolscholarship` VALUES ('115', '1160299006', '优秀学生二等奖学金', '该生自入校以来，能严格遵守学院的各项规章制度，严于律己，尊敬师长。生活节约简朴，积极和同学交流。课外，该生积极投身于各种社交活动，锻炼自己。思想上，该生积极要求上进，不断提高政治素养 。入校后该生就向党组织递交了入党申请书，定期向党组织汇报思想，处处以党员的标准来严格要求自己。学习上勤学苦练，工作上认真踏实。大学生活中，该生在各方面严格要求自己，努力使自己成为一名德、智、体全方面发展的优秀大学生。', null);
INSERT INTO `schoolscholarship` VALUES ('116', '1160580006', '优秀学生一等奖学金', '该学生在2016-2017学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，成绩优异，学习成绩靠前；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在文体活动方面，热心参与班级风采展示，积极展示自我风采。', null);
INSERT INTO `schoolscholarship` VALUES ('117', '1150299285', '优良学风奖', '在校期间思想端正，热爱祖国，诚实守信；在学习上，态度明确，勤奋刻苦，上课认真听讲，下课复习；在生活上，乐于助人，为人正直，积极向上', null);
INSERT INTO `schoolscholarship` VALUES ('118', '1160299351', '文体优秀奖', '该同学思想积极向上，作为入党积极分子，多次参与党校活动。学习较刻苦认真，参与校级活动并获得计算机设计大赛校赛二等奖，在体育方面也有良好的成绩。大一任职信息1612班的班长，恪尽职守，努力工作，处理好班级事务。寝室检查多次获得优秀，一直保持卫生整洁。此外当过新生志愿者，努力为同学服务。', null);
INSERT INTO `schoolscholarship` VALUES ('119', '1160299180', '外语成绩优秀奖', '该生担任班级里的生活委员，认真负责班级里的工作，积极为同学们服务，思想积极向上，热于帮助同学和老师。该生有良好的英语基础，积极参加英语学科类竞赛，比如全国大学英语竞赛，并在大学一年里通过了英语四级，英语六级。该生也积极参加学校内的讲座，在校作息规律，认真学习复习，积极参加锻炼，并在学业上取得了良好的成绩。在暑假，该生也积极参加社会实践，去相关单位实习。', null);
INSERT INTO `schoolscholarship` VALUES ('120', '1160299328', '优秀学生二等奖学金', '该生自入学以来一直严格要求自己，不断提升各方面能力。\r\n在学习上，该生在校努力上进，勤奋学习；在思想上，态度端正，积极乐观，认真学习党的知识，努力向党组织靠拢；在工作上，作为班级干部，积极配合校领导的工作，为班级建设出一份力；在生活中，勤俭节约，乐于助人，与同学相处融洽。\r\n在今后的日子里，该生将以更严格的标准来要求自己，向更好的自己前进。特此提出申请。', null);
INSERT INTO `schoolscholarship` VALUES ('121', '1160299329', '优良学风奖', '该生在思想方面积极响应学校号召加强对党知识的学习，并努力提高自身的素质。\r\n该生在学习方面积极参加各类竞赛，经常总结学习经验修改自己不足的学习方法，按时完成老师交代的任务。\r\n该生在生活方面努力从自身做起，做到洁身自好，不与人有冲突有矛盾，积极参加寝室卫生打扫工作，并尽自身最大努力去帮助有需要帮助的人。\r\n该生在工作方面能按时完成任务不拖拉不退缩，并能尽自己能力范围内去做一些课外活动。', null);
INSERT INTO `schoolscholarship` VALUES ('122', '1160299276', '优秀学生二等奖学金', '该学生在大一学年中，思想突出，被选为预备党员。学习认真，有远大的理想，并能将目标付诸于行动，能够坚定目标并持之以恒地努力，得到老师们的一致好评，他将学习融入生活，广泛地学习跨学科的知识，从他身上我们能看到学习对他而言独特的魅力。在日常工作中，他有强烈的责任感，能够协调组织的秩序，维护社会的公平公正。在生活中独立自主，性格温和，心胸宽广，与大家和谐相处。', null);
INSERT INTO `schoolscholarship` VALUES ('123', '1150299332', '优秀学生三等奖学金', '大二学年，担任软工152团支书，期间与其余班委共同帮助服务同学；除此之外也有参与志愿者服务，积极参加学校活动；学业方面，认真对待课程，较大一学年，学业成绩方面有一定程度的提升；在学科竞赛方面也有参加，在服务外包省赛获得了团体二等奖。', null);
INSERT INTO `schoolscholarship` VALUES ('124', '1150299309', '优良学风奖', '在过去的三年里我始终保持着积极乐观向上的心态，以高标准要求自己的同时，妥善处理好学习和日常生活工作两者之间的关系。并且在大一，大二的两年时间里成功通过了英语4.6级的考试。课余时间时常去图书馆学习丰富自己的学识，并在不影响学习的前提下找到了一份兼职来补贴生活费。在思想上努力提高自身素质， 热心服务同学。在学习上坚定信念，勇往直前。在工作上积极参加实践活动，不断提高创新精神。', null);
INSERT INTO `schoolscholarship` VALUES ('125', '1160299189', '优秀学生三等奖学金', '此生在校表现良好，学习认真遵纪守法，他工作认真负责，能按时完成老师布置的任务，并能帮助同班同学完成他们的任务，同学有困难会无私的帮助他们看到老师会主动问好，对待同学很和善。在学习上他遇到困难是都会自己先专研在实在不会的情况下他会积极向老师求助，并积累经验争取下次出现同样问题时能自己解决。在寝室里他能按时就寝不扰乱寝室纪律与同寝室成员和睦相处，在寝室里互帮互助一同进步', null);
INSERT INTO `schoolscholarship` VALUES ('126', '1160299260', '优良学风奖', '该生在浙江科技学院学习期间思想态度端正，无不良行为，积极帮助班级体。在学习方面，认真努力，在完成专业课的内容，还会阅读其他的书籍。在生活上，勤俭节约，热爱劳动，卫生良好，积极帮助同学，热爱锻炼，身体健康。对待师长很有礼貌，交代的任务认真完成，从不拖沓。是一个品学兼优的好学生。', null);
INSERT INTO `schoolscholarship` VALUES ('127', '1150299005', '优秀学生二等奖学金', '1.大二专业内综测排名18，获得英语四六级证书，善于利用学校图书馆资源，热爱学习。\r\n2.在班级中担任学习委员一职务，成为老师和同学沟通的桥梁，班级工作到位，能热心帮助同学，尽责管理班级事务；大二在院心理联合会中担任策划部部长，能积极参与策划校内活动，现任院心理联合会副会长。\r\n3.大二被评为入党积极分子，参与党校学习，积极参加党校教育活动，获优秀团员称号。\r\n4.热心社会公益事业，参与无偿献血。', null);
INSERT INTO `schoolscholarship` VALUES ('128', '1160299154', '学业优秀三等奖学金', '该生在校期间思想端正，有责任心，学习积极认真，能够按时有效完成学业任务，在课余时间能够兼顾学习与娱乐活动。在班级工作中，尽管未担任职务，也能够在需要时帮助班委完成工作。在学习上遇到问题，积极与同学讨论，互相帮助。在生活中，能够及时打扫寝室卫生，保持寝室的卫生整洁。与同学相处友好，相处融洽。', null);
INSERT INTO `schoolscholarship` VALUES ('129', '1160299093', '优秀学生二等奖学金', '该生在校期间表现良好，学习上，认真努力，积极进取，有很好的专业素养；生活上，乐观向上，团结同学，乐于助人，积极的参加班级的集体活动，有很好的团队意识；思想上，积极正确，拥护党的政策方针，是一名优秀的大学生。', null);
INSERT INTO `schoolscholarship` VALUES ('130', '1160299095', '优秀学生二等奖学金', '该生在校期间具有良好的思想道德品质，各方面表现优秀，有强烈的集体荣誉感和工作责任心，坚持实事求是的原则，养成良好的生活作风，乐于助人，关心国家大事。勤奋学习，刻苦钻研，通过系统地学习掌握了扎实的基础知识。该生积极参加校开展的各项文体活动，参加社会实践，继承和发扬了艰苦奋斗的精神，丰富了课余生活，使自己在各方面都得到了相应的提高。', null);
INSERT INTO `schoolscholarship` VALUES ('131', '1160299213', '优秀学生二等奖学金', '该生在大一这一学年中，思想方面表现良好，积极参与学校组织的活动；学习方面认真刻苦，老师布置作业积极完成。学年总绩点名列段前20％；积极报名学校内的讲座活动；认真配合班级活动。顺利通过英语四级，积极参加英语四级口语。生活中，与他人相处良好，碰到矛盾及时解决，尊敬师长。寝室内务也整理的不错。', null);
INSERT INTO `schoolscholarship` VALUES ('132', '1150299230', '优良学风奖', '该生在大二学年，努力学习，积极参加科技创新活动，获得浙江省服务外包竞赛一等奖，中国大学生计算机设计大赛二等奖，并热爱科技创新项目，参加申报两项新苗项目，均立项。成绩较优秀，综合测评名列前茅。', null);
INSERT INTO `schoolscholarship` VALUES ('133', '1150299155', '优秀学生二等奖学金', '本人工作上积极配合党员和学生干部。生活上，待人热情，乐于帮助同学，与他人相处融洽。学习上，严格要求自己，积极向上，努力学习本专业知识与技能，不断提高自身科学文化素养。', null);
INSERT INTO `schoolscholarship` VALUES ('134', '1160299034', '优秀学生二等奖学金', '该生在大一期间担任班长，多次组织班级活动，团结同学，恭敬师长，所在班级在团日活动中获奖，且在学期末被评为优良学风班。曾被评选为优秀学生干部，优秀班干部，参加团校并结业，生活习惯好，所在寝室卫生情况优秀。热爱学习，刻苦认真，学分绩点在前20％，多次参加学校学术报告，参加汉语言能力考试通过并获得证书，军训时所在集体被评为军训先进集体。', null);
INSERT INTO `schoolscholarship` VALUES ('135', '1150299347', '优秀学生一等奖学金', '该学生在校期间思想积极向上，大一期间成绩上一直名列前茅，曾获得“省政府奖学金”，“校三好生”等荣誉。该学生在学习上遇到不懂的问题都能积极提问，善于钻研难题，；在工作上，该学生积极配合班长组织好班级活动，并且多次参与志愿活动，表现突出；在生活上，该学生能吃苦耐劳，有崇高的理想和伟大的目标，注重个人道德修养，养成良好的生活作风，乐于助人。', null);
INSERT INTO `schoolscholarship` VALUES ('136', '5151594017', '优秀学生二等奖学金', '该生在大二学年学习认真，工作努力，为人亲和。在专业及选修学科的学习都非常认真努力，学习成绩好，做事认真，参加学校团代会，为学校团日活动作出贡献。并参与多项学科竞赛，获得蓝桥杯省赛二等奖，参加浙江省程序设计竞赛，担任ACM协会会长。生活朴实，能够独立处理日常，并帮助同学完成力所能及的事，并参与献血活动，为需要获得帮助的人提供帮助。', null);
INSERT INTO `schoolscholarship` VALUES ('137', '1160299255', '优良学风奖', '该同学大一思想端正，积极学习，并且积极参与校内党的活动，是一名优秀的入党积极分子。在学校组织工作积极活跃，如参加书院自管会，为学校书院的建设做出了极大的贡献。在兴趣爱好方面，积极参与课外社团活动。生活自律，未出现违纪记录，并且寝室卫生方面保持优秀，与同学能够相处友善。', null);
INSERT INTO `schoolscholarship` VALUES ('138', '5160491047', '文体优秀奖', '该同学大一思想端正，积极学习。大一上学期修读化工与制药，后通过转专业测试进入信息与电子工程学院修读物联网工程。在学校组织工作积极活跃，如参加和山之声广播电台，为学校传递新鲜的新闻及正能量。还于大学生KAB创业俱乐部工作，获得优秀部员。在兴趣爱好方面，积极参加运动会，担任学校主持工作。生活自律，未出现违纪记录，与同学相处友善。', null);
INSERT INTO `schoolscholarship` VALUES ('139', '1150299283', '学业优秀二等奖学金', '本人在2016-2017学年内，学业成绩为82.3，绩点名次为13/83，平均学分绩点在同年级前20%，品德素质里、学习态度项、社会责任评为优秀，体测成绩89.8分，无任何课程不及格记录，其他各项表现良好。', null);
INSERT INTO `schoolscholarship` VALUES ('140', '1160692012', '优秀学生二等奖学金', '该生平时学习生活中，成绩优秀，尊师敬长，团结同学，积极乐观，生活节俭朴素。思想端正，行为规范，目前是入党积极分子，坚决拥护国家拥护党组织。家中父母皆是农民，为家中唯一经济来源，父母收入微薄且不稳定。家中有两位老人皆无劳动力无经济来源。08年地震灾害导致房屋受损重修房屋使家中负债及老人生病的高昂医药费皆大大加重了家中的经济负担，入远不敷出。', null);
INSERT INTO `schoolscholarship` VALUES ('141', '1160694036', '优秀学生一等奖学金', '该生学习态度认真，勤奋刻苦。在大一这一年，积极参加学校组织的各类文体活动，如：校运动会广播操，积极参加学科竞赛，如：大学生英语竞赛，写作竞赛，均获得奖项，同时还通过了英语四六级，并且分数较高。积极参加学校社团和组织，工作踏实认真，在学校里遵守纪律，无违纪行为，尊敬老师、团结同学。', null);
INSERT INTO `schoolscholarship` VALUES ('142', '1150299380', '优秀学生二等奖学金', '该生在校期间，思想积极先进。学习上刻苦努力，成绩一直名列前茅，通过了英语四级，计算机二级，并获得了汉语能力测试及普通话等级考试的证书，她平时乐于钻研，常常阅读课外书籍。工作上，她认真负责，从大一开始加入校志协，曾多次参加志愿活动，服务他人，历练自身。生活方面，她拥有积极向上的生活态度，尊敬师长，并且常常帮助身边的同学，拥有良好的人际关系。相信她将来也会努力提升自我，成为对社会有贡献的栋梁。', null);
INSERT INTO `schoolscholarship` VALUES ('143', '1160299245', '优良学风奖', '该同学在大一学年期间思想端正，抱着积极的学习态度，认真学习，努力提升自身的学术修养，在日常生活中，与同学和谐相处，共同进步，共同与班级同学打造班级自强向上，努力拼搏的学习氛围，而且课外之余积极主动配合学校开展的各项活动，并能够投身参与其中，所以，学习课外表现都很优秀', null);
INSERT INTO `schoolscholarship` VALUES ('144', '5161510006', '学业优秀二等奖学金', '该生虽然家境贫寒，但是从小立志上大学，做一个对社会有贡献的人。在过去的一年里，他很好地去实践了自己梦想，不仅思想品德优良，而且努力学习，刻苦钻研，在学业上取得了不错的成绩。课余时间，他也积极参加社团活动，不但学到了不少知识，更重要的是提升了社会交往能力。此外，在暑假期间，他积极参加社会实践，去公司实习，不仅锻炼了自己的职业能力，还增长了社会见识。相信在今后的学习工作中，他一定会有更出色的表现。', null);
INSERT INTO `schoolscholarship` VALUES ('145', '1160299035', '文体优秀奖', '2016年大一开学以来担任浙江科技学院（安吉校区）秀竹书院自管会主任一职，并组织很多大型活动，如诚信彩虹跑、阳光青年讲坛、秀竹书院烹饪课堂、世界艾滋病日系列活动、阳光青年训练营等。在诚信宣誓活动中作为学生代表签署大学生诚信承诺书。在运动会中参加比赛和广播操表演。作为信息与电子工程学院代表参加了2016年全校团代会。大二专业分流以来担任班级班长一职。', null);
INSERT INTO `schoolscholarship` VALUES ('146', '1160299122', '优秀学生三等奖学金', '该生在校期间在思想上努力提高自身素质， 热心服务同学，生活上，热爱生活，独立自主，在寝室勤于打扫，其宿舍获得“优秀寝室”称号，学习上，坚定信念，勇往直前，其绩点成绩位于全专业前20%，工作上，积极参加校内举办的活动，不断提高创新精神，在新年晚会活动中受到表彰', null);
INSERT INTO `schoolscholarship` VALUES ('147', '1160299047', '优良学风奖', '该生入学以来一直从各方面严格要求自己，积极向党组织靠拢，勤奋学习，刻苦钻研，生活节俭，工作认真，努力使自己成为一名德智体全面发展的优秀大学生。该生从进校以来学习一直未松懈，认真钻研专业知识，刻苦学习,乐于帮助其他同学，取长补短，达到共同进步的目的。该生积极与室友、同班同学及兄弟班级的同学搞好关系，与同学关系融洽，为人友好。', null);
INSERT INTO `schoolscholarship` VALUES ('148', '1160299036', '优良学风奖', '该学生热爱生活，乐观开朗。在校品德优秀，尊敬师长、团结同学，学习认真、刻苦，有较强的进取精神。能自觉遵守学校纪律，上课认真听讲，积极开动脑筋，作业按时完成。在团体工作中，能够与他人合作，团结协作，一起完成团体工作项目。在面对各种困难时，能够坚持下去，坦然面对各种困难，尽最大努力解决。', null);
INSERT INTO `schoolscholarship` VALUES ('149', '1160299031', '优秀学生三等奖学金', '该生自进入浙江科技学院以来，表现优异，思想乐观，积极向上，有正确的人生观，价值观和世界观。学习上，目标明确，态度端正，勤奋好学，成绩较优异，学业绩点在专业前30%；工作上，虽没担任班委，但是积极配合班委工作，并帮助班委完成工作；生活上，与寝室各个同学都相处很好，并经常打扫寝室卫生，提高寝室生活品质，还在寒假期间进入工厂打工，减轻家庭负担。', null);
INSERT INTO `schoolscholarship` VALUES ('150', '1160299284', '优秀学生三等奖学金', '该生在校期间，思想端正，热爱国家，热爱学校，作为入党积极分子，给其他同学起了个带头作用。在学习方面，在上课前预习，下课后不懂得地方问老师，回寝室后，将当天所学的知识消化掉。这确保了他在期末考试中没有一门课是不及格的。在工作方面，该同学大一期间加入了学生会，在此期间一直努力工作，在最后的总结中，获得了优秀干事的称号。在生活方面，与同学们和睦相处。', null);
INSERT INTO `schoolscholarship` VALUES ('151', '1160299011', '文体优秀奖', '该生在文体活动中表现不错，在军训中坚持到最后，尽管有些小难受，但他都能克服。该生思想活跃，有创新的想法。在年轻的季节该生甘愿吃苦受累，只愿通过他自己富有激情、积极主动的努力实现自身价值。该生也是一个追求完美的人，他知道世上没有十全十美的人存在，但可以去追求，去不断的向它靠拢，每一个人或多或少都有缺点，该生把这些缺点比作一个无形的洞，洞是可以填补的。', null);
INSERT INTO `schoolscholarship` VALUES ('152', '1160299092', '文体优秀奖', '该生 在校期间以严谨的学习，热情的工作，积极参加学校活动，德智体美劳全面发展，孜孜不倦，刻苦钻研，态度端正，掌握了一些专业知识，生活上，有良好的生活习惯，为人热情大方，诚实守信乐于助人，积极参加各种学校组织的体育活动，', null);
INSERT INTO `schoolscholarship` VALUES ('153', '1160492025', '优良学风奖', '该生在大学第一年学习刻苦，积极参与学校各类活动，严格遵守学校规章制度，从不缺席任何课程课业，按时上课，不迟到，不早退，有明确的学习目标，并愿意为之努力。准时完成各项课程作业及任务。尊敬师长，和同学相处融洽，互帮互助。\r\n   诚实守信，多次参加各类社团活动，努力做各种技能尝试，如海报推送等。踏实努力，富有实干精神。', null);
INSERT INTO `schoolscholarship` VALUES ('154', '1160299062', '优良学风奖', '该生在大学的短短几年间，由初出茅庐的高中生成长为如今一名自信，自立，积极，进取，懂得感恩的新知识青年。在大学里该生的思想在不断成长进步，无论在学习上还是生活上，时刻以中国共产党的思想来督促自己，努力改造自己的主观世界，树立科学的世界观、人生观和价值观，对社会做出自己应有的贡献，不遗余力地奉献自己的智慧和汗水。', null);
INSERT INTO `schoolscholarship` VALUES ('155', '1160299045', '优秀学生一等奖学金', '该生在各方面表现优异。生活方面，乐观积极，与人为善，广交好友。参加轮滑社，主动担任教练，组织社团活动。学习方面成绩名列前茅。积极与老师讨论问题。顺利通过四级六级。参加ACM社，一直坚持着编程训练。', null);
INSERT INTO `schoolscholarship` VALUES ('156', '1160299058', '学业优秀三等奖学金', '该生在校期间在思想上，诚实守信，道德品质优良，积极向上，作风正派，严以律己。学习上，该生勤奋踏实，刻苦钻研，作业按时完成，不逃课，不旷课，不迟到，不早退。有明确的学习目标，并付诸于行动，充分利用图书馆资源，阅读其他学科的相关书籍、报刊、杂志，学习成绩都可以达到良好。生活上，该生性格开朗，朴素节俭，在寝室，作为寝室成员，能做好宿舍的卫生工作，杜绝一切不良的生活作风，主动关心同学，帮助同学解决问题。', null);
INSERT INTO `schoolscholarship` VALUES ('157', '1150299070', '优秀学生二等奖学金', '该生成绩优异，综合测评成绩名列前茅，并且积极参加科技竞赛，在浙江省大学生服务外包创新创业大赛、全国大学生服务外包创新创业大赛中均获得了一等奖的优异成绩。在思想上，该生持续用心进步，以身作则，学习领会党的理论思想并运用到实践中。在生活中，该生乐于帮助专业同学，为同学营造良好的学习氛围。', null);
INSERT INTO `schoolscholarship` VALUES ('158', '1150299250', '优秀学生三等奖学金', '本人学习认真，工作负责，积极参加学校组织的活动，同时担任班长和院学生会办公室副部长，积极参加学科竞赛，获浙江省服务外包二等奖', null);
INSERT INTO `schoolscholarship` VALUES ('159', '1150299033', '外语成绩优秀奖', '　我是信息学院软件工程15级的学生。在过去的一学年里我始终保持着积极乐观向上的心态，以高标准要求自己的同时，妥善处理好学习和工作两者之间的关系。主要表现为学业成绩在全专业前50%，并且在四六级考试中取得了优异成绩。', null);
INSERT INTO `schoolscholarship` VALUES ('160', '1150299034', '外语成绩优秀奖', '该生就像一颗耀眼的星星，看着她俨然一位小老师，热心地帮助每一位需要帮助的同学;她成绩优秀，仍孜孜不倦地努力学习;她默默地为班级付出自己的爱，老师们真心为她感到骄傲!她的可贵之处在于平和、宠辱不惊、淡薄名利、宽厚待人;绝不随声附和，决不人云亦云，同龄人中难得的质疑精神，在她的身上得以展现。', null);
INSERT INTO `schoolscholarship` VALUES ('161', '1150299174', '学业优秀一等奖学金', '我在思想方面，遵纪守法，积极进取；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，成绩优异，学习成绩靠前；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在文体活动方面，热心参与班级风采展示，积极展示自我风采；在社会实践方面，乐于参加志愿服务活动，主动承接兼职，提高自己书本外的能力。因此，申请学年奖学金，望批准', null);
INSERT INTO `schoolscholarship` VALUES ('162', '1150299388', '优秀学生一等奖学金', '热爱学习，与人友善，乐于助人。在校期间积极参加各类公益实践、志愿者、运动会等活动。大二时候成为一名光荣的入党积极分子，课堂之外也在实验室跟着专业老师学习,掌握了更多专业技能，并作为第一负责人主持申报立项省级项目新苗，此项目现在也在按计划持续进行中。', null);
INSERT INTO `schoolscholarship` VALUES ('163', '1150299336', '优秀学生三等奖学金', '信息学院16-17年体育部部长，浙江科技学院2016年度群众体育活动先进个人，2016年省大学生足球高校组联赛二等奖。', null);
INSERT INTO `schoolscholarship` VALUES ('164', '1150299175', '学业优秀三等奖学金', '本人学习成绩较为稳定，能够积极要求上进。同时能够乐于助人，积极参加学校和学院举办的活动，与人友善，曾无偿献血。另外能够经常反省自己，改正自己的缺点不足之处，尊敬师长，团结同学，有团队意识和合作精神，积极投身社会工作。', null);
INSERT INTO `schoolscholarship` VALUES ('165', '1150299035', '优秀学生三等奖学金', '平时努力学习认真刻苦，利用好图书馆资源和环境还有实验室资源，增加见识以及提高专业能力，同时还积极参加校内举办的社团活动，主要参加一些志愿者活动，在帮助他人中收获人生价值，使生活变得更有意义。', null);
INSERT INTO `schoolscholarship` VALUES ('166', '5151591008', '优秀学生三等奖学金', '学习认真勤奋，绩点在同专业位列前面；在校表现优秀，积极参加集体活动；加入信息社联，参与社联活动，如辩论赛，社团文化节开幕式等；与人相处友好，与同学相处融洽；在校参加勤工俭学，工作认真主动；第二学期参加“蓝桥杯”比赛，获得参与奖；暑期在浙江我才网络有限公司实习2个月，获得实习证明；', null);
INSERT INTO `schoolscholarship` VALUES ('167', '1150299221', '学业优秀三等奖学金', '我大一学习不太好，成绩在中等左右，全学院排到了两百名左右。到了大二，我觉得我不应该这么碌碌无为下去。所以我大二进了院学生会担任副部长，并在大二一年的学习中，认真听讲，努力学习，做好每一门工课，协调好学习和生活。这次有幸能够获得这个学业优秀三等奖，也是对我这一年努力的肯定，更加激励我大三的学习和工作。', null);
INSERT INTO `schoolscholarship` VALUES ('168', '1150299134', '优秀学生一等奖学金', '现担任数媒学生第一党支部支委，信息学院分团委学生会副主席兼数字媒体技术151班班长。大二期间，获得优秀团干部的称号，作为班长，为班级申请到了校十佳团支部的荣誉，作为学生会副主席，自上任以来，在老师和学长学姐的指导和帮助下，在广大同学的支持下，我积极配合主席开展学院内的工作，努力保质的完成主席分配的各种任务。作为一名在校学生，积极参加各类学科竞赛，浙江省多媒体竞赛，浙江省电子商务大赛。', null);
INSERT INTO `schoolscholarship` VALUES ('169', '1150299051', '优秀学生二等奖学金', '从入学以来，我一直从各方面严格要求自己，积极向党组织靠拢，勤奋学习，刻苦钻研，生活节俭，工作认真，努力使自己成为一名德智体全面发展的优秀大学生。在校院领导老师的辛勤教育指导下，我明确了自己人生发展的目标，坚定了理想和信念，激励自己不断向高素质人才靠拢，并坚持不懈地为之努力奋斗。', null);
INSERT INTO `schoolscholarship` VALUES ('170', '1150299140', '文体优秀奖', '大一学年取得校二等奖学金及三好学生，大二学年在各类比赛中获奖并且得到单项奖学金，担任学生会外联部部长', null);
INSERT INTO `schoolscholarship` VALUES ('171', '1150299184', '优良学风奖', '2009.09――2012.06 郯城县新建中学 班长\r\n2012.09――2015.06 郯城县第一中学\r\n2015.09――至今 浙江科技学院', null);

-- ----------------------------
-- Table structure for `tripleastudent`
-- ----------------------------
DROP TABLE IF EXISTS `tripleastudent`;
CREATE TABLE `tripleastudent` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(50) NOT NULL DEFAULT '',
  `reason` varchar(1000) DEFAULT NULL,
  `opinion` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tripleastudent
-- ----------------------------
INSERT INTO `tripleastudent` VALUES ('1', '1160299243', '该同学自入学一来始终把学习摆在第一位。在这个充满竞争的社会中，只有不断的充实自己，完善自己才能适应这个社会。该同学经常去图书馆看书，课下就去自习室自习，不断巩固自己新学到的知识。在思想政治方面，该同学积极向上，热爱祖国，热爱社会主义中国，热爱中国共产党，拥护中国共产党的领导。在生活方面，该同学坦诚乐观，乐于帮助身边的人。该同学现真心的向学校申请“三好学生”并希望能够获得。\r\n ', null);
INSERT INTO `tripleastudent` VALUES ('2', '1160492076', '该生始终保持积极向上的学习态度，努力提高自身的专业知识水平，最终取得了较好的成绩。还积极参加学校组织的活动，并在校园心理情景剧中获得了二等奖的好成绩。该生在思想上积极进取，和同学相处融洽，互爱互助，思想积极，品行高尚，热爱班级、学校，工作积极努力，热心为集体服务，遵守校规校纪、遵守社会公德和国家法律、法规。 讲文明，有礼貌，讲团结，有爱心， 积极参加各种体育活动。', null);
INSERT INTO `tripleastudent` VALUES ('5', '1160299261', '该生在2016-2017学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，成绩优异，学习成绩靠前；在班级工作方面，努力做好学委工作，协助老师和其他班委工作，真心实意为同学们服务；在社团方面，参与ACM协会，努力提升专业水平，并积极参与校级和省级比赛。因此，申请2016-2017学年三好学生，望批准。', null);
INSERT INTO `tripleastudent` VALUES ('6', '1160299270', '该生在校期间，在思想上，认真学习党的思想方针和工作路线，树立良好的人生观和道德观，积极向党组织靠拢，在第一年就申请加入中国共产党。在学习上，专业成绩在全学院也名列前茅，努力学习专业知识，积极参加学科竞赛，并获得奖项。在工作上，身为班级的团支书，协助班长管理班级，以先进班级作为的奋斗目标。', null);
INSERT INTO `tripleastudent` VALUES ('7', '1160299065', '该生保持积极乐观的心态，对自己有着较高的要求。该学生充分利用课余时间来提高自该学生的综合素养，在学院中名列前茅。并且在这一年里面参加了校内的勤工俭学，以减轻父母的负担和压力，有着较强的独立性。在班级上，该学生担任了班级的团支书，并且获得了学校优秀团干的荣誉，这一职位锻炼了该学生的能力。因此，该学生达到了申请本项奖学金的资格，特此申请。', null);
INSERT INTO `tripleastudent` VALUES ('8', '1150299049', '该生在2016-2017学年中，在思想方面，遵纪守法，积极进取，完成了党校学习，成为一名入党积极分子；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，成绩优异，学习成绩靠前；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在社会实践方面，乐于参加志愿服务活动。', null);
INSERT INTO `tripleastudent` VALUES ('9', '1150199147', '该生一直以来表现优秀，恪尽职守，严于律己。不仅在学习方面取得优秀成绩，而且积极参与各类活动，工作能力强。在大一结束的评优中获得学校优秀学生二等奖学金以及三好学生。在大一时成为入党积极分子并在大二下学期顺利成为预备党员。并且顺利通过大学英语六级考试。积极参加学校活动。并且积极投身学生会和班干部的竞选，乐于为这个学院奉献自己的一份力量。', null);
INSERT INTO `tripleastudent` VALUES ('10', '1160299188', '该生张钰恺。在大一时期，态度端正，积极向上。在校严格遵守校规，积极配合工作。尊重师长，乐于助人。上课无迟到旷课，上课认真听讲，课后认真按时完成作业，复习课程及深入思考。身心健康，热爱运动，积极参加活动和学科竞赛，并在浙江省大学生高等数学竞赛荣获一等奖。在此申请三好学生，希望领导批准。', null);
INSERT INTO `tripleastudent` VALUES ('11', '1150299068', '本人自从升入大学以来，时刻将学习放在首位，学习成绩名列前茅。工作方面，我担任班级的团支书，学院中研会的会长，用心参加各项活动，并取得的良好的成绩，被评为优秀学生干部、体育先进个人和二星级志愿者。特向学校申请三好学生，这是对我学习成绩、工作潜力、综合素质的肯定。如果学院能够给予我这份荣誉，将是对我一种莫大的鼓励，必将激励我今后更加努力，做得更出色，为社会作出更大的贡献！', null);
INSERT INTO `tripleastudent` VALUES ('12', '1160299023', '该生戴梁辉在2016-2017学年间，在思想方面，遵纪守法，积极进取，阳光向上；在学习上，勤奋刻苦，积极学习专业知识，认真按时完成作业，不旷课，不早退，成绩优异，经过自己的努力学习，顺利通过所选科目的考试，并取得绩点第9的成绩，除此之外，还积极参加学科竞赛，努力提高专业素养；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在生活中，该生朴素节俭﹑性格开朗，严以律己，宽以待人。', null);
INSERT INTO `tripleastudent` VALUES ('13', '1160299042', '在2016-2017学年中，该生在思想、学习、生活等各方面均表现优异。在思想方面，遵纪守法，积极进取，阳光向上；学习上，认真努力，有较强的自学能力和自我管理能力，专业学习主动性强，积极参加各项学科竞赛，学业成绩名列前茅；在班级工作方面，努力工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在文体活动方面，热心参与班级风采展示，积极展示自我风采。', null);
INSERT INTO `tripleastudent` VALUES ('14', '1160299045', '该生在各方面表现优异。生活方面，始终持续着乐观生活态度，与人为善，广交好友。坚持跑步健身。参加轮滑社，锻炼身体、放松娱乐的同时，主动担任教练，组织社团活动。学习方面，始终将学习放在首位，学习成绩名列前茅。积极与老师讨论问题。顺利通过四级六级。参加ACM社，一直坚持着编程训练。', null);
INSERT INTO `tripleastudent` VALUES ('15', '1160299178', '该生在大一学年各方面表现优秀。在学习上，该生一直将学习摆在首要位置，大一学年也取得了令人满意的成绩，平均绩点名列前茅，该生积极参加各项竞赛，同时也通过了四六级考试。在生活方面，该生用心参加各类学校活动，参加团组织活动，成为入党积极分子，获得了优秀团员的荣誉。在社会实践方面，该生也积极参加实习活动，工作态度认真，丰富了个人社会经验。因此特向学校申请三好学生，相信这是对其学习成绩、综合素质的肯定。', null);
INSERT INTO `tripleastudent` VALUES ('16', '1150299102', '学期间，该生在各方面表现优异。生活方面，该生始终持续着乐观生活态度，他坚信贫困是暂时的，有潜力改变生活；工作方面，该生用心认真，担任志愿者协会干事；学习方面，该生始终将学习放在首位，学习成绩排名靠前，通过大学英语四六级等；社会实践方面：该生用心参加社会实践活动，参与各种志愿活动，从而使自我更好的接触社会，了解社会，并得到锻炼，增加实践经验。文体方面：该生积极参加校运动会并取得名次。', null);
INSERT INTO `tripleastudent` VALUES ('17', '1150299119', '俞怡学习刻苦，学习成绩一直名列年级前茅，连续两年获得一等奖学金，省政府奖学金和三好学生的荣誉。课余时间，俞怡积极参加学院和学校组织的比赛，获得了校数模比赛的二等奖，校蓝桥杯的三等奖。思想上，俞怡要求进步，积极入党，在行为规范上能严格要求自己，入党动机端正，俞怡在大二下学期曾获得了优秀团员的荣誉。社会实践，俞怡积极参加志愿者活动，获得了一星级志愿者等荣誉。', null);
INSERT INTO `tripleastudent` VALUES ('18', '1160299311', '该生在校期间始终将学习放在首位，学习刻苦认真，担任课代表，尽心尽力为同学服务，积极配合老师工作。各科目测试均取得良好成绩，绩点排名第二，并获得浙江省高数竞赛二等奖。积极听取优秀教师的讲座，注重体育锻炼，主动参与学校运动会的方阵项目，全面提高了自身的综合素质。', null);
INSERT INTO `tripleastudent` VALUES ('20', '1150299286', '本人在学习上刻苦，积极配合老师工作，按时完成作业，不旷课，成绩优异。在找工作方面，担任学习委员，积极为同学们服务。在思想上保持积极进步。', null);
INSERT INTO `tripleastudent` VALUES ('21', '1150299389', '该生在校期间各方面表现优秀，思想方面，向党组织靠拢，不忘党训；生活方面，该生积极向上，乐观生活，也会不定期的加以锻炼，并且参加学院羽毛球比赛并获团体亚军；工作方面，该生用心认真，担任班级生活委员，关心同学生活并且与同学关系融洽，代表班级参加学院双代会；学习方面，该生时刻将学习放在第一位，努力刻苦，成绩在专业前30%，还常与同学讨论学习上的问题。', null);
INSERT INTO `tripleastudent` VALUES ('22', '1160299021', '该生在2016-2017学年中，学习努力刻苦，虽基础差，但经过努力成绩能在年级的百分之十五左右。工作认真负责，在班任学习委员，在校任校区学生会主席。任职期间产生积极的影响获得校“优秀学生干部”称号，在上学期成为入党积极分子。参加校内的勤工勤学为家中减负，也参加支教、迎新等志愿活动。他全方位发展自己，是一名优秀的学子。', null);
INSERT INTO `tripleastudent` VALUES ('23', '1150299072', '该同学品学兼优，综测排名在专业前列，担任学生会副部长，在学习和工作中表现较为突出。  这一年工作中认真负责，多次参加学院组织的活动，在同时也不忘学习。成绩方面获得省服务外包竞赛三等奖，各类校竞赛也取得不错的成绩该同学表示新的一年会更加努力在学习生活工作中，不辜负老师和同学们的期望。', null);
INSERT INTO `tripleastudent` VALUES ('24', '1150299344', '该同学在班级与组织中，认真负责，有较强的组织能力，乐意为同学服务，为班级建设作出自己的贡献。她为人正直，真诚，待人坦率，热情。人际关系融洽，积极参加各项活动。她是一位思想作风正派，为人热情大方，待人诚恳真诚的同学。该同学是一名立场坚定、思想正派的入党积极分子。我认为该同学已经基本符合评为三好学生的条件。', null);
INSERT INTO `tripleastudent` VALUES ('25', '1160299001', '该生殷龙女学习刻苦，并在期末测验中取得了优异的成绩；工作上态度认真负责，身为班级的副班长，对班级的管理值得同学们信任，因此深受任课老师和辅导员喜爱；生活中与同学相处融洽，欢声笑语不断。在课余时间，该生还参加了许多志愿者活动，为他人提供帮助。同时也不忘锻炼提升自己，参加了“新耀杯”羽毛球赛并获得了单打第一和团体第二的好成绩。', null);
INSERT INTO `tripleastudent` VALUES ('26', '1160299221', '该生在大一学年中，工作和生活上分别获得科创部干事考核合格，所在寝室月卫生检查成绩屡获优秀的成绩。在学习上通过了CET四级六级考试，取得了职业汉语等级专业中（甲）级并且人力资源部认证，积极参加蓝桥杯校内新生选拔赛并获得三等奖，积极参与了“美丽安吉”征文大赛并获得二等奖。很好的兼顾了学习、工作和生活。', null);
INSERT INTO `tripleastudent` VALUES ('27', '1150299346', '该生作为一名预备党员，在校各方面更加严于律己。 在学习方面，严格制定标准，积极参加学科竞赛。在工作方面，加入了学生组织，各类大小活动不仅积极配合彼此工作，在自己职责范围内认真尽职。在文体活动方面，曾参与院演讲赛，校运动会多项田径比赛等。进入院主持队，曾主持过迎新晚会，参与暑期社会实践等。自愿参与了各项志愿者活动如世界互联网大会志愿者等。该生在校期间能努力做到不忘初心，砥砺前行！', null);
INSERT INTO `tripleastudent` VALUES ('28', '1160299008', '该同学学习认真，团结同学，愿意帮助别人，积极参加班级活动和学校组织的讲座，参加了全国大学生英语竞赛并获得了三等奖，大一时通过了cet4和cet6和六级口语b等级。军训期间认真训练，坚持到了最后，参加了最后的方阵检阅。认真学习的同时他也积极参加学生社团，担当了部长的职务，也没把身体锻炼落下。思想道德方面，他热爱祖国，热爱共产党，思想与时俱进。', null);
INSERT INTO `tripleastudent` VALUES ('29', '1150299216', '该生学习成绩优异，刻苦努力，对待工作认真负责，并且乐于助人。 在学习上，该生一直严格要求自己，勤奋刻苦，平均绩点在专业前列。在工作上，该生认真负责，作为班级的一份子，积极配合老师和班委的工作，并且还加入了院志愿者协会，积极参加部门的各项活动。在生活上，该生和同学融洽和睦地相处，积极帮助同学。在学习的课余时间，能够合理的安排时间，给予足够的时间用于锻炼，做到德智体全面发展。', null);
INSERT INTO `tripleastudent` VALUES ('30', '1160692012', '该生平时学习生活中，成绩优秀，尊师敬长，团结同学，积极乐观，生活节俭朴素。思想端正，行为规范，目前是入党积极分子，坚决拥护国家拥护党组织。家中父母皆是农民，为家中唯一经济来源，父母收入微薄且不稳定。家中有两位老人皆无劳动力无经济来源。08年地震灾害导致房屋受损重修房屋使家中负债及老人生病的高昂医药费皆大大加重了家中的经济负担，入远不敷出。', null);
INSERT INTO `tripleastudent` VALUES ('31', '1150299031', '该生乐观开朗，思想进步，在2016-2017学年中，学习上勤奋努力，按时完成作业，绩点排名本专业前5%。在思想方面，他从一名入党积极分子成为了一名光荣的预备党员。在生活中，他积极参加学校里举办的活动，例如运动会方阵，辩论赛，“三学三比”等。他还利用课余时间学习英语，通过了英语六级的考试，并且通过了学校的“春萌”立项。另外还在暑假参加了“五水共治”暑期社会实践。', null);
INSERT INTO `tripleastudent` VALUES ('32', '1150299182', '叶灵杰同学，大二一学年思想积极向上，学习认真，成绩优秀。他思想上乐观向上，完成了党校的学习，做好成为一名预备党员的准备。学习上刻苦认真，成绩优异，积极参加学校组织的活动。工作上认真负责，认真按照学校要求组织好团日活动主题班会。在这一学年中得到“优秀团员”、“心理知识竞赛一等奖”、“社团优秀干事“等荣誉。', null);
INSERT INTO `tripleastudent` VALUES ('33', '1150299165', '他自从升入大学以来，时刻将学习放在首位，学习成绩名列前茅。他还担任了班级的学习委员，为老师和同学们服务，从而锻炼自身潜力，全面提高自身综合素质。此外，他还积极参加学院的活动，例如五月四日的五四毅行，院杯、院代会等等；代表软件工程专业参加学校的团代会等等。在工作方面，他时刻遵守党的章程，争取早日从预备党员转为正式党员。', null);
INSERT INTO `tripleastudent` VALUES ('34', '1150299125', '陈琪同学在大一年级获得学业优秀奖学金一等奖，在大二年级担任信息学院学生会新媒部副部长及助理团成员，获得了优秀学生干部的称号，在大三的时候当选院团委副书记。作为一名学生干部，她积极投入到学生工作中去，始终用一个学生干部的标准来衡量自己的一言一行。同时，她并没有在学习上停下了脚步，而是不断求知、不断学习、不断进步。', null);
INSERT INTO `tripleastudent` VALUES ('35', '1150299126', '该生在校期间思想上，严于律己，诚实守信，道德品质优良，积极向上。在学习上，态度端正，勤奋踏实，不旷课，不迟到，不早退，有明确的学习目标，遇到问题不放弃，刻苦钻研。在工作上，认真负责，一丝不苟，积极配合班委工作，真心实意帮助同学。在生活中，性格开朗，待人诚恳，品德端正，积极参加学校活动，做好寝室卫生工作，与身边的同学们友好相处，积极帮助他们解决问题。', null);
INSERT INTO `tripleastudent` VALUES ('36', '1160299121', '该同学自入学以来一直遵守学校相关规章制度，思想品德素质良思想端正，能吃苦耐劳，注重个人道德修养好。学习上她刻苦努力，上课专心听讲，及时完成相关作业，对问题能深入求解，并与同学积极讨论。作为班干部的一员，协助其他班委共同管理好班级，工作上认真负责，有强烈的集体荣誉感和工作责任心。在生活上，她诚实守信，待人友好，乐于助人，一直以来与同学相处融洽。', null);
INSERT INTO `tripleastudent` VALUES ('37', '1160299032', '该生是来自信息1602的孙梦瑶，现在是软件工程专业。在思想上，该生保持积极进步，拥护党和国家，诚实守信；在学习工作上，该生严于律己，成绩优异，顺利通过英语四级考试，身为副班长，该生乐于助人，积极配合辅导员老师的工作。希望今后，该生可以更加严格要求自己，以求更突出的表现。', null);
INSERT INTO `tripleastudent` VALUES ('38', '1160299184', '该生是一个十分开朗活泼很爱笑的姑娘，在校遵纪守法，遵守学院各项规章制度，认真完成学业，并在大一期间通过了英语四六级考试。她热爱画画，设计，积极参加学校的设计比赛，在诚信设计比赛中获得第一名，也积极加入学校的各组织，为其出力，认真完成任务。同时，她爱运动爱帮助他人，积极地参与校运动会，也和其他同学一起以浙科院的名义马拉松志愿者活动。', null);
INSERT INTO `tripleastudent` VALUES ('39', '1160299013', '该生在校期间努力拼搏，奋发进取，在一些方面取得了优异的成绩。在学习上，劳逸结合是他的学习方法，互帮互助，共同进步是他的制胜法宝，好思能动是他前进的源泉。在生活上，他积极参加课外活动，通过运动锻炼身体，而且在学习之余，注重人际交流，不死读书，知识与人际交往齐头并进。在十九大召开期间，他也认真学习党的理论知识，爱党爱国的思想根深蒂固。', null);
INSERT INTO `tripleastudent` VALUES ('40', '1150399100', '这学年，该同学在各方面表现优异。生活方面，始终持续着乐观生活态度；工作方面，用心认真，担任班级组织委员，关心同学生活和学习，帮助有困难的同学；学习方面，成绩名列前茅；社会实践方面，用心参加社会实践活动。\r\n　　因此，该同学特向学校申请奖学金，它是对学习成绩、工作潜力、综合素质的肯定。如果学院能够给予这份荣誉，将是对此同学的一种莫大的鼓励，必将激励她今后更加努力，做得更出色。', null);
INSERT INTO `tripleastudent` VALUES ('41', '1160299030', '该同学为人诚恳，谦虚，随和，乐观向上，有进取心，乐于助人，思想积极要求上进，向党组织靠拢，有良好的心理素质和应变能力，勇于进取，不怕挫折；在平时专业学习上，该生学习刻苦勤奋，认真学习，学习优秀，顺利通过大学英语四级考试，能及时完成老师布置的任务；在工作上，该生，能熟练专业知识，有较强的动手能力；在生活上，该生简朴勤俭，勤劳刻苦。', null);
INSERT INTO `tripleastudent` VALUES ('42', '1150299320', '该生在思想上，要求积极上进，热爱祖国、热爱人民，目前是入党积极分子。该生在学习上，刻苦钻研，勤奋好学，积极参加学科竞赛，蓝桥杯，省多媒体竞赛等，学分绩点位列该专业第一。该生在工作上，认真负责，担任数媒152班班长一职，妥善处理班级事情，积极配合学院的工作。在生活上，养成了良好的生活习惯，生活充实而有条理，有严谨的生活态度和良好的生活态度和生活作风，能与同学们和睦相处;', null);
INSERT INTO `tripleastudent` VALUES ('43', '1160299316', '该生入学以来始终保持着积极向上的心态，能妥善处理各方面的关系，做到全面发展。在校期间，该生立足自己的专业，刻苦学习，广泛涉猎，与同学讨论学习心得，以优异的成绩通过所选科目的考试，专业绩点排名能达学院第四。同时，该生积极参加学校组织的活动，作为班干团结同学，维护班级学风建设。该生也能积极报名参加学科竞赛，充分利用课余时间，参与学院社团的各种活动，综合表现突出。', null);
INSERT INTO `tripleastudent` VALUES ('44', '1150299054', '他积极进取，努力上进，积极参加学校和学院举办的各项活动；他尊敬老师，团结同学，是同学们的好榜样；他有着很强的奉献精神，曾参加过无人机大赛志愿者，并即将参加世界互联网大会志愿者；他积极投身社会工作，具备团队合作精神，在院志协担任副部长，是一个优秀的大学生。现推荐他申请优秀学生二等奖学金。', null);
INSERT INTO `tripleastudent` VALUES ('45', '1150299159', '学习上，他学生以学习为本。该同学上课认真听讲，课后积极复习，并有自己的学习方法，绩点较大一学年有了明显提升。思想上，该同学认真学习各种重要思想，不断提升自身的政治修养。工作上，该同学为人稳重，工作认真踏实，吃苦耐劳。在担任班长期间，该同学认真做好本职工作，主动关心和同学，为班级做出了较大贡献。总而言之，该同学将以百倍的信心和万分的努力去迎接更大的挑战', null);
INSERT INTO `tripleastudent` VALUES ('46', '1151020047', '该生学习态度端正，有较强的自学能力和自我管理能力，在专业学习上主动性强，成绩在专业里名列前茅，工作态度积极，能够很好的处理班级里同学之间的关系，适应能力强，遵守学校的规章制度，了解自己的兴趣爱好，对未来有着自己的想法与见解，有着积极乐观的态度和拼搏的精神。', null);
INSERT INTO `tripleastudent` VALUES ('47', '1160299063', '该生在上一学年中，始终保持积极向上的心态，时刻严格要求自己，努力做到全面发展。在思想上，该生认真学习党的先进思想，用正确的理论武装自己的头脑，贯彻党的方针政策。 在学习上，该生明确了学习目的，勤于向老师和同学请教、讨论，经过该生的努力，学习成绩一直保持优异。生活上，积极参加各类活动，投身于社会事业。相信该生会不断的努力，以更优秀的自己去帮助和影响更多的人。', null);
INSERT INTO `tripleastudent` VALUES ('48', '1160299211', '该生是一个活泼开朗、乐于助人和认真好学的一个人，经常在课余时间问同学问题以及帮助有需要的同学。在第一学期积极组织班级活动，开展了班级来到安吉第一次春游。她积极参加校级运动会，并且获得了跳高女子组第四名的成绩，为学院争光。她还在微电影的创意比赛中获得一等奖的好成绩，以及在“美丽安吉”征文比赛中获得三等奖的成绩。', null);
INSERT INTO `tripleastudent` VALUES ('49', '1150299303', '本人大二学年，担任班里学习委员，学习方面，认真刻苦；工作方面，积极负责；思想方面，积极向上，乐于为大众做贡献；生活方面，勤俭节约，作息习惯良好，不打扰室友休息；竞赛方面，获得第八届蓝桥杯浙江省赛C/C++程序设计大学B组三等奖三等奖、浙江省第十四届大学生程序设计竞赛二等奖。特此申请三好学生，望批准。', null);
INSERT INTO `tripleastudent` VALUES ('50', '1150299063', '该生在各个方面的表现优异，思想方面，遵纪守法，积极进取；在学习上，努力刻苦，积极配合老师工作，按时完成作业，不旷课，取得了优异的成绩；在班级及社团工作方面，作为班级组织委员及信息学院中研会副会长，积极为同学们服务，认真组织社团和班级活动，配合辅导老师的工作，真心实意为同学服务。', null);
INSERT INTO `tripleastudent` VALUES ('51', '1150299108', '金柏哲，15级计算机1班学生。他自入校以来，严格遵守学校的各项规章制度，在思想上积极进取，奋发向上，争取做到优秀学生的好榜样，学习上刻苦努力，工作上认真负责，生活中继承了中华名族的传统美德勤俭节约、尊老爱幼、认真踏实、学习勤奋。因为他的自觉性强，积极参加各项活动，在思想、学习、生活、个人实践等方面都取得了较大的进展。', null);
INSERT INTO `tripleastudent` VALUES ('52', '1150299066', '该生在学习上，成绩优异，在数媒专业位列前茅，绩点排名第6，综测排名第7。在思想上，尊敬师长，团结同学，热爱祖国，遵守校规，积极乐观,并在这学期被评为优秀团员。在生活上，该生热于参加学校组织的活动，在运动会上，自荐参加红旗舞；加入学生会，对组织负责，热心做好每一件事；在假期，积极参加暑期社会实践活动。作为一个贫困生，为了减轻家庭负担，该生勤工助学，努力学习，自强不息。', null);
INSERT INTO `tripleastudent` VALUES ('53', '1150299112', '该学生身心健康，品德良好，刻苦学习，在学业上取得了一定的成绩。对待生活他乐观积极向上，与队友在球赛场为专业争光；对待学习他严谨认真，积极参加各类学科竞赛（数学建模比赛等）；对待他人他友善和睦，积极参加志愿者活动为他人服务。', null);
INSERT INTO `tripleastudent` VALUES ('54', '1160299185', '该生勤奋向上，踏实进取，学习刻苦认真，取得了良好成绩，主要表现如下：在本学年中中表现突出，成绩显著，被评为“优秀团员”，在英语四六级一次性顺利通过，在生活上，宽于待人，尊敬师长，并在平时积极和同学交流沟通、融洽和睦地相处,在寝室里,能和室友和睦相处。在思想方面，仍然一如既往地向党组织靠拢。', null);
INSERT INTO `tripleastudent` VALUES ('55', '1150299082', '我在学习期间各方面表现优异。思想方面，向党组织靠拢，不忘党训，成为一名预备党员；生活方面，我始终持续着乐观生活态度；工作方面，用心认真，担任班级团支书，不忘对同学学习的带动和帮忙；学习方面，始终将学习放在首位，学习成绩名列前茅，通过大学英语四六级和计算机二级等，曾获得二等校二等奖学金和三好学生荣誉。\r\n　　我特向学校申请省政府奖学金，这是对我学习成绩、工作潜力、综合素质的肯定。', null);
INSERT INTO `tripleastudent` VALUES ('56', '1160299136', '在2016-2017学年，该生在思想、学习、生活等各方面表现优异。政治思想上，热爱中国共产党，拥护党的方针、政策和路线；学习上，认真努力，有较强的自学能力和自我管理能力，专业学习主动性强，积极参加各项学科竞赛，学业成绩名列前茅；生活上，吃苦耐劳，朴实大方，认真对待工作，积极参加社会实践活动，与同学相处融洽。', null);
INSERT INTO `tripleastudent` VALUES ('57', '1150299134', '现担任数媒学生第一党支部支委，信息学院分团委学生会副主席兼数字媒体技术151班班长。大二期间，获得优秀团干部的称号，作为班长，为班级申请到了校十佳团支部的荣誉，作为学生会副主席，自上任以来，在老师和学长学姐的指导和帮助下，在广大同学的支持下，我积极配合主席开展学院内的工作，努力保质的完成主席分配的各种任务。作为一名在校学生，积极参加各类学科竞赛，浙江省多媒体竞赛，浙江省电子商务大赛。', null);
INSERT INTO `tripleastudent` VALUES ('58', '1150299363', '在思想上，该同学保持积极向上的思想，热爱党热爱人民，乐于帮助同学和为人民服务，并且已经成为了一名光荣的预备党员。在学习上，该同学十分刻苦，上课认真听讲，下课积极实践创新，多次参加学科竞赛并且取得不错的成绩。在工作方面，该同学担任软件工程专业党支委，积极辅助老师完成党建工作。在生活方面，该同学勤俭节约，时刻保持良好的言谈举止，生活作风优良。', null);
INSERT INTO `tripleastudent` VALUES ('59', '1150299040', '本学期间，该同学在各方面表现优异。思想方面，透过努力获得组织认可，成为一名预备党员;生活方面，他始终持续着乐观生活态度;工作方面，用心认真，在班级担任组织委员，关心同学生活和学习，帮忙有困难的学生，同时不忘对同学学习的带动和帮忙;学习方面，始终将学习放在首位，学习成绩优异;他积极参加多种志愿者活动，在实践中锻炼自己，参与献血活动，为社会奉献一份力。', null);
INSERT INTO `tripleastudent` VALUES ('60', '1150580033', '该生在校期间，在思想上，紧跟习大大的脚步；在学习上，把学习当作自己的第一任务，从来不肯放松一丝一毫，认真完成老师上课布置的任务，在课下好好复习；热爱集体，遵纪守法，热爱集体，尊敬老师，团结同学，积极参加各种社团活动和志愿者活动；追求自我发展，追求创新，申报了新苗，立项成功，申请了发明型专利。', null);
INSERT INTO `tripleastudent` VALUES ('61', '1160299152', '该生在2016-2017学年内，思想积极上进，学习努力，学分绩点加权学业成绩为84.48，成绩优秀，位于学院前20%；积极参加社会实践和志愿者活动，品德素质，考核中思想表现项、文明守纪项、社会责任项评为优秀；社会工作能力较强，在志愿者服务参与方面有较好表现；综合表现优秀。', null);
INSERT INTO `tripleastudent` VALUES ('62', '1160299059', '在2016-2017学年，该生在思想、学习、生活等各方面均表现优异。政治思想上热爱共产党；学习上认真刻苦，专业学习主动性强，学业成绩名列前茅；生活上，吃苦耐劳，朴实大方，认真对待工作，与同学相处融洽。综合各方面，该生均符合三好学生申请条件，现推荐其申请三好学生。', null);
INSERT INTO `tripleastudent` VALUES ('63', '1160299299', '该生在学习上学习态度端正，有明确的学习目标并且能够朝着这个目标努力学习，品学兼优，多才多艺，能力突出，积极上进，在班级里担任学习委员，为班级学习氛围做出贡献，为班级里的同学树立榜样。在品德素养上，该生积极参加学校的各项文体活动，对待事情认真负责，能够听取他人意见。在生活上，该生自觉遵守学校的规章制度，积极乐观，尊敬师长，和同学相处融洽，有广泛的兴趣爱好。', null);
INSERT INTO `tripleastudent` VALUES ('64', '1160580006', '该学生在2016-2017学年中，在思想方面，遵纪守法，积极进取，阳光向上；在学习方面，勤奋刻苦，积极配合老师的工作，认真按时完成作业，不旷课，不早退，成绩优异，学习成绩靠前；在班级工作方面，努力配合班委工作，真心实意为同学们服务；在社团工作方面，积极参加社团工作，奉献自我，锻炼自我；在文体活动方面，热心参与班级风采展示，积极展示自我风采。', null);
INSERT INTO `tripleastudent` VALUES ('65', '1160299006', '该学生很热爱生活。在校品德优秀，尊敬师长、团结同学，爱帮助同学。学习认真、刻苦，有较强的进取精神，并且成绩优秀。该学生还能自觉遵守学校纪律，上课认真听讲，积极开动脑筋，作业可以按时完成上交，她热心帮助同学，辅导同学，能够在老师、班主任的指导下和同学一起完成班级布置的各项工作。热爱班集体，有集体荣誉感，并且集体荣誉感强，德智体美四方面全面发展。', null);
INSERT INTO `tripleastudent` VALUES ('66', '1160299328', '该生自入学以来一直严格要求自己，不断提升各方面能力。\r\n在学习上，该生在校努力上进，勤奋学习；在思想上，态度端正，积极乐观，认真学习党的知识，努力向党组织靠拢；在工作上，作为班级干部，积极配合校领导的工作，为班级建设出一份力；在生活中，勤俭节约，乐于助人，与同学相处融洽。\r\n在今后的日子里，该生将以更严格的标准来要求自己，向更好的自己前进。特此提出申请。', null);
INSERT INTO `tripleastudent` VALUES ('67', '1160299276', '该学生在大一学年中，思想突出，被选为预备党员。学习认真，有远大的理想，并能将目标付诸于行动，能够坚定目标并持之以恒地努力，得到老师们的一致好评，他将学习融入生活，广泛地学习跨学科的知识，从他身上我们能看到学习对他而言独特的魅力。在日常工作中，他有强烈的责任感，能够协调组织的秩序，维护社会的公平公正。在生活中独立自主，性格温和，心胸宽广，与大家和谐相处。', null);
INSERT INTO `tripleastudent` VALUES ('68', '1150299005', '该同学积极上进，一直以高标准严格要求自己。虚心好学，成绩始优秀，学习成绩在班级名列前茅，坚持独立思考，不仅理论知识学的扎实，还将所学知识融入到实践中，积极参加有关专业实习。。在班级中担任学习委员一职，一直尽心尽力。尊敬师长，团结同学，与人为善。思想踊跃，要求上进，积极学习党的各项理论和政策，是一名优秀的学生。', null);
INSERT INTO `tripleastudent` VALUES ('69', '1160299093', '该生在校期间表现良好，学习上，认真努力，积极进取，有很好的专业素养；生活上，乐观向上，团结同学，乐于助人，积极的参加班级的集体活动，有很好的团队意识；思想上，积极正确，拥护党的政策方针，是一名优秀的大学生。', null);
INSERT INTO `tripleastudent` VALUES ('70', '1160299095', '该生在校期间具有良好的思想道德品质，各方面表现优秀，有强烈的集体荣誉感和工作责任心，坚持实事求是的原则，养成良好的生活作风，乐于助人，关心国家大事。勤奋学习，刻苦钻研，通过系统地学习掌握了扎实的基础知识。该生积极参加校开展的各项文体活动，参加社会实践，继承和发扬了艰苦奋斗的精神，丰富了课余生活，使自己在各方面都得到了相应的提高。', null);
INSERT INTO `tripleastudent` VALUES ('71', '1160299213', '该生在大一这一学年中，思想方面表现良好，积极参与学校组织的活动；学习方面认真刻苦，老师布置作业积极完成。学年总绩点名列段前20％；积极报名学校内的讲座活动；认真配合班级活动。顺利通过英语四级，积极参加英语四级口语。生活中，与他人相处良好，碰到矛盾及时解决，尊敬师长。寝室内务也整理的不错。', null);
INSERT INTO `tripleastudent` VALUES ('72', '1160299034', '该生在大一期间担任班长，多次组织班级活动，团结同学，恭敬师长，所在班级在团日活动中获奖，且在学期末被评为优良学风班。曾被评选为优秀学生干部，优秀班干部，参加团校并结业，生活习惯好，所在寝室卫生情况优秀。热爱学习，刻苦认真，学分绩点在前20％，多次参加学校学术报告，参加汉语言能力考试通过并获得证书，军训时所在集体被评为军训先进集体。', null);
INSERT INTO `tripleastudent` VALUES ('73', '1150299347', '该学生在校期间思想积极向上，大一期间成绩上一直名列前茅，曾获得“省政府奖学金”，“校三好生”等荣誉。该学生在学习上遇到不懂的问题都能积极提问，善于钻研难题，；在工作上，该学生积极配合班长组织好班级活动，并且多次参与志愿活动，表现突出；在生活上，该学生能吃苦耐劳，有崇高的理想和伟大的目标，注重个人道德修养，养成良好的生活作风，乐于助人。', null);
INSERT INTO `tripleastudent` VALUES ('74', '5151594017', '该生在大二学年学习认真，工作努力，为人亲和。在专业及选修学科的学习都非常认真努力，学习成绩好，做事认真，参加学校团代会，为学校团日活动作出贡献。并参与多项学科竞赛，获得蓝桥杯省赛二等奖，参加浙江省程序设计竞赛，担任ACM协会会长。生活朴实，能够独立处理日常，并帮助同学完成力所能及的事，并参与献血活动，为需要获得帮助的人提供帮助。', null);
INSERT INTO `tripleastudent` VALUES ('75', '1150299155', '本人积极向上，努力进取。思想上积极向党组织靠拢，勤奋学习，关注国家实事，积极入党，现在是一名发展党员。工作上积极配合党员和学生干部，担任信息学院学生会记者团部长，参与院会活动的举办和宣传，反响良好。生活上，待人热情，乐于帮助同学，与他人相处融洽。学习上，严格要求自己，积极向上，努力学习专业相关的知识与技能，不断提高自身科学文化素养，成绩良好，获校二等奖学金。', null);
INSERT INTO `tripleastudent` VALUES ('76', '1160694036', '该生学习态度认真，勤奋刻苦。在大一这一年，积极参加学校组织的各类文体活动，如：校运动会广播操，积极参加学科竞赛，如：大学生英语竞赛，写作竞赛，均获得奖项，同时还通过了英语四六级，并且分数较高。积极参加学校社团和组织，工作踏实认真，在学校里遵守纪律，无违纪行为，尊敬老师、团结同学。', null);
INSERT INTO `tripleastudent` VALUES ('77', '1150299380', '该生在校期间，思想积极先进。学习上刻苦努力，成绩一直名列前茅，通过了英语四级，计算机二级，并获得了汉语能力测试及普通话等级考试的证书，她平时乐于钻研，常常阅读课外书籍。工作上，她认真负责，从大一开始加入校志协，曾多次参加志愿活动，服务他人，历练自身。生活方面，她拥有积极向上的生活态度，尊敬师长，并且常常帮助身边的同学，拥有良好的人际关系。相信她将来也会努力提升自我，成为对社会有贡献的栋梁。', null);
INSERT INTO `tripleastudent` VALUES ('78', '1150299070', '该生成绩优异，综合测评成绩名列前茅，并且积极参加科技竞赛，在浙江省大学生服务外包创新创业大赛、全国大学生服务外包创新创业大赛中均获得了一等奖的优异成绩。在思想上，该生持续用心进步，以身作则，学习领会党的理论思想并运用到实践中。在生活中，该生乐于帮助专业同学，为同学营造良好的学习氛围。', null);
INSERT INTO `tripleastudent` VALUES ('79', '1150299388', '热爱学习，与人友善，乐于助人。在校期间积极参加各类公益实践、志愿者、运动会等活动。大二时候成为一名光荣的入党积极分子，课堂之外也在实验室跟着专业老师学习,掌握了更多专业技能，并作为第一负责人主持申报立项省级项目新苗，此项目现在也在按计划持续进行中。', null);
INSERT INTO `tripleastudent` VALUES ('80', '1150299051', '在学习方面，我一直都如同高中时期一般严格的要求自己。因为在这个充满竞争的社会中，只有不断的充实自己，完善自己才能使自己融入这个社会，适应这个社会。大学的生活不是想象中的虚度光阴，所以我一直都履行着自己的诺言。\r\n  其次，我担任学委职务，但是和班长一道，认真做好班级的工作，帮助班长分担班级任务。\r\n  在生活方面：我坦诚乐观，乐于帮助身边的人，因此得到了同学的支持，人员基础较为扎实。1', null);

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
INSERT INTO `users` VALUES ('1150299070', '陈伟', 'ZTLcLq+BaR2y9kFF0eCBzw==', '1', '1502972050');
INSERT INTO `users` VALUES ('1150299071', '张三', '83nq88gxsE3hU0adG+w0Xg==', '3', '1502972051');
INSERT INTO `users` VALUES ('1150299072', '李四', 'ISGMyneATSuhkiwz4BURBQ==', '4', '1502972051');
INSERT INTO `users` VALUES ('1150299234', '林创伟', 'UsaeOlczEIGCMzHE5p0/Lg==', '1', '1502972050');
INSERT INTO `users` VALUES ('1150299256', '蔡靖楠', '4QrcOUm6Wau+VuBX8g+IPg==', '2', '1502972050');

-- ----------------------------
-- Table structure for `userss`
-- ----------------------------
DROP TABLE IF EXISTS `userss`;
CREATE TABLE `userss` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL DEFAULT 'ISGMyneATSuhkiwz4BURBQ==',
  `is_changed_password` int(50) DEFAULT '0',
  `username` varchar(50) DEFAULT NULL,
  `major` varchar(50) DEFAULT NULL,
  `class_id` varchar(50) DEFAULT NULL,
  `major_sum` varchar(50) DEFAULT NULL,
  `character` varchar(50) DEFAULT NULL,
  `study` varchar(50) DEFAULT NULL,
  `ability` varchar(50) DEFAULT NULL,
  `all` varchar(50) DEFAULT NULL,
  `gp` varchar(50) DEFAULT NULL,
  `ce` varchar(50) DEFAULT NULL,
  `sex` varchar(50) DEFAULT NULL,
  `birth` varchar(50) DEFAULT NULL,
  `nation` varchar(50) DEFAULT NULL,
  `entrance` varchar(50) DEFAULT '2016年09月',
  `political` varchar(50) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `identity` varchar(100) DEFAULT NULL,
  `pass_sum` varchar(50) DEFAULT NULL,
  `sub_sum` varchar(50) DEFAULT NULL,
  `job` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`,`user_id`),
  UNIQUE KEY `id` (`id`) USING BTREE,
  UNIQUE KEY `user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=685 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userss
-- ----------------------------
INSERT INTO `userss` VALUES ('1', '1150299174', '6YuPLrk8x4tQcgzrwrj9sg==', '1', '马庆', '电子信息工程', '151', '59', '12.15', '57.19', '0.30', '69.64', '2', '5', '男', '1996年03月', '汉族', '2015年09月', '共青团员', '15868151685', '230605199603012632', '25', '25', '无');
INSERT INTO `userss` VALUES ('2', '1150299388', 'FV8xlzw6U4ppYt3pprls7Q==', '1', '龙杰', '电子信息工程', '152', '59', '14.10', '55.23', '2.10', '71.43', '6', '3', '男', '1994年02月', '彝族', '2015年09月', '共青团员', '15868177831', '522426199402132832', '24', '24', '班长');
INSERT INTO `userss` VALUES ('3', '1150299254', 'Cwivw/pyD/ijheeBpa274g==', '1', '徐欣怡', '电子信息工程', '152', '59', '14.10', '53.97', '6.83', '74.90', '8', '1', '女', null, '汉族', '2015年09月', '预备党员', null, null, null, null, '班级团支书');
INSERT INTO `userss` VALUES ('4', '1150299336', '8Dgr8/A7QLUvZCeuSoV4ew==', '1', '谢俊杰', '电子信息工程', '152', '59', '13.50', '50.40', '3.00', '66.90', '20', '11', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '学习委员');
INSERT INTO `userss` VALUES ('5', '1150299068', 'UJ3wm1NEDvzRls3ZObkSVQ==', '1', '向莹', '计算机科学与技术', '151', '101', '14.70', '59.22', '6.23', '80.15', '7', '3', '女', '1997年05月', '汉族', '2015年09月', '预备党员', '13586680799', '330205199705193325', '28', '28', '团支书、信息中研会会长');
INSERT INTO `userss` VALUES ('6', '1150299049', 'omDaxNlXP1TDSE5GXB6Hhw==', '1', '王俊波', '计算机科学与技术', '151', '101', '13.65', '60.48', '5.34', '79.47', '3', '4', '男', '1996年10月', '汉族', '2015年09月', '预备党员', '15869122835', '330723199610112553', '29', '29', '班长、社团联合会主席');
INSERT INTO `userss` VALUES ('7', '1150299031', 'A7MRcLTlWGiUjvjjIVCYxw==', '1', '朱佳超', '计算机科学与技术', '151', '101', '13.65', '59.57', '3.30', '76.52', '5', '11', '男', null, '汉族', '2015年09月', '预备党员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('8', '1150299102', 'NLP+YHFVMFgcp0kDzqVy4Q==', '1', '程思远', '计算机科学与技术', '151', '101', '13.80', '58.87', '3.53', '76.19', '9', '12', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('9', '1150299112', 'EXmizNvLtBLboSru/B8z7w==', '1', '林炜哲', '计算机科学与技术', '151', '101', '12.90', '59.01', '3.60', '75.51', '8', '13', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('10', '1150299005', 'tbXVHNKbBs6AuWDgbahCsg==', '1', '张梦颖', '计算机科学与技术', '151', '101', '13.95', '57.96', '2.33', '74.24', '15', '18', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '学习委员');
INSERT INTO `userss` VALUES ('11', '1150299108', '1W7i4UtbPQC0opPm3G/qoA==', '1', '金柏哲', '计算机科学与技术', '151', '101', '12.90', '58.52', '1.65', '73.07', '10', '21', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('12', '1150299110', 'F5mLyGVn9bYG4V3zd0nrUw==', '1', '廖鹏', '计算机科学与技术', '151', '101', '13.80', '56.35', '9.15', '79.30', '26', '5', '男', '1996年06月', '汉族', '2015年09月', '共青团员', '15869126587', '510722199606248674', '25', '25', '信息志协副会长');
INSERT INTO `userss` VALUES ('13', '1150299106', 'Tig/cusOopqC0/Apvd838w==', '1', '江俊', '计算机科学与技术', '151', '101', '12.75', '57.54', '2.25', '72.54', '18', '25', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '信息中研副会长');
INSERT INTO `userss` VALUES ('14', '1150299067', '08KwmaDy/rEEefc1+zX7bg==', '1', '吴影', '计算机科学与技术', '151', '101', '11.85', '58.17', '0.00', '70.02', '13', '35', '女', '1996年12月', '汉族', '2015年09月', '共青团员', '13093727626', '341282199612034320', '26', '26', null);
INSERT INTO `userss` VALUES ('15', '1150299119', 'NQydkBt/HHOkgeJA7Bt8Cw==', '1', '俞  怡', '计算机科学与技术', '152', '101', '13.80', '64.40', '8.78', '86.97', '1', '2', '男', '1996年04月', '汉族', '2015年09月', '共青团员', '15868177976', '330122199604183719', '25', '25', '信息志协办公室部长');
INSERT INTO `userss` VALUES ('16', '1150299253', 'ZHzuKxfAL4c17aeLHHmoig==', '1', '吴心怡', '计算机科学与技术', '152', '101', '13.35', '55.79', '5.33', '74.47', '31', '17', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('17', '1150299204', 'LbTPkNdqZvuQiUsymW/CIQ==', '1', '倪文硕', '计算机科学与技术', '152', '101', '12.60', '56.56', '3.27', '72.43', '23', '26', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('18', '1150299158', '7XODX9tUuOkTvXeLUif6Hw==', '1', '彭子恬', '计算机科学与技术', '152', '101', '12.60', '55.37', '4.78', '72.76', '36', '24', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('19', '1150299127', 'vYgdyq20zEQlpGskSZvBgg==', '1', '盛雯姝', '计算机科学与技术', '152', '101', '12.45', '54.74', '2.55', '69.74', '39', '38', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '团支书');
INSERT INTO `userss` VALUES ('20', '1150299241', 'RPhJta5RdvLceULXDpsl7Q==', '1', '吴文彬', '计算机科学与技术', '152', '101', '13.35', '55.44', '1.95', '70.74', '33', '32', '男', '1997年05月', '汉族', '2015年09月', '共青团员', '15868142453', '332525199705185732', '25', '25', null);
INSERT INTO `userss` VALUES ('21', '1150299266', 'mjNZ7SKIXOb8crRzwR2b6g==', '1', '罗俞建', '计算机科学与技术', '153', '101', '12.15', '54.39', '0.83', '67.37', '42', '44', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('22', '1150399100', 'miE+lSsRGNPvAKrS/L6jkA==', '1', '尹子彤', '计算机科学与技术', '153', '101', '13.20', '60.27', '4.28', '77.75', '4', '7', '女', '1996年07月', '汉族', '2015年09月', '共青团员', '15868170893', '14010719960709224X', '26', '26', '班级组织委员');
INSERT INTO `userss` VALUES ('23', '1150199147', '8crsk3Lh5mSI/XsDxWF5Vw==', '1', '张杰', '计算机科学与技术', '153', '101', '13.80', '56.91', '6.15', '76.86', '21', '10', '男', '1996年12月', '汉族', '2015年09月', '预备党员', '15868183059', '33062119961210839X', '26', '26', '无');
INSERT INTO `userss` VALUES ('24', '1150299344', 'S0eRpA0mlmrmsgIqOeSIWg==', '1', '高雨帆', '计算机科学与技术', '153', '101', '13.65', '56.98', '2.25', '72.88', '19', '22', '女', null, '汉族', '2015年09月', '预备党员', null, null, null, null, '中研副会长');
INSERT INTO `userss` VALUES ('25', '1150299282', 'n85m46RK5OVD01OikyBALg==', '1', '戴文飞', '计算机科学与技术', '153', '101', '12.90', '56.14', '9.71', '78.75', '27', '6', '女', '1997-08-10', '汉族', '2015年09月', '预备党员', '15868169523', '331023199708107026', '32', '32', '团支书');
INSERT INTO `userss` VALUES ('26', '5151591008', 'Cb1M0OFZ/xXbeXao1KVkcg==', '1', '楼俊超', '计算机科学与技术', '153', '101', '12.90', '55.86', '3.15', '71.91', '30', '27', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '信息社联主席团');
INSERT INTO `userss` VALUES ('27', '1150299261', 'ZBgWDNSTybWfWB0Z2QpB4Q==', '1', '韩康', '计算机科学与技术', '153', '101', '13.35', '54.60', '7.28', '75.22', '41', '14', '男', '1997年10月', '汉族', '2015年09月', '共青团员', '15868139850', '330824199710251210', '25', '25', '12届KAB公关部长，心理委员');
INSERT INTO `userss` VALUES ('28', '5151591001', 'Ileo+3PIb89aKOq+Jf2jTw==', '1', '陈瑶', '计算机科学与技术', '153', '101', '12.15', '56.77', '2.10', '71.02', '22', '31', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('29', '1150299309', 'IGleRCO9J73dSi4V749fEQ==', '1', '章奔', '计算机科学与技术', '153', '101', '12.15', '53.27', '1.50', '66.92', '49', '46', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('30', '1150299098', 'VGQ5EwuoUjUZ8wYYQbkADg==', '1', '严春利', '计算机科学与技术', '153', '101', '12.15', '53.06', '1.50', '66.71', '53', '47', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('31', '1150299384', 'PXBOFHgVFTyiwiYCgLjpfw==', '1', '黄洪杰', '计算机科学与技术', '153', '101', '12.60', '53.97', '0.00', '66.57', '45', '49', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('32', '1150299145', '1Rtw8vie2nqZGJh93YCsCA==', '1', '潘建锋', '计算机科学与技术', '153', '101', '13.80', '57.75', '6.15', '77.70', '16', '8', '男', '1996年10月', '汉族', '2015年09月', '预备党员', '15869107691', '362334199610233712', '25', '25', '无');
INSERT INTO `userss` VALUES ('33', '1150299165', 'dtoAvRz+xQlBvBNNH3joug==', '1', '何华峰', '软件工程', '151', '72', '13.80', '59.71', '9.40', '82.91', '11', '4', '男', '1997年03月', '汉族', '2015年09月', '预备党员', '15068829980', '330108199703230915', '21', '21', '学习委员');
INSERT INTO `userss` VALUES ('34', '1150299072', '4QrcOUm6Wau+VuBX8g+IPg==', '1', '黄栋栋', '软件工程', '151', '72', '13.95', '59.92', '7.28', '81.15', '10', '9', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('35', '1150299070', 'Qpf0SxOVUjUkWySXOZ16kw==', '1', '陈伟', '软件工程', '151', '72', '12.90', '60.55', '5.55', '79.00', '7', '10', '男', '1996年12月', '汉族', '2015年09月', '共青团员', '15869104199', '33028219961227281X', '42', '42', '无');
INSERT INTO `userss` VALUES ('36', '1150299216', 'pRl1oR52v0ymokbLwt2Hug==', '1', '征杭勇', '软件工程', '151', '72', '13.80', '61.60', '2.70', '78.10', '6', '11', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('37', '1150299004', 'DQwGo+oW05+Sl0S+CFavjQ==', '1', '史敏悦', '软件工程', '151', '72', '13.50', '61.74', '2.70', '77.94', '5', '12', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('38', '1150299190', 'c4pjvucV8Hxofcl6bPDLpA==', '1', '顾梦佳', '软件工程', '151', '72', '13.65', '59.22', '4.05', '76.92', '15', '15', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('39', '1150299035', 'IFMIGBJdzUo4pYL/xPmK9A==', '1', '骆润贻', '软件工程', '151', '72', '13.50', '59.29', '3.90', '76.69', '13', '16', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('40', '1150299230', 'NZSxhUTxPc9e7zDFdq1gAQ==', '1', '胡昊', '软件工程', '151', '72', '12.15', '57.26', '11.97', '81.38', '28', '8', '男', '1996年08月', '汉族', '2015年09月', '共青团员', '15869118561', '340404199608290218', '22', '22', '无');
INSERT INTO `userss` VALUES ('41', '1150299034', 'IFfUdDcCG1Wd1MtuohbOQA==', '1', '何敏杰', '软件工程', '151', '72', '13.50', '56.56', '5.10', '75.16', '35', '21', '女', '1996年11月', '汉族', '2015年09月', '共青团员', '15868102823', '330681199611115885', null, null, '班长，心理协会会长');
INSERT INTO `userss` VALUES ('42', '1150299131', 'RDj8Az+K70M/nbU0i3Do5Q==', '1', '陈郑强', '软件工程', '151', '72', '13.95', '57.47', '2.76', '74.18', '26', '25', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '生活委员');
INSERT INTO `userss` VALUES ('43', '1150299033', 'ea/+A0wMgrSeokyo+T3KuQ==', '1', '陈雨佳', '软件工程', '151', '72', '12.90', '56.49', '4.26', '73.65', '36', '26', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('44', '1150299175', 'CzE9thNuXmng56pjtILkKw==', '1', '施伟泽', '软件工程', '151', '72', '13.50', '58.10', '1.80', '73.40', '22', '28', '男', '1997年05月', '汉族', '2015年09月', '共青团员', '15868143343', '330721199705281218', '22', '22', '无');
INSERT INTO `userss` VALUES ('45', '1150299100', 'cf+jc5KXGOaFkr93e6Ti0Q==', '1', '周倩倩', '软件工程', '151', '72', '12.15', '56.91', '3.27', '72.33', '33', '31', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('46', '1150299140', 'zVmeJIjSfMMttoV7DHW4ZA==', '1', '李文东', '软件工程', '151', '72', '13.50', '55.44', '2.85', '71.79', '44', '34', '男', '1997年12月', '汉族', '2015年09月', '共青团员', '15869102946', '330324199712182135', null, null, '院学生会主席');
INSERT INTO `userss` VALUES ('47', '1150299001', 'ekYdgEfO3705Nii9Ferqyw==', '1', '黄思怡', '软件工程', '151', '72', '13.35', '54.81', '3.30', '71.46', '49', '35', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '副班长');
INSERT INTO `userss` VALUES ('48', '1150299363', '3Jwvjr23Nu2JDX8tQG1O8g==', '1', '李埼耀', '软件工程', '152', '72', '14.40', '63.84', '13.11', '91.35', '1', '1', '男', '1996年12月', '汉族', '2015年09月', '预备党员', '15868171346', '330521199612305814', '22', '22', '无');
INSERT INTO `userss` VALUES ('49', '1150299346', 'bJF+a60D4yVKBMI+jKS4IA==', '1', '梁晓莹', '软件工程', '152', '72', '13.50', '60.13', '9.04', '82.67', '9', '6', '女', '1997年10月', '汉族', '2015年09月', '预备党员', '15868157426', '330382199710186427', '22', '22', '无');
INSERT INTO `userss` VALUES ('50', '5151594017', 'ij1PiofPJHvXGa3/cTYr6Q==', '1', '姚一城', '软件工程', '152', '72', '13.95', '60.20', '7.41', '81.56', '8', '7', '男', null, '汉族', '2015年09月', '群众', null, null, null, null, 'ACM会长');
INSERT INTO `userss` VALUES ('51', '1150299332', 'm0onAgXU5p9Od3fTPZjjPQ==', '1', '田泽', '软件工程', '152', '72', '14.25', '58.17', '4.54', '76.96', '21', '14', '男', null, '汉族', '2015年09月', '预备党员', null, null, null, null, '团支书');
INSERT INTO `userss` VALUES ('52', '1150299281', 'UQnlcq/MvsgKjKHyGLcBlg==', '1', '陈夏涵', '软件工程', '152', '72', '14.55', '58.94', '3.00', '76.49', '17', '17', '女', '1997年05月', '汉族', '2015年09月', '预备党员', '15868171694', '330727199705241222', '22', '22', '无');
INSERT INTO `userss` VALUES ('53', '1150299290', 'lFkcTQIBufohy2cmHC/HVQ==', '1', '陈泽炫', '软件工程', '152', '72', '13.35', '59.57', '2.40', '75.32', '12', '20', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('54', '1150299250', 'UfJC3OlT3vcPHlL7KqcEKA==', '1', '黄园园', '软件工程', '152', '72', '13.05', '57.54', '4.99', '75.58', '25', '19', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '班长');
INSERT INTO `userss` VALUES ('55', '1150299300', 'Qwy/udvk4OT34hH++B4p5Q==', '1', '盛永铭', '软件工程', '152', '72', '13.35', '58.94', '2.40', '74.69', '17', '23', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('56', '1150299291', 'EIkNipYmpW/qdF981L/I/g==', '1', '范智强', '软件工程', '152', '72', '13.35', '58.03', '2.10', '73.48', '23', '27', '男', '1996年12月', '汉族', '2015年09月', '共青团员', '15869120071', '332525199612301511', '22', '22', '无');
INSERT INTO `userss` VALUES ('57', '1150299260', 'EZ+8hgPK+BUUWtmD19yDfQ==', '1', '方仲俊', '软件工程', '152', '72', '12.00', '57.40', '3.71', '73.11', '27', '29', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('58', '1150299303', 'Ha4KRbPT25o/OuViwMBM5A==', '1', '孙奇', '软件工程', '152', '72', '14.40', '62.72', '11.77', '88.89', '2', '2', '男', '1996年12月', '汉族', '2015年09月', '共青团员', '15868162919', '332522199612260095', '22', '22', '学习委员');
INSERT INTO `userss` VALUES ('59', '1150299134', 'h2uLdj9mmVsqA/rIBn3gyg==', '1', '关圣凡', '数字媒体技术', '151', '83', '14.70', '61.46', '3.98', '80.14', '2', '1', '男', '1996年08月', '满族', '2015年09月', '预备党员', '15988830605', '220204199608110039', '22', '22', '团支书');
INSERT INTO `userss` VALUES ('60', '1150299063', '3LfZilBNiXouFt+N7PykVQ==', '1', '戴淑琳', '数字媒体技术', '151', '83', '14.70', '61.39', '3.45', '79.54', '3', '2', '女', '1997年08月', '汉族', '2015年09月', '预备党员', '15868171489', '330682199708100029', '22', '22', '组织委员');
INSERT INTO `userss` VALUES ('61', '1150299126', 'wVBBNF+lUTRLdXAlnQDXQA==', '1', '林姬佤', '数字媒体技术', '151', '83', '13.95', '59.22', '4.94', '78.11', '8', '6', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('62', '1150299066', 'fRE+fhF7GLLeIOfK07JMiQ==', '1', '文倩', '数字媒体技术', '151', '83', '13.95', '59.43', '3.30', '76.68', '6', '7', '女', '1994年06月', '汉族', '2015年09月', '共青团员', '17767446956', '653227199406180044', '22', '22', '无');
INSERT INTO `userss` VALUES ('63', '1150299125', 'KAk+n68bb6nQLVISQjMamg==', '1', '陈琪', '数字媒体技术', '151', '83', '14.10', '58.52', '3.60', '76.22', '10', '8', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '信息学院团委副书记');
INSERT INTO `userss` VALUES ('64', '1150299155', 'JLn/K6Bgl4Qo1WVDSl1UOQ==', '1', '周志鹏', '数字媒体技术', '151', '83', '13.95', '58.59', '2.63', '75.17', '9', '9', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('65', '1150299251', 'WMLQmIk5dsyHzgghU3XNaw==', '1', '楼雪雯', '数字媒体技术', '151', '83', '13.80', '59.71', '1.50', '75.01', '5', '10', '女', null, '汉族', '2015年09月', '预备党员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('66', '1150299161', 'eNLDis72iEGVqq+T2dRdag==', '1', '朱好', '数字媒体技术', '151', '83', '12.90', '57.26', '3.15', '73.31', '15', '12', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('67', '1150299221', 'Vi1SkWXzPI39PRELWJnROQ==', '1', '毛亚丽', '数字媒体技术', '151', '83', '13.50', '56.42', '3.15', '73.07', '22', '14', '女', '1996年10月', '汉族', '2015年09月', '共青团员', '15868177131', '330881199610065522', '43', '43', '数媒151班长');
INSERT INTO `userss` VALUES ('68', '1150299162', 'WX2uaawoltTwxeoLw8Xeaw==', '1', '陈金航', '数字媒体技术', '151', '83', '13.65', '57.26', '1.05', '71.96', '15', '17', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('69', '1150299088', 'nUP+CeCVt/MleTHNm1erVw==', '1', '严楼旭', '数字媒体技术', '151', '83', '13.35', '55.09', '3.30', '71.74', '28', '18', '男', '1997年10月', '汉族', '2015年09月', '共青团员', '15869113894', '33078119971029591X', '28', '28', '无');
INSERT INTO `userss` VALUES ('70', '1150299097', 'rDs2lauo/S1uiD2M2YlJFg==', '1', '吴颖琪', '数字媒体技术', '151', '83', '13.35', '57.47', '0.75', '71.57', '14', '19', '女', '1997年3月', '汉族', '2015年09月', '共青团员', '15868153639', '330821199703101928', '22', '22', '无');
INSERT INTO `userss` VALUES ('71', '1150299347', 'fDV7qBYBsNaSQpAdEON2/Q==', '1', '楼可欣', '数字媒体技术', '152', '83', '14.40', '59.29', '5.40', '79.09', '7', '3', '女', '1997年01月', '汉族', '2015年09月', '共青团员', '18758898144', '330281199701050446', '20', '20', '学委');
INSERT INTO `userss` VALUES ('72', '1150299380', '/sI9UqdvUv3nec135q4J+w==', '1', '张舒怡', '数字媒体技术', '152', '83', '13.50', '60.90', '4.20', '78.60', '4', '4', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('73', '1150299320', 'M2wKve0YpgP25CbnC3VIoQ==', '1', '陈立', '数字媒体技术', '152', '83', '13.05', '61.88', '3.30', '78.23', '1', '5', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '班长');
INSERT INTO `userss` VALUES ('74', '1150299375', 'EMaKpq8gy361zuRbiG2Neg==', '1', '杜晨晨', '数字媒体技术', '152', '83', '12.75', '56.91', '2.70', '72.36', '19', '15', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('75', '1150299283', 'hWxcvyEsfwTyb2hSVX7ooQ==', '1', '高佳蓉', '数字媒体技术', '152', '83', '12.60', '57.61', '2.10', '72.31', '13', '16', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('76', '1150299285', 'sOW7kLUDg96GKoLTVnCkTg==', '1', '王依晴', '数字媒体技术', '152', '83', '12.75', '53.27', '1.20', '67.22', '45', '42', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('77', '1150299082', 'jKfdjvmESl4B/aMGijQd9w==', '1', '施学成', '通信工程', '151', '45', '14.25', '57.47', '2.70', '74.42', '5', '2', '男', '1997年04月', '汉族', '2015年09月', '预备党员', '15869115347', '330724199704025414', '26', '26', '团支书');
INSERT INTO `userss` VALUES ('78', '1150299040', 'DhbTL/1YltFxteGqmePkng==', '1', '陈泽华', '通信工程', '151', '45', '14.40', '57.96', '1.95', '74.31', '4', '3', '男', '1996年08月', '汉族', '2015年09月', '预备党员', '15869107695', '330521199608283018', '26', '26', '组织委员');
INSERT INTO `userss` VALUES ('79', '1151020047', 'SAwQbPZBb+Bay6gi6Gj3Pg==', '1', '柳一洋', '通信工程', '151', '45', '13.50', '58.66', '1.50', '73.66', '2', '4', '男', '1997年07月', '汉族', '2015年09月', '共青团员', '15868178670', '142730199707150011', null, null, '心理委员');
INSERT INTO `userss` VALUES ('80', '1150299054', 'b3Yt3B+0lyIY66jJe8jPdw==', '1', '吴越', '通信工程', '151', '45', '13.35', '54.95', '3.15', '71.45', '10', '7', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('81', '1150299096', 't3cmUAfxCLsnOtuFaD9Lpg==', '1', '钱碧云', '通信工程', '151', '45', '12.90', '54.25', '0.30', '67.45', '11', '11', '女', '1997年04月', '汉族', '2015年09月', '共青团员', '15868145296', '652926199704220025', '24', '24', '副班长');
INSERT INTO `userss` VALUES ('82', '1150299099', '88/Fe0BOMo8cZPuI0UCnYg==', '1', '杨紫君', '通信工程', '151', '45', '12.60', '53.90', '0.75', '67.25', '13', '12', '女', '1998年01月', '汉族', '2015年09月', '共青团员', '15868187680', '41088119980114352X', '24', '24', '无');
INSERT INTO `userss` VALUES ('83', '1150299124', 'OkmYHsWCAB/TcbWgWetlTw==', '1', '诸承广', '通信工程', '151', '45', '13.50', '59.15', '2.25', '74.90', '1', '1', '男', '1996年04月', '汉族', '2015年09月', '共青团员', '15869121425', '330781199604184335', '48', '48', null);
INSERT INTO `userss` VALUES ('84', '1150299286', 'tRm1P/+4lGsmFGG/XYdzPw==', '1', '袁佳丽', '通信工程', '152', '45', '13.35', '55.02', '0.75', '69.12', '9', '8', '女', null, '汉族', '2015年09月', '预备党员', null, null, null, null, '学习委员');
INSERT INTO `userss` VALUES ('85', '1150299193', 'yif9zXQUy+QGYG0ETzL00w==', '1', '邵燕喃', '通信工程', '152', '45', '12.75', '53.69', '0.75', '67.19', '14', '13', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('86', '1150299389', '9eebDNF6FGsIrVZ8oH8jNw==', '1', '卢侠', '通信工程', '152', '45', '12.15', '53.97', '0.30', '66.42', '12', '15', '男', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '生活委员');
INSERT INTO `userss` VALUES ('87', '1150299182', 'Ak647FJ6fBsxIv5NcKSNpw==', '1', '叶灵杰', '物联网工程', '151', '63', '13.65', '58.59', '3.00', '75.24', '4', '6', '男', '1997年02月', '汉族', '2015年09月', '共青团员', '15868168242', '320411199702153113', '24', '24', '无');
INSERT INTO `userss` VALUES ('88', '1150299051', 'lSWTtoSPaO19VJ1LLBVEAQ==', '1', '王毅', '物联网工程', '151', '63', '14.10', '56.63', '15.00', '85.73', '10', '1', '男', '1995年12月', '汉族', '2015年09月', '共青团员', '15869102834', '130182199512313917', '22', '22', '学习委员');
INSERT INTO `userss` VALUES ('89', '1150299159', 'VyxnDxvyXHrUwrDCwsZ3Uw==', '1', '汪甫榕', '物联网工程', '151', '63', '13.20', '56.49', '6.75', '76.44', '13', '3', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '班长');
INSERT INTO `userss` VALUES ('90', '1150299065', 'qHlubm4ZXMfvW+uyzM+yPw==', '1', '蒋嫒', '物联网工程', '151', '63', '12.60', '59.08', '3.00', '74.68', '2', '7', '女', '1997年05月', '汉族', '2015年09月', '预备党员', '15869103819', '330724199705047623', '24', '24', null);
INSERT INTO `userss` VALUES ('91', '1150299167', 'PQCoAHSf0czN2tsO+6AQ1w==', '1', '蒋道航', '物联网工程', '151', '63', '12.75', '54.32', '0.00', '67.07', '19', '22', '男', '1997年10月', '汉族', '2015年09月', '共青团员', '15869106881', '522121199710093814', '22', '22', null);
INSERT INTO `userss` VALUES ('92', '1150580033', 'lPURmCUfWHzy5Z6PDEDmqA==', '1', '姜竹', '物联网工程', '152', '63', '12.90', '59.99', '3.90', '76.79', '1', '2', '女', '1996年11月', '汉族', '2015年09月', '共青团员', '15868188046', '330523199611042349', '25', '25', '无');
INSERT INTO `userss` VALUES ('93', '1150299255', 'tvxVGVniqGYV0Mq9DY7ZDQ==', '1', '张燕婷', '物联网工程', '152', '63', '12.15', '55.09', '0.75', '67.99', '15', '20', '女', null, '汉族', '2015年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('94', '1160299293', '+tQ/k8DHpVo3bsUlMI6+Lw==', '1', '冯天祥', '信息大类', '1610', '396', '13.80', '60.41', '15.00', '89.21', '20', '1', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('95', '1160299270', 'jrNuJudQBCRTeM51GHB96A==', '1', '沈费欣', '信息大类', '1610', '396', '14.40', '59.64', '12.57', '86.61', '33', '2', '女', '1998年05月', '汉族', '2016年09月', '共青团员', '13758226614', '330421199805223027', '21', '21', '团支书');
INSERT INTO `userss` VALUES ('96', '1160299023', 'UPvSmiPLS7ntqZyjVOKeSQ==', '1', '戴梁辉', '信息大类', '1601', '396', '12.90', '61.46', '12.09', '86.45', '9', '3', '男', '1998年06月', '汉族', '2016年09月', '共青团员', '13757107737', '330682199806028219', '21', '21', '无');
INSERT INTO `userss` VALUES ('97', '1160299042', '97WUJUjwcVlP8R5vytqCoA==', '1', '余剑', '信息大类', '1602', '396', '13.80', '59.71', '10.62', '84.13', '31', '4', '男', '1998年06月', '汉族', '2016年09月', '共青团员', '13758270920', '331082199806096930', '21', '21', '生活委员');
INSERT INTO `userss` VALUES ('98', '1160299178', 'Ed+neO7N78mniCxO9IOVXA==', '1', '陈永雷', '信息大类', '1606', '396', '12.75', '63.28', '7.71', '83.74', '1', '5', '男', '1997年08月', '汉族', '2016年09月', '共青团员', '13758158272', '330327199708010954', '21', '21', '无');
INSERT INTO `userss` VALUES ('99', '1160694036', 'Sv/i/3mI3eWV1M6OVir6Qw==', '1', '俞雯霞', '信息大类', '1609', '396', '13.35', '62.51', '7.14', '83.00', '5', '6', '女', '1998年02月', '汉族', '2016年09月', '共青团员', '18768114403', '331022199802280785', '22', '22', '无');
INSERT INTO `userss` VALUES ('100', '1160580006', '6dm5danG0JFMHpKs7nKMMg==', '1', '涂雅婷', '信息大类', '1602', '396', '13.50', '60.41', '8.64', '82.55', '21', '7', '女', '1998年08月', '汉族', '2016年09月', '共青团员', '13757185537', '330303199808033925', '22', '22', '无');
INSERT INTO `userss` VALUES ('101', '1160299065', 'fbwiX79+My3+vCp7DM2kxQ==', '1', '陈莎莎', '信息大类', '1603', '396', '13.50', '62.09', '6.36', '81.95', '6', '8', '女', '1998年11月', '汉族', '2016年09月', '共青团员', '13738773772', '330327199811167722', '21', '21', '团支书');
INSERT INTO `userss` VALUES ('102', '1160299316', 'lYYj3YwCwoZL4JXFAAL6vQ==', '1', '陆凯杭', '信息大类', '1611', '396', '14.55', '62.65', '4.58', '81.78', '4', '9', '男', '1997年11月', '汉族', '2016年09月', '共青团员', '15990238042', '330227199711033414', '21', '21', '副班长');
INSERT INTO `userss` VALUES ('103', '1160299001', 'C8ZR73Ymp4aNpMv9vnD5bw==', '1', '殷龙女', '信息大类', '1601', '396', '14.40', '59.57', '7.56', '81.53', '37', '10', '女', '1998年09月', '汉族', '2016年09月', '共青团员', '13758213919', '332522199809063685', '21', '21', '副班长');
INSERT INTO `userss` VALUES ('104', '1160299261', 'JCB7q47dvf2Z37r1A644GA==', '1', '蒋才喜', '信息大类', '1609', '396', '13.05', '59.29', '8.64', '80.98', '41', '11', '男', '1998年07月', '汉族', '2016年09月', '共青团员', '13758232972', '330326199807243212', '21', '21', '学习委员');
INSERT INTO `userss` VALUES ('105', '1160299242', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄睿', '信息大类', '1609', '396', '12.90', '61.53', '6.24', '80.67', '8', '12', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('106', '1160199051', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈喆', '信息大类', '1607', '396', '13.95', '60.20', '6.19', '80.35', '24', '13', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('107', '1160299311', 'Z+bsJ0dYHtsnCBFAjTBaCA==', '1', '王宇超', '信息大类', '1611', '396', '12.90', '62.79', '4.58', '80.27', '2', '14', '男', '1998年03月', '汉族', '2016年09月', '共青团员', '13758234987', '331023199803101810', '21', '21', '无');
INSERT INTO `userss` VALUES ('108', '1160299045', 'gktY+p6q/nYqC5P0KEJq6Q==', '1', '吴植成', '信息大类', '1602', '396', '12.75', '60.69', '6.81', '80.25', '18', '15', '男', '1998年3月', '汉族', '2016年09月', '共青团员', '13758262037', '330329199803220776', '21', '21', '无');
INSERT INTO `userss` VALUES ('109', '1160492024', 'PJK3nhLxF/rSupmfy0Vepg==', '1', '陈波', '信息大类', '1608', '396', '11.70', '57.05', '11.26', '80.01', '104', '16', '男', '1998年08月', '汉族', '2016年09月', '共青团员', '13758218675', '330225199808060010', '21', '21', null);
INSERT INTO `userss` VALUES ('110', '1160299136', '/0UzzLDDyCX0LRxj3oK2uQ==', '1', '王鹏程', '信息大类', '1605', '396', '13.05', '61.46', '4.35', '78.86', '10', '17', '男', '1997年11月', '汉族', '2016年09月', '共青团员', '13588878773', '330322199711073612', '21', '21', '学习委员');
INSERT INTO `userss` VALUES ('111', '1160299188', 'wnRDSB2u1DcRH6nNDYUccQ==', '1', '张钰恺', '信息大类', '1607', '396', '12.90', '60.06', '5.85', '78.81', '27', '18', '男', '1997年12月', '汉族', '2016年09月', '共青团员', '18069275078', '330226199712210017', '21', '21', '无');
INSERT INTO `userss` VALUES ('112', '1160299032', 'qUbNYwCDxI03nxmXTYUxyQ==', '1', '孙梦瑶', '信息大类', '1602', '396', '13.80', '61.74', '2.85', '78.39', '7', '19', '女', '1997年09月', '汉族', '2016年09月', '共青团员', '15068571572', '330621199709190844', '21', '21', '副班长');
INSERT INTO `userss` VALUES ('113', '1160299006', '8bI8C+VWL6WMaBvJt6i/Fg==', '1', '岑怡婷', '信息大类', '1601', '396', '13.65', '60.55', '4.13', '78.33', '19', '20', '女', '1997年11月', '汉族', '2016年09月', '共青团员', '13758179792', '330282199711104264', '21', '21', '无');
INSERT INTO `userss` VALUES ('114', '1160299021', 'rqpdfWPB7xfjhHToKQn9Sg==', '1', '罗锋', '信息大类', '1601', '396', '14.70', '58.17', '5.03', '77.90', '62', '21', '男', '1994年11月', '汉族', '2016年09月', '共青团员', '13758231084', '511011199411048019', '21', '21', '信息1601学习委员、安吉校区学生会主席');
INSERT INTO `userss` VALUES ('115', '1160299013', 'zJJOPrnTfXqC7ydkm0kwRA==', '1', '杨德建', '信息大类', '1601', '396', '13.80', '61.18', '2.85', '77.83', '13', '22', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '班长');
INSERT INTO `userss` VALUES ('116', '1160299221', 'MhQ8N/ieFI7A7Jv1qk0eBg==', '1', '许楠钒', '信息大类', '1608', '396', '12.90', '61.18', '3.39', '77.47', '14', '23', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('117', '1160299279', '2WQGhbHFyW7EO9y6L1XIkg==', '1', '颜晨曦', '信息大类', '1610', '396', '12.60', '55.09', '9.66', '77.35', '165', '24', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('118', '1160299093', 'BGFWBBoF4PoGIrQ7L2GWUg==', '1', '刘宇鑫', '信息大类', '1604', '396', '13.65', '61.46', '2.10', '77.21', '11', '25', '女', '1998年02月', '汉族', '2016年09月', '共青团员', '13758205361', '332529199802287429', '16', '16', '无');
INSERT INTO `userss` VALUES ('119', '1160299008', 'ovtDVAQkWLMMEGcW8uowRg==', '1', '支石伟', '信息大类', '1601', '396', '12.90', '57.54', '7.05', '77.49', '83', '26', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('120', '1160299335', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张旦跃', '信息大类', '1612', '396', '12.00', '61.04', '3.90', '76.94', '16', '27', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('121', '1160299091', 'ISGMyneATSuhkiwz4BURBQ==', '0', '章朱英', '信息大类', '1604', '396', '13.65', '59.64', '3.60', '76.89', '34', '28', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('122', '1160299299', 'Jxv2JUsILI2a64j3NPwOQQ==', '1', '盛晶丹', '信息大类', '1611', '396', '13.50', '59.99', '3.38', '76.87', '28', '29', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '学习委员');
INSERT INTO `userss` VALUES ('123', '1160299327', 'ISGMyneATSuhkiwz4BURBQ==', '0', '叶晓琪', '信息大类', '1612', '396', '13.80', '60.27', '2.70', '76.77', '23', '30', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('124', '1160299185', '6vOtwKKwfRfBCJi4gMIk0Q==', '1', '戴思瑶', '信息大类', '1607', '396', '13.13', '59.22', '4.35', '76.69', '43', '31', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('125', '1160299196', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王晨韬', '信息大类', '1607', '396', '12.38', '58.45', '5.85', '76.68', '55', '32', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('126', '1160299171', 'ISGMyneATSuhkiwz4BURBQ==', '0', '鲁冰', '信息大类', '1606', '396', '12.90', '62.79', '0.75', '76.44', '3', '33', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('127', '1160299063', '5iDBLGY8B+Tl2/uNWfP7/w==', '1', '刘宇琪', '信息大类', '1603', '396', '13.20', '61.11', '2.10', '76.41', '15', '34', '女', '1997年10月', '汉族', '2016年09月', '共青团员', '13758195606', '330881199710141123', '21', '21', '无');
INSERT INTO `userss` VALUES ('128', '1160610007', '3Hg/81tfAJONeQbXPsf3JA==', '1', '单家颖', '信息大类', '1606', '396', '11.70', '60.20', '4.20', '76.10', '25', '35', '女', '1998年10月', '汉族', '2016年09月', '共青团员', '13758273602', '330283199810133761', '21', '22', '无');
INSERT INTO `userss` VALUES ('129', '1160299095', 'cdoOkL5uuGtBHAlTeEbNYg==', '1', '陈诗梦', '信息大类', '1604', '396', '13.35', '59.85', '2.55', '75.75', '29', '36', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('130', '1160299059', '8u8PM/vLUpMhvjGrxEQ1Jw==', '1', '陈田沐', '信息大类', '1602', '396', '12.90', '60.41', '2.40', '75.71', '22', '37', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('131', '1160299276', 'lwCiF8noqYbwcIUa0eaI1g==', '1', '张鎏', '信息大类', '1610', '396', '13.35', '61.25', '1.05', '75.65', '12', '38', '男', null, '汉族', '2016年09月', '预备党员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('132', '1160299030', '6s3bdYIv1LDLp6bLw34MLw==', '1', '陈冲', '信息大类', '1601', '396', '13.05', '59.78', '2.70', '75.53', '30', '39', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('133', '1160299081', 'ISGMyneATSuhkiwz4BURBQ==', '0', '刘汉林', '信息大类', '1603', '396', '12.00', '59.43', '4.05', '75.48', '39', '40', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('134', '1160299034', 'O+WwTpOS3cQG2ROjwpc+kA==', '1', '刘淑一', '信息大类', '1602', '396', '14.10', '59.08', '2.10', '75.28', '48', '41', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '班长');
INSERT INTO `userss` VALUES ('135', '1160570016', 'ISGMyneATSuhkiwz4BURBQ==', '0', '刘旭辉', '信息大类', '1606', '396', '13.20', '59.50', '2.55', '75.25', '38', '42', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('136', '1160299002', 'qUwJu4XvCbNM1DZcUMd+UA==', '1', '苏晓杭', '信息大类', '1601', '396', '13.65', '56.91', '4.62', '75.18', '108', '43', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '团支书');
INSERT INTO `userss` VALUES ('137', '1160299027', 'ISGMyneATSuhkiwz4BURBQ==', '0', '傅恩辉', '信息大类', '1601', '396', '12.90', '57.61', '4.65', '75.16', '81', '44', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('138', '1160299181', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张姹群', '信息大类', '1607', '396', '13.58', '56.91', '4.56', '75.05', '109', '45', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('139', '1160299328', '4B2Su5Ns936bU3+QT9KaSw==', '1', '施慧琳', '信息大类', '1612', '396', '13.50', '57.89', '3.60', '74.99', '70', '46', '女', '1998年07月', '汉族', '2016年09月', '共青团员', '15867958856', '330781199807155585', '24', '24', '数媒162班班长');
INSERT INTO `userss` VALUES ('140', '1160299241', 'ISGMyneATSuhkiwz4BURBQ==', '0', '牟柳颖', '信息大类', '1609', '396', '13.65', '59.15', '1.95', '74.75', '46', '47', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('141', '1160299068', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赵文伟', '信息大类', '1603', '396', '13.35', '58.38', '3.00', '74.73', '58', '48', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('142', '5161510006', 'KJcSkTIFLNR1AD79kYlwSg==', '1', '郑玉弘', '信息大类', '1601', '396', '12.30', '59.29', '3.00', '74.59', '42', '49', '男', '1996年12月', '汉族', '2016年09月', '共青团员', '13758219204', '330127199612102714', '23', '23', '无');
INSERT INTO `userss` VALUES ('143', '1160692012', 'TRIXOW9K/Nd9uI/HSFJkPw==', '1', '刘梦婷', '信息大类', '1604', '396', '12.75', '58.52', '3.30', '74.57', '53', '50', '女', '1998年05月', '汉族', '2016年09月', '共青团员', '17713788239', '51382119980506516X', '20', '20', '无');
INSERT INTO `userss` VALUES ('144', '1160299338', '0X5Xiydolox2RKfxWyWu/Q==', '1', '徐贤喆', '信息大类', '1612', '396', '12.30', '57.61', '4.65', '74.56', '82', '51', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('145', '1160299050', 'ISGMyneATSuhkiwz4BURBQ==', '0', '潘文昕', '信息大类', '1602', '396', '12.15', '53.76', '8.64', '74.55', '223', '52', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('146', '1160299219', '0/F7Sgz4mqpK1Wgo5r+VIw==', '1', '袁建彪', '信息大类', '1608', '396', '13.50', '59.64', '1.35', '74.49', '35', '53', '男', '1998年08月', '汉族', '2016年09月', '共青团员', '18758463724', '330226199808271914', '24', '24', null);
INSERT INTO `userss` VALUES ('147', '1160299275', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张铁标', '信息大类', '1610', '396', '13.20', '59.15', '2.10', '74.45', '47', '54', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('148', '1161440029', 'ISGMyneATSuhkiwz4BURBQ==', '0', '刘子竹', '信息大类', '1610', '396', '12.60', '60.90', '0.90', '74.40', '17', '55', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('149', '1160299167', 'ISGMyneATSuhkiwz4BURBQ==', '0', '汪宏斌', '信息大类', '1606', '396', '12.45', '58.31', '3.54', '74.30', '59', '56', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('150', '1160299273', 'ISGMyneATSuhkiwz4BURBQ==', '0', '周志文', '信息大类', '1610', '396', '13.20', '58.87', '2.10', '74.17', '50', '57', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('151', '1160299341', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王际洲', '信息大类', '1612', '396', '13.50', '57.47', '3.15', '74.12', '89', '58', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('152', '1160299354', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈承利', '信息大类', '1612', '396', '12.90', '59.64', '1.50', '74.04', '36', '59', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('153', '1160492076', 'lngWU9RyGUzU8nc35p0wgg==', '1', '严佳敏', '信息大类', '1605', '396', '12.90', '59.71', '1.35', '73.96', '32', '60', '女', '1998年12月', '汉族', '2016年09月', '共青团员', '13758108721', '330106199812125521', '21', '21', '无');
INSERT INTO `userss` VALUES ('154', '1160299184', '+m1qiZOA5Q18Ba/w+GKFbQ==', '1', '金爱君', '信息大类', '1607', '396', '13.35', '58.03', '2.40', '73.78', '66', '61', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '文娱委员');
INSERT INTO `userss` VALUES ('155', '1160299230', 'nNy0/nNBLYSp4ncGrODMpg==', '1', '林高凡', '信息大类', '1608', '396', '12.90', '58.17', '2.70', '73.77', '63', '62', '男', '1998年07月', '汉族', '2016年09月', '共青团员', '13758275829', '331022199807251879', '22', '22', null);
INSERT INTO `userss` VALUES ('156', '1160299243', 'Qnzlh1Lg/x5HXW9v6eNZUQ==', '1', '陈琦', '信息大类', '1609', '396', '13.50', '57.47', '2.55', '73.52', '90', '63', '女', '1998年01月', '汉族', '2016年09月', '共青团员', '13758225093', '33250119980131242X', '21', '21', '信息1609班团支书');
INSERT INTO `userss` VALUES ('157', '1160299217', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张炜杭', '信息大类', '1608', '396', '12.60', '57.33', '3.57', '73.50', '94', '64', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('158', '1160299211', 'cMZrq5EQNxbZ2pS4PfVl1Q==', '1', '吴鸯鸯', '信息大类', '1608', '396', '12.90', '58.03', '2.55', '73.48', '67', '65', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '组织委员');
INSERT INTO `userss` VALUES ('159', '1160299203', 'ISGMyneATSuhkiwz4BURBQ==', '0', '蒋翔', '信息大类', '1607', '396', '12.90', '57.82', '2.55', '73.27', '73', '66', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('160', '1160299298', 'jk6WD4bg//MyEIWZ7w705w==', '1', '徐琼波', '信息大类', '1611', '396', '13.35', '56.49', '3.38', '73.22', '118', '67', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '信息1611班长');
INSERT INTO `userss` VALUES ('161', '1160299121', '0lNWorQNfgkojjoiPYtK6w==', '1', '张娟', '信息大类', '1605', '396', '13.35', '58.31', '1.50', '73.16', '60', '68', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '副班长');
INSERT INTO `userss` VALUES ('162', '1160299213', 'erMNUWFX2xyB0qpXVwnEnA==', '1', '季名节', '信息大类', '1608', '396', '12.60', '58.52', '1.95', '73.07', '54', '69', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('163', '1160299116', 'ISGMyneATSuhkiwz4BURBQ==', '0', '高迪辉', '信息大类', '1604', '396', '11.78', '59.22', '2.04', '73.04', '44', '70', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('164', '1160299041', 'Fe1Nn8WEqdA9gTz4tJYeXA==', '1', '张海森', '信息大类', '1602', '396', '13.80', '56.35', '2.85', '73.00', '125', '71', '男', '1997年10月', '汉族', '2016年09月', '共青团员', '13588863699', '330683199710132034', '21', '21', null);
INSERT INTO `userss` VALUES ('165', '1160299035', 'JWE0/bICratPuVJpbZO4rw==', '1', '韩佳齐', '信息大类', '1602', '396', '13.80', '56.00', '3.15', '72.95', '137', '72', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '2016级秀竹书院自管会主任兼安吉校区学生会副主席');
INSERT INTO `userss` VALUES ('166', '1160299152', 'OeD3MCy/51V9L2eIfgmIDQ==', '1', '魏姚瑶', '信息大类', '1606', '396', '12.75', '59.36', '0.75', '72.86', '40', '73', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('167', '1160830056', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈贝嘉', '信息大类', '1601', '396', '12.90', '58.24', '1.65', '72.79', '61', '74', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('168', '1160299325', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈成愿', '信息大类', '1611', '396', '12.30', '58.17', '2.18', '72.65', '64', '75', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('169', '1160299268', 'V7H/cnjiP/aA+sYMCSAlTw==', '1', '赵珊珊', '信息大类', '1610', '396', '13.35', '55.79', '3.45', '72.59', '143', '76', '女', '1999年05月', '汉族', '2016年09月', '共青团员', '13758246383', '620121199905087221', '21', '21', null);
INSERT INTO `userss` VALUES ('170', '1160399109', 'iSCLHANsby0UJH+uVUp7lQ==', '1', '姜晨', '信息大类', '1603', '396', '12.15', '58.45', '1.95', '72.55', '56', '77', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('171', '1160199002', 'ISGMyneATSuhkiwz4BURBQ==', '0', '朱登杰', '信息大类', '1604', '396', '12.15', '55.51', '4.83', '72.49', '148', '78', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('172', '1160610060', 'y5aVo1XPzLcERSKZ2FQwbw==', '1', '包嘉敏', '信息大类', '1603', '396', '13.05', '55.02', '4.38', '72.45', '170', '79', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('173', '1160299189', 'KJ14CFTqN0WZilFgBWH3vA==', '1', '张斯奥', '信息大类', '1607', '396', '13.05', '56.21', '3.15', '72.41', '130', '80', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '班长');
INSERT INTO `userss` VALUES ('174', '1160299246', 'o2f81BLhmh3ENjXP0rA4Tw==', '1', '张正', '信息大类', '1609', '396', '12.75', '57.68', '1.95', '72.38', '74', '81', '男', '1998年02月', '汉族', '2016年09月', '共青团员', '13758147534', '331023199802205810', '21', '21', null);
INSERT INTO `userss` VALUES ('175', '1160299003', 'ISGMyneATSuhkiwz4BURBQ==', '0', '林静文', '信息大类', '1601', '396', '13.80', '57.05', '1.50', '72.35', '105', '82', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('176', '1160299010', 'XabgpeJxi+TnAmvW5V9EDw==', '1', '张艺飞', '信息大类', '1601', '396', '12.45', '59.08', '0.75', '72.28', '49', '83', '男', '1998年01月', '汉族', '2016年09月', '共青团员', '13757123536', '140425199801201656', '21', '21', null);
INSERT INTO `userss` VALUES ('177', '1160299107', 'ISGMyneATSuhkiwz4BURBQ==', '0', '涂涛浩', '信息大类', '1604', '396', '12.75', '58.73', '0.75', '72.23', '51', '84', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('178', '1160199004', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赵杭', '信息大类', '1607', '396', '12.15', '56.49', '3.54', '72.18', '119', '85', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('179', '1160299302', 'ISGMyneATSuhkiwz4BURBQ==', '0', '周琦', '信息大类', '1611', '396', '12.15', '58.45', '1.58', '72.18', '57', '86', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('180', '1160299064', 'plDbAzerwAUSxWdv3Wi1jg==', '1', '韩梦梅', '信息大类', '1603', '396', '12.90', '56.70', '2.55', '72.15', '113', '87', '女', '1997年05月', '汉族', '2016年09月', '共青团员', '18337987682', '410381199705152023', '21', '21', null);
INSERT INTO `userss` VALUES ('181', '1160299326', 'hvRQNAuSRv/cdke+lijSVA==', '1', '周天祎', '信息大类', '1612', '396', '12.15', '57.26', '2.70', '72.11', '96', '88', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('182', '1160299309', 'ISGMyneATSuhkiwz4BURBQ==', '0', '徐林峰', '信息大类', '1611', '396', '12.30', '58.17', '1.58', '72.05', '65', '89', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('183', '1160299031', 'yCoTLfIOPGfVIt8HBacVgA==', '1', '袁丽丽', '信息大类', '1602', '396', '13.20', '57.33', '1.50', '72.03', '95', '90', '女', '1998年04月', '汉族', '2016年09月', '共青团员', '15869309523', '330226199804041927', '21', '21', '无');
INSERT INTO `userss` VALUES ('184', '1160299108', 'ISGMyneATSuhkiwz4BURBQ==', '0', '沈钰淋', '信息大类', '1604', '396', '13.65', '52.43', '5.85', '71.93', '262', '91', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('185', '1160199055', 'ISGMyneATSuhkiwz4BURBQ==', '0', '周浩钦', '信息大类', '1611', '396', '12.75', '54.74', '4.43', '71.92', '182', '92', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('186', '1160299342', 'ISGMyneATSuhkiwz4BURBQ==', '0', '孙屹成', '信息大类', '1612', '396', '13.35', '56.56', '1.95', '71.86', '115', '93', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('187', '1160299025', 'hD+c71Kw2yl5vJ0MYNqr+g==', '1', '黄帅民', '信息大类', '1601', '396', '12.45', '57.89', '1.50', '71.84', '71', '94', '男', '1997年04月', '汉族', '2016年09月', '共青团员', '13758156954', '330683199704242018', '21', '21', null);
INSERT INTO `userss` VALUES ('188', '1160299089', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈浩燕', '信息大类', '1603', '396', '11.55', '60.13', '0.00', '71.68', '26', '95', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('189', '1160299329', '83nq88gxsE3hU0adG+w0Xg==', '1', '李婷婷', '信息大类', '1612', '396', '12.15', '56.35', '3.15', '71.65', '126', '96', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('190', '1160299313', 'ISGMyneATSuhkiwz4BURBQ==', '0', ' 孙力', '信息大类', '1611', '396', '12.15', '56.56', '2.93', '71.64', '116', '97', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('191', '1160299012', 'NY6Z0oX6vzppnnV0xi0bvQ==', '1', '应佳峰', '信息大类', '1601', '396', '12.90', '57.68', '1.05', '71.63', '75', '98', '男', '1998年03月', '汉族', '2016年09月', '共青团员', '13758229717', '332526199803273513', '21', '21', null);
INSERT INTO `userss` VALUES ('192', '1160299174', 'WSi7jeHgJJ35ac1u2yR9tQ==', '1', '江铮', '信息大类', '1606', '396', '12.90', '57.68', '1.05', '71.63', '76', '99', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('193', '1160299146', 'nz0yo0wcpmQ6QElbnAqCcQ==', '1', '高家辉', '信息大类', '1605', '396', '12.30', '59.22', '0.00', '71.52', '45', '100', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('194', '1160299122', '06Lit3vTXSyyvnLJe24eZg==', '1', '王菁', '信息大类', '1605', '396', '12.75', '57.68', '1.05', '71.48', '77', '101', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('195', '1160299222', 'ISGMyneATSuhkiwz4BURBQ==', '0', '徐樑', '信息大类', '1608', '396', '12.75', '57.89', '0.75', '71.39', '72', '102', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('196', '1160299228', 'ISGMyneATSuhkiwz4BURBQ==', '0', '莫晓伟', '信息大类', '1608', '396', '12.38', '56.42', '2.58', '71.38', '122', '103', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('197', '1160299259', 'uDDim075KakoCdpuh8iVQQ==', '1', '林东旭', '信息大类', '1609', '396', '13.20', '56.07', '2.10', '71.37', '136', '104', '男', '1996年11月', '汉族', '2016年09月', '共青团员', '13758222544', '330327199611012355', '20', '21', null);
INSERT INTO `userss` VALUES ('198', '1160299210', 'ISGMyneATSuhkiwz4BURBQ==', '0', '  张滟', '信息大类', '1608', '396', '12.60', '57.47', '1.20', '71.27', '91', '105', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('199', '1160299160', 'ISGMyneATSuhkiwz4BURBQ==', '0', '臧晨阳', '信息大类', '1606', '396', '11.85', '58.66', '0.75', '71.26', '52', '106', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('200', '1160299082', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李星煜', '信息大类', '1603', '396', '13.35', '57.05', '0.75', '71.15', '106', '107', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('201', '1160299083', 'ISGMyneATSuhkiwz4BURBQ==', '0', '孔科翰', '信息大类', '1603', '396', '13.80', '52.92', '4.29', '71.01', '246', '108', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('202', '1160299155', 'LcVPUhNYF/m0j10xpLOdfw==', '1', '陈雨', '信息大类', '1606', '396', '13.05', '57.93', '0.00', '70.98', '69', '109', '女', '1998年01月', '满族', '2016年09月', '共青团员', '13758229351', '220581199801274763', '22', '22', null);
INSERT INTO `userss` VALUES ('203', '1160299350', 'ISGMyneATSuhkiwz4BURBQ==', '0', '韩非凡', '信息大类', '1612', '396', '12.15', '57.26', '1.50', '70.91', '97', '110', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('204', '1160299180', 'ZcO8hMuQghYL6oyQvMQPEA==', '1', '蔡睿晟', '信息大类', '1606', '396', '12.00', '55.37', '3.48', '70.85', '154', '111', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '生活委员');
INSERT INTO `userss` VALUES ('205', '1160299005', 'En/cdB92a48Sbg6z2yGcmg==', '1', '陈涵斐', '信息大类', '1601', '396', '13.35', '54.60', '2.85', '70.80', '189', '112', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('206', '1160299070', '1L5gIAMH8wiuy4DMNBctig==', '1', '张航', '信息大类', '1603', '396', '12.15', '56.35', '2.25', '70.75', '127', '113', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('207', '1160299075', '+nrUPnIzXanIV3AzrjXHVA==', '1', '王泽天', '信息大类', '1603', '396', '12.90', '57.54', '0.30', '70.74', '84', '114', '男', null, '汉族', '2016年09月', '预备党员', null, null, null, null, '学习委员');
INSERT INTO `userss` VALUES ('208', '1160299351', 'hnXcPgpgJuXg29+TdX6A3A==', '1', '冯瀚', '信息大类', '1612', '396', '13.35', '53.27', '4.11', '70.73', '238', '115', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '信息1612班长');
INSERT INTO `userss` VALUES ('209', '1160299004', 'ISGMyneATSuhkiwz4BURBQ==', '0', '高犇', '信息大类', '1601', '396', '13.50', '54.46', '2.70', '70.66', '196', '116', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('210', '1160299051', 'ISGMyneATSuhkiwz4BURBQ==', '0', '罗凌峰', '信息大类', '1602', '396', '13.05', '54.88', '2.70', '70.63', '175', '117', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('211', '1160299284', '8lh14cAISLTac57xLIebyA==', '1', '孙俊磊', '信息大类', '1610', '396', '13.05', '56.21', '1.35', '70.61', '131', '118', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('212', '1160299022', 'ISGMyneATSuhkiwz4BURBQ==', '0', '林昊', '信息大类', '1601', '396', '13.05', '56.00', '1.50', '70.55', '138', '119', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('213', '1160299061', 'ISGMyneATSuhkiwz4BURBQ==', '0', '詹子杭', '信息大类', '1603', '396', '12.90', '56.14', '1.50', '70.54', '132', '120', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('214', '1160299036', 'KQpKtUWtJ6cMIVjLGvaL0g==', '1', '陈金晶', '信息大类', '1602', '396', '13.05', '55.79', '1.65', '70.49', '144', '121', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('215', '1160299187', 'ISGMyneATSuhkiwz4BURBQ==', '0', '郑和', '信息大类', '1607', '396', '12.53', '57.19', '0.75', '70.47', '99', '122', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('216', '1160299154', '0H+TjD1ZH+SaDn7FMqO3IA==', '1', '黄依泓', '信息大类', '1606', '396', '12.15', '57.54', '0.75', '70.44', '85', '123', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('217', '1160299057', 'ISGMyneATSuhkiwz4BURBQ==', '0', '付万克', '信息大类', '1602', '396', '12.00', '57.54', '0.75', '70.29', '86', '124', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('218', '1160493043', 'ISGMyneATSuhkiwz4BURBQ==', '0', '谭周', '信息大类', '1605', '396', '12.15', '57.54', '0.60', '70.29', '87', '125', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('219', '1160299052', 'ISGMyneATSuhkiwz4BURBQ==', '0', '凌毅', '信息大类', '1602', '396', '12.00', '57.96', '0.30', '70.26', '68', '126', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('220', '1160610014', 'eXCpwKSL60Mg1C6+viWQXQ==', '1', '武俊彪', '信息大类', '1601', '396', '12.60', '56.28', '1.35', '70.23', '128', '127', '男', '1998年05月', '汉族', '2016年09月', '群众', '13588852195', '332522199805194776', null, null, null);
INSERT INTO `userss` VALUES ('221', '1160299047', 'st5ojgpworzdJxOCVv9xsA==', '1', '王静', '信息大类', '1602', '396', '13.65', '52.64', '3.90', '70.19', '254', '128', '男', '1997年09月', '汉族', '2016年09月', '共青团员', '13758151611', '332525199709114712', '20', '20', '无');
INSERT INTO `userss` VALUES ('222', '1160299314', 'ISGMyneATSuhkiwz4BURBQ==', '0', '三郎旺扎', '信息大类', '1611', '396', '11.70', '52.50', '5.98', '70.19', '259', '129', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('223', '1160299033', 'ISGMyneATSuhkiwz4BURBQ==', '0', '阙嘉怡', '信息大类', '1602', '396', '13.05', '54.11', '3.00', '70.16', '212', '130', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('224', '1160299039', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赵时雨', '信息大类', '1602', '396', '12.15', '57.26', '0.75', '70.16', '98', '131', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('225', '1160299020', 'ISGMyneATSuhkiwz4BURBQ==', '0', '潘铁辉', '信息大类', '1601', '396', '13.05', '55.58', '1.50', '70.13', '147', '132', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('226', '1160299110', 'ISGMyneATSuhkiwz4BURBQ==', '0', '罗熙豪', '信息大类', '1604', '396', '11.70', '57.68', '0.75', '70.13', '78', '133', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('227', '1160299286', 'ISGMyneATSuhkiwz4BURBQ==', '0', '倪嘉琪', '信息大类', '1610', '396', '11.85', '57.68', '0.60', '70.13', '79', '134', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('228', '1160299186', 'ISGMyneATSuhkiwz4BURBQ==', '0', '周宇天', '信息大类', '1607', '396', '12.53', '56.84', '0.75', '70.12', '111', '135', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('229', '1160299058', 'Q7OISn+WpKp/eeT/RRCu9g==', '1', '丁楚浩', '信息大类', '1602', '396', '12.00', '56.91', '1.20', '70.11', '110', '136', '男', null, '汉族', '2016年09月', '群众', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('230', '1160299060', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈二琪', '信息大类', '1602', '396', '12.00', '56.14', '1.95', '70.09', '133', '137', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('231', '1160299318', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李金超', '信息大类', '1611', '396', '12.45', '54.81', '2.78', '70.04', '180', '138', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('232', '1160299340', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王育涵', '信息大类', '1612', '396', '11.70', '56.77', '1.50', '69.97', '112', '139', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('233', '1160299161', 'ISGMyneATSuhkiwz4BURBQ==', '0', '俞奇鸿', '信息大类', '1606', '396', '11.70', '57.47', '0.75', '69.92', '92', '140', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('234', '1160299130', 'ZZVBHEp10eiL5Njz5cGFuA==', '1', '俞科荣', '信息大类', '1605', '396', '12.15', '55.51', '2.25', '69.91', '149', '141', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('235', '1160299304', 'rn4qCwNGfP/3m2EVH7DH/g==', '1', '赵凯', '信息大类', '1611', '396', '11.55', '57.19', '1.13', '69.87', '100', '142', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('236', '1160299229', 'ISGMyneATSuhkiwz4BURBQ==', '0', '鲁友前', '信息大类', '1608', '396', '11.63', '56.28', '1.95', '69.86', '129', '143', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('237', '1160299092', '4QrcOUm6Wau+VuBX8g+IPg==', '1', '王晴熙', '信息大类', '1604', '396', '12.90', '55.30', '1.65', '69.85', '158', '144', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '班长');
INSERT INTO `userss` VALUES ('238', '1160229232', 'ISGMyneATSuhkiwz4BURBQ==', '0', '蒋鹏鹏', '信息大类', '1608', '396', '11.70', '56.42', '1.65', '69.77', '123', '145', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('239', '1160299320', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄利勇', '信息大类', '1611', '396', '11.55', '56.63', '1.58', '69.76', '114', '146', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('240', '1160299074', 'ISGMyneATSuhkiwz4BURBQ==', '0', '吴志源', '信息大类', '1603', '396', '12.15', '57.47', '0.00', '69.62', '93', '147', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('241', '1160299106', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王霖', '信息大类', '1604', '396', '11.18', '57.68', '0.75', '69.61', '80', '148', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('242', '1160492025', 'rNZtAo/GIinqhpoW0MLf9Q==', '1', '周芝吕', '信息大类', '1610', '396', '12.60', '54.60', '2.25', '69.45', '190', '149', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('243', '1160299087', 'ISGMyneATSuhkiwz4BURBQ==', '0', '丁泉波', '信息大类', '1603', '396', '11.55', '57.12', '0.75', '69.42', '101', '150', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('244', '1160299062', 'UM3HKN/rNZ07FtZBMCfI1A==', '1', '孙梦婷', '信息大类', '1603', '396', '13.05', '55.16', '1.20', '69.41', '164', '151', '女', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('245', '1160299260', 'WouMslY3dq9Dmh5nHvv8NQ==', '1', '李航', '信息大类', '1609', '396', '12.15', '56.49', '0.75', '69.39', '120', '152', '男', '1998年05月', '汉族', '2016年09月', '共青团员', '13758135759', '13028319980522707X', null, null, '无');
INSERT INTO `userss` VALUES ('246', '1160299044', 'QH9bxAUg8NGz4vyZhmY1dg==', '1', '徐余丰', '信息大类', '1602', '396', '12.60', '54.18', '2.55', '69.33', '210', '153', '男', '1997年10月', '汉族', '2016年09月', '共青团员', '18767140270', '330127199710205135', '22', '22', '无');
INSERT INTO `userss` VALUES ('247', '1160299278', 'ISGMyneATSuhkiwz4BURBQ==', '0', '尹一杰', '信息大类', '1610', '396', '12.15', '56.56', '0.60', '69.31', '117', '154', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('248', '1160299330', 'ISGMyneATSuhkiwz4BURBQ==', '0', '方虞', '信息大类', '1612', '396', '12.90', '53.69', '2.70', '69.29', '225', '155', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('249', '1160299252', 'ISGMyneATSuhkiwz4BURBQ==', '0', '魏笑铮', '信息大类', '1609', '396', '11.55', '56.98', '0.75', '69.28', '107', '156', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('250', '1160299197', 'ISGMyneATSuhkiwz4BURBQ==', '0', '舒宇环', '信息大类', '1607', '396', '12.15', '57.12', '0.00', '69.27', '102', '157', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('251', '1160299292', 'ISGMyneATSuhkiwz4BURBQ==', '0', '龚榆贵', '信息大类', '1610', '396', '12.60', '55.44', '1.20', '69.24', '150', '158', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('252', '1160299043', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杨锐', '信息大类', '1602', '396', '13.20', '54.67', '1.35', '69.22', '186', '159', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('253', '1160610001', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张雨薇', '信息大类', '1608', '396', '12.15', '55.09', '1.95', '69.19', '166', '160', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('254', '1160299029', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈孙洋', '信息大类', '1601', '396', '12.30', '55.37', '1.50', '69.17', '155', '161', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('255', '1160299126', 'ISGMyneATSuhkiwz4BURBQ==', '0', '周俊文', '信息大类', '1605', '396', '11.63', '57.54', '0.00', '69.17', '88', '162', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('256', '1160299009', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赵奇凯', '信息大类', '1601', '396', '12.15', '55.44', '1.50', '69.09', '152', '163', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('257', '1160299140', 'ISGMyneATSuhkiwz4BURBQ==', '0', '马震宇', '信息大类', '1605', '396', '11.70', '55.44', '1.95', '69.09', '151', '164', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('258', '1160299307', 'ISGMyneATSuhkiwz4BURBQ==', '0', '应超帆', '信息大类', '1611', '396', '12.15', '56.00', '0.83', '68.97', '139', '165', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('259', '1160299139', 'ISGMyneATSuhkiwz4BURBQ==', '0', '钱远洋', '信息大类', '1605', '396', '12.90', '54.53', '1.50', '68.93', '194', '166', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('260', '1160299281', 'd0blLhLZd2CCCEPF+IfOMg==', '1', '吴江南', '信息大类', '1610', '396', '12.60', '53.97', '2.34', '68.91', '214', '167', '男', '1998年02月', '汉族', '2016年09月', '共青团员', '13758151583', '33072719980218571X', null, null, null);
INSERT INTO `userss` VALUES ('261', '1160299137', 'ISGMyneATSuhkiwz4BURBQ==', '0', '万仁奎', '信息大类', '1605', '396', '12.30', '54.88', '1.65', '68.83', '176', '168', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('262', '5160491047', 'mH820u2mBhFDWWwFVa2kPA==', '1', '苏小明', '信息大类', '1612', '396', '12.90', '54.60', '1.20', '68.70', '191', '169', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('263', '1160299255', 'xyLPU4hmpbZNn8Nz2pEVOw==', '1', '施明朗', '信息大类', '1609', '396', '12.75', '53.90', '1.95', '68.60', '216', '170', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '大一副班长');
INSERT INTO `userss` VALUES ('264', '1160299239', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张雅婷', '信息大类', '1609', '396', '11.70', '56.14', '0.75', '68.59', '134', '171', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('265', '1160493050', 'ISGMyneATSuhkiwz4BURBQ==', '0', '顾伟扬', '信息大类', '1608', '396', '11.25', '57.12', '0.15', '68.52', '103', '172', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('266', '1160299321', 'ISGMyneATSuhkiwz4BURBQ==', '0', '郭煜哲', '信息大类', '1611', '396', '11.55', '55.30', '1.58', '68.43', '159', '173', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('267', '1160299290', 'ISGMyneATSuhkiwz4BURBQ==', '0', '蒋宇迪', '信息大类', '1610', '396', '12.15', '55.65', '0.60', '68.40', '145', '174', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('268', '1160299073', 'ISGMyneATSuhkiwz4BURBQ==', '0', '徐麒皓', '信息大类', '1603', '396', '11.70', '55.93', '0.75', '68.38', '140', '175', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('269', '1161440043', 'ISGMyneATSuhkiwz4BURBQ==', '0', '刘思逸', '信息大类', '1601', '396', '12.00', '55.02', '1.35', '68.37', '171', '176', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('270', '1160299066', 'ISGMyneATSuhkiwz4BURBQ==', '0', '朱名', '信息大类', '1603', '396', '11.70', '55.86', '0.75', '68.31', '141', '177', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('271', '1160299272', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杜洁铭', '信息大类', '1610', '396', '12.60', '52.99', '2.70', '68.29', '243', '178', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('272', '1160299150', 'a6bHu5BhMDnwaZiKGmT97Q==', '1', '蔡智轩', '信息大类', '1605', '396', '11.10', '56.42', '0.75', '68.27', '124', '179', '男', '1996年10月', '汉族', '2016年09月', '共青团员', '13758184051', '429006199610100013', null, null, null);
INSERT INTO `userss` VALUES ('273', '1160299308', 'GSAftvI7P2cYMhvvWKCKOg==', '1', '杨晨浩', '信息大类', '1611', '396', '12.15', '53.83', '2.18', '68.16', '219', '180', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('274', '1160830050', 'G4mZsEjjsXemsT0QJ+PLXQ==', '1', '郝雅雯', '信息大类', '1612', '396', '11.70', '54.18', '2.25', '68.13', '211', '181', '女', '1998年11月', '汉族', '2016年09月', '共青团员', '13758140295', '620103199811245628', '20', '21', null);
INSERT INTO `userss` VALUES ('275', '1160299078', 'ISGMyneATSuhkiwz4BURBQ==', '0', '沈文彬', '信息大类', '1603', '396', '12.00', '55.37', '0.75', '68.12', '156', '182', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('276', '1160299011', 'anRPao5BoLptC2X9SXxgQQ==', '1', '张国栋', '信息大类', '1601', '396', '12.60', '53.83', '1.65', '68.08', '220', '183', '男', '2017年10月', '汉族', '2016年09月', '共青团员', '13758248970', '41150219971026451X', '23', '23', '无');
INSERT INTO `userss` VALUES ('277', '1160299097', 'ISGMyneATSuhkiwz4BURBQ==', '0', '周广炤', '信息大类', '1604', '396', '11.18', '56.14', '0.75', '68.07', '135', '184', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('278', '1160299204', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄国丰', '信息大类', '1607', '396', '12.00', '55.30', '0.75', '68.05', '160', '185', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('279', '1161020014', 'ISGMyneATSuhkiwz4BURBQ==', '0', '吴浩泽', '信息大类', '1605', '396', '11.70', '53.48', '2.85', '68.03', '233', '186', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('280', '1160299258', 'PT+NzSL2+OayZ7QSiduEhg==', '1', '鲁建强', '信息大类', '1609', '396', '12.15', '55.09', '0.75', '67.99', '167', '187', '男', '1997年11月', '汉族', '2016年09月', '共青团员', '13758141844', '330621199711291513', null, null, null);
INSERT INTO `userss` VALUES ('281', '1160299206', 'ISGMyneATSuhkiwz4BURBQ==', '0', '冯驰坤', '信息大类', '1607', '396', '12.75', '54.46', '0.75', '67.96', '197', '188', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('282', '1160299334', 'iAJL22+8dSUDYsmd6EjH4g==', '1', '张艺凡', '信息大类', '1612', '396', '12.90', '50.54', '4.48', '67.93', '303', '189', '男', '1998年07月', '汉族', '2016年09月', '共青团员', '13758106974', '621102199807015218', null, null, null);
INSERT INTO `userss` VALUES ('283', '1160299159', '87Dm5190irYl2YcA6pdL4g==', '1', '张剑文', '信息大类', '1606', '396', '11.25', '55.86', '0.75', '67.86', '142', '190', '男', '1998年11月', '汉族', '2016年09月', '共青团员', '13758207712', '410821199811220035', null, null, null);
INSERT INTO `userss` VALUES ('284', '1160299205', 'eZam0rNcE+3C8cUHL9OMPw==', '1', '龚嘉豪', '信息大类', '1607', '396', '12.15', '54.95', '0.75', '67.85', '174', '191', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('285', '1160299055', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄涛', '信息大类', '1602', '396', '13.05', '52.08', '2.70', '67.83', '273', '192', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('286', '1160299177', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杜康', '信息大类', '1606', '396', '11.70', '54.60', '1.50', '67.80', '192', '193', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('287', '1160299088', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈武俊', '信息大类', '1603', '396', '12.00', '55.02', '0.75', '67.77', '172', '194', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('288', '1160299138', 'ISGMyneATSuhkiwz4BURBQ==', '0', '施浩然', '信息大类', '1605', '396', '11.70', '53.34', '2.70', '67.74', '236', '195', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('289', '1160299071', 'ISGMyneATSuhkiwz4BURBQ==', '0', '余沈铨', '信息大类', '1603', '396', '11.55', '54.67', '1.50', '67.72', '187', '196', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('290', '1160299245', '83nq88gxsE3hU0adG+w0Xg==', '1', '郑彪', '信息大类', '1609', '396', '12.15', '54.74', '0.83', '67.72', '183', '197', '男', null, '汉族', '2016年09月', '共青团员', null, null, null, null, '无');
INSERT INTO `userss` VALUES ('291', '1160299014', 'ISGMyneATSuhkiwz4BURBQ==', '0', '徐寅杰', '信息大类', '1601', '396', '13.35', '52.71', '1.65', '67.71', '251', '198', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('292', '1160299147', 'fySHFCKxT4KluZ4WtfreUw==', '1', '杜晨路', '信息大类', '1605', '396', '12.00', '55.09', '0.60', '67.69', '168', '199', '男', '1998年11月', '汉族', '2016年09月', '群众', '13757135254', '330825199811082416', null, null, null);
INSERT INTO `userss` VALUES ('293', '1160299127', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赵肖杰', '信息大类', '1605', '396', '11.25', '55.65', '0.75', '67.65', '146', '200', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('294', '1160299016', 'xhslcGPSkc/2+UoG2RN6ZA==', '1', '王跃泮', '信息大类', '1601', '396', '12.15', '54.74', '0.75', '67.64', '184', '201', '男', '1998年09月', '汉族', '2016年09月', '共青团员', '13758224957', '330327199809303377', null, null, null);
INSERT INTO `userss` VALUES ('295', '1160299085', 'ISGMyneATSuhkiwz4BURBQ==', '0', '何诚伟', '信息大类', '1603', '396', '12.15', '54.74', '0.75', '67.64', '185', '202', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('296', '1160299100', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张何帆', '信息大类', '1604', '396', '11.55', '54.81', '1.20', '67.56', '181', '203', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('297', '1160299216', 'ISGMyneATSuhkiwz4BURBQ==', '0', '郑国柱', '信息大类', '1608', '396', '11.03', '56.49', '0.00', '67.52', '121', '204', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('298', '1160299300', 'ISGMyneATSuhkiwz4BURBQ==', '0', '劳顺亚', '信息大类', '1611', '396', '11.70', '54.39', '1.43', '67.52', '202', '205', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('299', '1160299113', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赖晓军', '信息大类', '1604', '396', '12.45', '52.71', '2.25', '67.41', '252', '206', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('300', '1160694058', 'fwND68ajuchJbSgfq6XLAw==', '1', '蒋龙辉', '信息大类', '1609', '396', '11.10', '55.23', '1.05', '67.38', '162', '207', '男', '1998年03月', '汉族', '2016年09月', '共青团员', '13758265903', '413026199803085110', null, null, null);
INSERT INTO `userss` VALUES ('301', '1160399159', 'ISGMyneATSuhkiwz4BURBQ==', '0', '唐志遥', '信息大类', '1602', '396', '12.60', '53.55', '1.20', '67.35', '229', '208', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('302', '1160299162', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杨韬', '信息大类', '1606', '396', '11.25', '55.30', '0.75', '67.30', '161', '209', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('303', '1160299158', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张兆楠', '信息大类', '1606', '396', '11.25', '55.23', '0.75', '67.23', '163', '210', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('304', '1160299124', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄博文', '信息大类', '1605', '396', '11.70', '55.37', '0.15', '67.22', '157', '211', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('305', '1160399116', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈欢', '信息大类', '1603', '396', '12.15', '53.27', '1.80', '67.22', '239', '212', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('306', '1160299343', 'ISGMyneATSuhkiwz4BURBQ==', '0', '沈聪', '信息大类', '1612', '396', '11.70', '54.88', '0.60', '67.18', '177', '213', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('307', '1160299348', 'ISGMyneATSuhkiwz4BURBQ==', '0', '金建国', '信息大类', '1612', '396', '11.70', '55.44', '0.00', '67.14', '153', '214', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('308', '1160299172', 'ISGMyneATSuhkiwz4BURBQ==', '0', '梁业成', '信息大类', '1606', '396', '11.18', '54.46', '1.50', '67.14', '198', '215', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('309', '1160299214', 'ISGMyneATSuhkiwz4BURBQ==', '0', '程斐然', '信息大类', '1608', '396', '11.55', '53.62', '1.95', '67.12', '228', '216', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('310', '1160299125', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈英倩', '信息大类', '1605', '396', '11.70', '54.32', '1.05', '67.07', '205', '217', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('311', '1160299201', 'ISGMyneATSuhkiwz4BURBQ==', '0', '林杭', '信息大类', '1607', '396', '11.63', '54.39', '1.05', '67.07', '203', '218', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('312', '1160199203', 'HvGNnnyzC0UE++3UZ9VMPQ==', '1', '黄宇林', '信息大类', '1607', '396', '11.70', '54.46', '0.90', '67.06', '199', '219', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('313', '1160399090', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李岭音', '信息大类', '1606', '396', '11.70', '54.60', '0.75', '67.05', '193', '220', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('314', '1160299026', 'ISGMyneATSuhkiwz4BURBQ==', '0', '韩俊博', '信息大类', '1601', '396', '12.15', '54.88', '0.00', '67.03', '178', '221', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('315', '1160299109', 'ISGMyneATSuhkiwz4BURBQ==', '0', '平叶超', '信息大类', '1604', '396', '11.18', '55.09', '0.75', '67.02', '169', '222', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('316', '1160299339', 'ISGMyneATSuhkiwz4BURBQ==', '0', '吴奇隆', '信息大类', '1612', '396', '11.25', '54.25', '1.50', '67.00', '207', '223', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('317', '1160299212', 'ISGMyneATSuhkiwz4BURBQ==', '0', '彭嘉敏', '信息大类', '1608', '396', '11.70', '53.13', '2.10', '66.93', '242', '224', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('318', '1160299322', 'ISGMyneATSuhkiwz4BURBQ==', '0', '冯正华', '信息大类', '1611', '396', '11.70', '54.25', '0.98', '66.93', '208', '225', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('319', '1160299251', 'ISGMyneATSuhkiwz4BURBQ==', '0', '肖俊迪', '信息大类', '1609', '396', '11.10', '54.32', '1.50', '66.92', '206', '226', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('320', '1160299296', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈成', '信息大类', '1610', '396', '12.15', '53.41', '1.35', '66.91', '235', '227', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('321', '1160299069', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张云冲', '信息大类', '1603', '396', '12.15', '53.55', '1.20', '66.90', '230', '228', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('322', '1160492016', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杨帆', '信息大类', '1602', '396', '12.60', '52.64', '1.65', '66.89', '255', '229', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('323', '1160299289', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李佳林', '信息大类', '1610', '396', '13.65', '50.54', '2.70', '66.89', '304', '230', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('324', '1160299157', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赵睿哲', '信息大类', '1606', '396', '11.25', '54.88', '0.75', '66.88', '179', '231', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('325', '1160299015', 'ISGMyneATSuhkiwz4BURBQ==', '0', '吴拓', '信息大类', '1601', '396', '12.15', '53.20', '1.50', '66.85', '240', '232', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('326', '1160299193', 'ISGMyneATSuhkiwz4BURBQ==', '0', '徐俊', '信息大类', '1607', '396', '12.08', '53.97', '0.75', '66.80', '215', '233', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('327', '1160299271', 'Olr45kAwP9jEeEL+68TiSA==', '1', '康星璐', '信息大类', '1610', '396', '13.05', '52.99', '0.75', '66.79', '244', '234', '女', '1997年05月', '汉族', '2016年09月', '共青团员', '13758237944', '14018119970502042X', '20', '21', null);
INSERT INTO `userss` VALUES ('328', '1160299076', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王凯', '信息大类', '1603', '396', '11.70', '54.25', '0.75', '66.70', '209', '235', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('329', '1160299282', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王宇', '信息大类', '1610', '396', '12.15', '53.20', '1.35', '66.70', '241', '236', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('330', '1160299080', 'ISGMyneATSuhkiwz4BURBQ==', '0', '罗松德', '信息大类', '1603', '396', '11.55', '54.39', '0.75', '66.69', '204', '237', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('331', '1160299269', 'ISGMyneATSuhkiwz4BURBQ==', '0', '熊雪菲', '信息大类', '1610', '396', '13.20', '51.24', '2.25', '66.69', '292', '238', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('332', '5160491100', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杨寿超', '信息大类', '1609', '396', '12.15', '53.48', '1.05', '66.68', '234', '239', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('333', '1160299250', 'ISGMyneATSuhkiwz4BURBQ==', '0', '许瑞峰', '信息大类', '1609', '396', '11.10', '54.04', '1.50', '66.64', '213', '240', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('334', '1160299056', 'ISGMyneATSuhkiwz4BURBQ==', '0', '韩志涛', '信息大类', '1602', '396', '12.60', '51.45', '2.55', '66.60', '284', '241', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('335', '1160299145', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赫明学', '信息大类', '1605', '396', '11.93', '54.67', '0.00', '66.60', '188', '242', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('336', '1160610053', 'ISGMyneATSuhkiwz4BURBQ==', '0', '康银琛', '信息大类', '1603', '396', '11.70', '53.69', '1.20', '66.59', '226', '243', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('337', '1160299346', 'ISGMyneATSuhkiwz4BURBQ==', '0', '林之涵', '信息大类', '1612', '396', '12.75', '52.29', '1.50', '66.54', '268', '244', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('338', '1160299198', 'ISGMyneATSuhkiwz4BURBQ==', '0', '邱国培', '信息大类', '1607', '396', '11.70', '54.53', '0.30', '66.53', '195', '245', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('339', '1160299054', 'ISGMyneATSuhkiwz4BURBQ==', '0', '康梓杨', '信息大类', '1602', '396', '12.15', '52.22', '2.10', '66.47', '271', '246', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('340', '1160299123', '/AD8o9bW9v688VkQAvKJ/A==', '1', '刘雯雯', '信息大类', '1605', '396', '11.70', '52.22', '2.55', '66.47', '270', '247', '女', '1999年02月', '汉族', '2016年09月', '共青团员', '13758148859', '452730199902044428', null, null, null);
INSERT INTO `userss` VALUES ('341', '1160299256', 'fEFy/YaDLb8sQOVFrHC0hQ==', '1', '秦环宇', '信息大类', '1609', '396', '12.15', '50.26', '4.05', '66.46', '312', '248', '男', '1998年06月', '汉族', '2016年09月', '共青团员', '13758270872', '500235199806236654', null, null, null);
INSERT INTO `userss` VALUES ('342', '1160299165', 'ISGMyneATSuhkiwz4BURBQ==', '0', '韦阳扬', '信息大类', '1606', '396', '11.25', '54.46', '0.75', '66.46', '200', '249', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('343', '1161010003', 'ISGMyneATSuhkiwz4BURBQ==', '0', '纪舒涵', '信息大类', '1610', '396', '12.15', '51.73', '2.55', '66.43', '278', '250', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('344', '1160299086', 'ISGMyneATSuhkiwz4BURBQ==', '0', '付伟豪', '信息大类', '1603', '396', '12.60', '53.83', '0.00', '66.43', '221', '251', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('345', '1160299200', 'ISGMyneATSuhkiwz4BURBQ==', '0', '鲁鑫湛', '信息大类', '1607', '396', '12.08', '53.69', '0.60', '66.37', '227', '252', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('346', '1160299319', 'ISGMyneATSuhkiwz4BURBQ==', '0', '金兵', '信息大类', '1611', '396', '11.10', '55.02', '0.23', '66.35', '173', '253', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('347', '1160299019', 'ISGMyneATSuhkiwz4BURBQ==', '0', '沈佳华', '信息大类', '1601', '396', '12.60', '52.43', '1.20', '66.23', '263', '254', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('348', '1160299134', 'ISGMyneATSuhkiwz4BURBQ==', '0', '伍一鸣', '信息大类', '1605', '396', '11.25', '53.90', '1.05', '66.20', '217', '255', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('349', '1160299223', 'ISGMyneATSuhkiwz4BURBQ==', '0', ' 温宇阳', '信息大类', '1608', '396', '11.25', '52.71', '2.10', '66.06', '253', '256', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('350', '1160299079', 'ISGMyneATSuhkiwz4BURBQ==', '0', '潘政恺', '信息大类', '1603', '396', '11.55', '54.46', '0.00', '66.01', '201', '257', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('351', '1160299046', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王云昊', '信息大类', '1602', '396', '12.60', '51.59', '1.80', '65.99', '282', '258', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('352', '1160299317', 'ISGMyneATSuhkiwz4BURBQ==', '0', '林威宇', '信息大类', '1611', '396', '13.20', '51.45', '1.28', '65.93', '285', '259', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('353', '1160399150', 'ISGMyneATSuhkiwz4BURBQ==', '0', '郑智威', '信息大类', '1602', '396', '12.60', '51.17', '2.10', '65.87', '295', '260', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('354', '1160299336', 'bhDDUW+R4Z2peFQuEiS9zw==', '1', '应聪', '信息大类', '1612', '396', '12.38', '52.43', '1.05', '65.86', '264', '261', '男', '1997年07月', '汉族', '2016年09月', '共青团员', '15336552152', '33052219970729451X', null, null, null);
INSERT INTO `userss` VALUES ('355', '1160299141', 'qZUeMUidxjOlIYMfCA+uKA==', '1', '柳永恒', '信息大类', '1605', '396', '12.60', '52.50', '0.75', '65.85', '260', '262', '男', '1998年01月', '汉族', '2016年09月', '共青团员', '13758143319', '330781199801195578', null, null, null);
INSERT INTO `userss` VALUES ('356', '1160299017', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王江辉', '信息大类', '1601', '396', '12.15', '52.92', '0.75', '65.82', '247', '263', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('357', '1160299301', 'ISGMyneATSuhkiwz4BURBQ==', '0', '范旭琼', '信息大类', '1611', '396', '11.70', '53.34', '0.67', '65.72', '237', '264', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('358', '1160299280', 'ISGMyneATSuhkiwz4BURBQ==', '0', '徐立成', '信息大类', '1610', '396', '11.18', '53.90', '0.60', '65.68', '218', '265', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('359', '1160493038', 'ISGMyneATSuhkiwz4BURBQ==', '0', '于家豪', '信息大类', '1605', '396', '12.75', '52.57', '0.30', '65.62', '256', '266', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('360', '1160299315', 'ISGMyneATSuhkiwz4BURBQ==', '0', '倪沛栋', '信息大类', '1611', '396', '12.15', '52.29', '1.13', '65.57', '269', '267', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('361', '1160299253', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王兴寅', '信息大类', '1609', '396', '12.60', '51.87', '1.08', '65.55', '276', '268', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('362', '1160299244', '64zQitf+D7rDrVnYc1fxGQ==', '1', '周欣', '信息大类', '1609', '396', '11.70', '53.76', '0.00', '65.46', '224', '269', '男', '1997年12月', '汉族', '2016年09月', '共青团员', '13758244274', '421121199712014812', '21', '21', null);
INSERT INTO `userss` VALUES ('363', '1160299297', 'ISGMyneATSuhkiwz4BURBQ==', '0', '钟钰', '信息大类', '1611', '396', '11.70', '52.15', '1.58', '65.43', '272', '270', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('364', '1160299149', 'Fpmgep5hnWva9ChFCDkKXQ==', '1', '陈杰', '信息大类', '1605', '396', '11.48', '53.55', '0.30', '65.33', '231', '271', '男', '1998年05月', '汉族', '2016年09月', '共青团员', '13758152536', '33252919980504641X', null, null, null);
INSERT INTO `userss` VALUES ('365', '1160299236', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈郁松', '信息大类', '1608', '396', '12.30', '51.80', '1.20', '65.30', '277', '272', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('366', '1160299148', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈毅阳', '信息大类', '1605', '396', '12.45', '51.94', '0.90', '65.29', '275', '273', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('367', '1160299267', 'ISGMyneATSuhkiwz4BURBQ==', '0', '曹佳鹏', '信息大类', '1609', '396', '13.20', '51.31', '0.75', '65.26', '289', '274', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('368', '1160299262', '/qC/XPjnY7SeHz21cI1HOw==', '1', '胡雄军', '信息大类', '1609', '396', '11.70', '53.55', '0.00', '65.25', '232', '275', '男', '1998年05月', '汉族', '2016年09月', '共青团员', '13758266903', '332525199805306714', '0', '21', null);
INSERT INTO `userss` VALUES ('369', '1160299164', 'ISGMyneATSuhkiwz4BURBQ==', '0', '夏天乐', '信息大类', '1606', '396', '11.18', '52.50', '1.50', '65.18', '261', '276', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('370', '1160299235', 'ISGMyneATSuhkiwz4BURBQ==', '0', '方旭琦', '信息大类', '1608', '396', '11.25', '53.83', '0.00', '65.08', '222', '277', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('371', '1160299353', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈启栋', '信息大类', '1612', '396', '11.55', '52.78', '0.75', '65.08', '249', '278', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('372', '1160299305', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张维頔', '信息大类', '1611', '396', '11.10', '52.99', '0.98', '65.07', '245', '279', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('373', '1160199250', 'ISGMyneATSuhkiwz4BURBQ==', '0', '刘伟达', '信息大类', '1608', '396', '11.10', '52.92', '0.90', '64.92', '248', '280', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('374', '1160299264', 'ISGMyneATSuhkiwz4BURBQ==', '0', '方力', '信息大类', '1609', '396', '11.70', '52.43', '0.75', '64.88', '265', '281', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('375', '1160299090', 'ISGMyneATSuhkiwz4BURBQ==', '0', '鲍俊', '信息大类', '1603', '396', '11.55', '51.38', '1.95', '64.88', '286', '282', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('376', '1160694057', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李流彬', '信息大类', '1601', '396', '11.55', '49.77', '3.45', '64.77', '317', '283', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('377', '1160299104', 'ISGMyneATSuhkiwz4BURBQ==', '0', '吴昊', '信息大类', '1604', '396', '11.48', '51.24', '1.95', '64.67', '293', '284', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('378', '1160299218', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张诺琦', '信息大类', '1608', '396', '11.70', '52.57', '0.30', '64.57', '257', '285', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('379', '1160299151', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张雪婷', '信息大类', '1606', '396', '11.70', '51.31', '1.50', '64.51', '290', '286', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('380', '1160299238', 'ISGMyneATSuhkiwz4BURBQ==', '0', '曹奇', '信息大类', '1608', '396', '11.25', '51.66', '1.50', '64.41', '280', '287', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('381', '1160299166', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王乾阳', '信息大类', '1606', '396', '11.25', '52.36', '0.75', '64.36', '267', '288', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('382', '1160299233', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄昌祥', '信息大类', '1608', '396', '11.70', '51.31', '1.20', '64.21', '291', '289', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('383', '1160299207', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈梓', '信息大类', '1607', '396', '13.35', '49.21', '1.65', '64.21', '328', '290', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('384', '1160299283', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王楚健', '信息大类', '1610', '396', '11.70', '51.59', '0.90', '64.19', '283', '291', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('385', '1150299084', 'ISGMyneATSuhkiwz4BURBQ==', '0', '汤泽宏', '信息大类', '1603', '396', '12.15', '51.10', '0.75', '64.00', '297', '292', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('386', '1160299111', 'ISGMyneATSuhkiwz4BURBQ==', '0', '刘涛', '信息大类', '1604', '396', '11.18', '52.78', '0.00', '63.96', '250', '293', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('387', '1160299040', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张肄嘉', '信息大类', '1602', '396', '12.60', '50.54', '0.75', '63.89', '305', '294', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('388', '1160299199', 'ISGMyneATSuhkiwz4BURBQ==', '0', '莫宇翔', '信息大类', '1607', '396', '11.70', '51.38', '0.75', '63.83', '287', '295', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('389', '1160199150', 'ISGMyneATSuhkiwz4BURBQ==', '0', '姜阳', '信息大类', '1607', '396', '11.70', '50.61', '1.50', '63.81', '302', '296', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('390', '1160299254', 'ISGMyneATSuhkiwz4BURBQ==', '0', '汪杰', '信息大类', '1609', '396', '11.70', '51.24', '0.75', '63.69', '294', '297', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('391', '1160299295', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈立凯', '信息大类', '1610', '396', '12.08', '49.21', '2.40', '63.69', '329', '298', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('392', '1160199058', 'ISGMyneATSuhkiwz4BURBQ==', '0', '余林铭', '信息大类', '1604', '396', '11.25', '52.43', '0.00', '63.68', '266', '299', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('393', '1160299249', 'ISGMyneATSuhkiwz4BURBQ==', '0', '叶帆', '信息大类', '1609', '396', '11.10', '52.57', '0.00', '63.67', '258', '300', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('394', '1160299120', 'ISGMyneATSuhkiwz4BURBQ==', '0', '蔡旭强', '信息大类', '1604', '396', '11.10', '51.73', '0.75', '63.58', '279', '301', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('395', '1160299227', 'ISGMyneATSuhkiwz4BURBQ==', '0', '秦通', '信息大类', '1608', '396', '11.70', '50.54', '1.20', '63.44', '306', '302', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('396', '1160299331', 'ISGMyneATSuhkiwz4BURBQ==', '0', '朱陈楠', '信息大类', '1612', '396', '11.70', '50.68', '0.90', '63.28', '301', '303', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('397', '1160299168', 'JR40ZTo0Pdi2nuVwgHoR/w==', '1', '施梁涛', '信息大类', '1606', '396', '11.25', '52.01', '0.00', '63.26', '274', '304', '男', '1997年08月', '汉族', '2016年09月', '共青团员', '13757148376', '330501199708078518', null, null, null);
INSERT INTO `userss` VALUES ('398', '1160299208', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈俊杰', '信息大类', '1607', '396', '11.85', '51.38', '0.00', '63.23', '288', '305', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('399', '1160299274', 'ISGMyneATSuhkiwz4BURBQ==', '0', '郑康盛', '信息大类', '1610', '396', '11.18', '50.47', '1.35', '63.00', '310', '306', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('400', '1160299067', 'ISGMyneATSuhkiwz4BURBQ==', '0', '周犇', '信息大类', '1603', '396', '11.70', '50.54', '0.75', '62.99', '307', '307', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('401', '1160299183', 'ISGMyneATSuhkiwz4BURBQ==', '0', '秦雨馨', '信息大类', '1607', '396', '11.70', '50.54', '0.75', '62.99', '308', '308', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('402', '1160299131', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杨茗涵', '信息大类', '1605', '396', '11.25', '51.66', '0.00', '62.91', '281', '309', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('403', '1160299248', 'ISGMyneATSuhkiwz4BURBQ==', '0', '俞徐浩', '信息大类', '1609', '396', '11.55', '50.89', '0.45', '62.89', '299', '310', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('404', '1160299084', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄文翔', '信息大类', '1603', '396', '12.15', '49.98', '0.75', '62.88', '315', '311', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('405', '1160299182', 'ISGMyneATSuhkiwz4BURBQ==', '0', '向烁', '信息大类', '1607', '396', '13.50', '48.02', '1.05', '62.57', '346', '312', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('406', '1160299176', 'ISGMyneATSuhkiwz4BURBQ==', '0', '高杰', '信息大类', '1606', '396', '11.25', '50.54', '0.75', '62.54', '309', '313', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('407', '1160299163', 'ISGMyneATSuhkiwz4BURBQ==', '0', '许浩浙', '信息大类', '1606', '396', '11.25', '51.17', '0.00', '62.42', '296', '314', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('408', '1160299053', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李良辰', '信息大类', '1602', '396', '12.15', '50.26', '0.00', '62.41', '313', '315', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('409', '1160299347', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李炯延', '信息大类', '1612', '396', '11.55', '49.35', '1.50', '62.40', '325', '316', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('410', '1160299291', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄华颖', '信息大类', '1610', '396', '12.15', '49.63', '0.60', '62.38', '319', '317', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('411', '1160299132', 'E4AfGNB7dcOMysouBfRRXg==', '1', '闫旗', '信息大类', '1605', '396', '11.63', '50.75', '0.00', '62.38', '300', '318', '男', '1997年12月', '汉族', '2016年09月', '共青团员', '13588878752', '420682199712093011', '18', '21', null);
INSERT INTO `userss` VALUES ('412', '1160299231', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李恒', '信息大类', '1608', '396', '11.55', '50.33', '0.45', '62.33', '311', '319', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('413', '1160299277', 'ISGMyneATSuhkiwz4BURBQ==', '0', '占毅韬', '信息大类', '1610', '396', '11.10', '49.77', '1.35', '62.22', '318', '320', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('414', '1150299331', 'ISGMyneATSuhkiwz4BURBQ==', '0', '潘凯航', '信息大类', '1611', '396', '11.18', '50.96', '0.08', '62.21', '298', '321', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('415', '1160299306', 'E4D72rQCHFumbslLNGa3hQ==', '1', '张彩刚', '信息大类', '1611', '396', '11.70', '49.63', '0.83', '62.16', '320', '322', '男', '1998年08月', '汉族', '2016年09月', '共青团员', '18757019723', '330821199808146874', null, null, null);
INSERT INTO `userss` VALUES ('416', '1160299247', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张锦涛', '信息大类', '1609', '396', '11.70', '49.14', '1.20', '62.04', '330', '323', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('417', '1160299028', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李久坤', '信息大类', '1601', '396', '12.15', '49.00', '0.75', '61.90', '334', '324', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('418', '1160299173', 'ISGMyneATSuhkiwz4BURBQ==', '0', '劳越洲', '信息大类', '1606', '396', '11.70', '49.28', '0.90', '61.88', '327', '325', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('419', '1160299018', 'ISGMyneATSuhkiwz4BURBQ==', '0', '唐鉴非', '信息大类', '1601', '396', '12.15', '48.09', '1.50', '61.74', '343', '326', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('420', '1160299287', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陆建合', '信息大类', '1610', '396', '11.10', '49.98', '0.60', '61.68', '316', '327', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('421', '1160299265', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈宇轩', '信息大类', '1609', '396', '11.55', '49.35', '0.75', '61.65', '326', '328', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('422', '1160299072', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杨兴晔', '信息大类', '1603', '396', '12.00', '48.09', '1.50', '61.59', '344', '329', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('423', '1160299037', 'WUiB3dbF55GiRpdSZQ3NAQ==', '1', '朱东奇', '信息大类', '1602', '396', '12.60', '47.88', '1.05', '61.53', '348', '330', '男', '1996年8月', '汉族', '2016年09月', '共青团员', '13758234929', '622722199608252412', null, null, null);
INSERT INTO `userss` VALUES ('424', '1160299118', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈星宇', '信息大类', '1604', '396', '11.10', '49.63', '0.75', '61.48', '321', '331', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('425', '1160299128', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张泽涵', '信息大类', '1605', '396', '11.25', '50.19', '0.00', '61.44', '314', '332', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('426', '1160299098', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赵祥富', '信息大类', '1604', '396', '11.18', '49.42', '0.75', '61.35', '323', '333', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('427', '1160299129', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张嘉豪', '信息大类', '1605', '396', '11.25', '48.58', '1.50', '61.33', '340', '334', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('428', '1150910030', 'ISGMyneATSuhkiwz4BURBQ==', '0', '朱恺翔', '信息大类', '1602', '396', '12.15', '49.14', '0.00', '61.29', '331', '335', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('429', '1160299234', 'ISGMyneATSuhkiwz4BURBQ==', '0', '葛冠鑫', '信息大类', '1608', '396', '11.70', '48.79', '0.75', '61.24', '338', '336', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('430', '1160299266', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈静华', '信息大类', '1609', '396', '11.70', '49.49', '0.00', '61.19', '322', '337', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('431', '1160299345', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陆宇坤', '信息大类', '1612', '396', '11.70', '47.81', '1.65', '61.16', '349', '338', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('432', '1160299220', 'ISGMyneATSuhkiwz4BURBQ==', '0', '叶鸿靖', '信息大类', '1608', '396', '11.70', '48.93', '0.30', '60.93', '335', '339', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('433', '1160299263', 'ISGMyneATSuhkiwz4BURBQ==', '0', '高字博', '信息大类', '1609', '396', '11.70', '48.44', '0.75', '60.89', '342', '340', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('434', '1160299142', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李鑫', '信息大类', '1605', '396', '11.70', '49.07', '0.00', '60.77', '332', '341', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('435', '1160299007', 'ISGMyneATSuhkiwz4BURBQ==', '0', '朱传', '信息大类', '1601', '396', '12.60', '47.25', '0.75', '60.60', '356', '342', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('436', '1161020054', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李比', '信息大类', '1606', '396', '10.95', '49.42', '0.15', '60.52', '324', '343', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('437', '1160299288', 'ISGMyneATSuhkiwz4BURBQ==', '0', '林圣力', '信息大类', '1610', '396', '11.70', '47.46', '1.35', '60.51', '351', '344', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('438', '1160299117', 'RbTEHuAvQkgneElN7omkWA==', '1', '董畅畅', '信息大类', '1604', '396', '11.18', '48.51', '0.75', '60.44', '341', '345', '男', '1999年01月', '汉族', '2016年09月', '共青团员', '13758103816', '320321199901263013', '20', '23', null);
INSERT INTO `userss` VALUES ('439', '1160299190', 'ISGMyneATSuhkiwz4BURBQ==', '0', '曾善洋', '信息大类', '1607', '396', '12.90', '47.39', '0.00', '60.29', '354', '346', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('440', '1160299144', '85XOvbGLWhREfJh0xwiZIg==', '1', '江建琳', '信息大类', '1605', '396', '11.55', '48.72', '0.00', '60.27', '339', '347', '男', '1998年09月', '汉族', '2016年09月', '共青团员', '13758224044', '14263019980929343X', null, null, null);
INSERT INTO `userss` VALUES ('441', '1160299105', 'EAjF+XMcAjfDKauuj7vEWQ==', '1', '王志勇', '信息大类', '1604', '396', '11.10', '49.07', '0.00', '60.17', '333', '348', '男', '1995年07月', '回族', '2016年09月', '共青团员', '13758262806', '341125199507200910', null, null, null);
INSERT INTO `userss` VALUES ('442', '1160299114', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄宇航', '信息大类', '1604', '396', '11.25', '48.86', '0.00', '60.11', '336', '349', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('443', '1160299175', 'ISGMyneATSuhkiwz4BURBQ==', '0', '洪浩然', '信息大类', '1606', '396', '11.25', '48.02', '0.75', '60.02', '347', '350', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('444', '1160299119', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈嘉乐', '信息大类', '1604', '396', '11.03', '48.86', '0.00', '59.89', '337', '351', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('445', '1160299024', 'ISGMyneATSuhkiwz4BURBQ==', '0', '金太阳', '信息大类', '1601', '396', '12.15', '46.83', '0.90', '59.88', '359', '352', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('446', '1160299102', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杨叶扬', '信息大类', '1604', '396', '11.63', '48.09', '0.00', '59.72', '345', '353', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('447', '1160299192', 'ISGMyneATSuhkiwz4BURBQ==', '0', '严冯扬', '信息大类', '1607', '396', '12.98', '46.55', '0.15', '59.68', '364', '354', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('448', '1160299285', 'ISGMyneATSuhkiwz4BURBQ==', '0', '邱新剑', '信息大类', '1610', '396', '11.18', '47.74', '0.60', '59.52', '350', '355', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('449', '1160299096', 'bw13a7hB56wgyGKel0F6Bg==', '1', '卓昂磊', '信息大类', '1604', '396', '11.10', '47.39', '0.60', '59.09', '355', '356', '男', '1997年11月', '汉族', '2016年09月', '共青团员', '13758225862', '330283199711017714', null, null, null);
INSERT INTO `userss` VALUES ('450', '1160299038', 'ISGMyneATSuhkiwz4BURBQ==', '0', '钟源', '信息大类', '1602', '396', '12.60', '45.64', '0.75', '58.99', '373', '357', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('451', '1160299310', 'ISGMyneATSuhkiwz4BURBQ==', '0', '吴栗威', '信息大类', '1611', '396', '11.70', '46.48', '0.67', '58.86', '365', '358', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('452', '1161010022', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄翰彬', '信息大类', '1612', '396', '11.70', '47.04', '0.00', '58.74', '358', '359', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('453', '1160299133', 'ISGMyneATSuhkiwz4BURBQ==', '0', '许豪', '信息大类', '1605', '396', '11.25', '47.46', '0.00', '58.71', '352', '360', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('454', '1160299170', 'ISGMyneATSuhkiwz4BURBQ==', '0', '茅仁周', '信息大类', '1606', '396', '11.18', '46.69', '0.75', '58.62', '362', '361', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('455', '1160299143', 'ISGMyneATSuhkiwz4BURBQ==', '0', '蓝可贤', '信息大类', '1605', '396', '11.70', '46.83', '0.00', '58.53', '360', '362', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('456', '1160299324', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈其辉', '信息大类', '1611', '396', '11.70', '45.57', '1.13', '58.40', '374', '363', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('457', '1160299094', 'ISGMyneATSuhkiwz4BURBQ==', '0', '何薇', '信息大类', '1604', '396', '11.93', '45.99', '0.45', '58.37', '367', '364', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('458', '1160299224', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王旭', '信息大类', '1608', '396', '10.88', '47.46', '0.00', '58.34', '353', '365', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('459', '1160299179', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈经纬', '信息大类', '1606', '396', '11.18', '46.83', '0.30', '58.31', '361', '366', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('460', '1160299312', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王海峰', '信息大类', '1611', '396', '11.70', '45.71', '0.83', '58.24', '372', '367', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('461', '1160299225', 'ISGMyneATSuhkiwz4BURBQ==', '0', '汪靖轩', '信息大类', '1608', '396', '10.95', '47.11', '0.00', '58.06', '357', '368', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('462', '1160299202', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李欢', '信息大类', '1607', '396', '11.93', '46.13', '0.00', '58.06', '366', '369', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('463', '1160299135', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王鑫', '信息大类', '1605', '396', '11.10', '46.69', '0.00', '57.79', '363', '370', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('464', '1160299191', 'ISGMyneATSuhkiwz4BURBQ==', '0', '叶子豪', '信息大类', '1607', '396', '11.70', '45.85', '0.00', '57.55', '369', '371', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('465', '1160299349', 'ISGMyneATSuhkiwz4BURBQ==', '0', '黄润波', '信息大类', '1612', '396', '11.70', '45.78', '0.00', '57.48', '370', '372', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('466', '1160299156', 'ISGMyneATSuhkiwz4BURBQ==', '0', '周励扬', '信息大类', '1606', '396', '11.78', '45.50', '0.00', '57.28', '375', '373', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('467', '1160299294', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈鑫', '信息大类', '1610', '396', '11.18', '45.43', '0.60', '57.21', '376', '374', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('468', '1160299332', 'ISGMyneATSuhkiwz4BURBQ==', '0', '郑阳', '信息大类', '1612', '396', '11.33', '44.66', '1.20', '57.19', '382', '375', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('469', '1160299337', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杨承林', '信息大类', '1612', '396', '10.88', '45.92', '0.30', '57.10', '368', '376', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('470', '1160299333', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赵龙杰', '信息大类', '1612', '396', '11.25', '44.31', '1.50', '57.06', '384', '377', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('471', '1160299099', 'ISGMyneATSuhkiwz4BURBQ==', '0', '张泽', '信息大类', '1604', '396', '11.25', '45.78', '0.00', '57.03', '371', '378', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('472', '1160299237', 'ISGMyneATSuhkiwz4BURBQ==', '0', '陈军', '信息大类', '1608', '396', '11.70', '45.08', '0.00', '56.78', '380', '379', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('473', '1160299115', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李子贤', '信息大类', '1604', '396', '11.18', '45.43', '0.00', '56.61', '377', '380', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('474', '1160299344', 'ISGMyneATSuhkiwz4BURBQ==', '0', '潘宁', '信息大类', '1612', '396', '11.70', '44.80', '0.00', '56.50', '381', '381', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('475', '1160299103', 'ISGMyneATSuhkiwz4BURBQ==', '0', '徐麟轩', '信息大类', '1604', '396', '11.03', '45.22', '0.00', '56.25', '378', '382', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('476', '1160299112', 'ISGMyneATSuhkiwz4BURBQ==', '0', '李阳辉', '信息大类', '1604', '396', '10.88', '45.15', '0.00', '56.03', '379', '383', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('477', '1160299101', 'ISGMyneATSuhkiwz4BURBQ==', '0', '余侃聂', '信息大类', '1604', '396', '11.10', '44.17', '0.75', '56.02', '385', '384', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('478', '1160299240', 'ISGMyneATSuhkiwz4BURBQ==', '0', '吴诗岚', '信息大类', '1609', '396', '11.70', '44.03', '0.15', '55.88', '387', '385', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('479', '1160299215', 'ISGMyneATSuhkiwz4BURBQ==', '0', '周永昱', '信息大类', '1608', '396', '10.65', '44.38', '0.30', '55.33', '383', '386', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('480', '1160299303', 'ISGMyneATSuhkiwz4BURBQ==', '0', '郑棋泓', '信息大类', '1611', '396', '11.10', '42.98', '1.13', '55.21', '390', '387', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('481', '1160299153', 'ISGMyneATSuhkiwz4BURBQ==', '0', '毛扶敏', '信息大类', '1606', '396', '11.10', '43.53', '0.00', '54.63', '388', '388', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('482', '1150299277', 'ISGMyneATSuhkiwz4BURBQ==', '0', '杨帆进涛', '信息大类', '1612', '396', '11.25', '43.05', '0.00', '54.30', '389', '389', null, null, null, '2015年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('483', '1160299209', 'ISGMyneATSuhkiwz4BURBQ==', '0', '常宜冲', '信息大类', '1607', '396', '9.67', '44.10', '0.00', '53.78', '386', '390', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('484', '1160299169', 'ISGMyneATSuhkiwz4BURBQ==', '0', '乔闯', '信息大类', '1606', '396', '11.55', '42.21', '0.00', '53.76', '393', '391', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('485', '1160299194', 'ISGMyneATSuhkiwz4BURBQ==', '0', '吴家宇', '信息大类', '1607', '396', '10.65', '42.84', '0.00', '53.49', '391', '392', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('486', '1160299226', 'ISGMyneATSuhkiwz4BURBQ==', '0', '施旭阳', '信息大类', '1608', '396', '10.88', '42.42', '0.00', '53.30', '392', '393', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('487', '1150299208', 'ISGMyneATSuhkiwz4BURBQ==', '0', '王鑫宇', '信息大类', '1607', '396', '11.55', '41.23', '0.00', '52.78', '394', '394', null, null, null, '2015年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('488', '1150580029', 'ISGMyneATSuhkiwz4BURBQ==', '0', '赵超', '信息大类', '1602', '396', '12.15', '39.27', '0.45', '51.87', '395', '395', null, null, null, '2015年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('489', '1160299257', 'ISGMyneATSuhkiwz4BURBQ==', '0', '孟佳鹏', '信息大类', '1609', '396', '0.00', '0.00', '0.00', '0.00', '396', '396', null, null, null, '2016年09月', null, null, null, null, null, null);
INSERT INTO `userss` VALUES ('621', '1150299211', 'hFVxuObEzs1fKEuAfe/DFA==', '1', '严宇杭', '电子信息工程', '151', null, null, null, null, null, null, null, '男', '1997年01月', '汉族', '2015年09月', '共青团员', '15869105066', '350322199701042576', null, null, null);
INSERT INTO `userss` VALUES ('622', '1150299280', 'hmN/O+6f6In81w5gLCLuig==', '1', '朱恒韬', '电子信息工程', '152', null, null, null, null, null, null, null, '男', '1997年03月', '汉族', '2015年09月', '共青团员', '15868193025', '330781199703283910', null, null, null);
INSERT INTO `userss` VALUES ('623', '1150299287', '0EaHBSxY3p8hdGcqpwOeGg==', '1', '包寅珂', '电子信息工程', '152', null, null, null, null, null, null, null, '男', '1997年08月', '汉族', '2016年09月', '共青团员', '15869114863', '510125199708272612', null, null, null);
INSERT INTO `userss` VALUES ('624', '1150299335', 'xaPsb3rO2wUJxfGB2/3EoA==', '1', '夏元鹏', '电子信息工程', '152', null, null, null, null, null, null, null, '男', '1996年03月', '汉族', '2016年09月', '共青团员', '15868160640', '332528199603251611', '44', '47', null);
INSERT INTO `userss` VALUES ('626', '1151020005', 'l3UD/JzQkcm7g8NVuBTAqQ==', '1', '管志远', '电子信息工程', '152', null, null, null, null, null, null, null, '男', '1997年01月', '汉族', '2015年09月', '共青团员', '15869112694', '410611199701057018', null, null, null);
INSERT INTO `userss` VALUES ('627', '5151591018', 'EjvH/ozrs2tX25zUQbVBwQ==', '1', '章红顺', '电子信息工程', '152', null, null, null, null, null, null, null, '男', '1996年11月', '汉族', '2016年09月', '共青团员', '15869100593', '330822199611183918', null, null, null);
INSERT INTO `userss` VALUES ('628', '1150299013', 'jo7BLvsS+KuJi7M76oE/1w==', '1', '李远洋', '计算机科学与技术', '151', null, null, null, null, null, null, null, '男', '1997年11月', '汉族', '2016年09月', '共青团员', '15868171096', '420202199711071618', '45', '46', null);
INSERT INTO `userss` VALUES ('629', '1150299022', 'voAlSO6v00Fu4M8Wn/4ucQ==', '1', '吴志斌', '计算机科学与技术', '151', null, null, null, null, null, null, null, '男', '1997年06月', '汉族', '2015年09月', '共青团员', '15869122475', '332525199706061512', null, null, null);
INSERT INTO `userss` VALUES ('631', '1150299057', 'VoPcp40wO3VrzaE5DI6oKA==', '1', '张哲', '计算机科学与技术', '151', null, null, null, null, null, null, null, '男', '1998年02月', '汉族', '2015年09月', '共青团员', '15868149752', '410728199802107072', null, null, null);
INSERT INTO `userss` VALUES ('633', '1150299086', 'bqykO+CqRFUvkZ9RBTm91g==', '1', '王江南', '计算机科学与技术', '151', null, null, null, null, null, null, null, '男', '1996年07月', '汉族', '2015年09月', '共青团员', '15869113002', '411082199607284218', null, null, null);
INSERT INTO `userss` VALUES ('635', '1150299118', '9k+845mEbzMX6i9ja4LFfQ==', '1', '杨弟金', '计算机科学与技术', '152', null, null, null, null, null, null, null, '男', '1997年06月', '汉族', '2015年09月', '共青团员', '15868183637', '52213019970621523X', null, null, null);
INSERT INTO `userss` VALUES ('636', '1150299149', 'gHloR91OyXlIKXwXo7ZTMw==', '1', '汪小鹏', '计算机科学与技术', '152', null, null, null, null, null, null, null, '男', '1996年08月', '汉族', '2015年09月', '群众', '15868133052', '330824199608227011', '13', '13', null);
INSERT INTO `userss` VALUES ('637', '1150299229', 'beRizUUFWAVnQll54ZL8fw==', '1', '冯嘉恒', '计算机科学与技术', '152', null, null, null, null, null, null, null, '男', '1996年06月', '汉族', '2015年09月', '共青团员', '15868188797', '230403199606030613', null, null, null);
INSERT INTO `userss` VALUES ('642', '1150299316', 'CwlIxhGGw6/YLhGq/jazPQ==', '1', '徐楠', '计算机科学与技术', '153', null, null, null, null, null, null, null, '女', '1997年06月', '汉族', '2015年09月', '共青团员', '15868196951', '330281199706087440', null, null, null);
INSERT INTO `userss` VALUES ('643', '1150299318', '27wI1FGia02g7nfaoDE+wA==', '1', '陈斌', '计算机科学与技术', '153', null, null, null, null, null, null, null, '男', '1996年12月', '汉族', '2015年09月', '共青团员', '15869114643', '33068219961227821X', null, null, null);
INSERT INTO `userss` VALUES ('644', '1150299355', '+jyJGDqDGJCqGXoLZji22w==', '1', '胡君威', '计算机科学与技术', '153', null, null, null, null, null, null, null, '男', '1997年01月', '汉族', '2015年09月', '共青团员', '15868198420', '332525199701135316', null, null, null);
INSERT INTO `userss` VALUES ('648', '1150299176', '/khbwuE8uImxtd6elcHgyA==', '1', '唐智杰', '软件工程', '151', null, null, null, null, null, null, null, '男', '1997年07月', '汉族', '2015年09月', '共青团员', '15869105934', '431103199707230034', null, null, null);
INSERT INTO `userss` VALUES ('649', '1150299222', 'mzoQkN7s17DXgov3SviWAg==', '1', '邵晓艳', '软件工程', '151', null, null, null, null, null, null, null, '女', '1997年05月', '汉族', '2016年09月', '共青团员', '15868159329', '14058119970505682X', null, null, null);
INSERT INTO `userss` VALUES ('652', '1150299249', 'Ni+zlW11eirsBa73VxBEow==', '1', '叶天华', '软件工程', '152', null, null, null, null, null, null, null, '男', '1996年08月', '汉族', '2015年09月', '共青团员', '15869107730', '330183199608103213', null, null, null);
INSERT INTO `userss` VALUES ('655', '1150299343', 'FFlJmXZ6+Z8sdECzH3GaAg==', '1', '冯海婧', '软件工程', '152', null, null, null, null, null, null, null, '女', '1996年09月', '汉族', '2015年09月', '共青团员', '15868160291', '620403199610023347', null, null, null);
INSERT INTO `userss` VALUES ('656', '1150299367', 'v2kPhEgF9GCB3aoKe/AkUg==', '1', '童汝唐', '软件工程', '152', null, null, null, null, null, null, null, '男', '2017年09月', '汉族', '2015年09月', '共青团员', '15868127452', '330327199709020812', null, null, null);
INSERT INTO `userss` VALUES ('657', '1151010058', 'ZQ8Q1nHh8mlLO6O/hxV/uw==', '1', '胡涛', '软件工程', '152', null, null, null, null, null, null, null, '男', '1995年11月', '汉族', '2015年09月', '共青团员', '15988830037', '421127199511253735', '45', '45', null);
INSERT INTO `userss` VALUES ('662', '1151020021', '261qmTmRYPZPV4PAt5i+hQ==', '1', '彭凯', '数字媒体技术', '152', null, null, null, null, null, null, null, '男', '1997年11月', '汉族', '2015年09月', '共青团员', '15868178215', '42080119971105403X', '8', '8', null);
INSERT INTO `userss` VALUES ('663', '1150299008', 'TUZy+mDu10sVhUsv1Noyvw==', '1', '杜长旺', '通信工程', '151', null, null, null, null, null, null, null, '男', '1995年05月', '汉族', '2015年09月', '共青团员', '15869118597', '411524199505294013', null, null, null);
INSERT INTO `userss` VALUES ('664', '1150299041', '6frLGT+QFjjjB1F+LiEwJw==', '1', '甘玉金', '通信工程', '151', null, null, null, null, null, null, null, '男', '1996年11月', '汉族', '2015年09月', '共青团员', '15869103515', '450981199611183515', null, null, null);
INSERT INTO `userss` VALUES ('665', '1150299055', 'V/S4s3ev+wavkqAwdnH4UA==', '1', '谢东丰', '通信工程', '151', null, null, null, null, null, null, null, '男', '1997年02月', '汉族', '2015年09月', '共青团员', '15868151452', '330683199702024711', null, null, null);
INSERT INTO `userss` VALUES ('666', '1150299059', 'R4Sxhic0xu2aLx2TI4oRpA==', '1', '周涛', '通信工程', '151', null, null, null, null, null, null, null, '男', '2017年10月', '汉族', '2016年09月', '共青团员', '15869119480', '513822199705214179', '35', '35', null);
INSERT INTO `userss` VALUES ('671', '1150299237', 'Hl7L2pa5iy8RQQBwuodefw==', '1', '罗杨', '通信工程', '152', null, null, null, null, null, null, null, '男', '1997年08月', '汉族', '2015年09月', '共青团员', '15868163190', '513030199708140052', null, null, null);
INSERT INTO `userss` VALUES ('672', '1150299264', 'VsCtCnOPJWuxxCP9l+gQWg==', '1', '李鑫', '通信工程', '152', null, null, null, null, null, null, null, '男', '1996年12月', '汉族', '2015年09月', '共青团员', '18648600412', '150205199612111016', null, null, null);
INSERT INTO `userss` VALUES ('673', '1150299345', 'ehWemoGSFQn/ZNZG9Gq0Fg==', '1', '郭秋娴', '通信工程', '152', null, null, null, null, null, null, null, '女', '1996年08月', '汉族', '2015年09月', '共青团员', '15869104266', '340521199308055228', '60', '61', null);
INSERT INTO `userss` VALUES ('674', '1150299371', 'y8ucK2Spu+lcwzIlY6E/ag==', '1', '詹新田', '通信工程', '152', null, null, null, null, null, null, null, '男', '1996年12月', '汉族', '2015年09月', '共青团员', '15869105814', '412722199612100017', null, null, null);
INSERT INTO `userss` VALUES ('675', '1150299387', 'xsnn4j1VIBfa2Ieh3otRGw==', '1', '刘志坚', '通信工程', '152', null, null, null, null, null, null, null, '男', '1995年09月', '汉族', '2016年09月', '共青团员', '15868162315', '341224199509247412', '11', '29', null);
INSERT INTO `userss` VALUES ('679', '1150299184', '2vLsfXNY6arWvX1Hy+OnOg==', '1', '赵斌', '物联网工程', '151', null, null, null, null, null, null, null, '男', '1996年06月', '汉族', '2016年09月', '预备党员', '15869106859', '371322199606206119', '22', '22', '无');
INSERT INTO `userss` VALUES ('680', '1150299196', 'IXHnrdmNR2gNG7aiN1yOIg==', '1', '陈日强', '物联网工程', '152', null, null, null, null, null, null, null, '男', '1996年09月', '汉族', '2016年09月', '共青团员', '15868137141', '152632199609214519', null, null, null);
INSERT INTO `userss` VALUES ('681', '1150299298', '4QrcOUm6Wau+VuBX8g+IPg==', '1', '吕潇凯', '物联网工程', '152', null, null, null, null, null, null, null, '男', '1998年01月', '汉族', '2016年09月', '共青团员', '18268877252', '330722199801015119', null, null, null);
INSERT INTO `userss` VALUES ('682', '1150299394', 'pb/N1y3FLOv7z45jfbB0kw==', '1', '王秀民', '物联网工程', '152', null, null, null, null, null, null, null, '男', '1997年02月', '汉族', '2015年09月', '共青团员', '15869108014', '331023199702045119', '40', '47', null);
INSERT INTO `userss` VALUES ('683', '1150299396', 'AvCNrQLwVzlkgQi2agzpwQ==', '1', '肖浩', '物联网工程', '152', null, null, null, null, null, null, null, '男', '1996年10月', '汉族', '2015年09月', '共青团员', '15868158334', '330127199610102737', null, null, null);
INSERT INTO `userss` VALUES ('684', '1150299398', 'mkv6ynh/0Iun0/yuS5/VOw==', '1', '叶长勇', '物联网工程', '152', null, null, null, null, null, null, null, '男', '2017年10月', '汉族', '2016年09月', '群众', '15869114702', '332528199704260816', null, null, null);
