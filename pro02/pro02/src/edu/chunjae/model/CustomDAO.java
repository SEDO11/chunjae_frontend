package edu.chunjae.model;

import edu.chunjae.dto.Custom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomDAO {
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;

    public List<Custom> getCustomList() {
        List<Custom> cusList = new ArrayList<>();
        DBConnect con = new PostgreCon();
        conn = con.connect();
        try {
            pstmt = conn.prepareStatement(DBConnect.CUSTOM_SELECT_ALL);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                Custom custom = new Custom();
                custom.setId(rs.getString("id"));
                custom.setPw(rs.getString("pw"));
                custom.setName(rs.getString("name"));
                custom.setPoint(rs.getInt("point"));
                custom.setGrade(rs.getString("grade"));
                custom.setTel(rs.getString("tel"));
                custom.setEmail(rs.getString("email"));
                custom.setBirth(rs.getString("birth"));
                custom.setRegdate(rs.getString("regdate"));
                cusList.add(custom);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cusList;
    }

    public Custom getCustom(String id) {
        Custom custom = new Custom();
        DBConnect con = new PostgreCon();
        conn = con.connect();
        try {
            pstmt = conn.prepareStatement(DBConnect.CUSTOM_SELECT_ONE);
            pstmt.setString(1,id);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                custom.setId(rs.getString("id"));
                custom.setPw(rs.getString("pw"));
                custom.setName(rs.getString("name"));
                custom.setPoint(rs.getInt("point"));
                custom.setGrade(rs.getString("grade"));
                custom.setTel(rs.getString("tel"));
                custom.setEmail(rs.getString("email"));
                custom.setBirth(rs.getString("birth"));
                custom.setRegdate(rs.getString("regdate"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return custom;
    }

    public boolean login(String id, String pw) {
        boolean pass = false;
        DBConnect con = new PostgreCon();
        conn = con.connect();
        try {
            pstmt = conn.prepareStatement(DBConnect.CUSTOM_SELECT_LOG);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                pass = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pass;
    }
}
