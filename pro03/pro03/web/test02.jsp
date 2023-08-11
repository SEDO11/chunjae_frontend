<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>전역 변수 테스트</title>
</head>
<%--
    web.xml에 있는 userId 전역 변수를 사용
--%>
<%
    String userId = application.getInitParameter("userId");
    String memberId = application.getInitParameter("memberId");
//    application.setInitParameter("id", "hong");
    application.setAttribute("sid", "hong");
    String sid = (String) application.getAttribute("sid");
%>
<body>
<h1>테스트 02</h1>
<h2>사용자 아이디 : <%=userId%></h2>
<h2>관리자 : <%=memberId%></h2>
<h2>유저 : <%=sid%></h2>
</body>
</html>
