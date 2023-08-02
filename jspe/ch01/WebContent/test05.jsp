<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>

</head>
<body>
	<h2>Respone 연습</h2>
	<form action="response.jsp" method="post">
		<table class="table">
			<tbody>
				<tr>
					<td><label for="id">아이디</label></td>
					<td><input type="text" id="id" name="id" placeholder="아이디" required="required" /></td>
				</tr>
				<tr>
					<td><label for="pw">비밀번호</label></td>
					<td><input type="password" id="pw" name="pw" placeholder="비밀번호" required="required" /></td>
				</tr>
				<tr>
					<td colspan="2"><input class="btn btn-primary" type="submit"
						value="로그인" /> <input class="btn btn-danger" type="reset"
						value="초기화" /></td>
				</tr>
			</tbody>
		</table>
	</form>
	<%
	String msg = request.getParameter("msg");
	String id = (String) session.getAttribute("id");
	String pw = (String) session.getAttribute("pw");
	if(msg!=null) {
		out.println(msg);
	}
	if (id != null) {
	%>
	<div>
		<%=id%>
		<%=pw%>
	</div>
	<% } 
	session.invalidate();
	%>
</body>
</html>