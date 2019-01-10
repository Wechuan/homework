package com.xiyou.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

@WebServlet(urlPatterns = "/myform")
public class FormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //得到信息存储在数据库
        try {
            mySql(req);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //返回页面响应
        getRes(resp);
    }
    private void mySql(HttpServletRequest req) throws ClassNotFoundException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        String yanzheng = req.getParameter("code");
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = JdbcUtils.getConn()) {
            //create table user1(id int primary key auto_increment,username varchar(200),password varchar(100),phone varchar(50))
            String sql = "insert into user1(id,username,password,phone) values (null,?,?,?)";
            try (PreparedStatement psmt = conn.prepareStatement(sql)) {
                psmt.setString(1, username);
                psmt.setString(2, password);
                psmt.setString(3, phone);

                psmt.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getRes(HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;utf-8");
        String html="<html><body><h1>"+new Date()+"</h1></body></html>";
        String html2="<html><body><h1>提交成功</h1></body></html>";
        resp.getWriter().print(html);
        resp.getWriter().print(html2);
    }
}
