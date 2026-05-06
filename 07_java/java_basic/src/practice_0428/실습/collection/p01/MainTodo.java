package practice_0428.실습.collection.p01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<String> 생성
        List<String> list = new ArrayList<>();

        // TODO 2: "Java", "Spring", "Vue" 추가
        list.add("Java");
        list.add("Spring");
        list.add("Vue");

        // TODO 3: foreach 전체 요소 출력
        list.forEach((l) -> System.out.println(l));

        System.out.println();

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(list.size());
    }
}
