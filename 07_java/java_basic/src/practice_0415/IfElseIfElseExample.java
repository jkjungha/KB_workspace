package pratice_0415;

/* score값의구간을검사하여, 점수와등급을출력하는클래스를완성하세요.
  조건:
    0~69   D등급
    70~79  C등급
    80~89  B등급
    90~100 A등급

  출력:
   점수가 70~79입니다.
   등급은C입니다.

 */

public class IfElseIfElseExample {
    public static void main(String[] args) {

        int score = 75;
        if(score >= 90 && score <=100){
            System.out.println("점수가 100~90점 사이입니다.");
            System.out.println("등급은 A 입니다.");
        }
        else if(score >= 80 && score <=89){
            System.out.println("점수가 80~89점 사이입니다.");
            System.out.println("등급은 B 입니다.");
        }
        else if(score >= 70 && score <=79){
            System.out.println("점수가 70~79점 사이입니다.");
            System.out.println("등급은 C 입니다.");
        }
        else if(score >= 0  && score <=69){
            System.out.println("점수가 0~69점 사이입니다.");
            System.out.println("등급은 D 입니다.");
        } else {
            System.out.println("유효하지 않은 숫자 입니다.");
        }





    }
}