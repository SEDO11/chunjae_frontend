<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="ch03.Member" %>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EL & JSTL</title>
</head>
<body>
<%
    String name = "홍길동";
    int age = 24;
    int num1=78, num2=95, num3=100;

    Member m1 = new Member();
    m1.setNo(1);
    m1.setId("hong");
    m1.setName("홍길동");
    m1.setPw("1234");
    m1.setPoint(100);

    Member m2 = new Member();
    m2.setNo(2);
    m2.setId("lee");
    m2.setName("이슬비");
    m2.setPw("43210");
    m2.setPoint(90);

    List<Member> lst = new ArrayList<>();
    lst.add(m1);
    lst.add(m2);

    request.setAttribute("name", name);
    request.setAttribute("age", age);
    request.setAttribute("num1", num1);
    request.setAttribute("num2", num2);
    request.setAttribute("num3", num3);
    request.setAttribute("m1", m1);
    request.setAttribute("m2", m2);
    request.setAttribute("lst", lst);
%>

<div class="container">
    <section class="page">
        <h2 class="title">표현식과 표현언어</h2>
        <hr>
        <div class="item_wrap">
            <h2>표현식, 스크립트릿 호라용</h2>
            <p>이름 : <%=name%></p>
            <p>나이 : <%=age%></p>
            <p>점수 : <%=num1 + num2 + num3%></p>
            <br>
            <hr>

            <h3>m1출력</h3>
            <p>번호 : <%=m1.getNo()%></p>
            <p>이름 : <%=m1.getName()%></p>
            <p>아이디 : <%=m1.getId()%></p>
            <p>비밀번호 : <%=m1.getPw()%></p>
            <p>포인트 : <%=m1.getPoint()%></p>
            <br>
            <hr>

            <h3>m2출력</h3>
            <p>번호 : <%=m2.getNo()%></p>
            <p>이름 : <%=m2.getName()%></p>
            <p>아이디 : <%=m2.getId()%></p>
            <p>비밀번호 : <%=m2.getPw()%></p>
            <p>포인트 : <%=m2.getPoint()%></p>
            <br>
            <hr>

            <h3>list 출력</h3>
            <%
                for(int i=0; i<lst.size(); i++) {
            %>
            <p>번호 : <%=lst.get(i).getNo()%></p>
            <p>이름 : <%=lst.get(i).getName()%></p>
            <p>아이디 : <%=lst.get(i).getId()%></p>
            <p>비밀번호 : <%=lst.get(i).getPw()%></p>
            <p>포인트 : <%=lst.get(i).getPoint()%></p>
            <br>
            <%
                }
            %>
            <hr>
        </div>
        <div class="item_wrap">
            <h2>표현언어와 스크립트릿</h2>
            <p>${name}</p>
            <p>${age}</p>
            <p>${num1+num2+num3}</p>
            <br>
            <hr>

            <h3>m1 출력</h3>
            <p>번호 : ${m1.no}</p>
            <p>이름 : ${m1.name}</p>
            <p>아이디 : ${m1.id}</p>
            <p>비밀번호 : ${m1.pw}</p>
            <p>포인트 : ${m1.point}</p>
            <br>
            <hr>

            <h3>m2출력</h3>
            <p>번호 : ${m2.no}</p>
            <p>이름 : ${m2.name}</p>
            <p>아이디 : ${m2.id}</p>
            <p>비밀번호 : ${m2.pw}</p>
            <p>포인트 : ${m2.point}</p>
            <br>
            <hr>

            <h3>list 출력</h3>
            <%
                for(Member m : lst) {
                    pageContext.setAttribute("m", m);
            %>
            <p>번호 : ${m.no}</p>
            <p>이름 : ${m.name}</p>
            <p>아이디 : ${m.id}</p>
            <p>비밀번호 : ${m.pw}</p>
            <p>포인트 : ${m.point}</p>
            <br>
            <%
                }
            %>
            <hr>
        </div>
        <div class="item_wrap">
            <h2>표현어와 태그 라이브러리</h2>
            <c:forEach var="m" items="${lst}" varStatus="varStatus">
                <p>번호 : ${status.count}</p>
                <p>번호 : ${m.no}</p>
                <p>이름 : ${m.name}</p>
                <p>아이디 : ${m.id}</p>
                <p>비밀번호 : ${m.pw}</p>
                <p>포인트 : ${m.point}</p>
                <br>
            </c:forEach>
            <c:set var="tot" value="${num1+num2+num3}"/>
            <h3>총점 : ${tot}</h3>
        </div>
    </section>
</div>
</body>
</html>
