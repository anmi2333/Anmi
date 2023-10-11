package jdbc;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class JDBCDemo02 {//增加
    @Test
    public void demo02() throws Exception{
        Connection conn = null;
        Statement stmt = null;
        //1.加载驱动
        Class.forName("com.mysql.j dbc.Driver");
        //2.获得连接
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","mt123456");
        //3.基本操作
        //4.获得执行SQL语句对象
        stmt = conn.createStatement();
        //5.编写SQL语句
        String sql = "insert into user values (null,'eee','123',21)";
        //6.执行SQL
        ResultSet resultSet = stmt.executeQuery(sql);
        //7.保存结果集
        int num = stmt.executeUpdate(sql);
        if (num > 0) {
            System.out.println("保存用户成功");
        }
        //8.释放资源

    }
}
