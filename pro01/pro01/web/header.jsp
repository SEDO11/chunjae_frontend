<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%
    String path2 = request.getContextPath();
    String sid = (String) session.getAttribute("id");
%>
<div class="hd_wrap">
    <nav class="tnb"> <!-- .hd_wrap:first-child  -->
        <ul class="menu">
            <% if(sid!=null) { %>
            <li><a href=<%=path2%>"/member/mypage.jsp">마이페이지</a></li>
            <li><a href=<%=path2%>"/member/signup.jsp">로그아웃</a></li>
            <li><a href=<%=path2%>"/member/map.jsp">오시는길</a></li>
                <% if(sid.equals("admin")) {%>
                <li><a href=<%=path2%>"/member/index.jsp">관리자페이지</a></li>
                <% } %>
            <% } else {%>
            <li><a href=<%=path2%>"/member/login.jsp">로그인</a></li>
            <li><a href=<%=path2%>"/member/signup.jsp">회원가입</a></li>
            <li><a href=<%=path2%>"/member/map.jsp">오시는길</a></li>
            <% } %>
        </ul>
    </nav>
</div>

<div class="hd_wrap"> <!-- .hd_wrap:first-child  -->
    <a href=<%=path2%>"/index.jsp" class="logo">
        <img src=<%=path2%>"/img/chunjae.png" alt="">
    </a>
    <nav class="gnb">
        <ul class="menu">
            <li class="item1">
                <a href=<%=path2%>"/html/company.html" class="dp1">회사소개</a>
                <ul class="sub">
                    <li><a href="./html/company.html#com">회사개요</a></li>
                    <li><a href="./html/company.html#greet">인사말</a></li>
                    <li><a href="./html/company.html#history">연혁</a></li>
                    <li><a href="./html/company.html#map1">경영이념</a></li>
                </ul>
            </li>
            <script src="./js/showpage.js"></script>
            <li class="item2">
                <a href="./html/learning.html" class="dp1">IT교육</a>
                <ul class="sub">
                    <li><a href="./html/business.html">파이썬</a></li>
                    <li><a href="./html/business.html">자바</a></li>
                    <li><a href="./html/business.html">OpenCV</a></li>
                    <li><a href="./html/business.html">안드로이드</a></li>
                </ul>
            </li>
            <li class="item3">
                <a href="" class="dp1">IT실습</a>
                <ul class="sub">
                    <li><a href="./html/service.html">해외</a></li>
                    <li><a href="./html/service.html">사교육</a></li>
                    <li><a href="./html/service.html">공교육</a></li>
                    <li><a href="./html/service.html">학회</a></li>
                </ul>
            </li>
            <li class="item4">
                <a href="" class="dp1">강사진</a>
                <ul class="sub">
                    <li><a href="./html/marketing.html">언론보도</a></li>
                    <li><a href="./html/marketing.html">광고</a></li>
                    <li><a href="./html/marketing.html">수상</a></li>
                    <li><a href="./html/marketing.html">이야기</a></li>
                </ul>
            </li>
            <li class="item5">
                <a href="" class="dp1">학습자료실</a>
                <ul class="sub">
                    <li><a href="./html/brand.html">브랜드소개</a></li>
                    <li><a href="./html/brand.html">역사</a></li>
                    <li><a href="./html/brand.html"></a></li>
                    <li><a href="./html/brand.html"></a></li>
                </ul>
            </li>
        </ul>
    </nav>
</div>