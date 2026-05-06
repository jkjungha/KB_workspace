package day05.objectCasting;

public class ABCDEFTest {
    public static void main(String[] args) {
        A a = new A();
        a = new B();

        B b1 = (B)a;


        a = new C();
        C c1 = (C)a;


        a = new D();
        D d1 = (D)a;

        a = new E();
        a = new F();
        //업캐스팅

        B b = new B();
        //F f1 = (F)b;
        b = new D();
        b = new E();
        //b = new F();
        //b = new C();
        C c = new C();
        //c = new E();
        c = new F();

        //다운 캐스팅





    }


}
