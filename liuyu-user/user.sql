DROP TABLE IF EXISTS  user_user;
CREATE TABLE user_user(
  id BIGINT NOT NULL COMMENT'用户ID,由应用程序控制生成，这里不进行自动增长',
  usercode VARCHAR(20) DEFAULT '' COMMENT '用户代码',
  phone VARCHAR(11) DEFAULT '' COMMENT '用户电话',
  email VARCHAR(50) DEFAULT '' COMMENT '邮箱',
  pwd   VARCHAR(32) NOT NULL COMMENT '密码',
  nickname VARCHAR(50) DEFAULT '' COMMENT'用户昵称',
  userType TINYINT DEFAULT 0 COMMENT'用户类型',
  userstuate TINYINT DEFAULT 0 COMMENT '用户状态',
  valid BOOLEAN DEFAULT TRUE COMMENT'用户是否有效',
  PRIMARY KEY (id),
  KEY usercode(usercode),
  KEY phone(phone),
  KEY email(email)
)ENGINE=INNODB;

DROP TABLE IF EXISTS  user_role;
create table user_role(
  id bigint not null comment '角色ID',
  rolecode varchar(20) default '' comment '用户代码',
  rolename varchar(11) default '' comment '用户电话',
  valid boolean default true comment'用户是否有效',
  PRIMARY key (id)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  user_user_x_role;
create table user_user_x_role(
  userId bigint not null comment '角色ID',
  roleId bigint not null comment '角色ID'
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  user_role_x_resource;
create table user_role_x_resource(
  id int not null AUTO_INCREMENT COMMENT '',
  roleId bigint not null comment '角色ID',
  resourceId bigint not null comment'资源ID',
  resourcecode varchar(100) default '' comment '',
  resourceType tinyint not null comment '资源类型',
  PRIMARY KEY (id)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  user_user_x_resource;
create table user_user_x_resource(
  id int not null AUTO_INCREMENT COMMENT '',
  userId bigint not null comment '用户ID',
  resourceId bigint not null comment'资源ID',
  codeValue varchar(100) default '' comment '',
  resourceType tinyint not null comment '资源类型',
  PRIMARY KEY (id)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  user_resource;
create table user_resource(
  id bigint not null comment '资源ID',
  parentId bigint DEFAULT -1 COMMENT '父级资源ID',
  `name` varchar(30) not null comment'资源名称',
  code varchar(100) default '' comment '',
  category varchar(100) default '' comment '',
  PRIMARY KEY (id)
)ENGINE=InnoDB;


DROP TABLE IF EXISTS  rg_org;
create table rg_org(
  id bigint not null comment '机构ID',
  `code` varchar(30) not null comment'机构代码',
  `name` varchar(100) default '' comment '机构名称',
  parentcode  varchar(30) default '' comment'',
  provincecode varchar(30) default '' comment'',
  citycecode  varchar(30) default '' comment'',
  countycode  varchar(30) default '' comment'',
   orgType tinyint default 4 comment '机构类型',
  PRIMARY KEY (id)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_grade;
create table rg_grade(
  id bigint not null comment '年级ID',
  `name` varchar(100) default '' comment '班级名称',
  PRIMARY KEY (id)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_clazz;
create table rg_clazz(
  id bigint not null comment '班级ID',
  `code` varchar(30) not null comment'班级代码',
  `name` varchar(100) default '' comment '班级名称',
   subjectName varchar(20) default '' comment '科目名称',
   schoolCode varchar(30) not null comment'学校名称',
   gradeId varchar(10) not null comment'年级',
   wl tinyint DEFAULT 0 comment'班级类别,可能以后就不用了',
   clazzLevel varchar(20) DEFAULT '' comment '班级分层层次',
  PRIMARY KEY (id)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_teacher_teach_clazz;
create table rg_teacher_teach_clazz(
  id bigint not null comment 'ID',
  `clazzcode` varchar(30) not null comment'班级代码',
   subjectName varchar(20) default '' comment '科目名称',
   schoolCode varchar(30) not null comment'学校名称',
   teacherId bigint not null comment'老师代码',
  PRIMARY KEY (id)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_teacher;
create table rg_teacher(
  id bigint not null comment'',
  `name` varchar(30) not null comment'',
  levelType tinyint not null comment'那个层级的老师',
  userId bigint default -1 comment'老师关联的账号ID',
  orgCode varchar(30) not null comment'所属结构ID',
  PRIMARY KEY (id)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_student;
create table rg_student(
  id bigint not null comment'',
  `code` varchar(30) not null comment'学生代码',
  `name` varchar(30) not null comment'',
  schoolCode varchar(30) not null comment'',
  userId bigint default -1 COMMENT '老师关联的账号ID',
  PRIMARY KEY (id)
)ENGINE=InnoDB;