package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "123123";
    public static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Load the MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create the connection
                connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                System.out.println("Connected to the database.");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                System.out.println("Failed to connect to the database.");
            }
        }
        return connection;
    }
//    public static void main(String[] args) {
//        // Test the database connection
//        Connection connection = getConnection();
//        if (connection != null) {
//            // Connection successful
//            // Perform additional operations or queries here
//        } else {
//            // Connection failed
//            // Handle connection failure here
//        }
//    }

}
