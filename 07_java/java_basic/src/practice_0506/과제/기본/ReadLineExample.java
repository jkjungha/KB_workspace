package practice_0506.과제.기본;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/junghakim/Desktop/temp/test1.txt"));

            int lineNo = 1;
            while(true){
                String str = br.readLine();
                if(str == null) break;
                System.out.println(lineNo+"\t"+str);
                lineNo++;
            }

            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
