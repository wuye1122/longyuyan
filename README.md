# start to run
1.update maven plugin

```shell 
mvn jetty:run 

```
# struts.xml
<result name="main">/success.jsp</result>
<result name="add1">/add.jsp</result>
<result name="update1">/update.jsp</result>
http://localhost:8014/index.jsp
http://localhost:8014/add.jsp
http://localhost:8014/update.jsp



# bug list
点击添加找不到映射的地方:
1. struts.xml的位置不对 直接移动到一起 都放在 resources下面；
2. 数据源切换成datasource1 support mysql8.0

# add sql

```mysql

create table single
(
    id      int auto_increment,
    name    varchar(64)    not null,
    email   varchar(128)    not null,
    address varchar(256) null,
    constraint single_pk
        primary key (id)
);


```