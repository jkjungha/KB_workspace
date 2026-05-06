package practice_0429.실습.student.todo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Ex13GroupingByLambdaTodo {
    static class Order {
        String category;
        int price;
        Order(String category, int price) { this.category = category; this.price = price; }
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("FOOD", 10000),
                new Order("BOOK", 15000),
                new Order("FOOD", 20000),
                new Order("BOOK", 12000)
        );

        // TODO: category별 주문 개수를 groupingBy로 집계하세요.
        Map<String, Long> result = null;

        System.out.println(result);
    }
}
