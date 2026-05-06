package practice_0420.실습.emp;

public class RempVO extends Employee{
    public String deptid;
    
    RempVO(){
        super();
    }
    
    RempVO(String name, int age, String phone,String empDate, String dept, boolean marriage){
        super(name, age, phone, empDate, dept, marriage);
    }

}
