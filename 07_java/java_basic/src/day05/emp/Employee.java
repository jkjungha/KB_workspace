package day05.emp;

public class Employee extends  Object{
    protected String name;   //사원명
    protected int age;  //나이
    protected String phone; //전화번호
    protected String empDate;   //입사일
    protected String dept;   //부서
    protected boolean marriage;  //결혼여부

    Employee(){
        super();
    }
    Employee(String name, int age, String phone, String empDate,String dept,boolean marriage){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;

    }
}
