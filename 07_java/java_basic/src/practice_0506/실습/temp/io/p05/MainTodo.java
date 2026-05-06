package practice_0506.실습.temp.io.p05;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: BufferedReader로 첫 줄 읽고 출력
        BufferedReader br = new BufferedReader(new FileReader("/Users/junghakim/Desktop/temp/test.txt"));
        String str = br.readLine();
        System.out.println(str);
    }
}
