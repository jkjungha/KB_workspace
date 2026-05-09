package practice_0506.과제.기본;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        try {
            /*OutputStream byte 단위 쓰기
            OutputStream os = new FileOutputStream("/Users/junghakim/Desktop/temp/test1.txt");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();*/

            /*OutputStream byte 배열 쓰기
            OutputStream os = new FileOutputStream("/Users/junghakim/Desktop/temp/test2.txt");
            byte[] array = {10,20,30};
            os.write(array);

            os.flush();
            os.close();*/

            //Writer 문자 쓰기
            char a = 'A';
            char b = 'B';
            char[] arr = {'C', 'D', 'E'};

            Writer writer = new FileWriter("/Users/junghakim/Desktop/temp/test2.txt");
            writer.write(a);
            writer.write(b);
            writer.write(arr);
            writer.write("fgh");
            writer.flush();
            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
