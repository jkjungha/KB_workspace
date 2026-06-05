package com.example.jdbc.dao;

import com.example.jdbc.common.DBUtil;
import com.example.jdbc.domain.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BoardDaoTest {
    private BoardDao boardDao;

    @BeforeEach
    void setUp() throws Exception {
        DBUtil dbUtil = TestDatabase.createDbUtil();
        boardDao = new BoardDao(dbUtil);
    }

    @Test
    @DisplayName("게시글 저장 후 자동 생성된 bno로 조회할 수 있다")
    void insertAndFindBoard() throws Exception {
        Board board = new Board(
                "봄이 오나 봄봄",
                "꽃이 동산에 가득하니 행복하네요",
                "신세계",
                "spring.txt",
                "sample file".getBytes(StandardCharsets.UTF_8)
        );

        int bno = boardDao.insert(board);
        Optional<Board> found = boardDao.findById(bno);

        assertTrue(bno > 0);
        assertTrue(found.isPresent());
        assertEquals("봄이 오나 봄봄", found.get().getTitle());
        assertEquals("spring.txt", found.get().getFileName());
    }
}
