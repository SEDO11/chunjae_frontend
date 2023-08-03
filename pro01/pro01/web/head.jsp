<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%-- 나중에 jsp가 헷갈릴 수 있으므로 path를 여러개 사용하는 경우 이름을 다르게 지정해준다.
    path를 지정할 때 이름을 같게 하지 않게해라 같게하면 오류 생길 수도 있음
--%>
<%
    String path1 = request.getContextPath();
%>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-compatible" content="IE=edge"> <!-- 익스프로어 일 경우 엣지를 사용하라고 안내-->
<meta http-equiv="author" content="홍길동"> <!-- 문서의 제작사 -->
<meta http-equiv="publisher" content="천재교육 콘텐츠 제작팀"> <!-- 문서의 저자 정의 -->
<meta http-equiv="copyright" content="copyright@chunjae.co.kr"> <!-- 저작권 명시 -->
<title>천재교육</title>

<!-- 검색엔진 최적화(SEO) -->
<meta name="subject" content="천재교육, 천재IT교육센터"> <!-- 페이지 주제 지정 http-equiv 로 지정해도 상관 무 -->
<meta name="keywords" content="천재교육, 천재 IT, 교육 교재, 교과서, 스마트 교육"> <!-- 검색 단어 지정 -->
<!-- 검색 결과에 표시되는 문자 지정-->
<meta name="description" content="천재교육은 교과서 제작, 교육 교재 제작, 초등, 중등, 고등 교육에 대한 교재와 교육을 실시하는 회사입니다.">
<meta name="robots" content="index, follow">

<!-- 오픈 그래프 -->
<!-- 페이지를 공유할 때 미리보기로 보여주는 코드 -->
<meta property="og:type" content="website">
<meta property="og:title" content="천재교육">
<meta property="og:description" content="앞선 생각으로 더 큰 미래의 교육을 준비하는 기업">
<meta property="og:image" content=<%=path1%>"/img/img1.jpg">
<meta property="og:url" content=<%=path1%>"/img/img1.jpg">

<!-- 파비콘 -->
<link rel="shortcut icon" href=<%=path1%>"/img/logo.ico">
<!-- 애플 계열 모바일 -->
<!-- <link rel="apple-touch-icon-precomposed" href="../img/logo_64.png"> -->
<!-- IE 계열 브라우저 -->
<meta name="msapplication-TileColor" content="#FFFFFF">
<meta name="msapplication-TileImage" content="./img/logo_48.png">
<!-- 파이어폭스, 오페라, 또는 구형 크롬/사파리 -->
<link rel="icon" href=<%=path1%>"/img/logo_16.png" sizes="16x16">
<link rel="icon" href=<%=path1%>"/img/logo_32.png" sizes="32x32">
<link rel="icon" href=<%=path1%>"/img/logo_48.png" sizes="48x48">
<link rel="icon" href=<%=path1%>"/img/logo_64.png" sizes="64x64">