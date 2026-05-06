package student.ch04_control;

import java.util.Scanner;

/*
문제 10. switch문
score가 95일 때 학점을 출력하세요.
- 90점 이상: A
- 80점 이상: B
- 70점 이상: C
- 그 외: D

출력 결과:
학점: A

힌트: score / 10 값을 활용하면 편합니다.
*/
public class Q02_GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = sc.nextInt();

        String grade = switch(score / 10){
             case 10,9 -> "A";
             case 8 ->"B";
             case 7 ->"C";
            default -> "D";
        };

        // TODO: switch문을 사용해 학점을 출력하세요.
        System.out.println("학점 : " + grade);
    }
}
