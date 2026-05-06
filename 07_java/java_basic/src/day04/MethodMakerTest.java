package day04;

import java.util.Scanner;

public class MethodMakerTest {
    public static void main(String[] args) {
        // 사용자에게 두개의 정수를 전달받아
        // add 라는 메소드를 호출하여 전달받은 두수의 합의 결과를 받아서 출력하세요
        int n1, n2, result;
        Scanner input = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        n1 = input.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        n2 = input.nextInt();

        result =  add(n1,n2);
        System.out.println("결과 : " + result);
       }

       public static int add(int n1, int n2){

        return n1 + n2;
       }

}
