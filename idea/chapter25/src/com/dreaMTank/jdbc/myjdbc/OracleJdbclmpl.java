package com.dreaMTank.jdbc.myjdbc;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
@SuppressWarnings("all")
public class OracleJdbclmpl implements JdbcInterface{

    @Override
    public Object getConnection() {
        System.out.println("得到 Oracle的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("得到 Oracle的连接");
    }

    @Override
    public void close() {
        System.out.println("得到 Oracle的连接");
    }
}
