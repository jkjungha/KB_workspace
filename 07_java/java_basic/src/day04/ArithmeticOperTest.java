package day04;

public class ArithmeticOperTest {

    public static void main(String[] args) {
           int digit = 3625;
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/10/10%10);
        System.out.println(digit/10/10/10%10);

        int number = 210123;
        int su = 5;
        if(su%2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

    }
}
