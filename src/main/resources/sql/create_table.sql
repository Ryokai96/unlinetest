-- 用户表
CREATE TABLE `user` (
  `user_id` binary(16) NOT NULL COMMENT '用户id',
  `username` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `email` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '邮箱',
  `code` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户激活码',
  `state` int(11) NOT NULL COMMENT '激活状态(0代表未激活,1代表已激活)',
  `user_type` int(11) NOT NULL COMMENT '用户类型(0代表管理员,1代表普通用户)',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `uni_user` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- 试题表
CREATE TABLE `test` (
  `test_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '试卷id',
  `test_desc` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '试卷描述',
  `test_path` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '试卷路径',
  `test_type` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '试卷类型',
  `uploader_id` binary(16) NOT NULL COMMENT '试卷上传者id',
  PRIMARY KEY (`test_id`),
  KEY `fk_user_test` (`uploader_id`),
  CONSTRAINT `fk_user_test` FOREIGN KEY (`uploader_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- 答案表
CREATE TABLE `solution` (
  `solution_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '答案id',
  `solution_path` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '答案地址',
  `test_id` int(11) NOT NULL COMMENT '试题id',
  PRIMARY KEY (`solution_id`),
  KEY `fk_test_usertest` (`test_id`),
  CONSTRAINT `fk_test_usertest` FOREIGN KEY (`test_id`) REFERENCES `test` (`test_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- 用户试题表
CREATE TABLE `selftest` (
  `selftest_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '我的试卷id',
  `test_id` int(11) NOT NULL COMMENT '试卷id',
  `user_id` binary(16) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`selftest_id`),
  KEY `fk_test_selftest` (`test_id`),
  KEY `fk_user_selftest` (`user_id`),
  CONSTRAINT `fk_test_selftest` FOREIGN KEY (`test_id`) REFERENCES `test` (`test_id`),
  CONSTRAINT `fk_user_selftest` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- 用户答案表
CREATE TABLE `selfsolution` (
  `selfsolution_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自己上传的答案id',
  `selftest_id` int(11) NOT NULL COMMENT '自己上传的试卷id',
  `selfsolution_path` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '自己上传的答案路径',
  PRIMARY KEY (`selfsolution_id`),
  KEY `fk_selftest_selfsolution` (`selftest_id`),
  CONSTRAINT `fk_selftest_selfsolution` FOREIGN KEY (`selftest_id`) REFERENCES `selftest` (`selftest_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- 用户答题表
CREATE TABLE `answertest` (
  `answertest_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户答题id',
  `test_id` int(11) NOT NULL COMMENT '试卷id',
  `user_id` binary(16) NOT NULL COMMENT '答题人id',
  `answertest_path` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '答题文件路径',
  `state` int(11) NOT NULL COMMENT '答题状态(0代表未提交,1代表已提交)',
  PRIMARY KEY (`answertest_id`),
  KEY `fk_test_answertest` (`test_id`),
  KEY `fk_user_answertest` (`user_id`),
  CONSTRAINT `fk_test_answertest` FOREIGN KEY (`test_id`) REFERENCES `test` (`test_id`),
  CONSTRAINT `fk_user_answertest` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- 学科标签表
CREATE TABLE `subjecttag` (
  `subjecttag_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学科标签id',
  `subject_name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '学科名称',
  `subject_url` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '学科对应url',
  PRIMARY KEY (`subjecttag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- 个人中心二级菜单
CREATE TABLE `personmenu` (
  `personmenu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '个人中心二级菜单id',
  `personmenu_name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '个人中心二级菜单名称',
  `personmenu_url` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '个人中心二级菜单对应url',
  PRIMARY KEY (`personmenu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- 添加二级菜单
CREATE TABLE `addmenu` (
  `addmenu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '添加二级菜单id',
  `addmenu_name` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '添加二级菜单名称',
  `addmenu_url` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '添加二级菜单对应url',
  PRIMARY KEY (`addmenu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
