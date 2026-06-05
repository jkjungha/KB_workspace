package com.example.jdbc.dao;

import com.example.jdbc.domain.Person;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class PersonDao implements GenericDao<Person, Integer>{
    @Override
    public Integer insert(Connection conn, Person person) throws Exception {
        String sql = "INSERT INTO person(name) VALUES (?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
            pstmt.setString(1, person.getName());
            pstmt.executeUpdate();

            try (ResultSet rs = pstmt.getGeneratedKeys()){
                if(rs.next()){
                    return rs.getInt(1);
                }
            }
            throw new SQLException("person insert 후 생성된 id를 가져오지 못했습니다.");
        }
    }

    @Override
    public Optional<Person> findById(Connection conn, Integer id) throws Exception {
        String sql = "SELECT * FROM person WHERE id = ?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, id);



        }
    }

    @Override
    public List<Person> findAll(Connection conn) throws Exception {
        return List.of();
    }

    @Override
    public int update(Connection conn, Person person) throws Exception {
        return 0;
    }

    @Override
    public int delete(Connection conn, Integer id) throws Exception {
        return 0;
    }
}
