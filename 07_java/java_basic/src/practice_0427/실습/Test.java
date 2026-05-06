package practice_0427.실습;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");
        System.out.println(list);

        List<String> list2 = List.of("test1", "test2", "test3");
        System.out.println(list2);

        Map<String, String> map = Map.of("k1","v1", "k2", "v2");
        System.out.println(map);
    }
}
