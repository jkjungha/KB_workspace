package student.ch04_control;

// 파일명: MultipleOfThreeSum.java

import java.util.stream.IntStream;

public class Q05_MultipleOfThreeSum {

    public static void main(String[] args) {
        int result = sumOfMultiesOfThree(100);
        printResult(result);
        printResultApi();
        mathResult();
    }

    private static int sumOfMultiesOfThree(int limit) {
        // TODO 1: 총합을 저장할 변수 선언
        int sum = 0;

        // TODO 2: 1부터 100까지 반복하는 for문 작성
        // TODO 3: 3의 배수인지 조건문 작성
        // TODO 4: 총합에 값을 누적
        // TODO 5: 결과 출력

        for (int i = 3; i <= limit; i += 3) {

            sum += i;

        }
        return sum;

    }

    private  static void printResult(int result){
        System.out.println("1-100까지 3의 배수의 합 : " + result);
    }

    private static void printResultApi(){
        int sum = IntStream.rangeClosed(1,100).filter(n -> n % 3 == 0).sum();
        printResult(sum);
    }

    private static void mathResult(){
        int number = 100/3;
        int sum = 3 * number * (number+ 1) /2;
        printResult(sum);
    }
}