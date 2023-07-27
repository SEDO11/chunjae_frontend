<%--
  Created by IntelliJ IDEA.
  User: db400tea
  Date: 2023-07-27
  Time: 오후 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%-- 3. 스크립트릿 --%>
  <%-- 자바 코딩이 가능하다. --%>
  <%
    setName("홍길동");
    String addr = "가산";
  %>
  <hr>
  <%-- 4. 표현식 --%>
  <%--출력 값을 가져와 출력할 때 사용--%>
  <p>이름 : <%=getName()%> </p>
  <p>주소 : <%=addr%></p>
  <a href="test01.jsp">테스트1</a>
  </body>
</html>
