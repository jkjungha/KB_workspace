package day05.pratice_0420;

public class CoumputerExample {
    public static void main(String[] args) {
       Computer computer1 = new Computer();
       double result =  computer1.areaCircle(5.0);
       System.out.println("computer1 결과 : " + result);
       System.out.printf("computer1의 결과 : %.2f\n", result);

       Calculator  calculator = new Calculator();
       result = calculator.areaCircle(10.0);
        System.out.printf("Calculator 결과 : %.2f" , result);

    }
}
