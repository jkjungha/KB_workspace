//package connectionTest;
//
//import java.sql.*;
//
///*
//Java Database Connectivity 5단계
//1. JDBC 드라이버 로딩
//2. Connection 객체 생성
//3. Query문 작성 -> Statement 객체, PrepareStatement 객체
//4. 결과처리 ->  ResetSet 객체
//5. Connection 객체 종료
//* */
//public class BoardInsertExample {
//    public static void main(String[] args) {
//        Connection conn = null;
//
//        try {
//            //1. 드라이버 로딩
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver 연결 로딩 완료!");
//            //2. Connection 객체 생성
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ex?serverTimezone=Asia/Seoul&characterEncoding=UTF-8", "scoula", "1234");
//            System.out.println("Connection 생성 완료!");
//
//            String sql = "INSERT INTO boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata) VALUES(?, ?, ?, NOW(), ?, ?)";
//            try(
//                 PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
//                pstmt.setString(1, "햇살이 좋은 오후");
//                pstmt.setString(2, "소풍을 가면 좋을거 같아요");
//                pstmt.setString(3, "sunny");
//                pstmt.setString(4, "snow.jpg");
//                pstmt.setBytes(5, "new FileInputStream("/src/snow.jpg")");
//
//                int result = pstmt.executeUpdate();
//                if (result != 1) return -1;
//
//                try (ResultSet rs = pstmt.getGeneratedKeys()) {
//                    if (rs.next()) {
//                        return rs.getInt(1);
//                    }
//                    return -1;
//                }
//            }
//        } catch (ClassNotFoundException e) {
//            e.getException();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if(conn != null){
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
//}
