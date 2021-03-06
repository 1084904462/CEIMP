/*
Navicat MySQL Data Transfer

Source Server         : weige
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ceimp

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2018-05-28 11:21:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `award`
-- ----------------------------
DROP TABLE IF EXISTS `award`;
CREATE TABLE `award` (
  `award_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '获奖id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `scholarship_id` bigint(20) NOT NULL COMMENT '奖学金id',
  `is_filled` int(20) NOT NULL COMMENT '是否已填写，0-未填，1-已填',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  PRIMARY KEY (`award_id`),
  UNIQUE KEY `award_id` (`award_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `scholarship_id` (`scholarship_id`),
  CONSTRAINT `award_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `award_ibfk_2` FOREIGN KEY (`scholarship_id`) REFERENCES `scholarship` (`scholarship_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of award
-- ----------------------------

-- ----------------------------
-- Table structure for `class_num`
-- ----------------------------
DROP TABLE IF EXISTS `class_num`;
CREATE TABLE `class_num` (
  `class_num_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '班级号id',
  `num` varchar(20) NOT NULL COMMENT '班级号',
  `major_id` bigint(20) NOT NULL COMMENT '专业id',
  PRIMARY KEY (`class_num_id`),
  UNIQUE KEY `class_num_id` (`class_num_id`) USING BTREE,
  KEY `major_id` (`major_id`),
  CONSTRAINT `class_num_ibfk_1` FOREIGN KEY (`major_id`) REFERENCES `major` (`major_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_num
-- ----------------------------

-- ----------------------------
-- Table structure for `major`
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `major_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '专业id',
  `name` varchar(50) NOT NULL COMMENT '专业名称',
  `school_id` bigint(20) NOT NULL COMMENT '学院id',
  `grade` varchar(20) NOT NULL COMMENT '年级',
  PRIMARY KEY (`major_id`),
  UNIQUE KEY `major_id` (`major_id`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `major_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------

-- ----------------------------
-- Table structure for `manager`
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `manager_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `account` varchar(20) NOT NULL COMMENT '登录账号',
  `password` varchar(50) NOT NULL COMMENT '登录密码',
  `manager_type` int(20) NOT NULL COMMENT '管理员类型 1-高级管理员，2-子管理员',
  `school_id` bigint(20) NOT NULL COMMENT '所属学院id',
  PRIMARY KEY (`manager_id`),
  UNIQUE KEY `manager_id` (`manager_id`) USING BTREE,
  UNIQUE KEY `account` (`account`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `manager_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1', '1150299070', 'ZTLcLq+BaR2y9kFF0eCBzw==', '1', '1');

-- ----------------------------
-- Table structure for `ng`
-- ----------------------------
DROP TABLE IF EXISTS `ng`;
CREATE TABLE `ng` (
  `ng_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '国家助学金id',
  `user_id` bigint(20) NOT NULL COMMENT '用户基本信息id',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `resident` varchar(50) DEFAULT '' COMMENT '家庭户口',
  `income_source` varchar(50) DEFAULT '' COMMENT '收入来源',
  `month_income` varchar(50) DEFAULT '' COMMENT '家庭月总收入',
  `family_sum` varchar(50) DEFAULT '' COMMENT '家庭人口总数',
  `address` varchar(100) DEFAULT '' COMMENT '家庭住址',
  `postal_code` varchar(50) DEFAULT '' COMMENT '邮政编码',
  `situation` varchar(50) DEFAULT '' COMMENT '认定情况',
  `f_name1` varchar(50) DEFAULT '' COMMENT '家族成员姓名',
  `age1` varchar(50) DEFAULT '' COMMENT '家族成员年龄',
  `relation1` varchar(50) DEFAULT '' COMMENT '与本人关系',
  `work_place1` varchar(50) DEFAULT '' COMMENT '工作或学习单位',
  `f_name2` varchar(50) DEFAULT '',
  `age2` varchar(50) DEFAULT '',
  `relation2` varchar(50) DEFAULT '',
  `work_place2` varchar(50) DEFAULT '',
  `f_name3` varchar(50) DEFAULT '',
  `age3` varchar(50) DEFAULT '',
  `relation3` varchar(50) DEFAULT '',
  `work_place3` varchar(50) DEFAULT '',
  `f_name4` varchar(50) DEFAULT '',
  `age4` varchar(50) DEFAULT '',
  `relation4` varchar(50) DEFAULT '',
  `work_place4` varchar(50) DEFAULT '',
  `f_name5` varchar(50) DEFAULT '',
  `age5` varchar(50) DEFAULT '',
  `relation5` varchar(50) DEFAULT '',
  `work_place5` varchar(50) DEFAULT '',
  `apply_reason` varchar(500) DEFAULT '' COMMENT '申请理由',
  `opinion` varchar(50) DEFAULT '' COMMENT '院系意见',
  PRIMARY KEY (`ng_id`),
  UNIQUE KEY `ng_id` (`ng_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `ng_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ng
-- ----------------------------

-- ----------------------------
-- Table structure for `nis`
-- ----------------------------
DROP TABLE IF EXISTS `nis`;
CREATE TABLE `nis` (
  `nis_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '国家励志奖学金id',
  `user_id` bigint(20) NOT NULL COMMENT '用户基本信息id',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `date1` varchar(50) DEFAULT '' COMMENT '获奖日期',
  `award1` varchar(50) DEFAULT '' COMMENT '奖项名称',
  `unit1` varchar(50) DEFAULT '' COMMENT '颁奖单位',
  `date2` varchar(50) DEFAULT '',
  `award2` varchar(50) DEFAULT '',
  `unit2` varchar(50) DEFAULT '',
  `date3` varchar(50) DEFAULT '',
  `award3` varchar(50) DEFAULT '',
  `unit3` varchar(50) DEFAULT '',
  `date4` varchar(50) DEFAULT '',
  `award4` varchar(50) DEFAULT '',
  `unit4` varchar(50) DEFAULT '',
  `resident` varchar(50) DEFAULT '' COMMENT '家庭户口',
  `income_source` varchar(50) DEFAULT '' COMMENT '收入来源',
  `month_income` varchar(50) DEFAULT '' COMMENT '家庭月总收入',
  `family_sum` varchar(50) DEFAULT '' COMMENT '家庭人口总数',
  `address` varchar(100) DEFAULT '' COMMENT '家庭住址',
  `postal_code` varchar(50) DEFAULT '' COMMENT '邮政编码',
  `situation` varchar(50) DEFAULT '' COMMENT '认定情况',
  `apply_reason` varchar(500) DEFAULT '' COMMENT '申请理由',
  PRIMARY KEY (`nis_id`),
  UNIQUE KEY `nis_id` (`nis_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `nis_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nis
-- ----------------------------

-- ----------------------------
-- Table structure for `opinion`
-- ----------------------------
DROP TABLE IF EXISTS `opinion`;
CREATE TABLE `opinion` (
  `opinion_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `grade` varchar(20) NOT NULL,
  `school_id` bigint(20) NOT NULL,
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `nis_opinion` varchar(500) DEFAULT '',
  `pgs_recommend` varchar(500) DEFAULT '',
  `pgs_opinion` varchar(500) DEFAULT '',
  `ss_opinion` varchar(500) DEFAULT '',
  `tas_opinion` varchar(500) DEFAULT '',
  PRIMARY KEY (`opinion_id`),
  UNIQUE KEY `opinion_id` (`opinion_id`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `opinion_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of opinion
-- ----------------------------

-- ----------------------------
-- Table structure for `pgs`
-- ----------------------------
DROP TABLE IF EXISTS `pgs`;
CREATE TABLE `pgs` (
  `pgs_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '省政府奖学金id',
  `user_id` bigint(20) NOT NULL COMMENT '用户基本信息id',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `date1` varchar(50) DEFAULT '' COMMENT '获奖日期',
  `award1` varchar(50) DEFAULT '' COMMENT '奖项名称',
  `unit1` varchar(50) DEFAULT '' COMMENT '颁奖单位',
  `date2` varchar(50) DEFAULT '',
  `award2` varchar(50) DEFAULT '',
  `unit2` varchar(50) DEFAULT '',
  `date3` varchar(50) DEFAULT '',
  `award3` varchar(50) DEFAULT '',
  `unit3` varchar(50) DEFAULT '',
  `date4` varchar(50) DEFAULT '',
  `award4` varchar(50) DEFAULT '',
  `unit4` varchar(50) DEFAULT '',
  `apply_reason` varchar(500) DEFAULT NULL COMMENT '申请理由',
  PRIMARY KEY (`pgs_id`),
  UNIQUE KEY `pgs_id` (`pgs_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `pgs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pgs
-- ----------------------------

-- ----------------------------
-- Table structure for `scholarship`
-- ----------------------------
DROP TABLE IF EXISTS `scholarship`;
CREATE TABLE `scholarship` (
  `scholarship_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '奖学金id',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '奖学金名称',
  `model_name` varchar(50) NOT NULL DEFAULT '' COMMENT '模板名称',
  `sub_name` varchar(20) NOT NULL COMMENT '奖学金缩写',
  PRIMARY KEY (`scholarship_id`),
  UNIQUE KEY `scholarship_id` (`scholarship_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scholarship
-- ----------------------------
INSERT INTO `scholarship` VALUES ('1', '国家助学金', '国家助学金模板', 'ng');
INSERT INTO `scholarship` VALUES ('2', '国家励志奖学金', '国家励志奖学金模板', 'nis');
INSERT INTO `scholarship` VALUES ('3', '省政府奖学金', '省政府奖学金模板', 'pgs');
INSERT INTO `scholarship` VALUES ('4', '三好学生', '三好学生模板', 'tas');
INSERT INTO `scholarship` VALUES ('5', '优秀学生一等奖学金', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('6', '优秀学生二等奖学金', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('7', '优秀学生三等奖学金', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('8', '学业优秀一等奖学金', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('9', '学业优秀二等奖学金', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('10', '学业优秀三等奖学金', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('11', '优良学风奖', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('12', '外语成绩优秀奖', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('13', '文体优秀奖', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('14', '社团活动奖', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('15', '突出贡献奖', '校奖学金模板', 'ss');
INSERT INTO `scholarship` VALUES ('16', '学习进步奖', '校奖学金模板', 'ss');

-- ----------------------------
-- Table structure for `school`
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `school_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学院id',
  `name` varchar(50) NOT NULL COMMENT '学院名称',
  PRIMARY KEY (`school_id`),
  UNIQUE KEY `school_id` (`school_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES ('1', '信息与电子工程学院');

-- ----------------------------
-- Table structure for `ss`
-- ----------------------------
DROP TABLE IF EXISTS `ss`;
CREATE TABLE `ss` (
  `ss_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '校奖学金',
  `user_id` bigint(20) NOT NULL COMMENT '用户基本信息id',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `apply_reason` varchar(500) DEFAULT '' COMMENT '主要事迹与表现',
  PRIMARY KEY (`ss_id`),
  UNIQUE KEY `ss_id` (`ss_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `ss_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ss
-- ----------------------------

-- ----------------------------
-- Table structure for `tas`
-- ----------------------------
DROP TABLE IF EXISTS `tas`;
CREATE TABLE `tas` (
  `tas_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '三好学生id',
  `user_id` bigint(20) NOT NULL COMMENT '用户基本信息id',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `apply_reason` varchar(500) DEFAULT '' COMMENT '主要事迹与表现',
  PRIMARY KEY (`tas_id`),
  UNIQUE KEY `tas_id` (`tas_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `tas_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tas
-- ----------------------------

-- ----------------------------
-- Table structure for `user_basic`
-- ----------------------------
DROP TABLE IF EXISTS `user_basic`;
CREATE TABLE `user_basic` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户基本信息id',
  `account` varchar(20) NOT NULL COMMENT '登录账号',
  `password` varchar(50) NOT NULL COMMENT '登录密码',
  `username` varchar(20) NOT NULL COMMENT '姓名',
  `sex` varchar(20) DEFAULT '' COMMENT '性别',
  `birth` varchar(20) DEFAULT '' COMMENT '出生年月',
  `nation` varchar(20) DEFAULT '' COMMENT '民族',
  `entrance` varchar(20) DEFAULT '' COMMENT '入学年月',
  `identity` varchar(20) DEFAULT '' COMMENT '身份证',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id` (`user_id`) USING BTREE,
  UNIQUE KEY `account` (`account`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_basic
-- ----------------------------

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `info_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户动态信息id',
  `user_id` bigint(20) NOT NULL COMMENT '用户基本信息id',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `class_num_id` bigint(20) NOT NULL COMMENT '班级号id',
  `political` varchar(20) DEFAULT '' COMMENT '政治面貌',
  `phone` varchar(20) DEFAULT '' COMMENT '手机号',
  `job` varchar(20) DEFAULT '' COMMENT '职务',
  `charact` varchar(20) DEFAULT '' COMMENT '品德素质',
  `study` varchar(20) DEFAULT '' COMMENT '学业素质',
  `ability` varchar(20) DEFAULT '' COMMENT '发展能力',
  `total` varchar(20) DEFAULT '' COMMENT '总分',
  `gp_rank` varchar(20) DEFAULT '' COMMENT '绩点排名',
  `ce_rank` varchar(20) DEFAULT '' COMMENT '综测排名',
  `pass_sum` varchar(20) DEFAULT '' COMMENT '通过必修课数',
  `class_sum` varchar(20) DEFAULT '' COMMENT '总必修课数',
  `major_sum` varchar(20) DEFAULT '' COMMENT '专业总人数',
  PRIMARY KEY (`info_id`),
  UNIQUE KEY `info_id` (`info_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `class_num_id` (`class_num_id`),
  CONSTRAINT `user_info_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_info_ibfk_2` FOREIGN KEY (`class_num_id`) REFERENCES `class_num` (`class_num_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
