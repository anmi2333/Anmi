package jdbc;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class JDBCDemo01 {//资源释放
    @Test
    public void demo01() throws Exception{
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text","root","mt123456");
        //3.基本操作
        //4.获得执行SQL语句对象
        Statement statement = conn.createStatement();
        //5.编写SQL语句
        String sql = "select * from user";
        //6.执行SQL
        ResultSet resultSet = statement.executeQuery(sql);
        //7.遍历结果集
        while (resultSet.next()) {
            System.out.print(resultSet.getInt("id"));
            System.out.print(resultSet.getString("username"));
            System.out.print(resultSet.getString("password"));
            System.out.print(resultSet.getString("nickname"));
            System.out.print(resultSet.getInt("age"));
            System.out.println();
        }
        //8.释放资源
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            resultSet = null;
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement = null;
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn = null;
        }



    }
}
