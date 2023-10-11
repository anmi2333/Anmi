package com.dreaMTank.jdbc.myjdbc;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class TestJDBC {
    public static void main(String[] args) {
        JdbcInterface jdbcInterface = new MysqlUdbclmpl();
        jdbcInterface.getConnection();
        jdbcInterface.crud();
        jdbcInterface.close();
        System.out.println(jdbcInterface);
    }
}
