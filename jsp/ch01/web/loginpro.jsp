<%--
  Created by IntelliJ IDEA.
  User: db400tea
  Date: 2023-07-27
  Time: 오후 2:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP 01</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
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
    <a href="index.jsp">로그인 화면으로 가기</a>
  </div>
  </body>
</html>
