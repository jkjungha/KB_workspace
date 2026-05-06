package practice_0428.실습.collection.p06;

import java.util.Stack;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Stack<String> 생성
        Stack<String> stack = new Stack<>();
        // TODO 2: "첫째", "둘째", "셋째" push
        stack.push("첫째");
        stack.push("둘째");
        stack.push("셋째");
        // TODO 3: pop 하며 출력
        System.out.println(stack.pop());
    }
}
