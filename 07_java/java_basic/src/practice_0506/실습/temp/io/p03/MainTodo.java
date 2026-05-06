package practice_0506.실습.temp.io.p03;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MainTodo {
    public static void main(String[] args) throws Exception {

        // TODO 1: BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/junghakim/Desktop/temp/test.txt"));
        // TODO 2: 두 줄 쓰기
        bw.write("Hello");
        bw.write("Buffer");
        bw.close();
    }
}
