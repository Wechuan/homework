package com.xiyou.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(urlPatterns = "/date")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;utf-8");
        String html="<html><body><h1>"+new Date()+"</h1></body></html>";
        resp.getWriter().print(html);

    }
}
