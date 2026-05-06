package practice_0417.실습;

import java.util.Scanner;

class MethodAdd{
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int substract(int n1, int n2){
        return n1-n2;
    }
}

public class MethodMakerTest1 {
    public static void main(String[] args) {
        //사용자에게 두 개의 정수를 전달 받아
        //add라는 메소드를 호출하여 두 수의 합의 결과를 받아서 출력하세요.
        Scanner input = new Scanner(System.in);

        System.out.print("첫번쨰 숫자 입력 : ");
        int a = input.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int b = input.nextInt();

        MethodAdd 유미 = new MethodAdd();
        int result = 유미.add(a,b);
        System.out.println("유미의 add 결과 : "+ result);
    }

    public static int add(int a, int b) {
        return a+b;
    }

}
