<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인 (loginpro.jsp)</title>
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

      // 데이터가 null 경우를 대비해 값을 비교한 후 null 이면 0을 대입
      int qty = Integer.parseInt(request.getParameter("qty") == null || request.getParameter("qty").equals("") ? String.valueOf(0) : request.getParameter("qty")); // qty의 데이터를 int 형으로 가져옴
      int price = Integer.parseInt(request.getParameter("price") == null || request.getParameter("price").equals("") ? String.valueOf(0) : request.getParameter("price"));
    %>
    <hr>
    <p>아이디 : <%=id%></p>
    <p>비밀번호 : <%=pw%></p>
    <p>금액 : <%=price*qty%></p>
    <a href="test02.jsp">로그인 화면으로 가기</a>
  </div>
  </body>
</html>
