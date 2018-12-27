package com.westos.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    static String URL="jdbc:mysql://localhost:3306/test";
    static String USERNAME="root";
    static String PASSWORD="root";
    public static Connection getConn() throws SQLException {
        Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        return conn;
    }
}
