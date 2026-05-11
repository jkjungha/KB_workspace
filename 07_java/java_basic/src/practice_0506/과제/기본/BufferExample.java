package practice_0506.과제.기본;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) {
        String originalPath1 = "/Users/junghakim/Desktop/temp/originalFile1.txt";
        String targetPath1 = "/Users/junghakim/Desktop/temp/targetFile1.txt";
        String originalPath2 = "/Users/junghakim/Desktop/temp/originalFile2.txt";
        String targetPath2 = "/Users/junghakim/Desktop/temp/targetFile2.txt";

        try {
            FileInputStream fis1 = new FileInputStream(originalPath1);
            FileOutputStream fos1 = new FileOutputStream(targetPath1);
            long nonBufferTime = copy(fis1, fos1);
            System.out.println("버퍼 미사용:\t"+nonBufferTime+"ns");


            FileInputStream fis2 = new FileInputStream(originalPath2);
            FileOutputStream fos2 = new FileOutputStream(targetPath2);
            BufferedInputStream bis2 = new BufferedInputStream(fis2);
            BufferedOutputStream bos2 = new BufferedOutputStream(fos2);

            long withBufferTime = copy(bis2,bos2);
            System.out.println("버퍼 사용:\t"+withBufferTime+"ns");

            fis1.close();
            fos1.close();
            bis2.close();
            bos2.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();
        while(true){
            int data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return end - start;
    }
}
