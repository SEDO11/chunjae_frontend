<%--
  Created by IntelliJ IDEA.
  User: db400tea
  Date: 2023-07-27
  Time: 오후 2:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
  <head>
    <title>JSP 01</title>
  </head>
  <body>
  <!-- 얘네는 tab으로 해야 emmet이 먹힘 -->
  <div class="container">
    <h2 class="title">로그인</h2>
    <%
      request.setCharacterEncoding("utf8");
      String id = request.getParameter("id");
      String pw = request.getParameter("pw");
    %>
    <hr>
    <p>아이디 : <%=id%></p>
    <p>비밀번호 : <%=pw%></p>
    <a href="index.html">로그인 화면으로 가기</a>
  </div>
  </body>
</html>
