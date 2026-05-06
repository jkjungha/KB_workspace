package practice_0430.실습.student.student.todo;

import java.util.List;
import java.util.stream.IntStream;

public class Ex13_ParallelTodo {
    public static void main(String[] args) {
        List<Integer> scores = IntStream.rangeClosed(1, 1_000_000).boxed().toList();

        // TODO 1: 일반 stream으로 평균과 처리 시간을 출력하세요.
        long start = System.currentTimeMillis();
        double avg1 = scores.stream().mapToInt(i -> i).average().orElse(0.0);
        long end = System.currentTimeMillis();
        System.out.println("평균 : "+avg1+", 소요 시간 : "+(end-start));
        // TODO 2: parallelStream으로 평균과 처리 시간을 출력하세요.
        start = System.currentTimeMillis();
        double avg2 = scores.parallelStream().mapToInt(Integer::intValue).average().orElse(0.0);
        end = System.currentTimeMillis();
        System.out.println("평균 : "+avg2+", 소요 시간 : "+(end-start));
        // TODO 3: 병렬 스트림에서 공유 변수 누적이 위험한 이유를 주석으로 설명하세요.
        //병렬 스트림은 데이터를 여러 스레드에 쪼개서 동시에 처리하는데
        //외부 공유 변수에 값을 누적하면 여러 스레드가 동시에 같은 메모리 위치의 값을 읽고 수정함
        //이 과정에서 일부 연산 결과가 덮어씌워지거나 유실될 수 있어
        //최종 결과값이 매번 다르고 부정확함
    }
}
