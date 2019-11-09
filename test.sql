/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50605
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50605
File Encoding         : 65001

Date: 2019-10-23 22:14:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category_
-- ----------------------------
DROP TABLE IF EXISTS `category_`;
CREATE TABLE `category_` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category_
-- ----------------------------
INSERT INTO `category_` VALUES ('1', '4');
INSERT INTO `category_` VALUES ('2', '5');
INSERT INTO `category_` VALUES ('3', '5');

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `studentId` int(24) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  `profession` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `number` double(24,0) DEFAULT NULL,
  `advice` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('11111001', '学生1', '信息工程', '课题1', '78', '修改通过');
INSERT INTO `class` VALUES ('11111002', '学生2', '信息工程', '课题2', '82', '修改通过');
INSERT INTO `class` VALUES ('11111003', '学生3', '信息工程', '课题3', '81', '修改通过');
INSERT INTO `class` VALUES ('11111004', '学生4', '信息工程', '课题4', '88', '修改通过');
INSERT INTO `class` VALUES ('11111005', '学生5', '信息工程', '课题5', '75', '修改通过');
INSERT INTO `class` VALUES ('11111006', '学生6', '信息工程', '课题6', '86', '修改通过');
INSERT INTO `class` VALUES ('11111007', '学生7', '信息工程', '课题7', '86', '通过');
INSERT INTO `class` VALUES ('11111008', '学生8', '信息工程', '课题8', '78', '修改通过');
INSERT INTO `class` VALUES ('11111009', '学生9', '信息工程', '课题9', '92', '通过');
INSERT INTO `class` VALUES ('11111010', '学生10', '信息工程', '课题10', '77', '修改通过');
INSERT INTO `class` VALUES ('11111011', '学生11', '信息工程', '课题11', '68', '修改通过');
INSERT INTO `class` VALUES ('11111012', '学生12', '信息工程', '课题12', '78', '修改通过');
INSERT INTO `class` VALUES ('11111013', '学生13', '信息工程', '课题13', '84', '修改通过');
INSERT INTO `class` VALUES ('11111014', '学生14', '信息工程', '课题14', '88', '通过');
INSERT INTO `class` VALUES ('11111015', '学生15', '信息工程', '课题15', '52', '不通过');
INSERT INTO `class` VALUES ('11111016', '学生16', '信息工程', '课题16', '55', '不通过');
INSERT INTO `class` VALUES ('11111017', '学生17', '信息工程', '课题17', '83', '修改通过');
INSERT INTO `class` VALUES ('11111018', '学生18', '信息工程', '课题18', '79', '修改通过');
INSERT INTO `class` VALUES ('11111019', '学生19', '信息工程', '课题19', '75', '修改通过');
INSERT INTO `class` VALUES ('11111020', '学生20', '信息工程', '课题20', '78', '修改通过');
INSERT INTO `class` VALUES ('11111021', '学生21', '信息工程', '课题21', '94', '通过');
INSERT INTO `class` VALUES ('11111022', '学生22', '信息工程', '课题22', '80', '修改通过');
INSERT INTO `class` VALUES ('11111023', '学生23', '信息工程', '课题23', '78', '修改通过');
INSERT INTO `class` VALUES ('11111024', '学生24', '信息工程', '课题24', '76', '修改通过');
INSERT INTO `class` VALUES ('11111025', '学生25', '信息工程', '课题25', '78', '修改通过');
INSERT INTO `class` VALUES ('11111026', '学生26', '信息工程', '课题26', '90', '通过');
INSERT INTO `class` VALUES ('11111027', '学生27', '信息工程', '课题27', '95', '通过');
INSERT INTO `class` VALUES ('11111028', '学生28', '信息工程', '课题28', '80', '修改通过');
INSERT INTO `class` VALUES ('11111029', '学生29', '信息工程', '课题29', '86', '通过');
INSERT INTO `class` VALUES ('11111030', '学生30', '信息工程', '课题30', '90', '通过');
INSERT INTO `class` VALUES ('11111031', '学生31', '信息工程', '课题31', '62', '修改通过');
INSERT INTO `class` VALUES ('11111032', '学生32', '信息工程', '课题32', '52', '不通过');
INSERT INTO `class` VALUES ('11111033', '学生33', '信息工程', '课题33', '63', '修改通过');
INSERT INTO `class` VALUES ('11111034', '学生34', '信息工程', '课题34', '62', '修改通过');
INSERT INTO `class` VALUES ('11111035', '学生35', '信息工程', '课题35', '70', '修改通过');
INSERT INTO `class` VALUES ('11111036', '学生36', '信息工程', '课题36', '79', '修改通过');
INSERT INTO `class` VALUES ('11111037', '学生37', '信息工程', '课题37', '85', '通过');

