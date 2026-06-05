package com.example.jdbc.test;

import com.example.jdbc.common.DBUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * 실제 MySQL DB를 대상으로 PreparedStatement INSERT/SELECT 흐름을 검증합니다.
 *
 * 학생 실습 연결 포인트:
 * - UserTodo.insertUser()
 * - BoardTodo.insertBoard()
 * - BoardTodo.findBoardById()
 */
class MySqlUserBoardJdbcTest {

    @Test
    @DisplayName("users 테이블에 회원을 저장하고 조회할 수 있다")
    void insertAndSelectUser() throws Exception {
        assumeTrue(canConnect(), "MySQL 접속 불가로 실제 DB 테스트를 건너뜁니다.");

        String userId = "test_" + UUID.randomUUID().toString().substring(0, 8);
        String insertSql = "INSERT INTO users(userid, username, userpassword, userage, useremail) VALUES (?, ?, ?, ?, ?)";
        String selectSql = "SELECT userid, username, userage, useremail FROM users WHERE userid = ?";
        String deleteSql = "DELETE FROM users WHERE userid = ?";

        try (Connection con = DBUtil.defaultConfig().getConnection()) {
            try (PreparedStatement pstmt = con.prepareStatement(insertSql)) {
                pstmt.setString(1, userId);
                pstmt.setString(2, "테스트학생");
                pstmt.setString(3, "1234");
                pstmt.setInt(4, 20);
                pstmt.setString(5, userId + "@example.com");
                assertEquals(1, pstmt.executeUpdate());
            }

            try (PreparedStatement pstmt = con.prepareStatement(selectSql)) {
                pstmt.setString(1, userId);
                try (ResultSet rs = pstmt.executeQuery()) {
                    assertTrue(rs.next());
                    assertEquals("테스트학생", rs.getString("username"));
                    assertEquals(20, rs.getInt("userage"));
                }
            } finally {
                try (PreparedStatement pstmt = con.prepareStatement(deleteSql)) {
                    pstmt.setString(1, userId);
                    pstmt.executeUpdate();
                }
            }
        }
    }

    @Test
    @DisplayName("boards 테이블에 게시글을 저장하고 자동 생성된 bno로 조회할 수 있다")
    void insertAndSelectBoard() throws Exception {
        assumeTrue(canConnect(), "MySQL 접속 불가로 실제 DB 테스트를 건너뜁니다.");

        String insertSql = "INSERT INTO boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata) VALUES (?, ?, ?, NOW(), ?, ?)";
        String selectSql = "SELECT bno, btitle, bcontent, bwriter, bfilename FROM boards WHERE bno = ?";
        String deleteSql = "DELETE FROM boards WHERE bno = ?";
        int bno = -1;

        try (Connection con = DBUtil.defaultConfig().getConnection()) {
            try (PreparedStatement pstmt = con.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, "JUnit 게시글");
                pstmt.setString(2, "PreparedStatement 테스트 내용");
                pstmt.setString(3, "teacher");
                pstmt.setString(4, "sample.txt");
                pstmt.setBytes(5, "file-data".getBytes(StandardCharsets.UTF_8));
                assertEquals(1, pstmt.executeUpdate());

                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    assertTrue(rs.next());
                    bno = rs.getInt(1);
                }
            }

            try (PreparedStatement pstmt = con.prepareStatement(selectSql)) {
                pstmt.setInt(1, bno);
                try (ResultSet rs = pstmt.executeQuery()) {
                    assertTrue(rs.next());
                    assertEquals("JUnit 게시글", rs.getString("btitle"));
                    assertEquals("teacher", rs.getString("bwriter"));
                    assertEquals("sample.txt", rs.getString("bfilename"));
                }
            } finally {
                if (bno > 0) {
                    try (PreparedStatement pstmt = con.prepareStatement(deleteSql)) {
                        pstmt.setInt(1, bno);
                        pstmt.executeUpdate();
                    }
                }
            }
        }
    }

    private boolean canConnect() {
        try (Connection ignored = DBUtil.defaultConfig().getConnection()) {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
