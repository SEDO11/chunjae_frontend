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

    int bno = Integer.parseInt(request.getParameter("bno"));
    String title = request.getParameter("title");
    String content = request.getParameter("content");

    DBC con = new MariaDBCon();

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        conn = con.connect();
        String sql = "update board set title=?, content=? where bno=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, title);
        pstmt.setString(2, content);
        pstmt.setInt(3, bno);
        int cnt = pstmt.executeUpdate();
        if(cnt > 0) {
            System.out.println("내용 업데이트 완료");
            response.sendRedirect("boardList.jsp");
        } else {
            System.out.println("내용 업데이트 실패");
            response.sendRedirect("updateBoard.jsp");
        }
    } catch (SQLException e) {
        System.out.println("게시판 내용 수정: sql 에러");
    } finally {
        con.close(pstmt, conn);
    }

%>
