package practice_0416.과제.심화;

public class InputTest {
    public static void main(String[] args) {
        Input.read("이름");
        Input.read("이름", "홍길동");
        Input.readInt("나이");
        Input.confirm("종료할까요?",true);
        Input.confirm("종료할까요?");
    }
}
