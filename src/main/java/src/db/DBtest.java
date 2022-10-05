package src.db;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBtest {

    public static void main(String[] args) {

        Connection con;

        try {

            String url = "jdbc:mysql://localhost:3306/mysql";
            String username = "root";
            String password = "XXXXXXX";

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, username, password);

            if(con != null) {
                System.out.println("Successfully connected to the MySQL database test");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
