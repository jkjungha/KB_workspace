package practice_0506.실습.temp.io.p04;

import java.io.FileReader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: FileReader로 한 글자씩 읽기
        FileReader fr = new FileReader("/Users/junghakim/Desktop/temp/test.txt");
        char[] chars = new char[1024];

        while(true){
            int data = fr.read();
            if (data == -1) break;
            System.out.print((char) data);
        }
    }
}
