package practice_0429.실습.student.todo;

import java.util.HashMap;
import java.util.Map;

public class Ex12MapForEachLambdaTodo {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("노트북", 5);
        stock.put("마우스", 20);
        stock.put("키보드", 10);

        // TODO: Map의 forEach 람다식을 사용하여 "상품명 -> 재고수량" 형태로 출력하세요.
    }
}
