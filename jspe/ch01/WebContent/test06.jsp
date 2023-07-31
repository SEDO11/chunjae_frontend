<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 객체</title>
<%
request.setCharacterEncoding("utf8");
response.setContentType("text/html; charset=utf8");
%>
</head>
<body>
<h2>jsp의 8 객체 : out, request, response, session, application, config</h2>
<hr />
<%
// 서블릿에서 객체를 만드는 법
JspWriter pageOut = pageContext.getOut();
out.println("<h2>out : 출력 객체</h2>");
out.println("<p>브라우저에 태그를 포함하여 출력할 수 있는 객체</p>");
out.println(pageOut == out);
out.println("<hr>");

ServletRequest pageRequest = pageContext.getRequest();
out.println("<h2>request : 요청 객체</h2>");
out.println("<p>브라우저에서 요청한 정보를 저장하고 있는 객체</p>");
out.println(pageRequest == request);
out.println("<hr>");

ServletResponse pageResponse = pageContext.getResponse();
out.println("<h2>Response : 응답 객체</h2>");
out.println("<p>브라우저에서 보낼 정보를 저장하고 있는 객체</p>");
out.println(pageRequest == request);
out.println("<hr>");

HttpSession pageSession = pageContext.getSession();
out.println("<h2>session : 세션 객체</h2>");
out.println("<p>로그인 정보를 저장하고 있는 객체</p>");
out.println(pageSession == session);
out.println("<hr>");

ServletContext pageServlet = pageContext.getServletContext();
out.println("<h2>application : 애플리케이션 객체</h2>");
out.println("<p>프로그램이 시작되어 끝날 때 까지 저장하고 있는 객체</p>");
out.println(pageServlet == application);
out.println("<hr>");

ServletConfig pageConfig = pageContext.getServletConfig();
out.println("<h2>config : 응답 객체</h2>");
out.println("<p>애플리케이션의 설정 정보를 저장하고 있는 객체</p>");
out.println(pageConfig == config);
out.println("<hr>");

/*
Exception pageException = pageContext.getException();
out.println("<h2>config : 응답 객체</h2>");
out.println("<p>애플리케이션의 설정 정보를 저장하고 있는 객체</p>");
out.println(pageException == exception);
out.println("<hr>");
*/

Object pageObject = pageContext.getPage();
out.println("<h2>page : 현재 페이지 객체</h2>");
out.println("<p>현재 페이지에서만 사용할 내용을 저장하고 있는 객체</p>");
out.println(pageObject == page);
out.println("<hr>");
%>
</body>
</html>