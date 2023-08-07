<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.chunjae.db.*" %>
<%@ page import="com.chunjae.dto.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="javax.swing.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 상세보기</title>
    <%@ include file="../head.jsp" %>

    <!-- 스타일 초기화 : reset.css 또는 normalize.css -->
    <link href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css" rel="stylesheet">

    <!-- 플러그인 연결-->
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
    <!-- 스타일 초기화 -->
    <link rel="stylesheet" href="../css/reset.css">
    <!-- 웹 폰트 -->
    <link rel="stylesheet" href="../css/font.css">

    <!-- css 모듈화 -->
    <link rel="stylesheet" href="../css/common.css">
    <link rel="stylesheet" href="../css/hd.css">
    <link rel="stylesheet" href="../css/ft.css">
    <style>
        /* 본문 영역 스타일 */
        .contents { clear:both; min-height: 100vh; background-image: url("../img/login.jpg");
            background-repeat: no-repeat; background-position: center -250px; }
        .contents::after { content:""; clear:both; display:block; width:100%; }

        .page { clear:both; width: 100vw; height: 100vh; position:relative; }
        .page::after { content:""; display:block; width: 100%; clear:both; }

        .page_wrap { clear:both; width: 1200px; height: auto; margin:0 auto; }
        .page_tit { font-size:48px; text-align: center; padding-top:0.7em; color:#fff;
            padding-bottom: 1.3em; }

        .breadcrumb { clear:both;
            width:1200px; margin: 0 auto; text-align: right; color:#fff;
            padding-top: 28px; padding-bottom: 28px; }
        .breadcrumb a { color:#fff; }
        .frm { clear:both; width:1200px; margin:0 auto; padding-top: 80px; }

        .tb1 { width:600px; margin:0 auto; font-size: 24px;}
        .tb1 th {line-height: 32px; padding-top:16px; padding-bottom:16px;
            border-bottom: 1px solid #333; border-top: 1px solid #333; box-sizing: border-box; text-align: center;}
        .tb1 td {line-height: 32px; padding-top:16px; padding-bottom:16px;
            border-bottom: 1px solid #333; border-top: 1px solid #333; box-sizing: border-box; text-align: center;}

        .tb1 .item2 {height: 500px;}

        .inbtn { display:block;  border-radius:100px;
            min-width:140px; padding-left: 24px; padding-right: 24px; text-align: center;
            line-height: 48px; background-color: #333; color:#fff; font-size: 18px; }
        .item5 {width: 600px;}
        .inbtn:first-child { float: left; }
        .inbtn:last-child { float: right; }
    </style>
</head>

<%
    request.setCharacterEncoding("utf8");
    response.setCharacterEncoding("utf8");

    Board bd = new Board();
    int bno = Integer.parseInt(request.getParameter("bno"));

    DBC con = new MariaDBCon();
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try{
        // 조회수 갱신 코드
        conn = con.connect();
        String sql = "update board set cnt=cnt+1 where bno=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, bno);
        int cnt = pstmt.executeUpdate();
        if(cnt > 0) {
            System.out.println("조회수 갱신 완료");
        } else {
            System.out.println("조회수 갱신 실패");
        }

        String sql2 = "select * from board where bno=?";
        pstmt = conn.prepareStatement(sql2);
        pstmt.setInt(1, bno);
        rs = pstmt.executeQuery();
        if(rs.next()) {
            bd.setTitle(rs.getString("title"));
            bd.setAuthor(rs.getString("author"));
            bd.setContent(rs.getString("content"));
            bd.setResdate(rs.getString("resdate"));
            bd.setCnt(rs.getInt("cnt"));
        }
    } catch (SQLException e) {
        System.out.println("sql 연결 실패");
        e.printStackTrace();
    } catch (Exception e) {

    } finally {
        con.close(rs, pstmt, conn);
    }

%>
<body>
<div class="wrap">
    <header class="hd" id="hd">
        <%@ include file="../header.jsp" %>
    </header>
    <div class="contents" id="contents">
        <div class="breadcrumb">
            <p><a href="">HOME</a> &gt; <a href="">게시글 목록</a> &gt; <span>게시글 상세</span></p>
        </div>
        <section class="page" id="page1">
            <div class="page_wrap">
                <h2 class="page_tit">게시글 상세</h2>
                <table class="tb1">
                    <thead>
                    <tr >
                        <th class="item1">제목</th>
                        <th class="item3">작성자</th>
                        <th class="item4">조회수</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td class="item1" ><%=bd.getTitle()%></td>
                        <td class="item3"><%=bd.getAuthor()%></td>
                        <td class="item4"><%=bd.getCnt()%></td>
                    </tr>
                    <tr>
                        <td class="item2" colspan="3" ><%=bd.getContent()%></td>
                    </tr>
                    <tr>
                        <td class="item5" colspan="3">
                            <% if (sid != null && (sid.equals("admin") || sid.equals(bd.getAuthor()))) { %>
                            <a href="/board/updateBoard.jsp?bno=<%=bno%>" class="inbtn"> 글 수정</a>
                            <a href="/board/deleteBoardpro.jsp?bno=<%=bno%>" class="inbtn"> 글 삭제</a>
                            <% } else {%>
                            <p>관리자 혹은 글작성자만 수정이 가능합니다.</p>
                            <% } %>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </section>
    </div>
    <footer class="ft" id="ft">
        <%@ include file="../footer.jsp" %>
    </footer>
</div>
</body>
</html>