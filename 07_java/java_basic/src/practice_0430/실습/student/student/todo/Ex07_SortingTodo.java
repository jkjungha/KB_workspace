package practice_0430.실습.student.student.todo;

import practice_0430.실습.student.common.Student;

import java.util.Comparator;
import java.util.List;

public class Ex07_SortingTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("홍길동", "남", 30),
            new Student("신용권", "남", 10),
            new Student("유미선", "여", 20)
        );

        // TODO 1: 점수 오름차순 정렬 후 출력
//        students.stream().sorted((o1, o2)-> Integer.compare(o1.getScore(), o2.getScore())).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getScore)).forEach(System.out::println);
        System.out.println();
        // TODO 2: 점수 내림차순 정렬 후 출력
//        students.stream().sorted((o1, o2)-> Integer.compare(o2.getScore(), o1.getScore())).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getScore).reversed()).forEach(System.out::println);
        System.out.println();
    }
}
