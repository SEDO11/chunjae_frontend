package dao;

import java.sql.*;

public class MariaDBCon implements DBC{
    final String DRIVER = "org.mariadb.jdbc.Driver"; // 클래스 이름
    final String DNS = "localhost"; // DNS
    final String PORT = "3306"; // 포트 번호
    final String NAME = "edu"; // DB이름
    final String USER = "root"; // user 이름
    final String PASS = "1234"; // 비밀번호

    //        final String URL = "프로토콜:디비종류//호스트주소:포트번호/데이터베이스 이름";
    final String URL = "jdbc:mariadb://"+DNS+":"+PORT+"/"+NAME;
    Connection conn = null;

    @Override
    public Connection connect() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    @Override
    public void close(PreparedStatement stmt, Connection conn) {
        if(stmt!=null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
        if(rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(stmt!=null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
