package practice_0506.과제.기본;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) {
        String str = "문자 변환 스트림을 사용합니다.";

        try {
            OutputStream os = new FileOutputStream("/Users/junghakim/Desktop/temp/test1.txt");
            Writer writer = new OutputStreamWriter(os, "UTF-8");

            writer.write(str);
            writer.flush();
            writer.close();

            InputStream is = new FileInputStream("/Users/junghakim/Desktop/temp/test1.txt");
            Reader reader = new InputStreamReader(is, "UTF-8");

            char[] data = new char[100];
            int num = reader.read(data);
            reader.close();
            String reStr = new String(data, 0, num);

            System.out.println("read: "+reStr);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
