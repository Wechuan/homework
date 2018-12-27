package com.westos.jdbc1;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDate {
    static final String URL= "jdbc:mysql://localhost:3306/test" +
            "?rewriteBatchedStatements=true&useCursorFetch=true&defaultFetchSize=50&useSSL=false";
    static final String USERNAME = "root";
    static final String PASSWORD = "root";

    static final DruidDataSource dataSource = new DruidDataSource();
    static {
        dataSource.setUrl(URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver"); 可选步骤，注册驱动
        dataSource.setInitialSize(5); // 初始连接数
        dataSource.setMaxActive(10); // 最大连接数
        dataSource.setMinIdle(5);    // 最小连接数
        dataSource.setValidationQuery("select 1"); // 一条简单的sql语句，用来保活
        dataSource.setTestWhileIdle(true); // 当空闲时时不时检查一下连接的有效性, 利用ValidationQuery中的sql语句
        dataSource.setTimeBetweenEvictionRunsMillis(60*1000); // 默认一分钟
    }
    // 获取数据库连接, 直连
    public static Connection getConnection2() throws SQLException {
        return dataSource.getConnection();
}
}
