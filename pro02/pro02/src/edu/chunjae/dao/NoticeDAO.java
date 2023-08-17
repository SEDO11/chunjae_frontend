package edu.chunjae.dao;

import edu.chunjae.dto.Notice;
import edu.chunjae.model.DBConnect;
import edu.chunjae.model.PostgreCon;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NoticeDAO {
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;
    
    // 여러개의 값 가져오기
    public List<Notice> getNoticeList() {
        List<Notice> notiList = new ArrayList<>();
        DBConnect con = new PostgreCon();
        try{
            conn = con.connect();
            pstmt = conn.prepareStatement(DBConnect.NOTICE_SELECT_ALL);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                Notice noti = new Notice();
                noti.setNo(rs.getInt("no"));
                noti.setContent(rs.getString("content"));
                noti.setTitle(rs.getString("title"));
                noti.setResdate(rs.getString("resdate"));
                noti.setAuthor(rs.getString("author"));
                noti.setVisited(rs.getInt("cnt"));
                notiList.add(noti);
            }
        } catch (SQLException e) {
            System.out.println("에러 발생");
        } finally {
            con.close(rs, pstmt, conn);
        }
        return notiList;
    }
    
    // 하나의 값 가져오기
    public Notice getNotice(int no) {
        Notice noti = new Notice();
        DBConnect con = new PostgreCon();
        try{
            conn = con.connect();
            pstmt = conn.prepareStatement(DBConnect.NOTICE_SELECT_ONE);
            pstmt.setInt(1, no);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                noti.setNo(rs.getInt("no"));
                noti.setContent(rs.getString("content"));
                noti.setTitle(rs.getString("title"));
                noti.setResdate(rs.getString("resdate"));
                noti.setAuthor(rs.getString("author"));
                noti.setVisited(rs.getInt("cnt"));
            }
        } catch (SQLException e) {
            System.out.println("에러 발생");
        } finally {
            con.close(rs, pstmt, conn);
        }
        return noti;
    }

    // 추가
    public int addNotice(Notice noti) {

        return 0;
    }
    
    // 수정
    public int updateNotice(Notice noti) {
        return 0;
    }
    
    // 삭제
    public int deleteNotice(int no) {

        return 0;
    }

}
