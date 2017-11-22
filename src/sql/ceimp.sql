/*
Navicat MySQL Data Transfer

Source Server         : weige
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ceimp

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-11-22 19:41:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `award`
-- ----------------------------
DROP TABLE IF EXISTS `award`;
CREATE TABLE `award` (
  `award_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `scholarship_id` bigint(20) NOT NULL,
  `is_filled` int(20) NOT NULL COMMENT '是否已填写，0-未填，1-已填',
  `year_scope` int(20) NOT NULL,
  PRIMARY KEY (`award_id`),
  UNIQUE KEY `award_id` (`award_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `scholarship_id` (`scholarship_id`),
  CONSTRAINT `award_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `award_ibfk_2` FOREIGN KEY (`scholarship_id`) REFERENCES `scholarship` (`scholarship_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of award
-- ----------------------------
INSERT INTO `award` VALUES ('1', '1', '1', '1', '2017');
INSERT INTO `award` VALUES ('2', '1', '2', '1', '2017');
INSERT INTO `award` VALUES ('3', '1', '3', '1', '2017');
INSERT INTO `award` VALUES ('4', '1', '4', '1', '2017');
INSERT INTO `award` VALUES ('5', '1', '5', '1', '2017');

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_num
-- ----------------------------
INSERT INTO `class_num` VALUES ('1', '151', '1');
INSERT INTO `class_num` VALUES ('2', '152', '1');
INSERT INTO `class_num` VALUES ('3', '151', '2');
INSERT INTO `class_num` VALUES ('4', '152', '2');
INSERT INTO `class_num` VALUES ('5', '151', '3');
INSERT INTO `class_num` VALUES ('6', '152', '3');
INSERT INTO `class_num` VALUES ('7', '153', '3');
INSERT INTO `class_num` VALUES ('8', '151', '4');
INSERT INTO `class_num` VALUES ('9', '152', '4');
INSERT INTO `class_num` VALUES ('10', '153', '4');

-- ----------------------------
-- Table structure for `major`
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `major_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '专业id',
  `name` varchar(50) NOT NULL COMMENT '专业名称',
  `school_id` bigint(20) NOT NULL COMMENT '学院id',
  `grade` varchar(20) NOT NULL COMMENT '年级',
  `sum` int(20) NOT NULL COMMENT '专业人数',
  PRIMARY KEY (`major_id`),
  UNIQUE KEY `major_id` (`major_id`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `major_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------
INSERT INTO `major` VALUES ('1', '软件工程', '1', '2015', '74');
INSERT INTO `major` VALUES ('2', '软件工程', '1', '2016', '80');
INSERT INTO `major` VALUES ('3', '计算机科学与技术', '1', '2015', '60');
INSERT INTO `major` VALUES ('4', '计算机科学与技术', '1', '2016', '80');
INSERT INTO `major` VALUES ('5', '数字媒体技术', '1', '2015', '60');
INSERT INTO `major` VALUES ('6', '物联网工程', '1', '2016', '80');
INSERT INTO `major` VALUES ('7', '电子信息工程', '1', '2016', '50');

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
  `grade` varchar(20) NOT NULL COMMENT '所管理的年级',
  PRIMARY KEY (`manager_id`),
  UNIQUE KEY `manager_id` (`manager_id`) USING BTREE,
  UNIQUE KEY `account` (`account`) USING BTREE,
  KEY `school_id` (`school_id`),
  CONSTRAINT `manager_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1', '1150299070', 'ZTLcLq+BaR2y9kFF0eCBzw==', '1', '1', '2015');

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ng
-- ----------------------------
INSERT INTO `ng` VALUES ('1', '1', '2017', '农村', '打工', '3000', '5', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '啊', '同意一档国家助学金');

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nis
-- ----------------------------
INSERT INTO `nis` VALUES ('1', '1', '2017', '2017年11月', '啊', '啊', '2017年11月', '啊', '啊', '2017年11月', '啊', '啊', '2017年11月', '啊', '啊', '城镇', '打工', '3000', '5', '浙江省', '315315', '家庭经济特别困难', '啊');

-- ----------------------------
-- Table structure for `opinion`
-- ----------------------------
DROP TABLE IF EXISTS `opinion`;
CREATE TABLE `opinion` (
  `opinion_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `manager_id` bigint(20) NOT NULL,
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `nis_opinion` varchar(500) DEFAULT '',
  `pgs_recommend` varchar(500) DEFAULT '',
  `pgs_opinion` varchar(500) DEFAULT '',
  `ss_opinion` varchar(500) DEFAULT '',
  `tas_opinion` varchar(500) DEFAULT '',
  PRIMARY KEY (`opinion_id`),
  UNIQUE KEY `opinion_id` (`opinion_id`) USING BTREE,
  KEY `manager_id` (`manager_id`),
  CONSTRAINT `opinion_ibfk_1` FOREIGN KEY (`manager_id`) REFERENCES `manager` (`manager_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of opinion
-- ----------------------------
INSERT INTO `opinion` VALUES ('1', '1', '2017', '小', '菜', '鸡', '唧', '唧');
INSERT INTO `opinion` VALUES ('2', '1', '2016', '这', '个', '是', '测', '试');

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pgs
-- ----------------------------
INSERT INTO `pgs` VALUES ('1', '1', '2017', '2017年11月', '啊哈', '浙江省教育厅', '2017年11月', '啊哈', '浙江省教育厅', '2017年11月', '啊哈', '浙江省教育厅', '2017年11月', '啊哈', '浙江省教育厅', '啊');

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES ('1', '信息与电子工程学院');
INSERT INTO `school` VALUES ('2', '理学院');

-- ----------------------------
-- Table structure for `ss`
-- ----------------------------
DROP TABLE IF EXISTS `ss`;
CREATE TABLE `ss` (
  `ss_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '校奖学金',
  `user_id` bigint(20) NOT NULL COMMENT '用户基本信息id',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `reason` varchar(500) DEFAULT '' COMMENT '主要事迹与表现',
  PRIMARY KEY (`ss_id`),
  UNIQUE KEY `ss_id` (`ss_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `ss_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ss
-- ----------------------------
INSERT INTO `ss` VALUES ('1', '1', '2017', '厉害');

-- ----------------------------
-- Table structure for `tas`
-- ----------------------------
DROP TABLE IF EXISTS `tas`;
CREATE TABLE `tas` (
  `tas_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '三好学生id',
  `user_id` bigint(20) NOT NULL COMMENT '用户基本信息id',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `reason` varchar(500) DEFAULT '' COMMENT '主要事迹与表现',
  PRIMARY KEY (`tas_id`),
  UNIQUE KEY `tas_id` (`tas_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `tas_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tas
-- ----------------------------
INSERT INTO `tas` VALUES ('1', '1', '2017', '搜索');

-- ----------------------------
-- Table structure for `user_basic`
-- ----------------------------
DROP TABLE IF EXISTS `user_basic`;
CREATE TABLE `user_basic` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户基本信息id',
  `account` varchar(20) NOT NULL COMMENT '登录账号',
  `password` varchar(50) NOT NULL COMMENT '登录密码',
  `username` varchar(20) NOT NULL COMMENT '姓名',
  `class_num_id` bigint(20) NOT NULL COMMENT '班级号id',
  `sex` varchar(20) DEFAULT '' COMMENT '性别',
  `birth` varchar(20) DEFAULT '' COMMENT '出生年月',
  `nation` varchar(20) DEFAULT '' COMMENT '民族',
  `entrance` varchar(20) DEFAULT '' COMMENT '入学年月',
  `political` varchar(20) DEFAULT '' COMMENT '政治面貌',
  `phone` varchar(20) DEFAULT '' COMMENT '手机号',
  `identity` varchar(20) DEFAULT '' COMMENT '身份证',
  `job` varchar(20) DEFAULT '' COMMENT '职务',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id` (`user_id`) USING BTREE,
  UNIQUE KEY `account` (`account`) USING BTREE,
  KEY `class_num_id` (`class_num_id`),
  CONSTRAINT `user_basic_ibfk_1` FOREIGN KEY (`class_num_id`) REFERENCES `class_num` (`class_num_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_basic
-- ----------------------------
INSERT INTO `user_basic` VALUES ('1', '1150299070', 'ZTLcLq+BaR2y9kFF0eCBzw==', '陈小弟', '1', '男', '1996年12月', '汉族', '2015年09月', '共青团员', '15869104199', '330282199612272333', '无');
INSERT INTO `user_basic` VALUES ('2', '1150299250', 'ZTLcLq+BaR2y9kFF0eCBzw==', '黄大老', '2', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('3', '1150299260', 'ZTLcLq+BaR2y9kFF0eCBzw==', '方大老', '2', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('4', '1150299190', 'ZTLcLq+BaR2y9kFF0eCBzw==', '顾大老', '1', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('5', '1150299001', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试1', '3', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('6', '1150299002', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试2', '3', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('7', '1150299003', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试3', '4', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('8', '1150299004', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试4', '5', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('9', '1150299005', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试5', '5', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('10', '1150299006', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试6', '6', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('11', '1150299007', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试7', '7', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('12', '1150299008', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试8', '7', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('13', '1150299009', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试9', '8', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('14', '1150299010', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试10', '9', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('15', '1150299011', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试11', '10', '', '', '', '', '', '', '', '');
INSERT INTO `user_basic` VALUES ('16', '1150299012', 'ZTLcLq+BaR2y9kFF0eCBzw==', '测试12', '10', '', '', '', '', '', '', '', '');

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `info_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户动态信息id',
  `user_id` bigint(20) NOT NULL COMMENT '用户基本信息id',
  `year_scope` int(20) NOT NULL COMMENT '适用年份',
  `charact` varchar(20) DEFAULT '' COMMENT '品德素质',
  `study` varchar(20) DEFAULT '' COMMENT '学业素质',
  `ability` varchar(20) DEFAULT '' COMMENT '发展能力',
  `total` varchar(20) DEFAULT '' COMMENT '总分',
  `gp` varchar(20) DEFAULT '' COMMENT '绩点排名',
  `ce` varchar(20) DEFAULT '' COMMENT '综测排名',
  `pass_sum` varchar(20) DEFAULT '' COMMENT '通过必修课数',
  `class_sum` varchar(20) DEFAULT '' COMMENT '总必修课数',
  PRIMARY KEY (`info_id`),
  UNIQUE KEY `info_id` (`info_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `user_info_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '1', '2017', '13.2', '62.5', '3.3', '79', '7', '10', '20', '20');
