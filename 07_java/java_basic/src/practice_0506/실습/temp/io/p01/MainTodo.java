package practice_0506.실습.temp.io.p01;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTodo {
    public static void main(String[] args) throws IOException {
        // TODO 1: File 객체를 생성하고 경로를 출력하세요.

        //File객체 생성
        File dir = new File("/Users/junghakim/Desktop/temp/images");
        File file1 = new File("/Users/junghakim/Desktop/temp/file1.txt");
        File file2 = new File("/Users/junghakim/Desktop/temp/file2.txt");
        File file3 = new File("/Users/junghakim/Desktop/temp/file3.txt");

        if (dir.exists() == false) {
            dir.mkdir();
        }

        if (file1.exists() == false) file1.createNewFile();
        if (file2.exists() == false) file2.createNewFile();
        if (file3.exists() == false) file3.createNewFile();

        File temp = new File("/Users/junghakim/Desktop/temp");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        for (File content : contents) {
            System.out.printf("%-25s", sdf.format(new Date(content.lastModified())));
            if (content.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", content.getName());
                System.out.println();
            } else {
                System.out.printf("%-10s%-20s", content.length(), content.getName());
                System.out.println();
            }
        }
    }
}