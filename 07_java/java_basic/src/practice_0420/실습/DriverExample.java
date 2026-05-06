package practice_0420.실습;

import java.util.Scanner;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Scanner input = new Scanner(System.in);

        System.out.println("운전할 차를 선택하세요. 1) Taxi | 2) Bus | 3) Truck");
        System.out.print("입력값 : ");
        int num = input.nextInt();
//        if(i == 1){
//            Taxi taxi = new Taxi();
//            driver.drive(taxi);
//        }else if(i == 2){
//            Bus bus = new Bus();
//            driver.drive(bus);
//        }

        Vehicle cars[] = {
                new Taxi(),
                new Bus(),
                new Truck()
        };

//        for(Vehicle v : cars){
//            v.run();
//        }

        cars[num-1].run();
    }
}
