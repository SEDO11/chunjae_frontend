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
import java.util.Scanner;

// 하나의 정보 조회
// selectMemeber()
public class DaoTest2 {
    static Connection conn = null;
    static PreparedStatement stmt = null;
    static ResultSet rs = null;

    public static void main(String[] args) {
        DBC dbc = new MariaDBCon();
        conn = dbc.connect();
        if(conn!=null) {
            System.out.println("DB 연결 성공");
        }

        String sql = "select * from member where id = ?";
        // 아이디 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 아이디를 입력하세요 : ");
        String id = sc.nextLine();
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            rs = stmt.executeQuery();
            Member mem = null;
            if(rs.next()) { // 해당 아이디의 데이터가 있는지 확인
                mem = new Member(); // Member 클래스의 값을 저장하기 위해 선언
                mem.setId(rs.getString("id"));
                mem.setPw(rs.getString("pw"));
                mem.setName(rs.getString("name"));
                mem.setRegdate(rs.getString("regdate"));
                mem.setPoint(rs.getInt("point"));

                System.out.println(mem.toString()); // 데이터 출력
            } else { // 입력된 아이디가 없는 경우
                System.out.println("존재하지 않는 아이디");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbc.close(rs, stmt, conn);
        }
    }
}
