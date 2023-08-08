<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="com.chunjae.db.*"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ include file="/encoding.jsp"%>

<%
    String author = (String) session.getAttribute("id");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    int maxQno = 0;
    DBC con = new MariaDBCon();

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    // par 를 넣기전에 질문 게시글을 db에 저장
    try {
        conn = con.connect();
        String sql2 = "INSERT INTO qna(title, content, author) VALUES(?, ?, ?) ";
        pstmt = conn.prepareStatement(sql2);
        pstmt.setString(1, title);
        pstmt.setString(2, content);
        pstmt.setString(3, author);
        int cnt = pstmt.executeUpdate();
        if(cnt > 0) {
            System.out.println("질문 생성 완료");
        } else {
            System.out.println("질문 생성 실패");
        }
        System.out.println(maxQno); // 최대 qno 번호 확인 출력
    } catch (SQLException e) {
        System.out.println("질문 생성: sql 에러");
    } catch (Exception e) {

    } finally {
        con.close(rs, pstmt, conn); // db commit(저장)
    }

    // 질문 게시글에 저장을 한 후 qno를 뽑아서 par에 저장
    try {
        conn = con.connect();
        String sql = "select max(qno) as 'qno' from qna";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        if(rs.next()) {
            maxQno = rs.getInt("qno");
        }
        String sql2 = "update qna set par=? order by qno desc limit 1";
        pstmt = conn.prepareStatement(sql2);
        pstmt.setInt(1, maxQno);
        int cnt = pstmt.executeUpdate();
        if(cnt > 0) {
            System.out.println("update 완료");
            response.sendRedirect("qnaList.jsp");
        } else {
            System.out.println("update 실패");
            response.sendRedirect("addQuestion.jsp");
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    } finally {
        con.close(pstmt, conn); // db commit(저장)
    }

%>
