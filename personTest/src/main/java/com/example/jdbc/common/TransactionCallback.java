package com.example.jdbc.common;

import java.sql.Connection;

//TransactionManager 안의 로직의 틀을 만드는 함수형 인터페이스
@FunctionalInterface
public interface TransactionCallback<T> {
    T doInTransaction(Connection con) throws Exception;
}
