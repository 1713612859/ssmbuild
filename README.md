# ssmbuild
SSM整合！！！
同时希望大家点个star！
sql 文件就放在下面，自行运行即可！

File Encoding         : 65001

Date: 2022-04-28 08:33:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三13', '18888888888', '重庆沙111');
INSERT INTO `student` VALUES ('8', '王二麻子', '1888232565', 'china');
INSERT INTO `student` VALUES ('11', '张三789', '19823558789', 'China-------------------');
INSERT INTO `student` VALUES ('12', '李四', '19823558789', 'China C洪庆');
INSERT INTO `student` VALUES ('13', '王老五', '11123456789', '美国人');
INSERT INTO `student` VALUES ('15', 'admin', '1888882255', '四川77');
INSERT INTO `student` VALUES ('16', 'admin', '1888882255', '重庆沙111');
INSERT INTO `student` VALUES ('19', '张三', '15730042921', '广安');
INSERT INTO `student` VALUES ('20', '张三', '15730042921', '广安');
