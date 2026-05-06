package practice_0428.실습.collection.p10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student{
    private String name;
    private Integer score;
    private Integer height;

    public Student(String name, Integer score, Integer height) {
        this.name = name;
        this.score = score;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<Map<String, Object>> 구조를 사용해 학생 2명 정보 저장
        // 이름, 점수를 키 사용
        List<Map<String, Object>> students = new ArrayList<>();

        Map<String, Object> s1 = new HashMap<>();
        s1.put("이름", "홍길동");
        s1.put("점수", 90);

        Map<String, Object> s2 = new HashMap<>();
        s2.put("이름", "김진숙");
        s2.put("점수", 80);

        students.add(s1);
        students.add(s2);

        // TODO 2: 모든 학생 정보 출력
        for(Map<String, Object> student : students){
            System.out.println(student.get("이름")+" : "+student.get("점수"));
        }
    }
}
