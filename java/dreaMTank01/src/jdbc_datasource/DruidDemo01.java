package jdbc_datasource;

import jdbc.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.*;

/**
 * @projectName: dreaMTank01
 * @package: jdbc_datasource
 * @className: DruidDemo01
 * @NAME: WANG CHAO
 * @date: 2023/08/09 17:37
 */
/*
@SuppressWarnings({"all"})
public class DruidDemo01 {
    @Test
    public void demo05() throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;//结果集

        try {
            //1.使用连接池
            DruidDataSource dataSource = new DruidDataSource();
            //1.5 手动设置数据库连接参数
            dataSource.setDriverClassName("com.mysql.j dbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/text");
            dataSource.setUsername("root");
            dataSource.setPassword("mt123456");
            //2.获得连接
//            conn = JDBCUtils.getConnection();
            conn = dataSource.getConnection();
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

 */
