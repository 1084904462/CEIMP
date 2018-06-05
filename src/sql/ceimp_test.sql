/*
Navicat MySQL Data Transfer

Source Server         : weige
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ceimp

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2018-06-05 13:11:10
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
) ENGINE=InnoDB AUTO_INCREMENT=512 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of award
-- ----------------------------
INSERT INTO `award` VALUES ('1', '38', '1', '1', '2018');
INSERT INTO `award` VALUES ('2', '37', '1', '1', '2018');
INSERT INTO `award` VALUES ('3', '8', '1', '1', '2018');
INSERT INTO `award` VALUES ('4', '49', '1', '1', '2018');
INSERT INTO `award` VALUES ('5', '51', '1', '1', '2018');
INSERT INTO `award` VALUES ('6', '29', '1', '1', '2018');
INSERT INTO `award` VALUES ('7', '43', '1', '1', '2018');
INSERT INTO `award` VALUES ('8', '52', '1', '1', '2018');
INSERT INTO `award` VALUES ('9', '44', '1', '1', '2018');
INSERT INTO `award` VALUES ('10', '12', '1', '1', '2018');
INSERT INTO `award` VALUES ('11', '13', '1', '0', '2018');
INSERT INTO `award` VALUES ('12', '31', '1', '1', '2018');
INSERT INTO `award` VALUES ('13', '16', '1', '1', '2018');
INSERT INTO `award` VALUES ('14', '54', '1', '1', '2018');
INSERT INTO `award` VALUES ('15', '18', '1', '1', '2018');
INSERT INTO `award` VALUES ('16', '46', '1', '1', '2018');
INSERT INTO `award` VALUES ('17', '30', '1', '1', '2018');
INSERT INTO `award` VALUES ('18', '9', '1', '1', '2018');
INSERT INTO `award` VALUES ('19', '2', '1', '1', '2018');
INSERT INTO `award` VALUES ('20', '19', '1', '1', '2018');
INSERT INTO `award` VALUES ('21', '32', '1', '1', '2018');
INSERT INTO `award` VALUES ('22', '28', '1', '1', '2018');
INSERT INTO `award` VALUES ('23', '25', '1', '1', '2018');
INSERT INTO `award` VALUES ('24', '21', '1', '1', '2018');
INSERT INTO `award` VALUES ('25', '35', '1', '1', '2018');
INSERT INTO `award` VALUES ('26', '40', '1', '0', '2018');
INSERT INTO `award` VALUES ('27', '41', '1', '0', '2018');
INSERT INTO `award` VALUES ('28', '34', '1', '1', '2018');
INSERT INTO `award` VALUES ('29', '42', '1', '1', '2018');
INSERT INTO `award` VALUES ('30', '20', '1', '0', '2018');
INSERT INTO `award` VALUES ('31', '47', '1', '1', '2018');
INSERT INTO `award` VALUES ('32', '39', '1', '1', '2018');
INSERT INTO `award` VALUES ('33', '50', '1', '1', '2018');
INSERT INTO `award` VALUES ('34', '26', '1', '1', '2018');
INSERT INTO `award` VALUES ('35', '36', '1', '1', '2018');
INSERT INTO `award` VALUES ('36', '10', '1', '1', '2018');
INSERT INTO `award` VALUES ('37', '23', '1', '1', '2018');
INSERT INTO `award` VALUES ('38', '27', '1', '1', '2018');
INSERT INTO `award` VALUES ('39', '45', '1', '0', '2018');
INSERT INTO `award` VALUES ('40', '6', '1', '0', '2018');
INSERT INTO `award` VALUES ('41', '3', '1', '1', '2018');
INSERT INTO `award` VALUES ('42', '4', '1', '1', '2018');
INSERT INTO `award` VALUES ('43', '56', '1', '1', '2018');
INSERT INTO `award` VALUES ('44', '55', '1', '1', '2018');
INSERT INTO `award` VALUES ('45', '53', '1', '1', '2018');
INSERT INTO `award` VALUES ('46', '17', '1', '1', '2018');
INSERT INTO `award` VALUES ('47', '15', '1', '1', '2018');
INSERT INTO `award` VALUES ('48', '5', '1', '0', '2018');
INSERT INTO `award` VALUES ('49', '24', '1', '1', '2018');
INSERT INTO `award` VALUES ('50', '22', '1', '1', '2018');
INSERT INTO `award` VALUES ('51', '57', '1', '1', '2018');
INSERT INTO `award` VALUES ('52', '11', '1', '1', '2018');
INSERT INTO `award` VALUES ('53', '48', '1', '1', '2018');
INSERT INTO `award` VALUES ('54', '7', '1', '1', '2018');
INSERT INTO `award` VALUES ('55', '14', '1', '1', '2018');
INSERT INTO `award` VALUES ('56', '1', '1', '1', '2018');
INSERT INTO `award` VALUES ('57', '33', '1', '1', '2018');
INSERT INTO `award` VALUES ('58', '38', '2', '1', '2018');
INSERT INTO `award` VALUES ('59', '37', '2', '1', '2018');
INSERT INTO `award` VALUES ('60', '8', '2', '1', '2018');
INSERT INTO `award` VALUES ('61', '49', '2', '1', '2018');
INSERT INTO `award` VALUES ('62', '51', '2', '1', '2018');
INSERT INTO `award` VALUES ('63', '29', '2', '1', '2018');
INSERT INTO `award` VALUES ('64', '43', '2', '1', '2018');
INSERT INTO `award` VALUES ('65', '52', '2', '1', '2018');
INSERT INTO `award` VALUES ('66', '44', '2', '1', '2018');
INSERT INTO `award` VALUES ('67', '12', '2', '1', '2018');
INSERT INTO `award` VALUES ('68', '13', '2', '1', '2018');
INSERT INTO `award` VALUES ('69', '31', '2', '1', '2018');
INSERT INTO `award` VALUES ('70', '16', '2', '1', '2018');
INSERT INTO `award` VALUES ('71', '54', '2', '1', '2018');
INSERT INTO `award` VALUES ('72', '18', '2', '1', '2018');
INSERT INTO `award` VALUES ('73', '46', '2', '1', '2018');
INSERT INTO `award` VALUES ('74', '30', '2', '1', '2018');
INSERT INTO `award` VALUES ('75', '9', '2', '1', '2018');
INSERT INTO `award` VALUES ('76', '2', '2', '1', '2018');
INSERT INTO `award` VALUES ('77', '19', '2', '1', '2018');
INSERT INTO `award` VALUES ('78', '32', '2', '1', '2018');
INSERT INTO `award` VALUES ('79', '28', '2', '1', '2018');
INSERT INTO `award` VALUES ('80', '25', '2', '1', '2018');
INSERT INTO `award` VALUES ('81', '21', '2', '1', '2018');
INSERT INTO `award` VALUES ('82', '35', '2', '1', '2018');
INSERT INTO `award` VALUES ('83', '40', '2', '1', '2018');
INSERT INTO `award` VALUES ('84', '41', '2', '1', '2018');
INSERT INTO `award` VALUES ('85', '34', '2', '1', '2018');
INSERT INTO `award` VALUES ('86', '42', '2', '1', '2018');
INSERT INTO `award` VALUES ('87', '20', '2', '1', '2018');
INSERT INTO `award` VALUES ('88', '47', '2', '1', '2018');
INSERT INTO `award` VALUES ('89', '39', '2', '1', '2018');
INSERT INTO `award` VALUES ('90', '50', '2', '1', '2018');
INSERT INTO `award` VALUES ('91', '26', '2', '1', '2018');
INSERT INTO `award` VALUES ('92', '36', '2', '1', '2018');
INSERT INTO `award` VALUES ('93', '10', '2', '1', '2018');
INSERT INTO `award` VALUES ('94', '23', '2', '1', '2018');
INSERT INTO `award` VALUES ('95', '27', '2', '1', '2018');
INSERT INTO `award` VALUES ('96', '45', '2', '1', '2018');
INSERT INTO `award` VALUES ('97', '6', '2', '1', '2018');
INSERT INTO `award` VALUES ('98', '3', '2', '1', '2018');
INSERT INTO `award` VALUES ('99', '4', '2', '1', '2018');
INSERT INTO `award` VALUES ('100', '56', '2', '1', '2018');
INSERT INTO `award` VALUES ('101', '55', '2', '1', '2018');
INSERT INTO `award` VALUES ('102', '53', '2', '1', '2018');
INSERT INTO `award` VALUES ('103', '17', '2', '1', '2018');
INSERT INTO `award` VALUES ('104', '15', '2', '1', '2018');
INSERT INTO `award` VALUES ('105', '5', '2', '1', '2018');
INSERT INTO `award` VALUES ('106', '24', '2', '1', '2018');
INSERT INTO `award` VALUES ('107', '22', '2', '1', '2018');
INSERT INTO `award` VALUES ('108', '57', '2', '1', '2018');
INSERT INTO `award` VALUES ('109', '11', '2', '1', '2018');
INSERT INTO `award` VALUES ('110', '48', '2', '1', '2018');
INSERT INTO `award` VALUES ('111', '7', '2', '1', '2018');
INSERT INTO `award` VALUES ('112', '14', '2', '1', '2018');
INSERT INTO `award` VALUES ('113', '1', '2', '1', '2018');
INSERT INTO `award` VALUES ('114', '33', '2', '1', '2018');
INSERT INTO `award` VALUES ('115', '38', '3', '1', '2018');
INSERT INTO `award` VALUES ('116', '37', '3', '1', '2018');
INSERT INTO `award` VALUES ('117', '8', '3', '1', '2018');
INSERT INTO `award` VALUES ('118', '49', '3', '1', '2018');
INSERT INTO `award` VALUES ('119', '51', '3', '1', '2018');
INSERT INTO `award` VALUES ('120', '29', '3', '1', '2018');
INSERT INTO `award` VALUES ('121', '43', '3', '1', '2018');
INSERT INTO `award` VALUES ('122', '52', '3', '1', '2018');
INSERT INTO `award` VALUES ('123', '44', '3', '1', '2018');
INSERT INTO `award` VALUES ('124', '12', '3', '1', '2018');
INSERT INTO `award` VALUES ('125', '13', '3', '1', '2018');
INSERT INTO `award` VALUES ('126', '31', '3', '1', '2018');
INSERT INTO `award` VALUES ('127', '16', '3', '1', '2018');
INSERT INTO `award` VALUES ('128', '54', '3', '1', '2018');
INSERT INTO `award` VALUES ('129', '18', '3', '1', '2018');
INSERT INTO `award` VALUES ('130', '46', '3', '1', '2018');
INSERT INTO `award` VALUES ('131', '30', '3', '1', '2018');
INSERT INTO `award` VALUES ('132', '9', '3', '1', '2018');
INSERT INTO `award` VALUES ('133', '2', '3', '1', '2018');
INSERT INTO `award` VALUES ('134', '19', '3', '1', '2018');
INSERT INTO `award` VALUES ('135', '32', '3', '1', '2018');
INSERT INTO `award` VALUES ('136', '28', '3', '0', '2018');
INSERT INTO `award` VALUES ('137', '25', '3', '0', '2018');
INSERT INTO `award` VALUES ('138', '21', '3', '1', '2018');
INSERT INTO `award` VALUES ('139', '35', '3', '1', '2018');
INSERT INTO `award` VALUES ('140', '40', '3', '1', '2018');
INSERT INTO `award` VALUES ('141', '41', '3', '1', '2018');
INSERT INTO `award` VALUES ('142', '34', '3', '0', '2018');
INSERT INTO `award` VALUES ('143', '42', '3', '1', '2018');
INSERT INTO `award` VALUES ('144', '20', '3', '1', '2018');
INSERT INTO `award` VALUES ('145', '47', '3', '1', '2018');
INSERT INTO `award` VALUES ('146', '39', '3', '0', '2018');
INSERT INTO `award` VALUES ('147', '50', '3', '1', '2018');
INSERT INTO `award` VALUES ('148', '26', '3', '1', '2018');
INSERT INTO `award` VALUES ('149', '36', '3', '1', '2018');
INSERT INTO `award` VALUES ('150', '10', '3', '1', '2018');
INSERT INTO `award` VALUES ('151', '23', '3', '1', '2018');
INSERT INTO `award` VALUES ('152', '27', '3', '1', '2018');
INSERT INTO `award` VALUES ('153', '45', '3', '1', '2018');
INSERT INTO `award` VALUES ('154', '6', '3', '1', '2018');
INSERT INTO `award` VALUES ('155', '3', '3', '0', '2018');
INSERT INTO `award` VALUES ('156', '4', '3', '0', '2018');
INSERT INTO `award` VALUES ('157', '56', '3', '1', '2018');
INSERT INTO `award` VALUES ('158', '55', '3', '1', '2018');
INSERT INTO `award` VALUES ('159', '53', '3', '1', '2018');
INSERT INTO `award` VALUES ('160', '17', '3', '1', '2018');
INSERT INTO `award` VALUES ('161', '15', '3', '1', '2018');
INSERT INTO `award` VALUES ('162', '5', '3', '1', '2018');
INSERT INTO `award` VALUES ('163', '24', '3', '1', '2018');
INSERT INTO `award` VALUES ('164', '22', '3', '1', '2018');
INSERT INTO `award` VALUES ('165', '57', '3', '1', '2018');
INSERT INTO `award` VALUES ('166', '11', '3', '1', '2018');
INSERT INTO `award` VALUES ('167', '48', '3', '1', '2018');
INSERT INTO `award` VALUES ('168', '7', '3', '1', '2018');
INSERT INTO `award` VALUES ('169', '14', '3', '1', '2018');
INSERT INTO `award` VALUES ('170', '1', '3', '1', '2018');
INSERT INTO `award` VALUES ('171', '33', '3', '0', '2018');
INSERT INTO `award` VALUES ('172', '38', '4', '1', '2018');
INSERT INTO `award` VALUES ('173', '37', '4', '1', '2018');
INSERT INTO `award` VALUES ('174', '8', '4', '1', '2018');
INSERT INTO `award` VALUES ('175', '49', '4', '1', '2018');
INSERT INTO `award` VALUES ('176', '51', '4', '0', '2018');
INSERT INTO `award` VALUES ('177', '29', '4', '1', '2018');
INSERT INTO `award` VALUES ('178', '43', '4', '1', '2018');
INSERT INTO `award` VALUES ('179', '52', '4', '1', '2018');
INSERT INTO `award` VALUES ('180', '44', '4', '0', '2018');
INSERT INTO `award` VALUES ('181', '12', '4', '0', '2018');
INSERT INTO `award` VALUES ('182', '13', '4', '1', '2018');
INSERT INTO `award` VALUES ('183', '31', '4', '0', '2018');
INSERT INTO `award` VALUES ('184', '16', '4', '1', '2018');
INSERT INTO `award` VALUES ('185', '54', '4', '1', '2018');
INSERT INTO `award` VALUES ('186', '18', '4', '1', '2018');
INSERT INTO `award` VALUES ('187', '46', '4', '1', '2018');
INSERT INTO `award` VALUES ('188', '30', '4', '0', '2018');
INSERT INTO `award` VALUES ('189', '9', '4', '1', '2018');
INSERT INTO `award` VALUES ('190', '2', '4', '1', '2018');
INSERT INTO `award` VALUES ('191', '19', '4', '1', '2018');
INSERT INTO `award` VALUES ('192', '32', '4', '1', '2018');
INSERT INTO `award` VALUES ('193', '28', '4', '1', '2018');
INSERT INTO `award` VALUES ('194', '25', '4', '1', '2018');
INSERT INTO `award` VALUES ('195', '21', '4', '0', '2018');
INSERT INTO `award` VALUES ('196', '35', '4', '1', '2018');
INSERT INTO `award` VALUES ('197', '40', '4', '1', '2018');
INSERT INTO `award` VALUES ('198', '41', '4', '1', '2018');
INSERT INTO `award` VALUES ('199', '34', '4', '1', '2018');
INSERT INTO `award` VALUES ('200', '42', '4', '0', '2018');
INSERT INTO `award` VALUES ('201', '20', '4', '1', '2018');
INSERT INTO `award` VALUES ('202', '47', '4', '0', '2018');
INSERT INTO `award` VALUES ('203', '39', '4', '1', '2018');
INSERT INTO `award` VALUES ('204', '50', '4', '1', '2018');
INSERT INTO `award` VALUES ('205', '26', '4', '1', '2018');
INSERT INTO `award` VALUES ('206', '36', '4', '1', '2018');
INSERT INTO `award` VALUES ('207', '10', '4', '0', '2018');
INSERT INTO `award` VALUES ('208', '23', '4', '1', '2018');
INSERT INTO `award` VALUES ('209', '27', '4', '1', '2018');
INSERT INTO `award` VALUES ('210', '45', '4', '1', '2018');
INSERT INTO `award` VALUES ('211', '6', '4', '1', '2018');
INSERT INTO `award` VALUES ('212', '3', '4', '1', '2018');
INSERT INTO `award` VALUES ('213', '4', '4', '0', '2018');
INSERT INTO `award` VALUES ('214', '56', '4', '1', '2018');
INSERT INTO `award` VALUES ('215', '55', '4', '1', '2018');
INSERT INTO `award` VALUES ('216', '53', '4', '1', '2018');
INSERT INTO `award` VALUES ('217', '17', '4', '1', '2018');
INSERT INTO `award` VALUES ('218', '15', '4', '1', '2018');
INSERT INTO `award` VALUES ('219', '5', '4', '0', '2018');
INSERT INTO `award` VALUES ('220', '24', '4', '0', '2018');
INSERT INTO `award` VALUES ('221', '22', '4', '0', '2018');
INSERT INTO `award` VALUES ('222', '57', '4', '1', '2018');
INSERT INTO `award` VALUES ('223', '11', '4', '1', '2018');
INSERT INTO `award` VALUES ('224', '48', '4', '0', '2018');
INSERT INTO `award` VALUES ('225', '7', '4', '0', '2018');
INSERT INTO `award` VALUES ('226', '14', '4', '1', '2018');
INSERT INTO `award` VALUES ('227', '1', '4', '1', '2018');
INSERT INTO `award` VALUES ('228', '33', '4', '1', '2018');
INSERT INTO `award` VALUES ('229', '38', '5', '1', '2018');
INSERT INTO `award` VALUES ('230', '37', '5', '1', '2018');
INSERT INTO `award` VALUES ('231', '8', '5', '1', '2018');
INSERT INTO `award` VALUES ('232', '49', '5', '1', '2018');
INSERT INTO `award` VALUES ('233', '51', '5', '1', '2018');
INSERT INTO `award` VALUES ('234', '29', '5', '1', '2018');
INSERT INTO `award` VALUES ('235', '43', '5', '1', '2018');
INSERT INTO `award` VALUES ('236', '52', '9', '1', '2018');
INSERT INTO `award` VALUES ('237', '44', '9', '0', '2018');
INSERT INTO `award` VALUES ('238', '12', '9', '0', '2018');
INSERT INTO `award` VALUES ('239', '13', '9', '1', '2018');
INSERT INTO `award` VALUES ('240', '31', '9', '1', '2018');
INSERT INTO `award` VALUES ('241', '16', '9', '1', '2018');
INSERT INTO `award` VALUES ('242', '54', '9', '0', '2018');
INSERT INTO `award` VALUES ('243', '18', '9', '1', '2018');
INSERT INTO `award` VALUES ('244', '46', '9', '1', '2018');
INSERT INTO `award` VALUES ('245', '30', '14', '0', '2018');
INSERT INTO `award` VALUES ('246', '9', '14', '1', '2018');
INSERT INTO `award` VALUES ('247', '2', '14', '1', '2018');
INSERT INTO `award` VALUES ('248', '19', '14', '1', '2018');
INSERT INTO `award` VALUES ('249', '32', '15', '0', '2018');
INSERT INTO `award` VALUES ('250', '28', '15', '1', '2018');
INSERT INTO `award` VALUES ('251', '25', '15', '1', '2018');
INSERT INTO `award` VALUES ('252', '21', '15', '0', '2018');
INSERT INTO `award` VALUES ('253', '35', '15', '1', '2018');
INSERT INTO `award` VALUES ('254', '40', '12', '1', '2018');
INSERT INTO `award` VALUES ('255', '41', '12', '1', '2018');
INSERT INTO `award` VALUES ('256', '34', '12', '0', '2018');
INSERT INTO `award` VALUES ('257', '42', '12', '1', '2018');
INSERT INTO `award` VALUES ('258', '20', '12', '1', '2018');
INSERT INTO `award` VALUES ('259', '47', '12', '0', '2018');
INSERT INTO `award` VALUES ('260', '39', '11', '1', '2018');
INSERT INTO `award` VALUES ('261', '50', '11', '1', '2018');
INSERT INTO `award` VALUES ('262', '26', '11', '1', '2018');
INSERT INTO `award` VALUES ('263', '36', '11', '1', '2018');
INSERT INTO `award` VALUES ('264', '10', '11', '0', '2018');
INSERT INTO `award` VALUES ('265', '23', '11', '1', '2018');
INSERT INTO `award` VALUES ('266', '27', '13', '1', '2018');
INSERT INTO `award` VALUES ('267', '45', '13', '0', '2018');
INSERT INTO `award` VALUES ('268', '6', '13', '1', '2018');
INSERT INTO `award` VALUES ('269', '3', '13', '1', '2018');
INSERT INTO `award` VALUES ('270', '4', '13', '0', '2018');
INSERT INTO `award` VALUES ('271', '56', '13', '1', '2018');
INSERT INTO `award` VALUES ('272', '55', '13', '1', '2018');
INSERT INTO `award` VALUES ('273', '53', '13', '1', '2018');
INSERT INTO `award` VALUES ('274', '17', '13', '1', '2018');
INSERT INTO `award` VALUES ('275', '15', '13', '1', '2018');
INSERT INTO `award` VALUES ('276', '5', '13', '1', '2018');
INSERT INTO `award` VALUES ('277', '24', '16', '1', '2018');
INSERT INTO `award` VALUES ('278', '22', '16', '1', '2018');
INSERT INTO `award` VALUES ('279', '57', '16', '1', '2018');
INSERT INTO `award` VALUES ('280', '11', '16', '1', '2018');
INSERT INTO `award` VALUES ('281', '48', '16', '1', '2018');
INSERT INTO `award` VALUES ('282', '7', '16', '1', '2018');
INSERT INTO `award` VALUES ('283', '14', '16', '0', '2018');
INSERT INTO `award` VALUES ('284', '1', '16', '1', '2018');
INSERT INTO `award` VALUES ('285', '33', '16', '1', '2018');

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
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_num
-- ----------------------------
INSERT INTO `class_num` VALUES ('1', '152', '15');
INSERT INTO `class_num` VALUES ('2', '151', '15');
INSERT INTO `class_num` VALUES ('3', '152', '14');
INSERT INTO `class_num` VALUES ('4', '151', '14');
INSERT INTO `class_num` VALUES ('5', '162', '10');
INSERT INTO `class_num` VALUES ('6', '161', '10');
INSERT INTO `class_num` VALUES ('7', '162', '13');
INSERT INTO `class_num` VALUES ('8', '172', '11');
INSERT INTO `class_num` VALUES ('9', '155', '16');
INSERT INTO `class_num` VALUES ('10', '171', '11');
INSERT INTO `class_num` VALUES ('11', '152', '16');
INSERT INTO `class_num` VALUES ('12', '151', '16');
INSERT INTO `class_num` VALUES ('13', '171', '6');
INSERT INTO `class_num` VALUES ('14', '162', '18');
INSERT INTO `class_num` VALUES ('15', '161', '18');
INSERT INTO `class_num` VALUES ('16', '161', '8');
INSERT INTO `class_num` VALUES ('17', '172', '9');
INSERT INTO `class_num` VALUES ('18', '172', '6');
INSERT INTO `class_num` VALUES ('19', '161', '13');
INSERT INTO `class_num` VALUES ('20', '171', '9');
INSERT INTO `class_num` VALUES ('21', '172', '12');
INSERT INTO `class_num` VALUES ('22', '171', '12');
INSERT INTO `class_num` VALUES ('23', '151', '7');
INSERT INTO `class_num` VALUES ('24', '162', '8');
INSERT INTO `class_num` VALUES ('25', '152', '7');
INSERT INTO `class_num` VALUES ('26', '153', '17');
INSERT INTO `class_num` VALUES ('27', '171', '1');
INSERT INTO `class_num` VALUES ('28', '172', '1');
INSERT INTO `class_num` VALUES ('29', '152', '5');
INSERT INTO `class_num` VALUES ('30', '161', '2');
INSERT INTO `class_num` VALUES ('31', '173', '1');
INSERT INTO `class_num` VALUES ('32', '162', '2');
INSERT INTO `class_num` VALUES ('33', '151', '17');
INSERT INTO `class_num` VALUES ('34', '163', '2');
INSERT INTO `class_num` VALUES ('35', '152', '17');
INSERT INTO `class_num` VALUES ('36', '172', '3');
INSERT INTO `class_num` VALUES ('37', '161', '4');
INSERT INTO `class_num` VALUES ('38', '162', '4');
INSERT INTO `class_num` VALUES ('39', '151', '5');
INSERT INTO `class_num` VALUES ('40', '171', '3');

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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major
-- ----------------------------
INSERT INTO `major` VALUES ('1', '计算机科学与技术', '1', '2017');
INSERT INTO `major` VALUES ('2', '计算机科学与技术', '1', '2016');
INSERT INTO `major` VALUES ('3', '通信工程', '1', '2017');
INSERT INTO `major` VALUES ('4', '通信工程', '1', '2016');
INSERT INTO `major` VALUES ('5', '通信工程', '1', '2015');
INSERT INTO `major` VALUES ('6', '数字媒体技术', '1', '2017');
INSERT INTO `major` VALUES ('7', '数字媒体技术', '1', '2015');
INSERT INTO `major` VALUES ('8', '数字媒体技术', '1', '2016');
INSERT INTO `major` VALUES ('9', '软件工程', '1', '2017');
INSERT INTO `major` VALUES ('10', '物联网工程', '1', '2016');
INSERT INTO `major` VALUES ('11', '物联网工程', '1', '2017');
INSERT INTO `major` VALUES ('12', '电子信息工程', '1', '2017');
INSERT INTO `major` VALUES ('13', '电子信息工程', '1', '2016');
INSERT INTO `major` VALUES ('14', '电子信息工程', '1', '2015');
INSERT INTO `major` VALUES ('15', '物联网工程', '1', '2015');
INSERT INTO `major` VALUES ('16', '软件工程', '1', '2015');
INSERT INTO `major` VALUES ('17', '计算机科学与技术', '1', '2015');
INSERT INTO `major` VALUES ('18', '软件工程', '1', '2016');

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
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ng
-- ----------------------------
INSERT INTO `ng` VALUES ('1', '1', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('2', '2', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('3', '3', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('4', '4', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('7', '7', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('8', '8', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('9', '9', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('10', '10', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('11', '11', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('12', '12', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('14', '14', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('15', '15', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('16', '16', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('17', '17', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('18', '18', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('19', '19', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('21', '21', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('22', '22', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('23', '23', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('24', '24', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('25', '25', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('26', '26', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('27', '27', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('28', '28', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('29', '29', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('30', '30', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('31', '31', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('32', '32', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('33', '33', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('34', '34', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('35', '35', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('36', '36', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('37', '37', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('38', '38', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('39', '39', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('42', '42', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('43', '43', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('44', '44', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('46', '46', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('47', '47', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('48', '48', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('49', '49', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('50', '50', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('51', '51', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('52', '52', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('53', '53', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('54', '54', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('55', '55', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('56', '56', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `ng` VALUES ('57', '57', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');

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
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of nis
-- ----------------------------
INSERT INTO `nis` VALUES ('1', '1', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('2', '2', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('3', '3', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('4', '4', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('5', '5', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('6', '6', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('7', '7', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('8', '8', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('9', '9', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('10', '10', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('11', '11', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('12', '12', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('13', '13', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('14', '14', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('15', '15', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('16', '16', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('17', '17', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('18', '18', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('19', '19', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('20', '20', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('21', '21', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('22', '22', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('23', '23', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('24', '24', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('25', '25', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('26', '26', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('27', '27', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('28', '28', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('29', '29', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('30', '30', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('31', '31', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('32', '32', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('33', '33', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('34', '34', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('35', '35', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('36', '36', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('37', '37', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('38', '38', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('39', '39', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('40', '40', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('41', '41', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('42', '42', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('43', '43', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('44', '44', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('45', '45', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('46', '46', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('47', '47', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('48', '48', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('49', '49', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('50', '50', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('51', '51', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('52', '52', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('53', '53', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('54', '54', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('55', '55', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('56', '56', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');
INSERT INTO `nis` VALUES ('57', '57', '2018', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '');

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
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pgs
-- ----------------------------
INSERT INTO `pgs` VALUES ('1', '1', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('2', '2', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('5', '5', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('6', '6', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('7', '7', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('8', '8', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('9', '9', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('10', '10', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('11', '11', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('12', '12', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('13', '13', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('14', '14', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('15', '15', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('16', '16', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('17', '17', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('18', '18', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('19', '19', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('20', '20', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('21', '21', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('22', '22', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('23', '23', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('24', '24', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('26', '26', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('27', '27', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('29', '29', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('30', '30', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('31', '31', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('32', '32', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('35', '35', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('36', '36', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('37', '37', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('38', '38', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('40', '40', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('41', '41', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('42', '42', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('43', '43', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('44', '44', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('45', '45', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('46', '46', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('47', '47', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('48', '48', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('49', '49', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('50', '50', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('51', '51', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('52', '52', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('53', '53', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('54', '54', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('55', '55', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('56', '56', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);
INSERT INTO `pgs` VALUES ('57', '57', '2018', '', '', '', '', '', '', '', '', '', '', '', '', null);

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
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ss
-- ----------------------------
INSERT INTO `ss` VALUES ('1', '1', '2018', '');
INSERT INTO `ss` VALUES ('2', '2', '2018', '');
INSERT INTO `ss` VALUES ('3', '3', '2018', '');
INSERT INTO `ss` VALUES ('5', '5', '2018', '');
INSERT INTO `ss` VALUES ('6', '6', '2018', '');
INSERT INTO `ss` VALUES ('7', '7', '2018', '');
INSERT INTO `ss` VALUES ('8', '8', '2018', '');
INSERT INTO `ss` VALUES ('9', '9', '2018', '');
INSERT INTO `ss` VALUES ('11', '11', '2018', '');
INSERT INTO `ss` VALUES ('13', '13', '2018', '');
INSERT INTO `ss` VALUES ('15', '15', '2018', '');
INSERT INTO `ss` VALUES ('16', '16', '2018', '');
INSERT INTO `ss` VALUES ('17', '17', '2018', '');
INSERT INTO `ss` VALUES ('18', '18', '2018', '');
INSERT INTO `ss` VALUES ('19', '19', '2018', '');
INSERT INTO `ss` VALUES ('20', '20', '2018', '');
INSERT INTO `ss` VALUES ('22', '22', '2018', '');
INSERT INTO `ss` VALUES ('23', '23', '2018', '');
INSERT INTO `ss` VALUES ('24', '24', '2018', '');
INSERT INTO `ss` VALUES ('25', '25', '2018', '');
INSERT INTO `ss` VALUES ('26', '26', '2018', '');
INSERT INTO `ss` VALUES ('27', '27', '2018', '');
INSERT INTO `ss` VALUES ('28', '28', '2018', '');
INSERT INTO `ss` VALUES ('29', '29', '2018', '');
INSERT INTO `ss` VALUES ('31', '31', '2018', '');
INSERT INTO `ss` VALUES ('33', '33', '2018', '');
INSERT INTO `ss` VALUES ('35', '35', '2018', '');
INSERT INTO `ss` VALUES ('36', '36', '2018', '');
INSERT INTO `ss` VALUES ('37', '37', '2018', '');
INSERT INTO `ss` VALUES ('38', '38', '2018', '');
INSERT INTO `ss` VALUES ('39', '39', '2018', '');
INSERT INTO `ss` VALUES ('40', '40', '2018', '');
INSERT INTO `ss` VALUES ('41', '41', '2018', '');
INSERT INTO `ss` VALUES ('42', '42', '2018', '');
INSERT INTO `ss` VALUES ('43', '43', '2018', '');
INSERT INTO `ss` VALUES ('46', '46', '2018', '');
INSERT INTO `ss` VALUES ('48', '48', '2018', '');
INSERT INTO `ss` VALUES ('49', '49', '2018', '');
INSERT INTO `ss` VALUES ('50', '50', '2018', '');
INSERT INTO `ss` VALUES ('51', '51', '2018', '');
INSERT INTO `ss` VALUES ('52', '52', '2018', '');
INSERT INTO `ss` VALUES ('53', '53', '2018', '');
INSERT INTO `ss` VALUES ('55', '55', '2018', '');
INSERT INTO `ss` VALUES ('56', '56', '2018', '');
INSERT INTO `ss` VALUES ('57', '57', '2018', '');

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
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tas
-- ----------------------------
INSERT INTO `tas` VALUES ('1', '1', '2018', '');
INSERT INTO `tas` VALUES ('2', '2', '2018', '');
INSERT INTO `tas` VALUES ('3', '3', '2018', '');
INSERT INTO `tas` VALUES ('6', '6', '2018', '');
INSERT INTO `tas` VALUES ('8', '8', '2018', '');
INSERT INTO `tas` VALUES ('9', '9', '2018', '');
INSERT INTO `tas` VALUES ('11', '11', '2018', '');
INSERT INTO `tas` VALUES ('13', '13', '2018', '');
INSERT INTO `tas` VALUES ('14', '14', '2018', '');
INSERT INTO `tas` VALUES ('15', '15', '2018', '');
INSERT INTO `tas` VALUES ('16', '16', '2018', '');
INSERT INTO `tas` VALUES ('17', '17', '2018', '');
INSERT INTO `tas` VALUES ('18', '18', '2018', '');
INSERT INTO `tas` VALUES ('19', '19', '2018', '');
INSERT INTO `tas` VALUES ('20', '20', '2018', '');
INSERT INTO `tas` VALUES ('23', '23', '2018', '');
INSERT INTO `tas` VALUES ('25', '25', '2018', '');
INSERT INTO `tas` VALUES ('26', '26', '2018', '');
INSERT INTO `tas` VALUES ('27', '27', '2018', '');
INSERT INTO `tas` VALUES ('28', '28', '2018', '');
INSERT INTO `tas` VALUES ('29', '29', '2018', '');
INSERT INTO `tas` VALUES ('32', '32', '2018', '');
INSERT INTO `tas` VALUES ('33', '33', '2018', '');
INSERT INTO `tas` VALUES ('34', '34', '2018', '');
INSERT INTO `tas` VALUES ('35', '35', '2018', '');
INSERT INTO `tas` VALUES ('36', '36', '2018', '');
INSERT INTO `tas` VALUES ('37', '37', '2018', '');
INSERT INTO `tas` VALUES ('38', '38', '2018', '');
INSERT INTO `tas` VALUES ('39', '39', '2018', '');
INSERT INTO `tas` VALUES ('40', '40', '2018', '');
INSERT INTO `tas` VALUES ('41', '41', '2018', '');
INSERT INTO `tas` VALUES ('43', '43', '2018', '');
INSERT INTO `tas` VALUES ('45', '45', '2018', '');
INSERT INTO `tas` VALUES ('46', '46', '2018', '');
INSERT INTO `tas` VALUES ('49', '49', '2018', '');
INSERT INTO `tas` VALUES ('50', '50', '2018', '');
INSERT INTO `tas` VALUES ('52', '52', '2018', '');
INSERT INTO `tas` VALUES ('53', '53', '2018', '');
INSERT INTO `tas` VALUES ('54', '54', '2018', '');
INSERT INTO `tas` VALUES ('55', '55', '2018', '');
INSERT INTO `tas` VALUES ('56', '56', '2018', '');
INSERT INTO `tas` VALUES ('57', '57', '2018', '');

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
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_basic
-- ----------------------------
INSERT INTO `user_basic` VALUES ('1', '1160299281', 'ISGMyneATSuhkiwz4BURBQ==', '软工午', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('2', '1160299080', 'ISGMyneATSuhkiwz4BURBQ==', '物联吴', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('3', '1150299042', 'ISGMyneATSuhkiwz4BURBQ==', '软工乙', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('4', '1150299044', 'ISGMyneATSuhkiwz4BURBQ==', '软工丙', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('5', '1150299088', 'ISGMyneATSuhkiwz4BURBQ==', '软工壬', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('6', '1150299002', 'ISGMyneATSuhkiwz4BURBQ==', '软工甲', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('7', '1160299088', 'ISGMyneATSuhkiwz4BURBQ==', '软工辰', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('8', '1150299001', 'ISGMyneATSuhkiwz4BURBQ==', '胡日天', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('9', '1160299001', 'ISGMyneATSuhkiwz4BURBQ==', '计科才', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('10', '1170299089', 'ISGMyneATSuhkiwz4BURBQ==', '数媒局', '女', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('11', '1160299109', 'ISGMyneATSuhkiwz4BURBQ==', '软工寅', '女', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('12', '1150299009', 'ISGMyneATSuhkiwz4BURBQ==', '姚二城', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('13', '1150299290', 'ISGMyneATSuhkiwz4BURBQ==', '陈炒饭', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('14', '1160299075', 'ISGMyneATSuhkiwz4BURBQ==', '软工巳', '女', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('15', '1150299053', 'ISGMyneATSuhkiwz4BURBQ==', '软工辛', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('16', '1150299132', 'ISGMyneATSuhkiwz4BURBQ==', '吕拼拼', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('17', '1150299055', 'ISGMyneATSuhkiwz4BURBQ==', '软工庚', '女', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('18', '1160299110', 'ISGMyneATSuhkiwz4BURBQ==', '软工蔡', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('19', '1160299077', 'ISGMyneATSuhkiwz4BURBQ==', '物联刺', '女', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('20', '1170299255', 'ISGMyneATSuhkiwz4BURBQ==', '计科飞', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('21', '1160299199', 'ISGMyneATSuhkiwz4BURBQ==', '数媒迪', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('22', '1160299111', 'ISGMyneATSuhkiwz4BURBQ==', '软工子', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('23', '1170299019', 'ISGMyneATSuhkiwz4BURBQ==', '数媒林', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('24', '1160299219', 'ISGMyneATSuhkiwz4BURBQ==', '软工癸', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('25', '1160299182', 'ISGMyneATSuhkiwz4BURBQ==', '数媒电', '女', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('26', '1170299182', 'ISGMyneATSuhkiwz4BURBQ==', '通信胡', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('27', '1170299060', 'ISGMyneATSuhkiwz4BURBQ==', '电信天', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('28', '1160299142', 'ISGMyneATSuhkiwz4BURBQ==', '通信李', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('29', '1150299222', 'ISGMyneATSuhkiwz4BURBQ==', '林疮伟', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('30', '1160299100', 'ISGMyneATSuhkiwz4BURBQ==', '计科峰', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('31', '1150299301', 'ISGMyneATSuhkiwz4BURBQ==', '戴吻飞', '女', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('32', '1160299301', 'ISGMyneATSuhkiwz4BURBQ==', '通信张', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('33', '1160299008', 'ISGMyneATSuhkiwz4BURBQ==', '软工未', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('34', '1170299108', 'ISGMyneATSuhkiwz4BURBQ==', '软工强', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('35', '1160299291', 'ISGMyneATSuhkiwz4BURBQ==', '电信法', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('36', '1170299150', 'ISGMyneATSuhkiwz4BURBQ==', '通信孙', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('37', '1150299071', 'ISGMyneATSuhkiwz4BURBQ==', '朱晕壮', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('38', '1150299070', 'ISGMyneATSuhkiwz4BURBQ==', '陈伪', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('39', '1170299154', 'ISGMyneATSuhkiwz4BURBQ==', '物联姚', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('40', '1160299293', 'ISGMyneATSuhkiwz4BURBQ==', '电信泽', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('41', '1170299196', 'ISGMyneATSuhkiwz4BURBQ==', '软工窝', '女', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('42', '1170299075', 'ISGMyneATSuhkiwz4BURBQ==', '计科彩', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('43', '1150299030', 'ISGMyneATSuhkiwz4BURBQ==', '孙琪', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('44', '1150299154', 'ISGMyneATSuhkiwz4BURBQ==', '陈真强', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('45', '1170299158', 'ISGMyneATSuhkiwz4BURBQ==', '电信集', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('46', '1160299212', 'ISGMyneATSuhkiwz4BURBQ==', '计科朱', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('47', '1170299234', 'ISGMyneATSuhkiwz4BURBQ==', '计科耀', '男', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('48', '1160299011', 'ISGMyneATSuhkiwz4BURBQ==', '软工卯', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('49', '1150299078', 'ISGMyneATSuhkiwz4BURBQ==', '李土耀', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('50', '1170299078', 'ISGMyneATSuhkiwz4BURBQ==', '物联吕', '女', '', '', '2017年09月', '');
INSERT INTO `user_basic` VALUES ('51', '1150299234', 'ISGMyneATSuhkiwz4BURBQ==', '蔡精男', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('52', '1150299113', 'ISGMyneATSuhkiwz4BURBQ==', '田啧', '男', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('53', '1150299036', 'ISGMyneATSuhkiwz4BURBQ==', '软工己', '女', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('54', '1160299213', 'ISGMyneATSuhkiwz4BURBQ==', '软工伪', '男', '', '', '2016年09月', '');
INSERT INTO `user_basic` VALUES ('55', '1150299039', 'ISGMyneATSuhkiwz4BURBQ==', '软工戊', '女', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('56', '1150299038', 'ISGMyneATSuhkiwz4BURBQ==', '软工丁', '女', '', '', '2015年09月', '');
INSERT INTO `user_basic` VALUES ('57', '1160299214', 'ISGMyneATSuhkiwz4BURBQ==', '软工丑', '男', '', '', '2016年09月', '');

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
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '38', '2018', '12', '', '', '', '10', '80', '10', '100', '1', '1', '', '', '73');
INSERT INTO `user_info` VALUES ('2', '37', '2018', '11', '', '', '', '8', '86', '12', '106', '25', '22', '', '', '73');
INSERT INTO `user_info` VALUES ('3', '8', '2018', '33', '', '', '', '15', '69', '6', '90', '1', '5', '', '', '90');
INSERT INTO `user_info` VALUES ('4', '49', '2018', '35', '', '', '', '6', '70', '6', '82', '1', '1', '', '', '90');
INSERT INTO `user_info` VALUES ('5', '51', '2018', '26', '', '', '', '10', '68', '10', '88', '10', '3', '', '', '90');
INSERT INTO `user_info` VALUES ('6', '29', '2018', '2', '', '', '', '2', '78', '10', '90', '2', '2', '', '', '65');
INSERT INTO `user_info` VALUES ('7', '43', '2018', '1', '', '', '', '8', '75', '4', '87', '5', '4', '', '', '65');
INSERT INTO `user_info` VALUES ('8', '52', '2018', '39', '', '', '', '3', '77', '0', '80', '12', '12', '', '', '55');
INSERT INTO `user_info` VALUES ('9', '44', '2018', '29', '', '', '', '6', '33', '0', '39', '21', '6', '', '', '55');
INSERT INTO `user_info` VALUES ('10', '12', '2018', '23', '', '', '', '12', '18', '5', '35', '24', '11', '', '', '70');
INSERT INTO `user_info` VALUES ('11', '13', '2018', '25', '', '', '', '10', '88', '12', '110', '55', '32', '', '', '70');
INSERT INTO `user_info` VALUES ('12', '31', '2018', '4', '', '', '', '8', '70', '5', '83', '42', '54', '', '', '52');
INSERT INTO `user_info` VALUES ('13', '16', '2018', '3', '', '', '', '15', '66', '10', '91', '33', '13', '', '', '52');
INSERT INTO `user_info` VALUES ('14', '54', '2018', '15', '', '', '', '2', '10', '55', '67', '64', '77', '', '', '80');
INSERT INTO `user_info` VALUES ('15', '18', '2018', '14', '', '', '', '12', '7', '66', '85', '21', '75', '', '', '80');
INSERT INTO `user_info` VALUES ('16', '46', '2018', '30', '', '', '', '3', '5', '94', '102', '73', '75', '', '', '102');
INSERT INTO `user_info` VALUES ('17', '30', '2018', '32', '', '', '', '1', '65', '49', '115', '21', '19', '', '', '102');
INSERT INTO `user_info` VALUES ('18', '9', '2018', '34', '', '', '', '6', '23', '8', '37', '52', '63', '', '', '102');
INSERT INTO `user_info` VALUES ('19', '2', '2018', '6', '', '', '', '13', '21', '95', '129', '3', '1', '', '', '76');
INSERT INTO `user_info` VALUES ('20', '19', '2018', '5', '', '', '', '2', '72', '27', '101', '66', '74', '', '', '76');
INSERT INTO `user_info` VALUES ('21', '32', '2018', '37', '', '', '', '5', '80', '4', '89', '24', '55', '', '', '68');
INSERT INTO `user_info` VALUES ('22', '28', '2018', '38', '', '', '', '8', '78', '7', '93', '21', '26', '', '', '68');
INSERT INTO `user_info` VALUES ('23', '25', '2018', '16', '', '', '', '12', '5', '41', '58', '55', '42', '', '', '51');
INSERT INTO `user_info` VALUES ('24', '21', '2018', '24', '', '', '', '2', '85', '57', '144', '31', '35', '', '', '51');
INSERT INTO `user_info` VALUES ('25', '35', '2018', '19', '', '', '', '8', '42', '9', '59', '6', '42', '', '', '70');
INSERT INTO `user_info` VALUES ('26', '40', '2018', '7', '', '', '', '12', '13', '90', '115', '45', '28', '', '', '70');
INSERT INTO `user_info` VALUES ('27', '41', '2018', '20', '', '', '', '14', '74', '20', '108', '54', '13', '', '', '77');
INSERT INTO `user_info` VALUES ('28', '34', '2018', '17', '', '', '', '6', '73', '1', '80', '24', '21', '', '', '77');
INSERT INTO `user_info` VALUES ('29', '42', '2018', '27', '', '', '', '10', '21', '70', '101', '31', '3', '', '', '85');
INSERT INTO `user_info` VALUES ('30', '20', '2018', '28', '', '', '', '3', '1', '41', '45', '59', '71', '', '', '85');
INSERT INTO `user_info` VALUES ('31', '47', '2018', '31', '', '', '', '4', '70', '43', '117', '21', '41', '', '', '85');
INSERT INTO `user_info` VALUES ('32', '39', '2018', '10', '', '', '', '14', '67', '29', '110', '18', '7', '', '', '69');
INSERT INTO `user_info` VALUES ('33', '50', '2018', '8', '', '', '', '3', '70', '41', '114', '41', '12', '', '', '69');
INSERT INTO `user_info` VALUES ('34', '26', '2018', '40', '', '', '', '2', '34', '34', '70', '2', '18', '', '', '76');
INSERT INTO `user_info` VALUES ('35', '36', '2018', '36', '', '', '', '3', '51', '10', '64', '32', '28', '', '', '76');
INSERT INTO `user_info` VALUES ('36', '10', '2018', '13', '', '', '', '14', '60', '21', '95', '51', '6', '', '', '58');
INSERT INTO `user_info` VALUES ('37', '23', '2018', '18', '', '', '', '14', '89', '0', '103', '4', '12', '', '', '58');
INSERT INTO `user_info` VALUES ('38', '27', '2018', '22', '', '', '', '7', '20', '80', '107', '5', '17', '', '', '56');
INSERT INTO `user_info` VALUES ('39', '45', '2018', '21', '', '', '', '5', '84', '1', '90', '51', '5', '', '', '56');
INSERT INTO `user_info` VALUES ('40', '6', '2018', '12', '', '', '', '12', '14', '20', '46', '54', '63', '', '', '73');
INSERT INTO `user_info` VALUES ('41', '3', '2018', '9', '', '', '', '13', '19', '47', '79', '41', '71', '', '', '73');
INSERT INTO `user_info` VALUES ('42', '4', '2018', '12', '', '', '', '6', '76', '44', '126', '9', '38', '', '', '73');
INSERT INTO `user_info` VALUES ('43', '56', '2018', '12', '', '', '', '2', '11', '90', '103', '72', '35', '', '', '73');
INSERT INTO `user_info` VALUES ('44', '55', '2018', '12', '', '', '', '3', '80', '10', '93', '70', '19', '', '', '73');
INSERT INTO `user_info` VALUES ('45', '53', '2018', '11', '', '', '', '5', '82', '31', '118', '49', '44', '', '', '73');
INSERT INTO `user_info` VALUES ('46', '17', '2018', '11', '', '', '', '8', '76', '19', '103', '55', '65', '', '', '73');
INSERT INTO `user_info` VALUES ('47', '15', '2018', '12', '', '', '', '13', '77', '13', '103', '78', '3', '', '', '73');
INSERT INTO `user_info` VALUES ('48', '5', '2018', '11', '', '', '', '2', '19', '17', '38', '49', '77', '', '', '73');
INSERT INTO `user_info` VALUES ('49', '24', '2018', '15', '', '', '', '7', '41', '77', '125', '57', '30', '', '', '80');
INSERT INTO `user_info` VALUES ('50', '22', '2018', '14', '', '', '', '9', '16', '76', '101', '78', '60', '', '', '80');
INSERT INTO `user_info` VALUES ('51', '57', '2018', '15', '', '', '', '8', '68', '21', '97', '16', '64', '', '', '80');
INSERT INTO `user_info` VALUES ('52', '11', '2018', '14', '', '', '', '7', '58', '4', '69', '30', '78', '', '', '80');
INSERT INTO `user_info` VALUES ('53', '48', '2018', '15', '', '', '', '6', '59', '47', '112', '71', '30', '', '', '80');
INSERT INTO `user_info` VALUES ('54', '7', '2018', '14', '', '', '', '11', '41', '15', '67', '3', '78', '', '', '80');
INSERT INTO `user_info` VALUES ('55', '14', '2018', '15', '', '', '', '7', '20', '81', '108', '20', '8', '', '', '80');
INSERT INTO `user_info` VALUES ('56', '1', '2018', '15', '', '', '', '13', '46', '56', '115', '6', '63', '', '', '80');
INSERT INTO `user_info` VALUES ('57', '33', '2018', '14', '', '', '', '11', '31', '78', '120', '56', '42', '', '', '80');
