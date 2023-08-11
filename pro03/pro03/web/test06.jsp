<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EL(표현 언어)</title>
</head>
<%
    // 표현식을 사용할때에는 데이터 변수로 저장하고, 매개변수로 전달하고 사용
    String title = "슬비씨 배고프구나~";
    String[] nayeon = {"까다로움", "나이많음", "꾸준함", "웃김"};
    Map<String, String> kyo = new HashMap<>();
    kyo.put("name", "말짱황");
    kyo.put("age","72");
    kyo.put("nick","교주");

    //EL 사용시에는 데이터를 넘기는 곳에서 setAttribute를 지정하고 사용
    request.setAttribute("tit", title);
    request.setAttribute("ny", nayeon);
    request.setAttribute("k", kyo);
%>
<body>
<h2>표현식</h2>
<p><%=title%></p>
<div class="cate">
    <% for(String s: nayeon) { %>
    <p><%=s%></p>
    <% } %>
</div>
<p><%=kyo%></p>
<br>

<h2>표현 언어</h2>
<p>${tit}</p>
<c:forEach var="s" items="${ny}" >
<p>${s}</p>
</c:forEach>
<p>${k}</p>
</body>
</html>
