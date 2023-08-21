package edu.chunjae.model;

import edu.chunjae.dto.Fileud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FileudDAO {
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;

    public int fileUploadTest(Fileud file){
        int cnt = 0;
        DBConnect con = new PostgreCon();
        String sql = "insert into file values (?,?,?,?)";
        try {
            conn = con.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, file.getUname());
            pstmt.setString(2, file.getSubject());
            pstmt.setString(3, file.getContent());
            pstmt.setString(4, file.getFilename());
            cnt = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            con.close(pstmt, conn);
        }
        return cnt;
    }

    public List<Fileud> getFileTestList(){
        List<Fileud> fileList = new ArrayList<>();
        DBConnect con = new PostgreCon();
        String sql = "select * from filetest";
        try {
            conn = con.connect();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()){
                Fileud file = new Fileud();
                file.setUname(rs.getString("uname"));
                file.setSubject(rs.getString("subject"));
                file.setContent(rs.getString("content"));
                file.setFilename(rs.getString("filename"));
                fileList.add(file);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            con.close(rs, pstmt, conn);
        }
        return fileList;
    }
}
