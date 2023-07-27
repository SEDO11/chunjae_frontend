<%-- 디렉티브(Directive) --%>
<%-- 가져올 자원등을 설정 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>

<%-- 2. 선언문(Declare) --%>
<%-- 익명의 클래스나 인터페이스를 만들 때 사용한다. | 익명이기에 jsp 내부에서만 사용 가능 --%>
<%!
  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
%>

<!DOCTYPE html>
<html>
<head>
    <title>기본 구성 요소</title>
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
<a href="index.jsp">메인으로</a>
</body>
</html>
