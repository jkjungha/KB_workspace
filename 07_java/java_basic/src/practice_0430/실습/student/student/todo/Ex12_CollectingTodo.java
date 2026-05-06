package practice_0430.실습.student.student.todo;

import practice_0430.실습.student.common.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex12_CollectingTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("홍길동", "남", 92),
            new Student("김수영", "여", 87),
            new Student("감자바", "남", 95),
            new Student("오해영", "여", 93)
        );

        // TODO 1: 남학생만 List로 수집
        //collect() 최종처리 메서드 -> 스트림 요소를 최종 처리하는 메서드
        List<Student> list = students.stream().filter(i -> i.getSex().equals("남")).collect(Collectors.toList());
        // TODO 2: 이름을 key, 점수를 value로 Map 수집
        Map<String, Integer> scoreMap = students.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
        // TODO 3: 성별 기준 groupingBy로 그룹핑
        //특정 기준으로 요소를 그룹핑 할 때 사용
        Map<String, List<Student>> bySex = students.stream().collect(Collectors.groupingBy(Student::getSex));
        // TODO 4: 성별 기준 평균 점수 Map을 수집
        Map<String, Double> byAvg = students.stream().collect(Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getScore)));

        System.out.println("Todo 1 : "+list);
        System.out.println("Todo 2 : "+scoreMap);
        System.out.println("Todo 3 : "+bySex);
        System.out.println("Todo 4 : "+byAvg);
    }
}
