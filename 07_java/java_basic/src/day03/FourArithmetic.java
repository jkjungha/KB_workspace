package day03;

public class FourArithmetic {
    public static void main(String[] args) {
        int a, b ,result;   //변수 선언
        a = 12;   //값 할당
        b = 2;

        result = a + b;
        System.out.printf("a + b = %d\n", result);

        result = a - b;
        System.out.printf("a - b = %d\n", result);

        result = a * b;
        System.out.printf("a * b = %d\n", result);

        if( b > 0 ) {
            result = a / b;
            System.out.printf("a / b = %d\n" , result);
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }




    }
}
