package test;

import dao.DBC;
import dao.MariaDBCon;
import dto.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 여러개의 정보 조회
// selectMember()
public class DaoTest1 {
    static Connection conn = null;
    static PreparedStatement stmt = null;
    static ResultSet rs = null;

    public static void main(String[] args) {
        DBC dbc = new MariaDBCon();
        conn = dbc.connect();

        String sql = "select * from member";

        if(conn!=null) {
            System.out.println("DB 연결 성공");
        }
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            List<Member> memlist = new ArrayList<>(); // Member 클래스 값을 저장할 List 선언
            while(rs.next()) {
                Member mem = new Member(); // Member 클래스의 값을 저장하기 위해 선언
                mem.setId(rs.getString("id"));
                mem.setPw(rs.getString("pw"));
                mem.setName(rs.getString("name"));
                mem.setRegdate(rs.getString("regdate"));
                mem.setPoint(rs.getInt("point"));
                memlist.add(mem);
            }
            for(Member m : memlist) {
                System.out.println(m.toString());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbc.close(rs, stmt, conn);
        }
    }
}
