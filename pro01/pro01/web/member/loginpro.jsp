<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.chunjae.db.*" %>
<%@ page import="com.chunjae.util.AES256" %>
<%@ page import="java.security.NoSuchAlgorithmException" %>
<%@ include file="/encoding.jsp"%>
<%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    try {
        pw = AES256.sha256(pw);
    } catch (NoSuchAlgorithmException e) {
        System.out.println("pw 암호화 실패");
        throw new RuntimeException(e);
    }
    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    DBC con = new MariaDBCon();
    conn = con.connect();
    if(conn != null){
        System.out.println("DB 연결 성공");
    }

    try {
        String sql = "select * from member where id=? and pw=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pw);
        rs = pstmt.executeQuery();
        if(rs.next()){
            session.setAttribute("id", id);
            session.setAttribute("name", rs.getString("name"));
            response.sendRedirect("/");
        } else {
            out.println("<script>alert('아이디 혹은 비밀번호가 없거나 일치하지 않습니다.')</script>");
            out.println("<script>location.href='/member/login.jsp'</script>");

//            response.sendRedirect("/member/login.jsp");
        }
    } catch(SQLException e) {
        System.out.println("SQL 구문이 처리되지 못했습니다.");
    } finally {
        con.close(rs, pstmt, conn);
    }
%>