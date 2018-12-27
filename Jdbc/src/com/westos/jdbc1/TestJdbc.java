package com.westos.jdbc1;

import java.sql.*;

public class TestJdbc {
    public static void main(String[] args) throws SQLException {

        getSelect("张三","123");//用户，密码
        return;
    }
    private static void getSelect(String name, String psd) throws SQLException {
        //1.创建连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        //2.准备sql语句
        String sql ="select * from user where username=? and password=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,name);
        statement.setString(2,psd);
        //3.执行sql语句并返回一个集合
        ResultSet resultSet = statement.executeQuery();
        //4.如果有下一条数据返回true，没有返回false
        while (resultSet.next()){
            //resultSet本身值在在第一条记录的前面.
            System.out.println(resultSet.getString("username")+resultSet.getString("password"));
        }
        statement.close();
        conn.close();
    }
}
