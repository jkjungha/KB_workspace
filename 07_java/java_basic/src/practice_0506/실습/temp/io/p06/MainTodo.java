package practice_0506.실습.temp.io.p06;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: try-with-resources로 BufferedWriter 사용
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/junghakim/Desktop/temp/test.txt"))){
            bw.write("Hello");
            bw.write("buffer06");
            bw.flush();
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
