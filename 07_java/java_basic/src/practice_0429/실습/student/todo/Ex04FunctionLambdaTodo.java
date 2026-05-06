package practice_0429.실습.student.todo;

import java.util.function.Function;

public class Ex04FunctionLambdaTodo {
    static class User {
        String name;
        int age;
        User(String name, int age) { this.name = name; this.age = age; }
    }

    public static void main(String[] args) {
        User user = new User("홍길동", 25);

        // TODO: Function<User, String>을 람다식으로 작성하여 "홍길동(25세)" 형태로 변환하세요.
        Function<User, String> userFormatter = (user1) -> {
            return user1.name +"("+user1.age+"세)";
        };

        System.out.println(userFormatter.apply(user));
    }
}
