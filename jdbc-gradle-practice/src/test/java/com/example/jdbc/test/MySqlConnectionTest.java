package com.example.jdbc.test;

import com.example.jdbc.common.DBUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * 실제 MySQL bookmarketdb 연결 및 테이블 존재 여부를 검증합니다.
 *
 * 주의:
 * - MySQL 서버가 실행 중이어야 합니다.
 * - src/main/resources/sql/01_schema_mysql.sql을 먼저 실행해야 합니다.
 * - DB 계정은 src/main/resources/db.properties 값을 사용합니다.
 *
 * DB가 실행 중이 아니면 테스트는 실패가 아니라 SKIPPED 처리됩니다.
 */
class MySqlConnectionTest {

    @Test
    @DisplayName("db.properties 정보로 MySQL에 연결할 수 있다")
    void connectToMysql() throws Exception {
        assumeTrue(canConnect(), "MySQL 접속 불가: MySQL 실행 여부, bookmarketdb 생성 여부, 계정 권한을 확인하세요.");

        try (Connection con = DBUtil.defaultConfig().getConnection()) {
            assertFalse(con.isClosed());
            assertTrue(con.getCatalog().equalsIgnoreCase("bookmarketdb"));
        }
    }

    @Test
    @DisplayName("person, users, boards 테이블이 존재한다")
    void requiredTablesExist() throws Exception {
        assumeTrue(canConnect(), "MySQL 접속 불가로 실제 DB 테이블 검증을 건너뜁니다.");

        try (Connection con = DBUtil.defaultConfig().getConnection()) {
            assertTrue(tableExists(con, "person"));
            assertTrue(tableExists(con, "users"));
            assertTrue(tableExists(con, "boards"));
        }
    }

    private boolean canConnect() {
        try (Connection ignored = DBUtil.defaultConfig().getConnection()) {
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean tableExists(Connection con, String tableName) throws Exception {
        DatabaseMetaData metaData = con.getMetaData();
        try (ResultSet rs = metaData.getTables(con.getCatalog(), null, tableName, new String[]{"TABLE"})) {
            return rs.next();
        }
    }
}
