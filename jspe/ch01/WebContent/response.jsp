<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf8");
	response.setContentType("text/html; charset=utf8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String msg = "로그인실패";

	String[] idArr = {"admin", "kim", "hong"};
	String[] pwArr = {"1234", "5678", "4321"};
	
	out.println(id);
	out.println(pw);
	
	for(int i=0; i<idArr.length; i++) {
		if (id.equals(idArr[i]) && pw.equals(pwArr[i])) {
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			msg = "로그인성공";
			break;
		}
	}
	
	response.addHeader("Site", "https://chunjae.co.kr");
	response.setHeader("Url2", "https://github.com/sedoll");
	
	%>
	<a href="test05.jsp?msg=<%=msg %>"><%=msg%> - 로그인정보가기</a>
	<%
	// response.sendRedirect("/test05.jsp?msg="+msg);
	%>
	<br><hr><br>
	<ul>
		<li><span>콘텐츠 유형</span> : <%=response.getContentType()%></li>
		<li><span>문자 인코딩</span> : <%=response.getCharacterEncoding()%></li>
		<li><span>헤더의 Site</span> : <%=response.getHeader("Site")%></li>
		<li><span>헤더의 Url2</span> : <%=response.getHeader("Url2")%></li>
		<li><span>추가된 헤더의 존재 유무 확인</span> : <%=response.containsHeader("Site")%></li>
		<li><span>추가된 헤더의 존재 유무 확인</span> : <%=response.containsHeader("Url2")%></li>
		<li><span>저장된 상태 코드</span> : <%=response.getStatus()%></li>
		<li><span>리퀘스트 id</span> : <%=request.getParameter("id")%></li>
		<li><span>리퀘스트 pw</span> : <%=request.getParameter("pw")%></li>
		<li><span>세션 id</span> : <%=session.getAttribute("id")%></li>
		<li><span>세션 pw</span> : <%=session.getAttribute("pw")%></li>
	</ul>
</body>
</html>