package jdbc;

import org.junit.jupiter.api.Test;

import java.sql.*;

@SuppressWarnings("all")
public class JDBCDemo04 {//删除
    @Test
    public void demo04() throws Exception {
        Connection conn = null;
        Statement stmt = null;

        try {
            //1.加载驱动
            Class.forName("com.mysql.j dbc.Driver");
            //2.获得连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "mt123456");
            //3.基本操作
            //4.获得执行SQL语句对象
            //5.编写SQL语句
            String sql = "delete from user where id = 5";
            //6.执行SQL
            ResultSet resultSet = stmt.executeQuery(sql);
            stmt = conn.createStatement();
            //7.保存结果集
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                System.out.println("删除用户成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //8.释放资源
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
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
}
