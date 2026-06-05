package sec01;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class ConnectionTest {
    public static void main(String[] args) {
        String uri = "mongodb://ac-nwbklti-shard-00-00.wck3u5c.mongodb.net:27017";
        String db = "todo_db";

        try (MongoClient client = MongoClients.create(uri)) {
            MongoDatabase database = client.getDatabase(db);
            System.out.println("MongoDB 연결 성공: " + database.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
