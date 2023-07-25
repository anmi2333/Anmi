package com.dreaMTank.jdbc;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        Driver driver = new Driver() {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        };
        //2.得到连接
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();
        properties.setProperty("user","root");//用户
        properties.setProperty("password","mt123456");//密码
        Connection connect = driver.connect(url, properties);
        //3.执行sql
        String sql = "insert into actor values(null, '刘德华', '男', '1970-11-11','110')";
        Statement statement = connect.createStatement();
        boolean rows = statement.execute(sql);
        System.out.println(rows ? "成功":"失败");
        //4.关闭资源
        statement.close();
        connect.close();

    }
}
