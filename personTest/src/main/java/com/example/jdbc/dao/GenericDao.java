package com.example.jdbc.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public interface GenericDao<T, ID> {
    ID insert(Connection conn, T entity) throws Exception;

    Optional<T> findById(Connection conn, ID id) throws Exception;

    List<T> findAll(Connection conn) throws Exception;

    int update(Connection conn, T entity) throws Exception;

    int delete(Connection conn, ID id) throws Exception;
}
