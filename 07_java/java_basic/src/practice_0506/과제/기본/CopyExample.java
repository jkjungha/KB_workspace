package practice_0506.과제.기본;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "/Users/junghakim/Desktop/temp/test2.txt";
        String targetFileName = "/Users/junghakim/Desktop/temp/test1.txt";

        try (OutputStream os = new FileOutputStream(targetFileName); InputStream is = new FileInputStream(originalFileName);){
            byte[] data = new byte[100];
            while(true){
                int num = is.read(data);
                if(num == -1) break;
                os.write(data, 0, num);
            }

            os.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
