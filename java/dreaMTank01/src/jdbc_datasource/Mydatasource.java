//package jdbc_datasource;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class Mydatasource implements DataSource {
//
//    private final HikariDataSource dataSource;
//
//    public Mydatasource() {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://localhost:3306/mydb");
//        config.setUsername("username");
//        config.setPassword("password");
//
//        dataSource = new HikariDataSource(config);
//    }
//
//    @Override
//    public Connection getConnection() throws SQLException {
//        return dataSource.getConnection();
//    }
//
//    @Override
//    public Connection getConnection(String username, String password) throws SQLException {
//        return dataSource.getConnection(username, password);
//    }
//
//    // 其他 DataSource 接口方法的实现
//
//    @Override
//    public <T> T unwrap(Class<T> iface) throws SQLException {
//        return dataSource.unwrap(iface);
//    }
//
//    @Override
//    public boolean isWrapperFor(Class<?> iface) throws SQLException {
//        return dataSource.isWrapperFor(iface);
//    }
//}
//
