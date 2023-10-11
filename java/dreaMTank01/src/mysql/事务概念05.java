package mysql;

public class 事务概念05 {
    /*
    create table account ( 添加表
              id int primary key auto increment,
              name varchar(20),
              money double
    );
    insert into account values (null,'张三',10000);
    insert into account values (null,'张四',10000);

    update account set money = money - 1000 where name = '张三';
    update account set money = money + 1000 where name = '张三';

    start transaction 开启事务
    commit 提交事务
    Rollback 回滚事务
     */
}
