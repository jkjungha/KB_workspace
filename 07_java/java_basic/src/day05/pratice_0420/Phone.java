package day05.pratice_0420;

public class Phone {
    public  String model;
    public  String color;

    public Phone(){
        this.phoneInfo();
    }
    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        this.phoneInfo();
    }

    public void phoneInfo(){
        System.out.println("모델 : " + this.model);
        System.out.println("색상 : " + this.color);
    }

}
