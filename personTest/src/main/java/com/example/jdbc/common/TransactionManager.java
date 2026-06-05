package com.example.jdbc.common;

import java.sql.Connection;


public class TransactionManager {
    public static <T> T execute(TransactionCallback<T> callback) throws Exception{
        Connection conn = null;

        try{
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false);

            T result = callback.doInTransaction(conn);

            conn.commit();
            return result;
        } catch (Exception e){
            if(conn != null){
                conn.rollback();
            }

            throw e;
        } finally {
            if(conn != null){
                try {
                    conn.setAutoCommit(true);
                } finally {
                    conn.close();
                }
            }
        }
    }
}
