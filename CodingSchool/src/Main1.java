package CodingSchool.src;

import CodingSchool.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main1 {
    private static String dbUserName = "root";
    private static String dbPassword = "coderslab";
    private static String dbName = "codingschool";

    public static void main(String[] args) {
        try (Connection conn = ConnectionFactory.getConnection(dbUserName, dbPassword, dbName)) {
            User user0 = new User("Przemo","przemo@o2.pl","kupa");
            user0.saveToDB(conn);
//            User user1 = User.loadUserById(conn, 1);
//            System.out.println(user1);

            ArrayList<User> users = User.loadAllUsers(conn);
            for (User u : users) {
                System.out.println(u);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }


}
