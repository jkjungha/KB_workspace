package practice_0429.실습.student.todo;

import java.io.File;

public class Ex15FileFilterLambdaTodo {
    public static void main(String[] args) {
        File dir = new File(".");

        // TODO: 람다식을 사용하여 현재 폴더에서 .java 파일 이름만 배열로 가져오세요.
        String[] javaFiles = null;

        if (javaFiles != null) {
            for (String fileName : javaFiles) {
                System.out.println(fileName);
            }
        }
    }
}
