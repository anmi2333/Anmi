package jdbc;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @projectName: dreaMTank01
 * @package: jdbc
 * @className: Test
 * @NAME: WANG CHAO
 * @date: 2023/08/09 11:42
 */
@SuppressWarnings({"all"})

class Test01 {
   public void demotest(){
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      conn = JDBCUtils.getConnection();
      stmt = conn.createStatement();
      String sql ="select * from user";
      rs = stmt.executeQuery(sql);
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
    }finally {
      JDBCUtils.release(rs,stmt,conn);
    }

   }
}
