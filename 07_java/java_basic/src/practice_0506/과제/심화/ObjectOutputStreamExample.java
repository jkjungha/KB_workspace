package practice_0506.과제.심화;

import java.io.*;
import java.util.Arrays;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        Member m1 = new Member("fall", "단풍이");
        Product p1 = new Product("노트북", 1500000);
        int[] arr = {1,2,3};

        FileOutputStream fos = new FileOutputStream("/Users/junghakim/Desktop/temp/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr);

        oos.flush(); fos.close(); oos.close();

        FileInputStream fis = new FileInputStream("/Users/junghakim/Desktop/temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member m2 = (Member) ois.readObject();
        Product p2 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close(); fis.close();

        System.out.println(m2);
        System.out.println(p2);
        System.out.println(Arrays.toString(arr2));
    }
}
