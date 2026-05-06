package practice_0428.실습.collection.p05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainTodo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        // TODO 1: entrySet()을 이용해 key=value 형태로 출력
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> E : set){
            System.out.println(E.getKey()+"="+E.getValue());
        }
    }
}
