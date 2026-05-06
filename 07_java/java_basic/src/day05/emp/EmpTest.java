package day05.emp;

public class EmpTest {
    public static void main(String[] args) {

        RempVO vo = new RempVO();   //RempVO vo 인스턴스 생성
        vo.name = "홍길동";
        vo.deptid = "1111";
        System.out.println(vo.name  + "deptid : " + vo.deptid);

        // 김승리 사원의 정보는 나이 30, 전화번호: 010-2222-3333
        // 입사일: 2010.01.01 부서 : 개발부  결혼: 기혼

        Employee 김승리 = new Employee();
        김승리.name = "김승리";
        김승리.age = 30;
        김승리.phone = "010-2222-333";
        김승리.empDate = "2010-01-01";
        김승리.dept = "개발부";
        김승리.marriage = true;
        //김승리.deptid =

        System.out.printf("사원명 : %s 나이: %d 전화번호 : %s  입사일 : %s ", 김승리.name,김승리.age,김승리.phone,김승리.empDate);
    }
}
