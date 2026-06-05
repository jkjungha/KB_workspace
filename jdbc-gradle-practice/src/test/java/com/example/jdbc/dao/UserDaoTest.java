package com.example.jdbc.dao;

import com.example.jdbc.common.DBUtil;
import com.example.jdbc.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserDaoTest {
    private UserDao userDao;

    @BeforeEach
    void setUp() throws Exception {
        DBUtil dbUtil = TestDatabase.createDbUtil();
        userDao = new UserDao(dbUtil);
    }

    @Test
    @DisplayName("PreparedStatement로 users 데이터를 저장한다")
    void insertUser() throws Exception {
        int result = userDao.insert(new User("test01", "신호동", "123456", 20, "test@gmail.com"));

        assertEquals(1, result);
    }
}
