<%--
  Created by IntelliJ IDEA.
  User: db400tea
  Date: 2023-07-28
  Time: 오후 3:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>설문조사 결과 (research.jsp)</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf8");
        String id = request.getParameter("id");
        int year = Integer.parseInt(request.getParameter("year") == null ? "0" : request.getParameter("year"));
        String name = request.getParameter("name");
        String[] pet = request.getParameterValues("pet");
    %>
    <div class="result">
        <p>아이디 : <%=id%></p>
        <p>출생년도 : <%=year%></p>
        <p>이름 : <%=name%></p>
        <p>좋아하는 동물 :</p>
        <%
            if(pet.length == 0) {
                return;
            }
            for(int i=0; i<pet.length; i++) {
                if(pet[i].equals("dog")) {
                    pet[i] = "강아지";
                } else if(pet[i].equals("cat")) {
                    pet[i] = "고양이";
                } else if(pet[i].equals("cow")) {
                    pet[i] = "송아지";
                } else {
                    pet[i] = "강아지";
                }
            }
        %>
        <%
            for (String p : pet) {
        %>
        <%= p%>
        <%
            }
        %>

    </div>
</body>
</html>
