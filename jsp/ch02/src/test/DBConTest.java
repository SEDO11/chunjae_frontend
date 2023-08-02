package test;

import java.sql.*;

public class DBConTest {
    public static void main(String[] args) {
        final String DRIVER = "org.mariadb.jdbc.Driver"; // 클래스 이름
        final String DNS = "localhost"; // DNS
        final String PORT = "3306"; // 포트 번호
        final String NAME = "edu"; // DB이름
        final String USER = "root"; // user 이름
        final String PASS = "1234"; // 비밀번호

//        final String URL = "프로토콜:디비종류//호스트주소:포트번호/데이터베이스 이름";
        final String URL = "jdbc:mariadb://"+DNS+":"+PORT+"/"+NAME;

        Connection conn = null; // 커넥션(연결) 설정, 자동차 시동걸기
        PreparedStatement stmt = null; // 스위치, 엑셀 밟기
        ResultSet rs = null; // 결과를 받을 곳
        
        // db 드라이버 호출, 자동차 운전수
        try {
            Class.forName(DRIVER); // 드라이버 로딩
            conn = DriverManager.getConnection(URL, USER, PASS); // db 연결
            if(conn != null) {
                System.out.println("db 연결 성공");
            }

            String sql = "select * from member where id = ?";
            String id = "admin";

            stmt = conn.prepareStatement(sql); // sql 구문 대입
            stmt.setString(1, id);

            // SQL실행 결과 set 저장
            rs = stmt.executeQuery(); // select는 query를 전달
//            int cnt = stmt.executeUpdate(); select를 제외한 다른것들은 Update를 통해 변화값의 개수 즉, 정수 값을 리턴한다.
            while(rs.next()) { // point는 int 형으로 받아옴 나머지는 String 타입
                System.out.printf("이름 : %s \n비밀번호 : %s \n이름 : %s \n날짜 : %s \n포인트 : %d", rs.getString("id"),
                        rs.getString("pw"), rs.getString("name"), rs.getString("regdate"),
                        rs.getInt("point"));
            }
        } catch (ClassNotFoundException e) { // DRIVER 문제
            System.out.println("드라이버가 로딩되지 못했습니다.");
            throw new RuntimeException(e);
        } catch (SQLException e) { // URL, USER, PASS 중에 하나가 문제
            System.out.println("db 접속 실패");
            throw new RuntimeException(e);
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("rs 종료중 오류 발생");
                    throw new RuntimeException(e);
                }
            }
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.out.println("stmt 종료중 오류 발생");
                    throw new RuntimeException(e);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("conn 종료중 오류 발생");
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
