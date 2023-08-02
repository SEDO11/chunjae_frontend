package test;

import dao.DBC;
import dao.MariaDBCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// 정보 삭제
// deleteMember()
public class DaoTest5 {
    static Connection conn = null;
    static PreparedStatement stmt = null;

    public static void main(String[] args) {
        DBC dbc = new MariaDBCon();
        conn = dbc.connect();
        if(conn!=null) {
            System.out.println("DB 연결 성공");
        }

        String sql = "delete from member where id = ?";
        // 아이디 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String id = sc.nextLine();
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            int cnt = stmt.executeUpdate();
            if(cnt > 0) { // 해당 아이디의 데이터가 삭제 됐는지 확인
                System.out.println("회원 탈퇴가 완료되었습니다.");
            } else { // 입력된 아이디가 없는 경우
                System.out.println("회원 탈퇴에 실패했습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            dbc.close(stmt, conn); // executeUpdate()는 close를 해야 commit이 된다.
        }
    }
}
