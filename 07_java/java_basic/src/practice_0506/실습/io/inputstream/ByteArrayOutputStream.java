package practice_0506.실습.io.inputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayOutputStream {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("/Users/junghakim/Desktop/test2.txt");

            byte[] b = {1,2,3};

            os.write(b);
            os.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
