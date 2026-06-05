package jdbc.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    //1.jdbc 드라이버 로딩
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/kbbookstore?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    private static final String USER = "kbbookadmin";
    private static final String PASSWORD = "1234";

    static {
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError("MySQL 드라이버 로딩 실패");
        }
    }

    private DBUtil(){

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void close(AutoCloseable closable){
        if(closable != null){
            try{
               closable.close();
            }catch (Exception e){
                System.out.println("자원 해제 중 오류가 발생하였습니다."+e.getMessage());
            }
        }
    }
}

