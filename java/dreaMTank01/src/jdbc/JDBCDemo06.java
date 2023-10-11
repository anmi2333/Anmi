package jdbc;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @projectName: dreaMTank01
 * @package: jdbc
 * @className: Test
 * @NAME: WANG CHAO
 * @date: 2023/08/09 11:42
 */
@SuppressWarnings({"all"})

class JDBCDEmo06 {
    public void demotest01(){//批处理
        Connection conn = null;
        Statement stmt = null;
        try {
            //获得链接
            conn = JDBCUtils.getConnection();
            //创建批处理对象
            stmt = conn.createStatement();
            //编写一批SQL语句
            String sql1 ="select * from user";
            String sql2 ="use user";
            String sql3 ="create table user(id int primary key auto_increment,name varchar(20))";
            String sql4 ="insert into user values (null,'aaa')";
            String sql5 ="update user set name = 'mmm' where id =2";
            String sql6 ="delete from user where id =1";

            //添加批处理
            stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            stmt.addBatch(sql3);
            stmt.addBatch(sql4);
            stmt.addBatch(sql5);
            stmt.addBatch(sql6);
            //执行批处理
            stmt.executeBatch();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(stmt,conn);
        }
    }

    public void demotest02(){//批处理
        //记录开始时间
        long start = System.currentTimeMillis();
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //获得链接
            conn = JDBCUtils.getConnection();
            //编写一批SQL语句
            String sql ="insert into user values (null,'aaa')";
            //编译sql
            pstmt = conn.prepareStatement(sql);
            for (int i = 1; i < 1000; i++) {
                //创建批处理对象
                pstmt.setString(1,"name"+i);
                //添加批处理
                pstmt.addBatch(sql);
                //注意问题 内存
                if (i % 100 == 0) {
                    //执行批处理
                    pstmt.executeBatch();
                    //清空批处理
                    pstmt.clearBatch();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(pstmt,conn);
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start) / 1000);
    }
}

