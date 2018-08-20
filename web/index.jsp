<%--
  Created by IntelliJ IDEA.
  User: syd
  Date: 2018/4/20
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Tomcat</title>
  </head>
  <body>
  我的第一个web网页
  <hr>
  <a href="cn.syd.test/HelloServlet">Get请求方式HelloServlet方式</a>
  <form action="cn.syd.test/HelloServlet" method="post">
    <input type="submit" value="Post请求方式HelloServlet">
  </form>
  <h1>对于屌丝来说自己开心就好</h1>
  </body>
</html>
