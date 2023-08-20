<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%
    String path2 = request.getContextPath();
%>
<div class="hd_wrap">
    <nav class="tnb"> <!-- .hd_wrap:first-child  -->
        <ul class="menu">
            <% if(sid!=null) { %>
            <li><a href=<%=path2%>"/member/mypage.jsp">마이페이지</a></li>
            <li><a href=<%=path2%>"/member/logout.jsp">로그아웃</a></li>
                <% if(sid.equals("admin")) {%>
                <li><a href=<%=path2%>"/admin/boardList.jsp">관리자페이지</a></li>
                <% } %>
            <li><%=sname%></li>
            <% } else {%>
            <li><a href=<%=path2%>"/member/login.jsp">로그인</a></li>
            <li><a href=<%=path2%>"/member/term.jsp">회원가입</a></li>
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
                <a href=<%=path2%>"" class="dp1">소개</a>
                <ul class="sub">
                    <li><a class="move" href="/menu/company.jsp#com">회사소개</a></li>
                </ul>
            </li>
            <li class="item2">
                <a href="" class="dp1">IT교육</a>
                <ul class="sub">
                    <li><a class="move" href="/learning_py/boardList.jsp">파이썬</a></li>
                    <li><a class="move" href="/learning_java/boardList.jsp">자바</a></li>
                </ul>
            </li>
            <li class="item3">
                <a href="" class="dp1">자료실</a>
                <ul class="sub">
                    <li><a class="move" href="/file/boardList.jsp">자격증</a></li>
                </ul>
            </li>
            <li class="item4">
                <a href="" class="dp1">게시판</a>
                <ul class="sub">
                    <li><a class="move" href="/board/boardList.jsp">자유 게시판</a></li>
                    <li><a class="move" href="/board_stu/boardStuList.jsp">학생 게시판</a></li>
                </ul>
            </li>
            <li class="item5">
                <a href="" class="dp1">QnA</a>
                <ul class="sub">
                    <li><a class="move" href="/qna_problem/qnaList.jsp">문제 QnA</a></li>
                </ul>
            </li>
        </ul>
    </nav>
    <script src="/js/load.js"></script>
</div>