package com.dreaMTank.jdbc.datasource;

import com.dreaMTank.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class ConQuestion {
    @Test
    public void testCon() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
//            Connection connection = JDBCUtils.getConnection();
//            JDBCUtils.close(null, null, connection);
            System.out.println("123");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
