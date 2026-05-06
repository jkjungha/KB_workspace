package practice_0429.실습.student.todo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex05PredicateLambdaTodo {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(95, 40, 80, 55, 100);

        // TODO: 60점 이상이면 true를 반환하는 Predicate<Integer>를 작성하세요.
        Predicate<Integer> isPass = (score) -> score>=60;

        for (Integer score : scores) {
            if (isPass.test(score)) {
                System.out.println(score + "점: 합격");
            }
        }
    }
}
