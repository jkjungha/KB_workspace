package practice_0416.과제.심화;

public class DatabaseExample {
    public static void main(String[] args) {
        Database MySQL = Database.getInstance();

        String connect = MySQL.connect();
        System.out.println("데이터베이스 : "+connect);
        MySQL.close();
    }
}
