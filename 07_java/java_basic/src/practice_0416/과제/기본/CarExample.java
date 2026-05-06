package practice_0416.과제.기본;

public class CarExample {
    public static void main(String[] args) {
//        Car myCar = new Car("그랜저", "검정", 250);

//        Car car1 = new Car();
//        System.out.println("car1.company : "+car1.company);
//        System.out.println();
//
//        Car car2 = new Car("자가용");
//        System.out.println("car2.company : "+car2.company);
//        System.out.println("car2.model : "+car2.model);
//        System.out.println();
//
//        Car car3 = new Car("자가용", "빨강");
//        System.out.println("car3.company : "+car3.company);
//        System.out.println("car3.model : "+car3.model);
//        System.out.println("car3.color : "+car3.color);
//        System.out.println();
//
//        Car car4 = new Car("택시", "검정", 200);
//        System.out.println("car4.company : "+car4.company);
//        System.out.println("car4.model : "+car4.model);
//        System.out.println("car4.color : "+car4.color);
//        System.out.println("car4.maxSpeed : "+car4.maxSpeed);

//        Car myCar = new Car();
//        myCar.setGas(5);
//        myCar.isLeftGas();
//        myCar.run();

//        Car myCar = new Car("자가용");
//        myCar.setSpeed(100);
//        System.out.println("myCar.model : "+myCar.model);
//        System.out.println("myCar.speed : "+myCar.getSpeed());
//        myCar.run();

        //객체 생성
        Car myCar = new Car();
        //잘못된 속도(-50)로 변경
        myCar.setSpeed(-50);
        //올바른 속도로 변경
        myCar.setSpeed(60);
        //멈춤
        myCar.setStop(true);
        //현재 속도 출력
        myCar.printSpeed();
    }
}
