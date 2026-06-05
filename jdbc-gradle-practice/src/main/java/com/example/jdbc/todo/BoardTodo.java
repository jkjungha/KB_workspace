package com.example.jdbc.todo;

import com.example.jdbc.common.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 학생 실습 TODO - boards 테이블 JDBC 실습
 *
 * 실습 목표
 * 1. PreparedStatement로 게시글을 등록할 수 있다.
 * 2. Statement.RETURN_GENERATED_KEYS로 자동 생성 PK를 가져올 수 있다.
 * 3. ResultSet으로 게시글을 조회할 수 있다.
 */
public class BoardTodo {

    private final DBUtil dbUtil;

    public BoardTodo(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    /**
     * TODO 1. 게시글을 저장하고 자동 생성된 bno를 반환하세요.
     *
     * 사용 SQL
     * INSERT INTO boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata)
     * VALUES (?, ?, ?, NOW(), ?, ?)
     *
     * 작성 순서
     * 1. PreparedStatement 생성 시 Statement.RETURN_GENERATED_KEYS 옵션 사용
     * 2. 제목, 내용, 작성자, 파일명, 파일데이터 바인딩
     * 3. executeUpdate() 실행
     * 4. pstmt.getGeneratedKeys()로 bno 조회
     */
    public int insertBoard(String title, String content, String writer, String fileName, byte[] fileData) throws SQLException {
        // TODO: SQL을 작성하세요.
        String sql = "";

        // TODO: PreparedStatement를 생성할 때 자동 생성 키 반환 옵션을 사용하세요.
        // try (Connection con = dbUtil.getConnection();
        //      PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        //
        //     TODO: pstmt.setString(1, title);
        //     TODO: 나머지 파라미터를 순서대로 세팅하세요.
        //
        //     int result = pstmt.executeUpdate();
        //     if (result != 1) return -1;
        //
        //     try (ResultSet rs = pstmt.getGeneratedKeys()) {
        //         TODO: rs.next()가 true이면 rs.getInt(1)을 반환하세요.
        //     }
        // }

        return -1;
    }

    /**
     * TODO 2. bno로 게시글 1개를 조회하세요.
     *
     * 사용 SQL
     * SELECT bno, btitle, bcontent, bwriter, bdate, bfilename
     * FROM boards
     * WHERE bno = ?
     */
    public void findBoardById(int bno) throws SQLException {
        // TODO: SQL을 작성하세요.
        String sql = "";

        // TODO: bno를 바인딩하고 ResultSet으로 게시글 정보를 출력하세요.
    }

    /**
     * TODO 3. 전체 게시글 목록을 조회하세요.
     *
     * 사용 SQL
     * SELECT bno, btitle, bwriter, bdate, bfilename FROM boards ORDER BY bno DESC
     */
    public void findAllBoards() throws SQLException {
        // TODO: SQL을 작성하세요.
        String sql = "";

        // TODO: while(rs.next())로 전체 게시글 목록을 출력하세요.
    }
}
