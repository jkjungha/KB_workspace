package com.example.jdbc.dao;

import com.example.jdbc.common.DBConfig;
import com.example.jdbc.common.DBUtil;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Objects;
import java.util.Scanner;

final class TestDatabase {
    private TestDatabase() {}

    static DBUtil createDbUtil() throws Exception {
        DBUtil dbUtil = new DBUtil(DBConfig.fromClasspath("test-db.properties"));
        runSchema(dbUtil);
        return dbUtil;
    }

    private static void runSchema(DBUtil dbUtil) throws Exception {
        String schema;
        try (Scanner scanner = new Scanner(Objects.requireNonNull(
                TestDatabase.class.getClassLoader().getResourceAsStream("schema-h2.sql")
        ))) {
            scanner.useDelimiter("\\A");
            schema = scanner.hasNext() ? scanner.next() : "";
        }

        try (Connection con = dbUtil.getConnection(); Statement stmt = con.createStatement()) {
            for (String sql : schema.split(";")) {
                String trimmed = sql.trim();
                if (!trimmed.isEmpty()) {
                    stmt.execute(trimmed);
                }
            }
        }
    }
}
