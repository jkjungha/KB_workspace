package practice_0427.실습;

public class Main {
    public static void main(String[] args) {
        // 제네릭을 통해 람다 함수의 타입을 결정
        IAdd<Double> o = (x, y) -> x + y; // 매개변수 x와 y 그리고 반환형 타입이 int형으로 설정된다.

        Double result = o.add(10.0, 20.0);
        System.out.println(result); // 30
    }
}
interface IAdd<T> {
    public T add(T x, T y);
}
