package practice_0428.실습.collection.p09;

import java.util.ArrayList;
import java.util.List;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    public StudentTodo(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 리스트 생성
        List<StudentTodo> list = new ArrayList<>();
        // TODO 3: 객체 3개 추가
        list.add(new StudentTodo("홍길동", 90));
        list.add(new StudentTodo("김정하", 100));
        list.add(new StudentTodo("정나은",80));
        // TODO 4: 평균 점수 출력
        int sum = 0;
        int count = 0;
        for(StudentTodo s : list){
            sum += s.score;
            count++;
        }
        System.out.println("평균 : "+(double)sum/count);
    }
}
