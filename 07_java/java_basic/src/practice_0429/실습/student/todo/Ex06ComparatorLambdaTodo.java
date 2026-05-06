package practice_0429.실습.student.todo;

import java.util.ArrayList;
import java.util.List;

//Comparator 함수형 인터페이스 - 객체의 정렬 기준을 정의하는 함수형 인터페이스
//compare( T o1, T o2)
//결과가 음수이면 앞 객체가 먼저, 양수이면 뒤객체가 먼저 정렬됨
public class Ex06ComparatorLambdaTodo {
    static class Product {
        String name;
        int price;
        Product(String name, int price) { this.name = name; this.price = price; }
        public String toString() { return name + ": " + price; }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("키보드", 30000));
        products.add(new Product("마우스", 15000));
        products.add(new Product("모니터", 200000));

        // TODO: 가격 오름차순으로 정렬하는 람다식을 작성하세요.
        products.sort((p1, p2) -> Integer.compare(p1.price, p2.price));
//        products.sort(Comparator.comparingInt(p -> p.price));
        System.out.println(products);

        for(Product product: products){
            System.out.println(product);
        }
    }
}
