<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>include 테스트</title>
</head>
<%--
    web.xml에 있는 userId 전역 변수를 사용
--%>
<%
    pageContext.setAttribute("name", "홍길동");
    pageContext.setAttribute("age", "24");
%>
<body>
    <h2 class="title">include directive</h2>
    <div class="container">
        <%@ include file="/includeFile.jsp"%>
    </div>
    <br>

    <h2 class="title">include action tag</h2>
     액션 태그는 데이터 바인딩이 되지 않는다.
    <div class="container">
        <jsp:include page="/includeFile.jsp"></jsp:include>
    </div>
    <br>
</body>
</html>