-- ----------------------------
-- Table structure for conner_access
-- ----------------------------
DROP TABLE IF EXISTS `conner_access`;
CREATE TABLE `conner_access` (
  `asID` varchar(150) NOT NULL,
  `asMessage` varchar(150) NOT NULL,
  `asDate` varchar(50) NOT NULL,
  `asNumber` int(50) DEFAULT NULL,
  `asPeople` varchar(50) NOT NULL,
  `goid` varchar(150) NOT NULL,
  `usid` varchar(50) NOT NULL,
  `orid` varchar(50) NOT NULL,
  PRIMARY KEY (`asID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conner_access
-- ----------------------------
INSERT INTO `conner_access` VALUES ('a62627e0d5c54b4baa38c84b628fa1af', '使用极好', '2019-10-23 :08:49:04', '0', '李裕程', '055381', 'cbacc5d9544942fc9d6ca411dac33360', 'ea941579a6e14360ab2251a1797d90e6');

-- ----------------------------
-- Table structure for conner_address
-- ----------------------------
DROP TABLE IF EXISTS `conner_address`;
CREATE TABLE `conner_address` (
  `adID` varchar(50) NOT NULL,
  `adName` varchar(50) NOT NULL,
  `adAnotherName` varchar(50) NOT NULL,
  `adStartDate` varchar(50) NOT NULL,
  `adEndDate` varchar(50) NOT NULL,
  `adLong` double(50,8) NOT NULL,
  `adLat` double(50,8) NOT NULL,
  PRIMARY KEY (`adID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conner_address
-- ----------------------------
INSERT INTO `conner_address` VALUES ('1', '广东东软学院24栋101', '24栋101', '2019-10-15', '2015-10-20', '113.03808000', '23.14100000');
INSERT INTO `conner_address` VALUES ('2', '广东东软学院C座101', 'C座101', '9：00', '18：00', '113.03828000', '23.14118000');
INSERT INTO `conner_address` VALUES ('3', '广东东软学院F座101', 'F座101', '9:000', '18:00', '113.02828000', '23.14218000');
INSERT INTO `conner_address` VALUES ('4', '广东东软学院B座105', 'B座105', '9:00', '18:00', '113.02928000', '23.14218000');

-- ----------------------------
-- Table structure for conner_enjoy
-- ----------------------------
DROP TABLE IF EXISTS `conner_enjoy`;
CREATE TABLE `conner_enjoy` (
  `enId` varchar(50) NOT NULL,
  `enName` varchar(50) NOT NULL,
  `enRentDate` varchar(50) NOT NULL,
  `enBackDate` varchar(50) NOT NULL,
  `enPeople` varchar(50) NOT NULL,
  `enPrice` varchar(50) NOT NULL,
  `usid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`enId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conner_enjoy
-- ----------------------------

-- ----------------------------
-- Table structure for conner_goods
-- ----------------------------
DROP TABLE IF EXISTS `conner_goods`;
CREATE TABLE `conner_goods` (
  `goID` varchar(150) NOT NULL,
  `goName` varchar(50) NOT NULL,
  `goCategory` varchar(50) NOT NULL,
  `goMessage` varchar(150) NOT NULL,
  `goCreateDate` varchar(100) NOT NULL,
  `goRentDate` varchar(100) DEFAULT NULL,
  `goBackDate` varchar(100) DEFAULT NULL,
  `goNumber` int(50) DEFAULT NULL,
  `goAllPrice` int(50) DEFAULT NULL,
  `goRentAddress` varchar(150) DEFAULT NULL,
  `goBackAddress` varchar(150) DEFAULT NULL,
  `goRentPrice` int(50) DEFAULT NULL,
  `goGoodPrice` int(50) NOT NULL,
  `goButtonColor` varchar(50) NOT NULL,
  `goGoodTalkNumber` int(50) DEFAULT NULL,
  `usid` varchar(50) DEFAULT NULL,
  `goMasterName` varchar(50) NOT NULL,
  `goMasterImage` varchar(150) DEFAULT NULL,
  `adid` varchar(50) DEFAULT NULL,
  `goGoodStatus` varchar(50) NOT NULL,
  `myid` varchar(50) NOT NULL,
  PRIMARY KEY (`goID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conner_goods
-- ----------------------------
INSERT INTO `conner_goods` VALUES ('055381', '四级大猛冲', '学习', '学习四级用', '2019-10-23 :08:39:55', null, null, '1', '0', null, '广东东软学院B座105', '2', '150', '#e54d42', null, null, '李裕程', null, '4', '预约共享', 'cbacc5d9544942fc9d6ca411dac33360');
INSERT INTO `conner_goods` VALUES ('125646', '3D魔幻眼镜', '娱乐', '能看透', '2019-10-23 :08:39:04', null, null, '0', null, null, '广东东软学院24栋101', '1', '20', '#e54d42', null, null, '李裕程', null, '1', '预约共享', 'cbacc5d9544942fc9d6ca411dac33360');
INSERT INTO `conner_goods` VALUES ('161570', '破木吉他', '娱乐', '反弹幅度是否', '2019-10-23 :08:43:55', null, null, '0', null, null, '广东东软学院C座101', '10', '500', '#e54d42', null, null, '李裕程', null, '2', '预约共享', 'cbacc5d9544942fc9d6ca411dac33360');
INSERT INTO `conner_goods` VALUES ('191406', '天堂伞', '生活', '防守打法是否', '2019-10-23 :08:42:40', null, null, '0', null, null, '广东东软学院B座105', '2', '50', '#e54d42', null, null, '李裕程', null, '4', '预约共享', 'cbacc5d9544942fc9d6ca411dac33360');
INSERT INTO `conner_goods` VALUES ('236579', 'java进价', '学习', 'java学习', '2019-10-23 :08:41:16', null, null, '0', null, null, '广东东软学院B座105', '2', '150', '#e54d42', null, null, '李裕程', null, '4', '预约共享', 'cbacc5d9544942fc9d6ca411dac33360');
INSERT INTO `conner_goods` VALUES ('275604', '大锅', '电器', '烧菜专用', '2019-10-23 :08:40:35', null, null, '0', null, null, '广东东软学院C座101', '2', '150', '#e54d42', null, null, '李裕程', null, '2', '预约共享', 'cbacc5d9544942fc9d6ca411dac33360');
INSERT INTO `conner_goods` VALUES ('401950', '篮球', '娱乐', '的士速递', '2019-10-23 :08:43:16', null, null, '0', null, null, '广东东软学院24栋101', '2', '99', '#e54d42', null, null, '李裕程', null, '1', '预约共享', 'cbacc5d9544942fc9d6ca411dac33360');
INSERT INTO `conner_goods` VALUES ('880805', '数据库原理', '学习', '佛挡杀佛', '2019-10-23 :08:41:56', null, null, '0', null, null, '广东东软学院F座101', '5', '150', '#e54d42', null, null, '李裕程', null, '3', '预约共享', 'cbacc5d9544942fc9d6ca411dac33360');

-- ----------------------------
-- Table structure for conner_order
-- ----------------------------
DROP TABLE IF EXISTS `conner_order`;
CREATE TABLE `conner_order` (
  `orId` varchar(50) NOT NULL,
  `orName` varchar(50) NOT NULL,
  `orRentDate` varchar(50) NOT NULL,
  `orBackDate` varchar(50) NOT NULL,
  `orMaster` varchar(50) NOT NULL,
  `orImage` varchar(150) NOT NULL,
  `orStuats` varchar(50) NOT NULL,
  `orPrice` int(50) NOT NULL,
  `usid` varchar(50) NOT NULL,
  `goid` varchar(50) DEFAULT NULL,
  `talkStuats` varchar(50) NOT NULL,
  PRIMARY KEY (`orId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conner_order
-- ----------------------------
INSERT INTO `conner_order` VALUES ('ea941579a6e14360ab2251a1797d90e6', '四级大猛冲', '2019-10-23', '2019-10-26', '李裕程', 'null', '已完成', '6', 'cbacc5d9544942fc9d6ca411dac33360', '055381', '已评价');

-- ----------------------------
-- Table structure for conner_photos
-- ----------------------------
DROP TABLE IF EXISTS `conner_photos`;
CREATE TABLE `conner_photos` (
  `poID` varchar(150) NOT NULL,
  `poName` varchar(50) NOT NULL,
  `goid` varchar(150) NOT NULL,
  PRIMARY KEY (`poID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conner_photos
-- ----------------------------
INSERT INTO `conner_photos` VALUES ('0d382cd0263043bdb742c3f42f50a5be', 'wx33489807911b466c.2019-10-23-20-42-40.jpg', '191406');
INSERT INTO `conner_photos` VALUES ('16a1106c39784913970a3403d1ade254', 'wx33489807911b466c.2019-10-23-20-43-55.jpeg', '161570');
INSERT INTO `conner_photos` VALUES ('1890d3c8cf8a402fa199e2455ba79a42', 'wx33489807911b466c.2019-10-23-20-43-55.jpg', '161570');
INSERT INTO `conner_photos` VALUES ('2b882735f63c4159849d9e03a39992c6', 'wx33489807911b466c.2019-10-23-20-42-40.jpg', '191406');
INSERT INTO `conner_photos` VALUES ('2f03c5ba2f234eac83c118086e412c38', 'wx33489807911b466c.2019-10-23-20-40-35.jpg', '275604');
INSERT INTO `conner_photos` VALUES ('50e6066392844067988337c6a1823f5f', 'wx33489807911b466c.2019-10-23-20-41-56.jpg', '880805');
INSERT INTO `conner_photos` VALUES ('67e22f85686e47b2bfad63f67eb29439', 'wx33489807911b466c.2019-10-23-20-39-04.jpg', '125646');
INSERT INTO `conner_photos` VALUES ('72ed6bf341164b9e9092a9e68685007d', 'wx33489807911b466c.2019-10-23-20-43-16.jpg', '401950');
INSERT INTO `conner_photos` VALUES ('8d097f3eb948409294acc4712157f864', 'wx33489807911b466c.2019-10-23-20-41-16.jpeg', '236579');
INSERT INTO `conner_photos` VALUES ('9eb535703735481297d8ad9e5b066a3b', 'wx33489807911b466c.2019-10-23-20-43-16.jpg', '401950');
INSERT INTO `conner_photos` VALUES ('b45f2057f90a49519242d40d76d25e54', 'wx33489807911b466c.2019-10-23-20-41-16.jpg', '236579');
INSERT INTO `conner_photos` VALUES ('b6d75fe41782427ca8562a0f89bcc4e3', 'wx33489807911b466c.2019-10-23-20-39-55.jpg', '055381');
INSERT INTO `conner_photos` VALUES ('b86083c2ce2b4bbd9a3613f86ea2b0f7', 'wx33489807911b466c.2019-10-23-20-41-56.jpg', '880805');
INSERT INTO `conner_photos` VALUES ('d722f07b60ce4afea54fff1ab4315d00', 'wx33489807911b466c.2019-10-23-20-40-35.jpeg', '275604');
INSERT INTO `conner_photos` VALUES ('ec4bf5bf0b354035bf9ca834effee318', 'wx33489807911b466c.2019-10-23-20-39-55.jpg', '055381');
INSERT INTO `conner_photos` VALUES ('fbd73efa63b2476aa37b1f825b3e8888', 'wx33489807911b466c.2019-10-23-20-39-04.jpeg', '125646');

-- ----------------------------
-- Table structure for conner_talkphoto
-- ----------------------------
DROP TABLE IF EXISTS `conner_talkphoto`;
CREATE TABLE `conner_talkphoto` (
  `taID` varchar(50) NOT NULL,
  `tasrc` varchar(150) NOT NULL,
  `asid` varchar(50) NOT NULL,
  PRIMARY KEY (`taID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conner_talkphoto
-- ----------------------------
INSERT INTO `conner_talkphoto` VALUES ('2b727c8915dd4a1f9fc4bef11f96b6a7', 'wx33489807911b466c.2019-10-23-20-49-04.jpg', 'a62627e0d5c54b4baa38c84b628fa1af');
INSERT INTO `conner_talkphoto` VALUES ('6feebe5f95a142e1a9ba999198d2c3c1', 'wx33489807911b466c.2019-10-23-20-49-04.jpg', 'a62627e0d5c54b4baa38c84b628fa1af');

-- ----------------------------
-- Table structure for conner_user
-- ----------------------------
DROP TABLE IF EXISTS `conner_user`;
CREATE TABLE `conner_user` (
  `usID` varchar(150) NOT NULL,
  `usName` varchar(50) NOT NULL,
  `usImage` varchar(255) NOT NULL,
  `usDate` varchar(50) NOT NULL,
  `usOpenId` varchar(50) NOT NULL,
  `usIntegral` int(20) NOT NULL,
  PRIMARY KEY (`usID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conner_user
-- ----------------------------
INSERT INTO `conner_user` VALUES ('cbacc5d9544942fc9d6ca411dac33360', '李裕程', 'https://wx.qlogo.cn/mmopen/vi_32/rOOFlbOvWictpsanObp5dLqwjyzibJHLqiad62jISTRbwCQ0HsmRCJGhakeWYdC77ukH5rvmzoxJFljg2GnfL5YsA/132', '2019-10-09 :09:13:48', 'oCgSg4oaI4T5Ztj2uJGwz8wm8kI4', '100');

-- ----------------------------
-- Table structure for tb_criticism
-- ----------------------------
DROP TABLE IF EXISTS `tb_criticism`;
CREATE TABLE `tb_criticism` (
  `criticismID` int(11) NOT NULL AUTO_INCREMENT,
  `criticismContent` text,
  `employeeID` int(11) DEFAULT NULL,
  `criticismTime` datetime DEFAULT NULL,
  `messageID` int(11) DEFAULT NULL,
  PRIMARY KEY (`criticismID`),
  KEY `employeeID` (`employeeID`),
  KEY `messageID` (`messageID`),
  CONSTRAINT `tb_criticism_ibfk_1` FOREIGN KEY (`employeeID`) REFERENCES `tb_employee` (`employeeID`),
  CONSTRAINT `tb_criticism_ibfk_2` FOREIGN KEY (`messageID`) REFERENCES `tb_message` (`messageID`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='��Ϣ������';

-- ----------------------------
-- Records of tb_criticism
-- ----------------------------

-- ----------------------------
-- Table structure for tb_employee
-- ----------------------------
DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee` (
  `employeeID` int(11) NOT NULL DEFAULT '0',
  `employeeName` varchar(20) DEFAULT NULL,
  `employeeSex` bit(1) DEFAULT NULL,
  `employeeBirth` date DEFAULT NULL,
  `employeePhone` varchar(20) DEFAULT NULL,
  `employeePlace` varchar(50) DEFAULT NULL,
  `joinTime` date DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `isLead` bit(1) DEFAULT NULL,
  PRIMARY KEY (`employeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='Ա����Ϣ��';

-- ----------------------------
-- Records of tb_employee
-- ----------------------------
INSERT INTO `tb_employee` VALUES ('0', '李裕程', '', '2018-10-30', '17765602134', '汕尾', '2018-03-08', '1', '\0');

-- ----------------------------
-- Table structure for tb_message
-- ----------------------------
DROP TABLE IF EXISTS `tb_message`;
CREATE TABLE `tb_message` (
  `messageID` int(11) NOT NULL AUTO_INCREMENT,
  `messageTitle` varchar(50) DEFAULT NULL,
  `messageContent` text,
  `employeeID` int(11) DEFAULT NULL,
  `publishTime` datetime DEFAULT NULL,
  PRIMARY KEY (`messageID`),
  KEY `employeeID` (`employeeID`),
  CONSTRAINT `tb_message_ibfk_1` FOREIGN KEY (`employeeID`) REFERENCES `tb_employee` (`employeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gb2312 COMMENT='��Ϣ��';

-- ----------------------------
-- Records of tb_message
-- ----------------------------
INSERT INTO `tb_message` VALUES ('1', null, '<p>2222222222</p>', '0', '2019-03-09 15:27:16');
INSERT INTO `tb_message` VALUES ('2', '44444444444', '<p>333333333333</p>', '0', '2019-03-09 15:40:22');
INSERT INTO `tb_message` VALUES ('3', '4324', '<h3 style=\"color: red;\">43423444</h3>', '0', '2019-03-09 18:18:35');
INSERT INTO `tb_message` VALUES ('4', 'uuuu', '<p>uuuuuuuu</p>', '0', '2019-03-11 10:43:38');

-- ----------------------------
-- Table structure for tb_reply
-- ----------------------------
DROP TABLE IF EXISTS `tb_reply`;
CREATE TABLE `tb_reply` (
  `replyID` int(11) NOT NULL AUTO_INCREMENT,
  `replyContent` text,
  `employeeID` int(11) DEFAULT NULL,
  `replyTime` datetime DEFAULT NULL,
  `messageID` int(11) DEFAULT NULL,
  PRIMARY KEY (`replyID`),
  KEY `employeeID` (`employeeID`),
  KEY `messageID` (`messageID`),
  CONSTRAINT `tb_reply_ibfk_1` FOREIGN KEY (`employeeID`) REFERENCES `tb_employee` (`employeeID`),
  CONSTRAINT `tb_reply_ibfk_2` FOREIGN KEY (`messageID`) REFERENCES `tb_message` (`messageID`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312 COMMENT='��Ϣ�ظ���';

-- ----------------------------
-- Records of tb_reply
-- ----------------------------
