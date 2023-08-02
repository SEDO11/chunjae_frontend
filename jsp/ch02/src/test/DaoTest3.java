package test;

import dao.DBC;
import dao.MariaDBCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// 정보 입력
// insertMember()
public class DaoTest3 {
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
        System.out.print("만들 아이디를 입력하세요 : ");
        String id = sc.nextLine();
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            rs = stmt.executeQuery();
            if(rs.next()) { // 해당 아이디의 데이터가 있는지 확인
                System.out.println("이미 존재하는 회원 입니다.");
            } else { // 입력된 아이디가 없는 경우
                String sql2 = "insert into member(id, pw, name, tel, email) values(?, ?, ?, ?, ?)";
                System.out.print("비밀번호를 입력하세요 : ");
                String pw = sc.nextLine();
                System.out.print("이름을 입력하세요 : ");
                String name = sc.nextLine();
                System.out.print("전화번호를 입력하세요 : ");
                String tel = sc.nextLine();
                System.out.print("이메일을 입력하세요 : ");
                String email = sc.nextLine();

                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, id);
                stmt.setString(2, pw);
                stmt.setString(3, name);
                stmt.setString(4, tel);
                stmt.setString(5, email);
                
                int cnt = stmt.executeUpdate(); // 데이터가 성공적으로 들어갔는지 확인
                if(cnt > 0) {
                    System.out.println("회원 가입에 성공 했습니다.");
                } else {
                    System.out.println("회원 가입에 실패 했습니다.");
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbc.close(rs, stmt, conn); // executeUpdate()는 close를 해야 commit이 된다.
        }
    }
}
