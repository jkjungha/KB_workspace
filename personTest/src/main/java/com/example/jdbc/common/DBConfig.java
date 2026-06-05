package com.example.jdbc.common;

import java.io.InputStream;
import java.util.Properties;

//db.properties 파일을 읽어 DB 접속 정보를 관리
public class DBConfig {
    private static final Properties properties = new Properties();

    static {
        try(InputStream inputStream = DBConfig.class.getClassLoader().getResourceAsStream("db.properties")){
            if (inputStream == null){
                throw new IllegalStateException("db.properties 파일을 찾을 수 없습니다.");
            }
        }catch (Exception e){
            throw new RuntimeException("DB 설정 파일 로딩 실패", e);
        }
    }

    public static String get(String key){
        String value = properties.getProperty(key);

        if(value == null || value.isBlank()){
            throw new IllegalArgumentException("필수 DB 설정값이 없습니다: "+key);
        }

        return value.trim();
    }
}
