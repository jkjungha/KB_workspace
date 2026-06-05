package com.example.jdbc.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private final DBConfig config;

    public DBUtil(DBConfig config){
        this.config = config;
        loadDriver(config.getDriver());
    }

    public static DBUtil defaultConfig(){
        return new DBUtil(DBConfig.fromClasspath("db.properties"));
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    }

    private void loadDriver(String driverName) {
        try {
            Class.forName(driverName);
        }catch (ClassNotFoundException e){
            throw new IllegalStateException("JDBC 드라이버 로딩 실패: "+driverName, e);
        }
    }
}
