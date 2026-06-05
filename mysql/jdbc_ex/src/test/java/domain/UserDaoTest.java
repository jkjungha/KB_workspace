package domain;

import org.junit.jupiter.api.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserDaoTest {
    UserDao dao = new UserDaoImpl();

    @AfterAll
    static void tearDown(){
        JDBCUtil.close();
    }

    @Test
    @Order(1)
    void create() throws SQLException {
        UserVO user = new UserVO("ssamz","123", "ss", "ADMIN");
        int count = dao.create(user);
        Assertions.assertEquals(1, count);
    }

    @Test
    @Order(2)
    void getList() throws SQLException {
        List<UserVO> userList = dao.getList();
        for(UserVO vo : userList){
            System.out.println(vo);
        }
    }

    @Test
    @Order(3)
    void get() throws SQLException {
        UserVO user = dao.get("ssamz").orElseThrow(NoSuchElementException::new);
        Assertions.assertNotNull(user);
    }

    @Test
    @Order(4)
    void update() throws SQLException {
        UserVO user = dao.get("ssamz").orElseThrow(NoSuchElementException::new);
        user.setName("쌤");
        int count = dao.update(user);
        Assertions.assertEquals(1, count);
    }

    @Test
    @Order(5)
    void delete() throws SQLException {
        int count = dao.delete("ssamz");
        Assertions.assertEquals(1, count);
    }
}