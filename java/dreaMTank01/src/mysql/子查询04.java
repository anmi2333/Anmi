package mysql;

public class 子查询04 {
    /*
    select * form cno WHERE birthday > '1991-01-01';
    select * form classes WHERE cid IN(select * form cno WHERE birthday z> '1991-01-01');
    select * form classes WHERE EXISTS(select * form cno WHERE birthday z> '1991-01-01');
    select * form classes WHERE cid > ANY(select * form student);
    select * form classes WHERE (select * form cno WHERE birthday z> '1991-01-01');
    */
}
