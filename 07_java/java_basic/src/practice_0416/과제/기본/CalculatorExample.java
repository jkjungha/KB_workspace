package practice_0416.과제.기본;


public class CalculatorExample {
    public static void main(String[] args) {
//        Calculator myCalc = new Calculator();
//
//        myCalc.powerOn();
//
//        int result1 = myCalc.plus(5,6);
//        System.out.println("result1: "+result1);
//
//        int x = 10;
//        int y = 4;
//        double result2 = myCalc.divide(x,y);
//        System.out.println("result2: "+result2);
//
//        myCalc.powerOff();

//        Calculator myCalcu = new Calculator();
//
//        double result1 = myCalcu.areaRectangle(10);
//
//        double result2 = myCalcu.areaRectangle(10,20);
//
//        System.out.println("정사각형 넓이="+result1);
//        System.out.println("직사각형 넓이="+result2);

        double result1 = 10*10* Calculator.pi;
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10,5);

        System.out.println("result1 : "+result1);
        System.out.println("result2 : "+result2);
        System.out.println("result3 : "+result3);

    }
}
