package com.dreaMTank.jdbc.myjdbc;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public interface JdbcInterface {
    public Object getConnection();
    public void crud();
    public void close();
}
