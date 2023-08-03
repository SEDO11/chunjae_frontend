<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>이동</title>
</head>
<body>
<%
    //Scope Test
    pageContext.setAttribute("pageData", "페이지컨텍스트1");
    request.setAttribute("reqData", "요청한 데이터");
    session.setAttribute("sesData", "세션 데이터");
    application.setAttribute("appData", "애플리케이션데이터");
    request.setAttribute("msg", "안녕하세요~");
    RequestDispatcher rd = request.getRequestDispatcher("test5.jsp");
    rd.forward(request, response);
%>
</body>
</html>