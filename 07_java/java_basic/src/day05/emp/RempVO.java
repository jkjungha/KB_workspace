package day05.emp;

public final class RempVO extends Employee{

    public String deptid;   //부서코드

    RempVO(){
        super();  // 나의 부모의 생성자를 호출
    }   //기본생성자

    RempVO(String name,int age,String phone,String empDate,String dept,boolean marriage){
        super(name,age,phone,empDate,dept,marriage);
    }
}
