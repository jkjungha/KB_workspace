package practice_0506.실습.io.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx01 {
    public static void main(String[] args) {
        // /Users/junghakim/Desktop/test3.txt 파일에 있는 데이터를 ReaderEx01.java 파일로 읽어와서 콘솔창에 데이터를 출력
        try{
            Reader reader = null;
            reader = new FileReader("/Users/junghakim/Desktop/test3.txt");
            
            //while-1 한문자씩 읽어와서 콘솔 출력
            while(true){
                int data = reader.read();
                if(data == -1) break;
                System.out.println((char)data);
            }
            reader.close();
            System.out.println();
            
            //while-2 문자 배열에 담아서 콘솔 출력
            reader = new FileReader("/Users/junghakim/Desktop/test3.txt");
            char[] chars = new char[1024];
            while (true){
                int number = reader.read(chars);

                if(number == -1){
                    break;
                }

//                for(char aChar : chars){
//                    System.out.print(aChar);
//                }
//                System.out.println();

                for (int i = 0; i < number; i++) {
                    System.out.print(chars[i]);
                }
            }


            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
