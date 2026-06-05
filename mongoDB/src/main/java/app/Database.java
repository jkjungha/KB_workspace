package app;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * MongoDB 접속 정보를 관리하는 공통 유틸리티 클래스입니다.
 * 기본 접속 주소는 로컬 MongoDB입니다.
 */
public class Database {
    private static final String URI = "mongodb://ac-nwbklti-shard-00-00.wck3u5c.mongodb.net:27017";
    private static final String DB_NAME = "todo_db";

    static MongoClient client;
    static MongoDatabase database;

    static {
        ConnectionString connectionString = new ConnectionString(URI);
        client = MongoClients.create(connectionString);
        database = client.getDatabase(DB_NAME);
    }

    public static void close() {
        if (client != null) {
            client.close();
        }
    }

    public static MongoDatabase getDatabase() {
        return database;
    }

    public static MongoCollection<Document> getCollection(String colName) {
        return database.getCollection(colName);
    }
}
