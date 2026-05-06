package day04;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");
        int num1 = input.nextInt();
        System.out.print("두 번째 숫자 입력 : ");
        int num2 = input.nextInt();

        //두개의 정수 중 작은 값
        int min = (num1<num2) ? num1 : num2;
        System.out.println("Min Value : " + min);

        int max = (num1>num2) ? num1 : num2;
        System.out.println("Max Value : " + min);
    }
}
