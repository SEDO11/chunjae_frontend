<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더 정보 출력하기</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf8");
	String msg = request.getParameter("msg");
%>
	<div class="container">
    	<h2 class="title">요청 정보 및 헤더 정보 출력</h2>
    	<hr>
    	<ul>
	    	<li><span>메세지</span> : <%=msg%></li>
	    	<li><span>프로토콜</span> : <%=request.getProtocol()%></li>
	    	<li><span>요청된 서버 이름</span> : <%=request.getServerName()%></li>
	    	<li><span>요청방식</span> : <%=request.getMethod()%></li>
	    	<li><span>파라미터 열</span> : <%=request.getQueryString()%></li>
	    	<li><span>요청주소</span> : <%=request.getRequestURL()%></li>
	    	<li><span>요청 URI</span> : <%=request.getRequestURI()%></li>
	    	<li><span>서버 이름</span> : <%=request.getRemoteHost()%></li>
	    	<li><span>서버 주소</span> : <%=request.getRemoteAddr()%></li>
	    	<li><span>서버 포트(원격)</span> : <%=request.getRemotePort()%></li>
	    	<li><span>서버 포트(지역)</span> : <%=request.getServerPort()%></li>
	    	<li><span>현재 문서의 경로</span> : <%=request.getContextPath()%></li> <!-- 제일 중요 -->
	    	<li><span>헤더의 어셉트</span> : <%=request.getHeader("Accept")%></li>
	    	<li><span>헤더의 호스트(host) 주소</span> : <%=request.getHeader("Host")%></li>
    	</ul>
    	<hr><br><hr>
    	<table class="table" id="tb1">
    	<caption><h2>헤더 정보</h2></caption>
    		<tbody>
    			<%
    			Enumeration e = request.getHeaderNames();
    			while(e.hasMoreElements()){ // e 내부의 항목이 없어질 때 까지 반복
    				String hdName = (String) e.nextElement();
    			%>
    			<tr>
    				<td><%=hdName %></td>
    				<td><%=request.getHeader(hdName) %></td>
    			</tr>
    			<% 
    			}
    			%>
    		</tbody>
    	</table>
    </div>
</body>
</html>