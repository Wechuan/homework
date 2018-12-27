package com.westos.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJdbc3 {
    public static void main(String[] args) {
        try(Connection conn = JdbcUtils.getConn()) {
            String sql ="delete from user whrer id =?";
            try{
                //默认是自动提交，设置事务手动提交
                conn.setAutoCommit(false);
                PreparedStatement psmt =  conn.prepareStatement(sql);
                psmt.setInt(1,3);
                //begin
                psmt.executeUpdate();
                int i=1/0; //出现异常
                psmt.setInt(1,4);
                psmt.executeUpdate();
                conn.commit(); //手动提交事务
            }catch (SQLException e){
                conn.rollback();//回滚事务
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//        +----+--------+
//        | id | name   |
//        +----+--------+
//        |  1 | zhang1 |
//        |  2 | zhang2 |
//        |  3 | zhang3 |
//        |  4 | zhang4 |
//        |  5 | zhang5 |
//        +----+--------+