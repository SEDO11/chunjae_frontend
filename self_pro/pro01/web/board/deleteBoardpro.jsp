<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="com.chunjae.db.*"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");
    response.setCharacterEncoding("UTF-8");

    int bno = Integer.parseInt(request.getParameter("bno"));

    DBC con = new MariaDBCon();

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        conn = con.connect();
        String sql = "delete from board where bno=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, bno);
        int cnt = pstmt.executeUpdate();
        if(cnt > 0) {
            System.out.println("게시글 삭제 완료");
            response.sendRedirect("boardList.jsp");
        } else {
            System.out.println("게시글 삭제 실패");
            response.sendRedirect("getBoard.jsp");
        }
    } catch (SQLException e) {
        System.out.println("게시판 내용 수정: sql 에러");
    } finally {
        con.close(pstmt, conn);
    }

%>
