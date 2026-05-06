package student.ch04_control;

import java.util.stream.IntStream;

/*
문제 12. 중첩 for문
다음과 같이 별이 출력되도록 코드를 작성하세요.

출력 결과:
*
**
***
****
*****

*/
public class Q04_StarTriangle {
    public static void main(String[] args) {
        // TODO: 중첩 for문으로 별 삼각형을 출력하세요.
        //printTriangel(5);
        //printTriangel(7);
        printTriangel_api(7);
    }
    private static void printTriangel(int height){
        for (int row = 1; row <= height; row++) {   // 행
            for (int column = 1; column <= row ; column++) {    //열
                System.out.print("*");
            }
            System.out.println(); // 행 바꿈
        }
    }
    private static void printTriangel_api(int height) {
        IntStream.rangeClosed(1, height).forEach(row-> System.out.println("*".repeat(row)));
    }
}
