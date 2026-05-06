package pratice_0415;

/*
* 이중for루프를사용하여 2단부터 9단까지 구구단을출력하세요.
* 출력조건
*
  *** 2단 ***
  2 x 1 = 2    2 x 2 = 4   2 x 3 = 6       2 x 9 =  18      …
  3 x 1 = 3    3 x 2 = 6   3 x 3 = 9   ----3 x 9 =  27

  * *** 9단 ***
  9 x 1 = 9
  9 x 2 = 18
      …
  9 x 8 = 72
  9 x 9 = 81

* */

public class MultiplicationTableExample {
    public static void main(String[] args) {
         for(int dan = 2 ; dan <= 9 ; dan++){
             System.out.println("*** " + dan +"단 ***");
             for (int column = 1; column <= 9; column++) {
                 System.out.println( dan + " x " + column + " = " + dan * column + "    ");
             }

         }
    }

}
