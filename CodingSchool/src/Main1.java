package CodingSchool.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main1 {
    public static void main(String[] args) {

    }

    public static Connection getConnection(String dbUserName, String dbPassword, String dbName) throws SQLException {
        String connString = "jdbc:mysql//localhost:3306/" + dbName + "?useSSL=false";
        Connection conn = DriverManager.getConnection(connString,dbUserName,dbPassword);
        return conn;
    }
}
