package practice_0506.과제.기본;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("/Users/junghakim/Desktop/temp");
        File test1 = new File("/Users/junghakim/Desktop/temp/test1.txt");
        File test2 = new File("/Users/junghakim/Desktop/temp/test2.txt");
        File test3 = new File("/Users/junghakim/Desktop/temp/test3.txt");

        if(!dir.exists()){
            dir.mkdir();
        }
        if(!test1.exists()){
            System.out.println("해당 파일은 없는 파일입니다.");
        }
        if(!test2.exists()){
            System.out.println("해당 파일은 없는 파일입니다.");
        }
        if(!test3.exists()){
            System.out.println("해당 파일은 없는 파일입니다.");
        }

        File temp = new File("/Users/junghakim/Desktop/temp");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File file : contents){
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()){
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            }else{
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}
