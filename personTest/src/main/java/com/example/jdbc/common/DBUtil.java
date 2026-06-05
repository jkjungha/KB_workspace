package com.example.jdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Driver를 로딩
//DB Connection 객체를 생성
//Service -> TransactionManager -> DAO 순서로 Connection 전달
public class DBUtil {
    static {
        try {
            Class.forName(DBConfig.get("db.driver"));
        }catch (Exception e){
            throw new RuntimeException("JDBC 드라이버 로딩 실패", e);
        }
    }

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
                DBConfig.get("db.url"),
                DBConfig.get("db.username"),
                DBConfig.get("db.password")
        );
    }
}
