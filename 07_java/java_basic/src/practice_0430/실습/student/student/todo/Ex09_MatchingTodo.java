package practice_0430.실습.student.student.todo;

import java.util.Arrays;

public class Ex09_MatchingTodo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        // TODO 1: 모든 요소가 2의 배수인지 검사
        boolean b1 = Arrays.stream(arr).allMatch(i -> i%2 == 0);
        System.out.println(b1);
        // TODO 2: 하나라도 3의 배수가 있는지 검사
        boolean b2 = Arrays.stream(arr).anyMatch(i -> i%3 == 0);
        System.out.println(b2);
        // TODO 3: 3의 배수가 하나도 없는지 검사
        boolean b3 =  Arrays.stream(arr).noneMatch(i -> i%3 == 0);
        System.out.println(b3);
    }
}
