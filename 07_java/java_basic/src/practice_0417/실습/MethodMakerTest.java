package practice_0417.실습;

import java.util.Scanner;

public class MethodMakerTest {
    public static void main(String[] args) {
        //사용자에게 두 개의 정수를 전달 받아
        //add라는 메소드를 호출하여 두 수의 합의 결과를 받아서 출력하세요.
        Scanner input = new Scanner(System.in);

        System.out.print("첫번쨰 숫자 입력 : ");
        int a = input.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int b = input.nextInt();

        int result = add(a,b);

        System.out.println("결과 : "+result);
    }

    public static int add(int a, int b) {
        return a+b;
    }

}
