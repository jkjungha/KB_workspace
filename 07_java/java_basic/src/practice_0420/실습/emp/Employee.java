package practice_0420.실습.emp;

public class Employee {
    protected String name;
    protected int age;
    protected String phone;
    protected String empdate;
    protected String dept;
    protected boolean marriage;

    public Employee() {
    }

    public Employee(String name, int age, String phone, String dept, String empdate, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.dept = dept;
        this.empdate = empdate;
        this.marriage = marriage;
    }
}
