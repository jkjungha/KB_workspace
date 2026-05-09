package practice_0506.과제.기본;

import java.io.*;

public class ReadExample {
    public static void main(String[] args) {
        try {
            /*InputStream byte 단위 읽기
            InputStream is = new FileInputStream("/Users/junghakim/Desktop/temp/test1.txt");
            while(true){
                int data = is.read();
                if(data == -1) break;
                System.out.print(data);
            }
            is.close();*/

            /*InputStream byte 배열 읽기
            InputStream is = new FileInputStream("/Users/junghakim/Desktop/temp/test1.txt");
            byte[] data = new byte[100];

            while(true){
                int num = is.read(data);
                if(num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
            is.close();*/

            /*Reader 문자 단위 읽기
            Reader reader = new FileReader("/Users/junghakim/Desktop/temp/test1.txt");

            while(true){
                int data = reader.read();
                if(data == -1)break;
                System.out.println((char)data);
            }
            reader.close();*/

            //Reader 문자 배열 읽기
            Reader reader = new FileReader("/Users/junghakim/Desktop/temp/test1.txt");
            char[] data = new char[100];
            while(true){
                int num = reader.read(data);
                if(num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
            reader.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
