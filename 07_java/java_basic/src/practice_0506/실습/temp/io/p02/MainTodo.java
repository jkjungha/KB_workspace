package practice_0506.실습.temp.io.p02;

import java.io.FileWriter;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: FileWriter로 test.txt에 "Java" 쓰기
        FileWriter fw = new FileWriter("/Users/junghakim/Desktop/temp/test.txt");
        fw.write("Java");
        // TODO 2: close 호출
        fw.close();
    }
}
