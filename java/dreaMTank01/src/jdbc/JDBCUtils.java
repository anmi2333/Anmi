package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @projectName: dreaMTank01
 * @package: jdbc
 * @className: JDBCUtils
 * @NAME: WANG CHAO
 * @date: 2023/08/09 11:19
 */
@SuppressWarnings({"all"})
public class JDBCUtils {
    private  static  final String driverClassName;
    private  static  final String url;
    private  static  final String username;
    private  static  final String password;

    static {
        //获取属性文件内容
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/db.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        properties.getProperty("driverClassName");
        properties.getProperty("url");
        properties.getProperty("username");
        properties.getProperty("password");

        driverClassName=properties.getProperty("driverClassName");
        url=properties.getProperty("url");
        username=properties.getProperty("username");
        password=properties.getProperty("password");
    }

    /**
     * 注册驱动方法
     */
    public static void loadDriver(){
        try {
            Class.forName(driverClassName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得链接方法
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            loadDriver();
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


    /**
     * 释放资源方法
     */
    public static void release(Statement stmt, Connection conn){
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
    public static void release(ResultSet rs, Statement stmt, Connection conn) {
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
