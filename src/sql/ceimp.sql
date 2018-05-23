/*
Navicat MySQL Data Transfer

Source Server         : weige
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ceimp

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2018-05-23 09:54:08
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
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of award
-- ----------------------------
INSERT INTO `award` VALUES ('1', '1', '1', '1', '2018');
INSERT INTO `award` VALUES ('2', '1', '2', '1', '2018');
INSERT INTO `award` VALUES ('3', '1', '3', '1', '2018');
INSERT INTO `award` VALUES ('4', '1', '4', '1', '2018');
INSERT INTO `award` VALUES ('5', '1', '5', '1', '2018');
INSERT INTO `award` VALUES ('8', '5', '5', '1', '2018');
INSERT INTO `award` VALUES ('9', '6', '8', '1', '2018');
INSERT INTO `award` VALUES ('10', '5', '1', '1', '2018');
INSERT INTO `award` VALUES ('11', '6', '1', '1', '2018');
INSERT INTO `award` VALUES ('12', '5', '2', '1', '2018');
INSERT INTO `award` VALUES ('13', '6', '2', '1', '2018');
INSERT INTO `award` VALUES ('14', '5', '3', '1', '2018');
INSERT INTO `award` VALUES ('15', '6', '3', '1', '2018');
INSERT INTO `award` VALUES ('16', '5', '4', '1', '2018');
INSERT INTO `award` VALUES ('17', '6', '4', '1', '2018');
INSERT INTO `award` VALUES ('18', '7', '1', '1', '2018');
INSERT INTO `award` VALUES ('19', '8', '1', '1', '2018');
INSERT INTO `award` VALUES ('20', '10', '1', '1', '2018');
INSERT INTO `award` VALUES ('21', '13', '1', '1', '2018');
INSERT INTO `award` VALUES ('22', '14', '1', '1', '2018');
INSERT INTO `award` VALUES ('23', '18', '1', '1', '2018');
INSERT INTO `award` VALUES ('24', '19', '1', '1', '2018');
INSERT INTO `award` VALUES ('25', '20', '1', '1', '2018');
INSERT INTO `award` VALUES ('26', '27', '1', '1', '2018');
INSERT INTO `award` VALUES ('27', '9', '1', '1', '2018');
INSERT INTO `award` VALUES ('28', '11', '1', '1', '2018');
INSERT INTO `award` VALUES ('29', '12', '1', '1', '2018');
INSERT INTO `award` VALUES ('30', '15', '1', '1', '2018');
INSERT INTO `award` VALUES ('31', '16', '1', '1', '2018');
INSERT INTO `award` VALUES ('32', '17', '1', '1', '2018');
INSERT INTO `award` VALUES ('33', '21', '1', '1', '2018');
INSERT INTO `award` VALUES ('34', '22', '1', '1', '2018');
INSERT INTO `award` VALUES ('35', '23', '1', '1', '2018');
INSERT INTO `award` VALUES ('36', '24', '1', '1', '2018');
INSERT INTO `award` VALUES ('37', '25', '1', '1', '2018');
INSERT INTO `award` VALUES ('38', '26', '1', '1', '2018');
INSERT INTO `award` VALUES ('39', '28', '1', '1', '2018');

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
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_num
-- ----------------------------
INSERT INTO `class_num` VALUES ('1', '151', '1');
INSERT INTO `class_num` VALUES ('2', '152', '1');
INSERT INTO `class_num` VALUES ('3', '151', '2');
INSERT INTO `class_num` VALUES ('4', '152', '2');
INSERT INTO `class_num` VALUES ('5', '153', '2');
INSERT INTO `class_num` VALUES ('6', '151', '3');
INSERT INTO `class_num` VALUES ('7', '152', '3');
INSERT INTO `class_num` VALUES ('8', '151', '4');
INSERT INTO `class_num` VALUES ('9', '152', '4');
INSERT INTO `class_num` VALUES ('10', '151', '5');
INSERT INTO `class_num` VALUES ('11', '152', '5');
INSERT INTO `class_num` VALUES ('12', '151', '6');
INSERT INTO `class_num` VALUES ('13', '152', '6');
INSERT INTO `class_num` VALUES ('14', '161', '7');
INSERT INTO `class_num` VALUES ('15', '162', '7');
INSERT INTO `class_num` VALUES ('16', '161', '8');
INSERT INTO `class_num` VALUES ('17', '162', '8');
INSERT INTO `class_num` VALUES ('18', '163', '8');
INSERT INTO `class_num` VALUES ('19', '161', '9');
INSERT INTO `class_num` VALUES ('20', '162', '9');
INSERT INTO `class_num` VALUES ('21', '161', '10');
INSERT INTO `class_num` VALUES ('22', '162', '10');
INSERT INTO `class_num` VALUES ('23', '161', '11');
INSERT INTO `class_num` VALUES ('24', '162', '11');
INSERT INTO `class_num` VALUES ('25', '161', '12');
INSERT INTO `class_num` VALUES ('26', '162', '12');
INSERT INTO `class_num` VALUES ('27', '1601', '13');
INSERT INTO `class_num` VALUES ('28', '1602', '13');
INSERT INTO `class_num` VALUES ('29', '1603', '13');
INSERT INTO `class_num` VALUES ('30', '1604', '13');
INSERT INTO `class_num` VALUES ('31', '1605', '13');
INSERT INTO `class_num` VALUES ('32', '1606', '13');
INSERT INTO `class_num` VALUES ('33', '1607', '13');
INSERT INTO `class_num` VALUES ('34', '1608', '13');
INSERT INTO `class_num` VALUES ('35', '1609', '13');
INSERT INTO `class_num` VALUES ('36', '1610', '13');
INSERT INTO `class_num` VALUES ('37', '1611', '13');
INSERT INTO `class_num` VALUES ('38', '1612', '13');
INSERT INTO `class_num` VALUES ('39', '141', '14');

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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------
INSERT INTO `major` VALUES ('1', '软件工程', '1', '2015');
INSERT INTO `major` VALUES ('2', '计算机科学与技术', '1', '2015');
INSERT INTO `major` VALUES ('3', '数字媒体技术', '1', '2015');
INSERT INTO `major` VALUES ('4', '物联网工程', '1', '2015');
INSERT INTO `major` VALUES ('5', '通信工程', '1', '2015');
INSERT INTO `major` VALUES ('6', '电子信息工程', '1', '2015');
INSERT INTO `major` VALUES ('7', '软件工程', '1', '2016');
INSERT INTO `major` VALUES ('8', '计算机科学与技术', '1', '2016');
INSERT INTO `major` VALUES ('9', '数字媒体技术', '1', '2016');
INSERT INTO `major` VALUES ('10', '物联网工程', '1', '2016');
INSERT INTO `major` VALUES ('11', '通信工程', '1', '2016');
INSERT INTO `major` VALUES ('12', '电子信息工程', '1', '2016');
INSERT INTO `major` VALUES ('13', '信息大类', '1', '2016');
INSERT INTO `major` VALUES ('14', '软件工程', '1', '2014');

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1', '1150299070', 'ZTLcLq+BaR2y9kFF0eCBzw==', '1', '1');
INSERT INTO `manager` VALUES ('2', '1150299001', 'ZTLcLq+BaR2y9kFF0eCBzw==', '1', '1');

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
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ng
-- ----------------------------
INSERT INTO `ng` VALUES ('1', '2', '2018', '农村', '打工', '3000', '5', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '我热爱学习。\r\n专业成绩名列前茅。', '同意一档国家助学金');
INSERT INTO `ng` VALUES ('2', '5', '2018', '农村', '务农', '5000', '3', '地球', '233333', '家庭经济一般困难', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '好学', '同意一档国家助学金');
INSERT INTO `ng` VALUES ('3', '6', '2018', '农村', '务农', '2000', '3', '杭州市', '315300', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '啊啊', '同意一档国家助学金');
INSERT INTO `ng` VALUES ('4', '7', '2018', '农村', '打工', '3000', '3', '浙江省', '333333', '家庭经济一般困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '喜欢学习', '同意二档国家助学金');
INSERT INTO `ng` VALUES ('5', '8', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('6', '10', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('7', '13', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意二档国家助学金');
INSERT INTO `ng` VALUES ('8', '14', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('9', '18', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('10', '19', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('11', '20', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('12', '27', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('13', '9', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('14', '11', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('15', '12', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意二档国家助学金');
INSERT INTO `ng` VALUES ('16', '15', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('17', '16', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意二档国家助学金');
INSERT INTO `ng` VALUES ('18', '17', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意二档国家助学金');
INSERT INTO `ng` VALUES ('19', '21', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('20', '22', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('21', '23', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('22', '24', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('23', '25', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('24', '26', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('25', '28', '2018', '农村', '打工', '2330', '4', '浙江省', '315315', '家庭经济特别困难', '陈伟', '20', '本人', '浙江科技学院', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '我热爱学习', '同意国家一档奖学金');
INSERT INTO `ng` VALUES ('26', '1', '2018', '农村', '打工仔', '30000', '50', '浙江省慈溪市', '315300', '家庭经济一般困难', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '诺基亚', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '陈伟', '20', '本人', '浙江科技学院', '我爱学习！\r\n学习使我快乐！\r\n真的很快乐！', '');

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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nis
-- ----------------------------
INSERT INTO `nis` VALUES ('2', '5', '2018', '2017年10月', '啊', '啊', '2017年10月', '啊', '去', '2017年10月', '去', '去', '2017年10月', '去', '我', '城镇', '务农', '5000', '3', '慈溪市', '315315', '家庭经济一般困难', '我');
INSERT INTO `nis` VALUES ('3', '6', '2018', '2017年10月', '个', '个', '2017年10月', '额', '额', '2017年10月', '额', '我', '2017年10月', '去', '去', '农村', '打工', '3000', '5', '杭州市', '315310', '家庭经济特别困难', '去');
INSERT INTO `nis` VALUES ('4', '2', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '城镇', '1', '1', '1', '1', '111111', '家庭经济一般困难', 'DSDS');
INSERT INTO `nis` VALUES ('5', '1', '2018', '2018年1月', '啊哈', '啊', '2018年6月', '啊', '啊', '2009年2月', '啊哈', '浙江省教育厅', '2018年1月', '啊', '浙江省教育厅', '城镇', '打工仔', '30000', '51', '浙江省慈溪市', '315300', '家庭经济特别困难', '我爱学习！\r\n学习使我快乐！\r\n真的很快乐！');

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of opinion
-- ----------------------------
INSERT INTO `opinion` VALUES ('1', '2015', '1', '2018', '该生勤奋刻苦，敢于拼搏，批准申报国家励志奖学金。', '该生专业成绩名列前茅，敢于钻研，批准申报省政府奖学金。', '同意申报。', '该生成绩优异，批准申报校奖学金。', '同意申请三好学生');
INSERT INTO `opinion` VALUES ('2', '2015', '1', '2017', '这', '个', '是', '测', '试');
INSERT INTO `opinion` VALUES ('3', '2016', '1', '2018', '234', '11', '22', '33', '44');

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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pgs
-- ----------------------------
INSERT INTO `pgs` VALUES ('2', '5', '2018', '2017年11月', '啊', '啊', '2017年11月', '啊', '啊', '2017年11月', '啊', '啊', '2017年11月', '啊', '啊', '我');
INSERT INTO `pgs` VALUES ('3', '6', '2018', '2017年11月', '分', '分', '2017年11月', '额', '人', '2017年11月', '人', '人', '2017年11月', '额', '去', '去');
INSERT INTO `pgs` VALUES ('4', '2', '2018', '2017年11月', '啊哈', '浙江省教育厅', '', '', '', '', '', '', '', '', '', '奶思');
INSERT INTO `pgs` VALUES ('5', '1', '2018', '1899年1月', '啊哈啊', '羡慕', '1899年5月', '啊哈啊', '羡慕', '1899年2月', '啊哈啊', '羡慕', '1899年2月', '啊哈啊', '羡慕', '羡慕的要死！\r\n要死！\r\n要！');

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
  `apply_reason` varchar(500) DEFAULT '' COMMENT '主要事迹与表现',
  PRIMARY KEY (`ss_id`),
  UNIQUE KEY `ss_id` (`ss_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  CONSTRAINT `ss_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user_basic` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ss
-- ----------------------------
INSERT INTO `ss` VALUES ('2', '5', '2018', '好');
INSERT INTO `ss` VALUES ('3', '6', '2018', '我');
INSERT INTO `ss` VALUES ('4', '1', '2018', '过分了啊！\r\n真的过分！\r\n过分！');

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tas
-- ----------------------------
INSERT INTO `tas` VALUES ('3', '5', '2018', '牛逼');
INSERT INTO `tas` VALUES ('4', '6', '2018', '好');
INSERT INTO `tas` VALUES ('6', '1', '2018', '我爱学习！\r\n学习使我快乐！\r\n真的很快乐！\r\n羡慕~1');

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
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_basic
-- ----------------------------
INSERT INTO `user_basic` VALUES ('1', '1150299070', 'ZTLcLq+BaR2y9kFF0eCBzw==', '陈小弟', '男', '1996年12月', '汉族', '2015年09月', '330282199612272333');
INSERT INTO `user_basic` VALUES ('2', '1150299250', 'ZTLcLq+BaR2y9kFF0eCBzw==', '黄大老', '女', '1996年12月', '汉族', '2015年09月', '330282199612272345');
INSERT INTO `user_basic` VALUES ('3', '1150299260', 'ZTLcLq+BaR2y9kFF0eCBzw==', '方大老', '男', '1997年01月', '汉族', '2015年09月', '330282199701272111');
INSERT INTO `user_basic` VALUES ('4', '1150299190', 'ZTLcLq+BaR2y9kFF0eCBzw==', '顾大老', '女', '1996年10月', '汉族', '2015年09月', '330282199610270121');
INSERT INTO `user_basic` VALUES ('5', '1160299070', 'ZTLcLq+BaR2y9kFF0eCBzw==', '软工王', '男', '1997年10月', '汉族', '2016年09月', '330282199710276666');
INSERT INTO `user_basic` VALUES ('6', '1160299002', 'ZTLcLq+BaR2y9kFF0eCBzw==', '软工胡', '女', '1997年12月', '汉族', '2016年09月', '330282199712278888');
INSERT INTO `user_basic` VALUES ('7', '1150299001', 'ZTLcLq+BaR2y9kFF0eCBzw==', '计算胡', '男', '1996年10月', '汉族', '2015年09月', '330282199610272888');
INSERT INTO `user_basic` VALUES ('8', '1150299002', 'ZTLcLq+BaR2y9kFF0eCBzw==', '计算李', '男', '1997年03月', '汉族', '2015年09月', '330282199703272332');
INSERT INTO `user_basic` VALUES ('9', '1150299003', 'ZTLcLq+BaR2y9kFF0eCBzw==', '计算赵', '女', '1996年11月', '汉族', '2015年09月', '330282199611273222');
INSERT INTO `user_basic` VALUES ('10', '1150299004', 'ZTLcLq+BaR2y9kFF0eCBzw==', '数媒黄', '男', '1997年08月', '汉族', '2015年09月', '330282199708272330');
INSERT INTO `user_basic` VALUES ('11', '1150299005', 'ZTLcLq+BaR2y9kFF0eCBzw==', '数媒孙', '女', '1997年04月', '汉族', '2015年09月', '330282199704271321');
INSERT INTO `user_basic` VALUES ('12', '1150299006', 'ZTLcLq+BaR2y9kFF0eCBzw==', '物联常', '女', '1997年01月', '汉族', '2015年09月', '330282199701272322');
INSERT INTO `user_basic` VALUES ('13', '1150299007', 'ZTLcLq+BaR2y9kFF0eCBzw==', '物联潘', '男', '1996年12月', '汉族', '2015年09月', '330282199612201234');
INSERT INTO `user_basic` VALUES ('14', '1150299008', 'ZTLcLq+BaR2y9kFF0eCBzw==', '通信魏', '男', '1997年02月', '汉族', '2015年09月', '330282199702208231');
INSERT INTO `user_basic` VALUES ('15', '1150299009', 'ZTLcLq+BaR2y9kFF0eCBzw==', '通信郭', '男', '1996年11月', '汉族', '2015年09月', '330282199611111111');
INSERT INTO `user_basic` VALUES ('16', '1150299010', 'ZTLcLq+BaR2y9kFF0eCBzw==', '电子朱', '女', '1997年05月', '汉族', '2015年09月', '330228199705123221');
INSERT INTO `user_basic` VALUES ('17', '1150299011', 'ZTLcLq+BaR2y9kFF0eCBzw==', '电子迪', '男', '1996年12月', '汉族', '2015年09月', '330282199612212110');
INSERT INTO `user_basic` VALUES ('18', '1160299003', 'ZTLcLq+BaR2y9kFF0eCBzw==', '计算奇', '男', '1998年01月', '汉族', '2016年09月', '330212199801101831');
INSERT INTO `user_basic` VALUES ('19', '1160299004', 'ZTLcLq+BaR2y9kFF0eCBzw==', '计算葱', '女', '1997年11月', '汉族', '2016年09月', '330232199711233312');
INSERT INTO `user_basic` VALUES ('20', '1160299005', 'ZTLcLq+BaR2y9kFF0eCBzw==', '计算删', '女', '1997年11月', '汉族', '2016年09月', '330212199711121223');
INSERT INTO `user_basic` VALUES ('21', '1160299006', 'ZTLcLq+BaR2y9kFF0eCBzw==', '数媒泽', '男', '1997年12月', '汉族', '2016年09月', '332123199712302118');
INSERT INTO `user_basic` VALUES ('22', '1160299007', 'ZTLcLq+BaR2y9kFF0eCBzw==', '数媒尔', '女', '1998年09月', '汉族', '2016年09月', '330123199809202842');
INSERT INTO `user_basic` VALUES ('23', '1160299008', 'ZTLcLq+BaR2y9kFF0eCBzw==', '物联沃', '男', '1998年05月', '汉族', '2016年09月', '330124199805124556');
INSERT INTO `user_basic` VALUES ('24', '1160299009', 'ZTLcLq+BaR2y9kFF0eCBzw==', '物联吴', '女', '1997年11月', '汉族', '2016年09月', '330122199711028288');
INSERT INTO `user_basic` VALUES ('25', '1160299010', 'ZTLcLq+BaR2y9kFF0eCBzw==', '通信陈', '男', '1997年12月', '汉族', '2016年09月', '330224199712232331');
INSERT INTO `user_basic` VALUES ('26', '1160299011', 'ZTLcLq+BaR2y9kFF0eCBzw==', '通信王', '女', '1998年06月', '汉族', '2016年09月', '312521199806127781');
INSERT INTO `user_basic` VALUES ('27', '1160299012', 'ZTLcLq+BaR2y9kFF0eCBzw==', '电子初', '女', '1997年10月', '汉族', '2016年09月', '312151199710232341');
INSERT INTO `user_basic` VALUES ('28', '1160299013', 'ZTLcLq+BaR2y9kFF0eCBzw==', '电子痕', '女', '1997年12月', '汉族', '2016年09月', '331215199712101242');
INSERT INTO `user_basic` VALUES ('29', '1140299070', 'ZTLcLq+BaR2y9kFF0eCBzw==', '软工陈', '男', '1997年10月', '汉族', '2014年09月', '330282199626733333');

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
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '1', '2018', '1', '预备党员', '119', '班长', '12', '65', '13', '90', '3', '10', '20', '20', '73');
INSERT INTO `user_info` VALUES ('2', '1', '2017', '1', '群众', '112', '无', '11', '60', '0', '71', '10', '20', '20', '20', '');
INSERT INTO `user_info` VALUES ('3', '2', '2018', '2', '共青团员', '119', '无', '12', '61', '0', '73', '8', '16', '20', '20', '');
INSERT INTO `user_info` VALUES ('5', '2', '2017', '2', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('6', '3', '2018', '1', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('7', '4', '2018', '2', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('11', '5', '2018', '14', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('12', '6', '2018', '15', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('13', '7', '2018', '3', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('14', '8', '2018', '4', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('15', '9', '2018', '5', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('16', '10', '2018', '6', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('17', '11', '2018', '7', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('18', '12', '2018', '8', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('19', '13', '2018', '9', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('20', '14', '2018', '10', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('21', '15', '2018', '11', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('22', '16', '2018', '12', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('23', '17', '2018', '13', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('24', '18', '2018', '16', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('25', '19', '2018', '17', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('26', '20', '2018', '18', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('27', '21', '2018', '19', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('28', '22', '2018', '20', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('29', '23', '2018', '21', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('30', '24', '2018', '22', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('31', '25', '2018', '23', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('32', '26', '2018', '24', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('33', '27', '2018', '25', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('34', '28', '2018', '26', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('35', '5', '2017', '27', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('36', '6', '2017', '28', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('37', '18', '2017', '28', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('38', '19', '2017', '29', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('39', '20', '2017', '30', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('42', '21', '2017', '30', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('43', '22', '2017', '31', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('44', '23', '2017', '32', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('45', '24', '2017', '33', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('46', '25', '2017', '34', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('47', '26', '2017', '36', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('48', '27', '2017', '37', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('49', '28', '2017', '38', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `user_info` VALUES ('50', '29', '2018', '39', '', '', '', '', '', '', '', '', '', '', '', '');
