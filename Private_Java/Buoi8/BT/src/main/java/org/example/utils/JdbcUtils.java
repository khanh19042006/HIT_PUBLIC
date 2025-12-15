package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    private static final String URL = "jdbc:mysql://localhost:3306/demo_db";
    private static final String USER = "admin";
    private static String PASS = "admin123";

    public static Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(URL,USER,PASS);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn){
        try {
            if (conn != null) conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
