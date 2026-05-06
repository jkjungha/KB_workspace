package practice_0430.실습.student.student.todo;

import practice_0430.실습.student.common.Student;
import java.util.List;

public class Ex03_PipelineTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("홍길동", "남", 40),
            new Student("신용권", "남", 80),
            new Student("유미선", "여", 90)
        );

        //파이프라인 구성
        //1. stream():원본 컬렉션에서 스트림을 생성
        //2. mapToInt() : Student 객체를 int 점수로 변환하는 점수 중간 처리
        //3. average() : 평균을 계산하는 최종처리
        //4. orElse(0.0) : 요소가 없다면 (null) 없을 때, 기본 평균값을 지정
        // TODO 1: stream -> mapToInt(Student::getScore) -> average -> orElse(0.0)로 평균을 구하세요.
        students.stream().mapToInt(Student::getScore).average().orElse(0.0);
    }
}
