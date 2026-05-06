package practice_0429.실습.student.todo;

import java.util.Optional;

//Optional 클래스는 상속 불가 final class -> null 처리
//ofNullable()을 많이 사용함 -> 값이 null이어도 안전하게 Optional 객체를 생성하여 처리함
//orElse() -> 해당하는 값이 없을 때 사용할 기본값을 지정
public class Ex10OptionalLambdaTodo {
    public static void main(String[] args) {
        //email 값이 null이 아니면 람다식을 실행하고 null이면 기본 문자열 반환
        String email = null;

        // TODO: Optional과 람다를 사용하여 email이 null이면 "이메일 없음"을 출력하세요.
        String result = Optional.ofNullable(email).map(value ->  "이메일 : "+value).orElse("이메일 없음");

        System.out.println(result);
    }
}
