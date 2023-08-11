<%@ page import="java.util.Enumeration" %>
<%@ page import="java.net.InetAddress" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>헤더 정보 출력</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf8");
//    String msg = request.getParameter("msg");
%>
<div class="container">
    <h2 class="title">요청 정보 및 헤더 정보 출력</h2>
    <div class="info">
    <%
        Enumeration e = request.getHeaderNames();
        while(e.hasMoreElements()) {
            String name = (String) e.nextElement();
            String value = request.getHeader(name);
            out.println("<p>name: "+name+", value="+value+"</p>");
        }
    %>
        <h2>Server or Client IPAddress/HostName</h2>
    <%
        out.println("<p>접속 PC 주소 : " + request.getLocalAddr()+"</p>");
        InetAddress ipaddr = InetAddress.getLocalHost();
        out.println("<p>서버 주소1 : "+request.getRemoteAddr()+"</p>");
        out.println("<p>서버 주소2 (실제 주소) : "+ipaddr+"</p>");
        out.println("<p>서버 홈디렉토리 : "+request.getContextPath()+"</p>");
    %>
    </div>

</div>
</body>
</html>
