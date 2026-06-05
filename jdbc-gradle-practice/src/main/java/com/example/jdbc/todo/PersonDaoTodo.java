package com.example.jdbc.todo;

/**
 * 학생 실습 TODO 파일입니다.
 * 목표: PersonDao  아래 순서대로 직접 구현합니다.
 *
 * TODO 1. DBUtil 필드를 선언하고 생성자에서 주입받으세요.
 * TODO 2. insert(Person person) 메서드를 작성하세요.
 *         - SQL: INSERT INTO person(id, name) VALUES(?, ?)
 *         - Statement가 아니라 PreparedStatement를 사용하세요.
 * TODO 3. findById(int id) 메서드를 작성하세요.
 *         - SELECT id, name FROM person WHERE id = ?
 *         - 조회 결과가 없을 수 있으므로 Optional<Person>을 사용하세요.
 * TODO 4. findAll() 메서드를 작성하세요.
 *         - ResultSet을 반복문으로 읽고 List<Person>으로 반환하세요.
 * TODO 5. Connection, PreparedStatement, ResultSet은 try-with-resources로 닫으세요.
 */
public class PersonDaoTodo {
    // 여기에 실습 코드를 작성하세요.
}
