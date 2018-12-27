package com.westos.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJdbc2 {
    public static void main(String[] args) {
        try(Connection conn = JdbcUtils.getConn()) {
            String sql="insert into user(id,name) values (null,?)";
            try(PreparedStatement psmt = conn.prepareStatement(sql)){
                long start = System.currentTimeMillis();
                for (int i = 1; i < 10000; i++) {
                    psmt.setString(1,"zhang"+i);
                    psmt.addBatch();
                    if (i %10000 == 0){
                        psmt.executeBatch();
                    }
                }
                long end = System.currentTimeMillis();
                System.out.println("总共花费了"+(end - start)+"毫秒");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
/*1.整体加入一个batch中 33040
 2. 每100次将batch进行执行 31528
 3.每一次执行一次   34024

*/