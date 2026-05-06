package practice_0430.실습.student.student.todo;

import java.util.Arrays;

public class Ex10_BasicAggregateTodo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // TODO: 짝수 기준 count, sum, average, max, min을 구하고 출력하세요.
        long count = Arrays.stream(arr).filter(i -> i%2 == 0).count();
        System.out.println("짝수 개수 : "+count);
        int sum = Arrays.stream(arr).filter(i -> i%2 == 0).sum();
        System.out.println("짝수의 총합 : "+sum);
        double avg = Arrays.stream(arr).filter(i -> i%2 == 0).average().orElse(0.0);
        System.out.println("짝수의 평균값 : "+avg);
        int max = Arrays.stream(arr).filter(i -> i%2 == 0).max().orElse(0);
        System.out.println("저장소의 짝수 중 가장 큰 짝수 값 : "+max);
        int min = Arrays.stream(arr).filter(i -> i%2 == 0).min().orElse(0);
        System.out.println("저장소의 짝수 중 가장 작은 짝수값 : "+min);
        // TODO: 3의 배수 중 첫 번째 값을 findFirst로 구하세요.
        long findFirst = Arrays.stream(arr).filter(i -> i%3 == 0).findFirst().orElse(-1);
        System.out.println("3의 배수 중 첫 번째 값 : "+findFirst);
        System.out.println();
    }
}
