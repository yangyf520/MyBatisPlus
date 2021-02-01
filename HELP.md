###MyBatis plus使用

####新建主从SCHEMA
```$xslt
CREATE SCHEMA mybatis;
```

####新建user表
```$xslt
create table mybatis.user
(
  id          bigint auto_increment
  comment '主键ID',
  name        varchar(30)                        null
  comment '姓名',
  age         int                                null
  comment '年龄',
  email       varchar(50)                        null
  comment '邮箱',
  create_time datetime default CURRENT_TIMESTAMP null,
  update_time datetime default CURRENT_TIMESTAMP null,
  version     int default '0'                    null,
  deleted     int default '0'                    null,
  constraint user_id_uindex
  unique (id)
);

alter table mybatis.user
  add primary key (id);
```

###多数据源

####新建主从SCHEMA
```$xslt
CREATE SCHEMA demo_primary;
CREATE SCHEMA demo_second;
```

####主库新建用户表
```$xslt
create table demo_primary.t_user
(
  id   int auto_increment
  comment '自增id'
    primary key,
  name varchar(10) null
  comment '姓名',
  age  int(2)      null
  comment '年龄'
)
  charset = utf8;

```

####从库新建学生表
```$xslt
create table demo_second.t_student
(
  id   int auto_increment
    primary key,
  name varchar(16) null,
  age  int         null
)
  charset = utf8;
```

#### 1、pom.xml进入start
#### 2、application.yml添加配置
#### 3、定义MultiAccountMapper
