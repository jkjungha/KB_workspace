package practice_0420.실습.objectCasting;

public class ABCDEFTest {
    public static void main(String[] args) {
        A a = new A();
        a = new B();
        System.out.println();
        B b1 = (B)a;

        a = new C();

        a = new D();
        a = new E();
        a = new F();

        B b = new B();
//        F f1 = (F)b;

        b = new D();
        b = new E();


    }
}
