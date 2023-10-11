package jdbc;

import org.junit.jupiter.api.Test;

import java.sql.*;

@SuppressWarnings("all")
public class JDBCDemo05 {
    @Test
    public void demo05() throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;//结果集

        try {
            //1.加载驱动
            Class.forName("com.mysql.j dbc.Driver");
            //2.获得连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "mt123456");
            //3.基本操作
            //4.获得执行SQL语句对象
            stmt = conn.createStatement();
            //5.编写SQL语句
            String sql = "select * from user";
            //String sql = "select * from user where id =4";单条消息查询
            //6.执行SQL
            rs = stmt.executeQuery(sql);

            //7.遍历结果集
            //一条记录
            if (rs.next()) {
                System.out.println(rs.getInt("id")
                        +" "+rs.getString("username")
                        +" "+rs.getString("password")
                        +" "+rs.getString("nickname")
                        +" "+rs.getInt("age"));
            }
            //全部记录
            while (rs.next()) {
                System.out.print(rs.getInt("id"));
                System.out.print(rs.getString("username"));
                System.out.print(rs.getString("password"));
                System.out.print(rs.getString("nickname"));
                System.out.print(rs.getInt("age"));
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //8.释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                rs = null;
            }

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
