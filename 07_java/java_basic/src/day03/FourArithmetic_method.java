package day03;

public class FourArithmetic_method {
    public static void main(String[] args) {
        int a, b ,result;   //변수 선언
        a = 12;   //값 할당
        b = 2;
        String str1 = "Hello , Python";
        float f1 = 3.1254f;

        System.out.printf("안녕 printf()\n");

        System.out.printf("a = %d , b = %d\n", a,b);   //정수 %d
        System.out.printf("f1 = %f\n",f1);    //실수
        System.out.printf("f1 = %.2f\n",f1);  // 실수 소숫점 처리
        System.out.printf("번호: %5d\n",10);  //우측정렬
        System.out.printf("번호: %-5d\n",10);  //좌측정렬
        System.out.printf("번호: %05d\n",10);  //우측정렬

        String item = "노트북";
        int quantity = 10;
        double price = 1500000.48;

        System.out.printf("상품명 : %s , 현재 남은 수량 : %d , 한대당 가격 : %.1f원 , 총금액 : %.1f 달러\n",item, quantity,price,quantity*price);

        double rate = 87.5;
        System.out.printf("성공률 : %.1f%%\n",rate);

        String userId = "Admin";
        String action = "service debugger";
        System.out.printf("[INFO] 사용자 : %s, 요청 : %s \n", userId,action);

        System.out.printf("총 금액 : %,d원\n", 1000000);
        System.out.printf("주문번호 : ORD-%05d\n", 7666);

        String ack = printAction();
        System.out.printf("exit code method : %s\n " , ack );


//        for (int i = 1; i < 6; i++) {
//            System.out.printf("=== %d 번 호출===\n", i );
//            fourMethod(a,b);
//        }



    }

    public  void fourMethod(int a, int b){
        int result = 0;
        result = a + b;
        System.out.printf("a + b = %d\n", result);

        result = a - b;
        System.out.printf("a - b = %d\n", result);

        result = a * b;
        System.out.printf("a * b = %d\n", result);

        if( b > 0 ) {
            result = a / b;
            System.out.printf("a / b = %d\n" , result);
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }


    }

    public static String printAction(){
        String str1 = "하이!";
        System.out.printf("인사말 : %s\n",str1);      //문자열 %s
        return "성공";
    }

}
