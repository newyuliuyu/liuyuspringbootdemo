DROP TABLE IF EXISTS  user_user;
create table user_user(
  id bigint not null comment '用户ID,由应用程序控制生成，这里不进行自动增长',
  usercode varchar(20) default '' comment '用户代码',
  phone varchar(11) default '' comment '用户电话',
  email varchar(50) default '' comemnt '',
  pwd   varchar(32) not null comment '',
  nickname varchar(50) DEFAULT '用户昵称',
  userType tinyint default '' comment'用户类型',
  userstuate tinyint default '' comment '用户状态',
  valid boolean default true comment'用户是否有效',
  PRIMARY key (id),
  key usercode(usercode),
  key phone(phone),
  key email(email)
)ENGINE=InnoDB;

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
  roleId bigint not null comment '角色ID',
  resourceId bigint not null comment'资源ID',
  resourcecode varchar(100) default '' comment '',
  resourceType tinyint not null comment '资源类型'
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  user_user_x_resource;
create table user_user_x_resource(
  userId bigint not null comment '用户ID',
  resourceId bigint not null comment'资源ID',
  resourcecodeValue varchar(100) default '' comment '',
  resourceType tinyint not null comment '资源类型'
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  user_resource;
create table user_resource(
  id bigint not null comment '资源ID',
  `name` varchar(30) not null comment'资源名称',
  resourcecode varchar(100) default '' comment '',
)ENGINE=InnoDB;


DROP TABLE IF EXISTS  rg_org;
create table rg_org(
  id bigint not null comment '机构ID',
  `code` varchar(30) not null comment'机构代码',
  `name` varchar(100) default '' comment '机构名称',
  parentcode  varchar(30) defualt '' comment'',
  provincecode varchar(30) defualt '' comment'',
  citycecode  varchar(30) defualt '' comment'',
  countycode  varchar(30) defualt '' comment'',
   orgType tinyint default '' comment '机构类型'
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_grade;
create table rg_grade(
  id bigint not null comment '年级ID',
  `name` varchar(100) default '' comment '班级名称'
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_clazz;
create table rg_clazz(
  id bigint not null comment '班级ID',
  `code` varchar(30) not null comment'班级代码',
  `name` varchar(100) default '' comment '班级名称',
   subjectName varchar(20) default '' comment '科目名称',
   schoolCode varchar(30) not null comment'学校名称',
   gradeId varcahr(10) not null comment'年级',
   wl tinyint DEFAULT 0 comment'班级类别,可能以后就不用了',
   clazzLevel varchar(20) DEFAULT '' comment '班级分层层次'
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_teacher_teach_clazz;
create table rg_teacher_teach_clazz(
  id bigint not null comment 'ID',
  `clazzcode` varchar(30) not null comment'班级代码',
   subjectName varchar(20) default '' comment '科目名称',
   schoolCode varchar(30) not null comment'学校名称',
   teacherId bigint not null comment'老师代码'
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_teacher;
create table rg_teacher(
  id bigint not null comment'',
  `name` varchar(30) not null comment'',
  levelType tinyint not null comment'那个层级的老师',
  userId bigint default -1 commment'老师关联的账号ID',
  orgCode varchar(30) not null comment'所属结构ID'
)ENGINE=InnoDB;

DROP TABLE IF EXISTS  rg_student;
create table rg_student(
  id bigint not null comment'',
  `code` varchar(30) not null comment'学生代码',
  `name` varchar(30) not null comment'',
  schoolCode varchar(30) not null comment'',
  userId bigint default -1 commment'老师关联的账号ID'
)ENGINE=InnoDB;