# JDBC  실습 프로젝트

## 1. 프로젝트 개요

- JDBC Driver 로딩
- `DriverManager`를 이용한 DB 연결
- `Statement`와 `PreparedStatement` 차이 이해
- SQL Injection을 예방하는 `PreparedStatement` 사용
- `DBUtil`로 DB 연결 코드 분리
- `VO/DTO` 객체로 ResultSet 매핑
- DAO 계층 분리
- 게시글 저장 시 자동 생성 키 조회
- BLOB 파일 데이터 저장
- JUnit 5 테스트 코드 작성

---

## 2. 프로젝트 구조

```text
jdbc-gradle-practice
├── build.gradle
├── settings.gradle
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/example/jdbc
│   │   │       ├── app
│   │   │       │   └── JdbcPracticeMain.java
│   │   │       ├── common
│   │   │       │   ├── DBConfig.java
│   │   │       │   └── DBUtil.java
│   │   │       ├── dao
│   │   │       │   ├── BoardDao.java
│   │   │       │   ├── PersonDao.java
│   │   │       │   └── UserDao.java
│   │   │       ├── domain
│   │   │       │   ├── Board.java
│   │   │       │   ├── Person.java
│   │   │       │   └── User.java
│   │   │       └── todo
│   │   │           └── PersonDaoTodo.java
│   │   └── resources
│   │       ├── db.properties
│   │       └── sql
│   │           ├── 01_schema_mysql.sql
│   │           └── 02_sample_data.sql
│   └── test
│       ├── java
│       │   └── com/example/jdbc
│       │       ├── dao
│       │       │   ├── BoardDaoTest.java
│       │       │   ├── PersonDaoTest.java
│       │       │   ├── TestDatabase.java
│       │       │   └── UserDaoTest.java
│       │       └── domain
│       │           └── PersonTest.java
│       └── resources
│           ├── schema-h2.sql
│           └── test-db.properties
```

---

## 3. 실행 환경

- Java 17 이상
- Gradle 8.x 권장
- MySQL 8.x
- IntelliJ IDEA 권장


---

## 4. MySQL 실습 DB 생성

MySQL Workbench 또는 터미널에서 아래 파일을 순서대로 실행합니다.

```sql
src/main/resources/sql/01_schema_mysql.sql
src/main/resources/sql/02_sample_data.sql
```


---

## 5. DB 접속 정보 수정

`src/main/resources/db.properties` 파일에서 본인 MySQL 환경에 맞게 수정합니다.

```properties
db.driver=com.mysql.cj.jdbc.Driver
db.url=jdbc:mysql://localhost:3306/bookmarketdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
db.username=root
db.password=mysql1234
```

---


---

##6. 테스트 실행 방법

테스트는 다음 내용을 검증합니다.

| 테스트 파일 | 검증 내용 |
|---|---|
| `PersonTest` | VO 객체의 getter, setter, toString 검증 |
| `PersonDaoTest` | person 저장, 단건 조회, 전체 조회 검증 |
| `UserDaoTest` | users 저장 검증 |
| `BoardDaoTest` | 게시글 저장, 자동 생성 키 조회, 단건 조회 검증 |

---

## 8. 수업 진행 순서 

### 1단계: 기존 JDBC 흐름 이해


```text
Driver 로딩 → Connection 생성 → PreparedStatement 생성 → SQL 실행 → ResultSet 처리 → 자원 반납
```

### 2단계: Statement 문제점 설명

`Statement`는 문자열을 직접 연결하여 SQL을 만들기 때문에 다음 문제가 발생할 수 있습니다.

- SQL Injection 위험
- 문자열 따옴표 오류 발생 가능
- 데이터 타입별 처리 불편
- SQL과 값이 섞여 가독성 저하

### 3단계: PreparedStatement 실습

`PersonDao.insert()`를 중심으로 `?` 바인딩 구조를 실습합니다.

```java
String sql = "INSERT INTO person(id, name) VALUES(?, ?)";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setInt(1, person.getId());
pstmt.setString(2, person.getName());
```

### 4단계: DBUtil 분리

반복되는 DB 연결 코드를 `DBUtil`로 분리합니다.

### 5단계: DAO 분리

SQL 실행 책임을 DAO에 모읍니다.

- `PersonDao`
- `UserDao`
- `BoardDao`

### 6단계: 테스트 코드 실행

실제 MySQL과 별도로 H2 인메모리 DB를 사용해 DAO 테스트를 실행합니다.

---

## 9.  실습 과제

### 과제 1. PersonDaoTodo 완성

`src/main/java/com/example/jdbc/todo/PersonDaoTodo.java` 파일을 열고 TODO 주석에 따라 직접 DAO를 작성합니다.

### 과제 2. UserDao 조회 기능 추가

현재 `UserDao`에는 `insert()`만 있습니다. 아래 기능을 추가합니다.

```java
Optional<User> findById(String userId)
```

### 과제 3. BoardDao 목록 조회 기능 추가

아래 기능을 추가합니다.

```java
List<Board> findAll()
```

조건:

- 최신 게시글이 먼저 나오도록 `ORDER BY bno DESC` 사용
- BLOB 데이터는 목록 조회에서 제외

### 과제 4. 예외 메시지 개선

현재 DAO는 `SQLException`을 그대로 던집니다. 실무에서는 사용자에게 직접 DB 오류를 노출하지 않습니다.

다음 구조를 추가

```java
public class DataAccessException extends RuntimeException {
    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
```

---

