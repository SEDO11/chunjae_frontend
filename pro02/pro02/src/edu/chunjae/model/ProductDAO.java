package edu.chunjae.model;

import edu.chunjae.dto.Custom;
import edu.chunjae.dto.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;

    public List<Product> getProductList() {
        List<Product> proList = new ArrayList<>();
        DBConnect con = new MariaDBCon();
        conn = con.connect();
        try {
            pstmt = conn.prepareStatement(DBConnect.PRODUCT_SELECT_ALL);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                Product pro = new Product();
                pro.setNo(rs.getInt("no"));
                pro.setPname(rs.getString("pname"));
                pro.setImgSrc1(rs.getString("imgsrc1"));
                pro.setResdate(rs.getString("resdate"));
                proList.add(pro);
            }
        } catch (SQLException e) {
            System.out.println("sql 에러");
        } finally {
            con.close(rs, pstmt, conn);
        }
        return proList;
    }

    public Product getProduct(int no) {
        Product pro = new Product();
        DBConnect con = new MariaDBCon();
        conn = con.connect();
        try {
            pstmt = conn.prepareStatement(DBConnect.PRODUCT_SELECT_ONE);
            pstmt.setInt(1,no);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                pro.setNo(rs.getInt("no"));
                pro.setCate(rs.getString("cate"));
                pro.setCateno(rs.getString("cateno"));
                pro.setPname(rs.getString("pname"));
                pro.setPcomment(rs.getString("pcomment"));
                pro.setPlist(rs.getString("plist"));
                pro.setPqty(rs.getInt("pqty"));
                pro.setPrice(rs.getInt("price"));
                pro.setImgSrc1(rs.getString("imgsrc1"));
                pro.setImgSrc2(rs.getString("imgsrc2"));
                pro.setImgSrc3(rs.getString("imgsrc3"));
                pro.setResdate(rs.getString("resdate"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            con.close(rs, pstmt, conn);
        }
        return pro;
    }

    public boolean login(String id, String pw) {
        boolean pass = false;
        DBConnect con = new MariaDBCon();
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
        } finally {
            con.close(rs, pstmt, conn);
        }
        return pass;
    }

    public boolean join(String id, String pw, String name, String tel, String email, String birth, String address) {
        boolean pass = false;
        DBConnect con = new MariaDBCon();
        conn = con.connect();
        try {
            pstmt = conn.prepareStatement(DBConnect.CUSTOM_INSERT);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            pstmt.setString(3, name);
            pstmt.setString(4, tel);
            pstmt.setString(5, email);
            pstmt.setString(6, birth);
            pstmt.setString(7, address);
            int cnt = pstmt.executeUpdate();
            if(cnt > 0) {
                pass = true;
            }
        } catch (SQLException e) {
            System.out.println("sql 에러");
        } finally {
            con.close(pstmt, conn);
        }
        return pass;
    }

    public boolean idCheck(String id) {
        Custom custom = new Custom();
        DBConnect con = new MariaDBCon();
        boolean pass = false;
        conn = con.connect();
        try {
            pstmt = conn.prepareStatement(DBConnect.CUSTOM_SELECT_ONE);
            pstmt.setString(1,id);
            rs = pstmt.executeQuery();
            if(!rs.next()) {
                pass = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            con.close(rs, pstmt, conn);
        }
        return pass;
    }

    public int deleteCustom(String id){
        int cnt = 0;
        DBConnect con = new MariaDBCon();
        conn = con.connect();
        if(conn!=null){
            System.out.println("SQL 연결 성공");
        }

        String sql = "delete from custom where id=?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            cnt = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            con.close(pstmt, conn);
        }
        return cnt;
    }
}
