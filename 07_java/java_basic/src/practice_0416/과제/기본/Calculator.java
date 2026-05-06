package practice_0416.과제.기본;

public class Calculator {
    static double pi = 3.14159;

    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    static int plus(int x, int y){
        return x+y;
    }

    public double divide(int x, int y) {
        return (double) x/(double) y;
    }

    public double areaRectangle(int i) {
        return i*i;
    }

    public double areaRectangle(int i, int j) {
        return i*j;
    }

    static int minus(int x,int y){
        return x-y;
    }
}
