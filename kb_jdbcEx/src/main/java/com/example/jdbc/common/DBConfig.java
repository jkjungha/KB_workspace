package com.example.jdbc.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBConfig {
    private final String driver;
    private final String url;
    private final String username;
    private final String password;

    public DBConfig(String driver, String url, String username, String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DBConfig fromClasspath(String fileName){
        Properties properties = new Properties();
        try (InputStream inputStream = DBConfig.class.getClassLoader().getResourceAsStream(fileName)){
            if(inputStream == null){
                throw new IllegalArgumentException("설정 파일을 찾을 수 없습니다: "+fileName);
            }
            properties.load(inputStream);
            return new DBConfig(
                    readRequired(properties, "db.driver"),
                    readRequired(properties, "db.url"),
                    readRequired(properties, "db.username"),
                    readRequired(properties, "db.password")
            );
        } catch (IOException e) {
            throw new IllegalStateException(" DB 설정 파일을 읽는 중 오류가 발생했습니다.", e);
        }
    }

    private static String readRequired(Properties properties, String key) {
        String value = properties.getProperty(key);
        if(value == null || value.trim().isEmpty()){
            throw new IllegalArgumentException("필수 DB 설정값이 없습니다: "+key);
        }
        return value.trim();
    }

    public String getDriver(){
        return this.driver;
    }

    public String getUrl(){
        return this.url;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
