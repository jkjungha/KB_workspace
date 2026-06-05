package com.example.jdbc.dao;

import com.example.jdbc.common.DBUtil;
import com.example.jdbc.domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonDaoTest {
    private PersonDao personDao;

    @BeforeEach
    void setUp() throws Exception {
        DBUtil dbUtil = TestDatabase.createDbUtil();
        personDao = new PersonDao(dbUtil);
    }

    @Test
    @DisplayName("person 데이터를 저장하고 id로 조회할 수 있다")
    void insertAndFindById() throws Exception {
        int result = personDao.insert(new Person(1, "홍길동"));

        Optional<Person> found = personDao.findById(1);

        assertEquals(1, result);
        assertTrue(found.isPresent());
        assertEquals(new Person(1, "홍길동"), found.get());
    }

    @Test
    @DisplayName("존재하지 않는 id는 Optional.empty를 반환한다")
    void findByIdReturnsEmpty() throws Exception {
        Optional<Person> found = personDao.findById(999);

        assertTrue(found.isEmpty());
    }

    @Test
    @DisplayName("전체 person 목록을 id 오름차순으로 조회한다")
    void findAll() throws Exception {
        personDao.insert(new Person(2, "이순신"));
        personDao.insert(new Person(1, "강감찬"));

        List<Person> people = personDao.findAll();

        assertEquals(2, people.size());
        assertEquals(1, people.get(0).getId());
        assertEquals(2, people.get(1).getId());
    }
}
