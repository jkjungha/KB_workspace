package practice_0430.실습.student.student.todo;

import java.util.Arrays;

public class Ex08_LoopingTodo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // TODO 1: 짝수만 필터링하고 peek로 중간 출력한 뒤 sum으로 합계를 구하세요.
        int sum = Arrays.stream(arr).filter(i -> i%2 == 0).peek(System.out::println).sum();
        System.out.println("합계: "+sum);
        System.out.println();
        // TODO 2: forEach로 짝수만 최종 출력하세요.
        Arrays.stream(arr).filter(i -> i%2==0).forEach(System.out::println);
    }
}
