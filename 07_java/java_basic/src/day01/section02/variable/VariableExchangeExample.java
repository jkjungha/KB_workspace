package day01.section02.variable;

public class VariableExchangeExample {
    public static void main(String[] args) {
        // 정수형 변수 x 에 3 값 할당
        int x = 3;
        // 정수형 변수 y 에  5값 할당
        int y = 5;
        //현재  x , y 값 출력   x=3 ,y =5
        System.out.println("x = " + x + " y = " + y);

        // x의 값 과 y의 값을 교환 한 후  결과 출력  x=5 , y=3
        int temp = 0;

        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + " y = " + y);


    }
}
