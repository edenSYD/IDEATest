package cn.syd.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: syd
 * \* Date: 2018/8/17
 * \* Time: 15:22
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class HelloServlet extends HttpServlet {
    public HelloServlet(){

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("处理get请求。。。");
        PrintWriter out = resp.getWriter();
        out.print("hello servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("处理post请求。。。");
        PrintWriter out = resp.getWriter();
        out.print("hello servlet");
    }
}
