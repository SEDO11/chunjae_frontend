<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("utf8");
%>
</head>
<body>
	<div class="msg">
		<h2>pageContext</h2>
		<hr />
		<%
		String str = request.getParameter("str");
		if(str.equals("include")){
			pageContext.include("target.jsp"); // target.jsp를 내장시켜라
		} else if(str.equals("forward")) {
			pageContext.forward("target.jsp");
		} else if(str.equals("etc")) {
			// pageContext.forward("target.jsp");
		} else {
			out.println("<h2>자료 없음</h2>");
		}
		%>
	</div>
</body>
</html>