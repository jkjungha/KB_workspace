package day01.section02.variable;

import java.util.Arrays;

public class VariableUseExample {
	public static void main(String[] args) {
       // hour 라는 정수형 변수에 3 할당
	      int hour = 3;
	   // minute 정수형 변수에 5 할당
	      int minute = 5;
	   //  "3시간 5분" 문자열 출력
		System.out.println(hour + "시간" + minute + "분");

	   // 3시간 5분을 분으로 계산해서 출력
		 int totalminute =  (hour * 60) + minute ;
		System.out.println("결과 : " + totalminute + "분");

	}
}
