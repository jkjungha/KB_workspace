package practice_0506.실습.io.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx01 {
    public static void main(String[] args) {
        // /Users/junghakim/Desktop/test3.txt에 A B C 를 출력하세요
        try (Writer wt = new FileWriter("/Users/junghakim/Desktop/test3.txt")){
            wt.write("A");
            int ch1 = 65;
            wt.write(ch1);
            char[] data = {'D', 'E', 'F'};
            wt.write(data);
            String str = "Java";
            wt.write(str);

            wt.flush();
        } catch (IOException e) {
//            System.out.println("파일 쓰기 중 문제 발생하여 프로그램 종료");
            e.getMessage();
            throw new RuntimeException(e);
        }
    }
}
