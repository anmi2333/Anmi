package com.dreaMTank.jdbc.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class JDBCUtils_Use {
    public static void main(String[] args) {

    }
    @Test
    public void testDML() {
        Connection connection = null;//1
        String sql = "update actor set name = ? where id = ?";//2
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "周星驰");
            preparedStatement.setInt(2, 4);
            preparedStatement.executeLargeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }

    }
}
