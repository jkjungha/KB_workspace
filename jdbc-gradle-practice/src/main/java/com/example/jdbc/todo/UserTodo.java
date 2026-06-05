package com.example.jdbc.todo;

import com.example.jdbc.common.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 학생 실습 TODO - users 테이블 JDBC 실습
 *
 * 실습 목표
 * 1. PreparedStatement로 회원을 등록할 수 있다.
 * 2. ResultSet으로 회원을 단건 조회할 수 있다.
 * 3. 반복문으로 회원 목록을 조회할 수 있다.
 *
 * 실습 전 확인
 * - src/main/resources/sql/01_schema_mysql.sql 실행
 * - src/main/resources/sql/02_sample_data.sql 실행
 * - src/main/resources/db.properties 접속 정보 확인
 */
public class UserTodo {

    private final DBUtil dbUtil;

    public UserTodo(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    /**
     * TODO 1. users 테이블에 회원 1명을 저장하세요.
     *
     * 사용 SQL
     * INSERT INTO users(userid, username, userpassword, userage, useremail)
     * VALUES (?, ?, ?, ?, ?)
     *
     * 작성 순서
     * 1. SQL 문자열 작성
     * 2. Connection 생성
     * 3. PreparedStatement 생성
     * 4. ? 위치에 값 바인딩
     * 5. executeUpdate() 실행
     * 6. 저장된 행의 수 반환
     */
    public int insertUser(String userId, String username, String password, int age, String email) throws SQLException {
        // TODO: SQL을 작성하세요.
        String sql = "";

        // TODO: try-with-resources로 Connection과 PreparedStatement를 생성하세요.
        // try (Connection con = dbUtil.getConnection();
        //      PreparedStatement pstmt = con.prepareStatement(sql)) {
        //
        //     TODO: pstmt.setString(1, userId);
        //     TODO: 나머지 파라미터를 순서대로 세팅하세요.
        //     TODO: return pstmt.executeUpdate();
        // }

        return 0;
    }

    /**
     * TODO 2. userid로 회원 1명을 조회하세요.
     *
     * 사용 SQL
     * SELECT userid, username, userage, useremail FROM users WHERE userid = ?
     */
    public void findUserById(String userId) throws SQLException {
        // TODO: SQL을 작성하세요.
        String sql = "";

        // TODO: Connection, PreparedStatement, ResultSet을 사용해서 조회하세요.
        // 출력 예시:
        // userid = user01
        // username = 홍길동
        // age = 20
        // email = hong@example.com
    }

    /**
     * TODO 3. 전체 회원 목록을 조회하세요.
     *
     * 사용 SQL
     * SELECT userid, username, userage, useremail FROM users ORDER BY userid
     */
    public void findAllUsers() throws SQLException {
        // TODO: SQL을 작성하세요.
        String sql = "";

        // TODO: ResultSet을 while문으로 반복해서 전체 회원을 출력하세요.
    }
}
