package CodingSchool.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection(String dbUserName, String dbPassword, String dbName) throws SQLException {
        String connString = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false";
        Connection conn = DriverManager.getConnection(connString,dbUserName,dbPassword);
        return conn;
    }
}
