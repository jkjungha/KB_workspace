package practice_0429.실습.lambda;

public class Main {
    public static void main(String[] args) {
        Calculator add = (x,y) -> x+y;
        int result = add.calc(10,20);
        System.out.println(result);
        Calculator sub = (x,y) -> x-y;
        result = sub.calc(30, 25);
        System.out.println(result);
    }
}
