/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Thinkpad
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/ACP_project";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    // Method to get a database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
