package connectionTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
Java Database Connectivity 5단계
1. JDBC 드라이버 로딩
2. Connection 객체 생성
3. Query문 작성 -> Statement 객체, PrepareStatement 객체
4. 결과처리 ->  ResetSet 객체
5. Connection 객체 종료
* */
public class ConnectionExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            //1. 드라이버 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver 연결 로딩 완료!");
            //2. Connection 객체 생성
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ex?serverTimezone=Asia/Seoul&characterEncoding=UTF-8", "scoula", "1234");
            System.out.println("Connection 생성 완료!");
        } catch (ClassNotFoundException e) {
            e.getException();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
