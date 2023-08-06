<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath(); // 현재 프로젝트의 위치 정보 반환
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Scope Test</title>
</head>
<body>
<div class="container">
    <header id="hd">
        <%@include file="nav.jsp"%>
    </header>
    <hr>
    <h2 class="title">Scope Test</h2>
    <hr>
    <%
        String pg = (String) pageContext.getAttribute("pageData");
        String req = (String) request.getAttribute("reqData");
        String ses = (String) session.getAttribute("sesData");
        String app = (String) application.getAttribute("appData");
        String msg = (String) request.getAttribute("msg");
    %>
    <ul class="list">
        <li>page : <%=pg%></li>
        <li>request : <%=req%></li>
        <li>ses : <%=ses%></li>
        <li>app : <%=app%></li>
        <li>msg : <%=msg%></li>
        <li>img : <img src="img/star.jpg" alt="밤하늘 사진"></li>
    </ul>
    <p>
        <a href="test6.jsp?req=<%=req%>&msg=<%=msg%>">페이지6으로 이동하기</a>
        <% if(ses!=null) { %>
        <a href="logout.jsp">로그아웃</a>
        <% } else { %>
        <a href="test4.jsp">로그인</a>
        <% } %>
    </p>
</div>
</body>
</html>
