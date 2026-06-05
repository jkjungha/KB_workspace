package com.example.jdbc.test;

import com.example.jdbc.common.DBConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * db.properties 파일의 DB 접속 정보가 올바르게 로딩되는지 검증합니다.
 *
 * 이 테스트는 실제 DB에 접속하지 않고 설정값만 확인합니다.
 */
class DbPropertiesTest {

    @Test
    @DisplayName("db.properties에서 MySQL 접속 정보를 읽어온다")
    void loadDbProperties() {
        DBConfig config = DBConfig.fromClasspath("db.properties");

        assertEquals("com.mysql.cj.jdbc.Driver", config.driver());
        assertTrue(config.url().startsWith("jdbc:mysql://localhost:3306/bookmarketdb"));
        assertEquals("bookadmin", config.username());
        assertEquals("bookadmin", config.password());
    }
}
