package mysql;

public class 基本操作01 {
   /*

    create table dept (
            did int primary key auto_increment,
            daname varchar(20)
    );
    insert into dept values (null,'市场部');
    insert into dept values (null,'人事部');
    insert into dept values (null,'教研部');

    create table dept ( 添加表
            eid int primary key auto_increment,
            ename varchar(20),
            salary double,
            birthday date,
            sex varchar(10),
            dno int
    );
    insert into employee values (null,'张三',8000,'1988-09-01','男',3); 添加
    insert into employee values (null,'张三',8000,'1988-09-01','男',3);
    insert into employee values (null,'张三',8000,'1988-09-01','男',3);
    insert into employee values (null,'张三',8000,'1988-09-01','男',3);

    select * form dept 选择部门
    delete form dept where did = 2; 删除表的列
    drop database text; 删除库
    alter table employee add foreign key (dno) references dept(did); 添加外健
    */
}
