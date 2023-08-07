<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="com.chunjae.db.*"%>
<%@ page import="javax.sql.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");
    response.setCharacterEncoding("UTF-8");

    String author = request.getParameter("author");
    String title = request.getParameter("title");
    String content = request.getParameter("content");

    DBC con = new MariaDBCon();

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        conn = con.connect();
        String sql = "insert into board(author, title, content) values (?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, author);
        pstmt.setString(2, title);
        pstmt.setString(3, content);
        int cnt = pstmt.executeUpdate();
        if(cnt > 0) {
            System.out.println("게시판 생성 완료");
            response.sendRedirect("boardList.jsp");
        } else {
            System.out.println("게시판 생성 실패");
            response.sendRedirect("addBoard.jsp");
        }
    } catch (SQLException e) {
        System.out.println("게시판 생성: sql 에러");
    } finally {
        con.close(pstmt, conn);
    }

%>
