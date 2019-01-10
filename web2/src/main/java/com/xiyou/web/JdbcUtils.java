package com.xiyou.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
        static final String URL="jdbc:mysql://localhost:3306/test";
        static final String USERNAME="root";
        static final String PASSWORD="root";

    public  static Connection  getConn() throws SQLException {

        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}
