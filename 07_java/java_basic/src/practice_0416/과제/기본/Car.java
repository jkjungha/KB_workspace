package practice_0416.과제.기본;

public class Car {
    String model;  //초기값 : null
//    boolean start; //초기값 : false
    private int speed;     //초기값 : 0

    String company = "현대자동차";
    int maxSpeed;

    int gas;

    private boolean stop;
    String color;

    public Car(){}

    public Car(String model){
//        this.model = model;
        this(model, "검정", 250);
    }

    public Car(String model, String color){
//        this.model = model;
//        this.color = color;
        this(model, color, 250);
    }

    public Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

//    public Car(String model, String color, int speed) {
//        this.model = model;
//        this.color = color;
//        this.speed = speed;
//    }

    public void setGas(int gas){
        this.gas = gas;
    }

    public boolean isLeftGas(){
        if(this.gas == 0){
            System.out.println("gas가 없습니다.");
            return false;
        }else {
            System.out.println("gas가 있습니다.");
            return true;
        }
    }

//    public void run(){
//        if(this.gas > 0){
//            System.out.println("출발합니다.");
//        }else{
//            System.out.println("gas를 주입하세요.");
//            return;
//        }
//        while(this.gas > 0){
//            System.out.println("달립니다.(gas잔량: "+this.gas+")");
//            this.gas--;
//        }
//        System.out.println("멈춥니다.(gas잔량: "+this.gas+")");
//        System.out.println("gas를 주입하세요.");
//    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if(speed <= 0){
            this.speed = 0;
        }else {
            this.speed = speed;
        }
        printSpeed();
    }

    public void run(){
        System.out.println(this.model+"이/가 달립니다.(시속: "+this.speed+"km/h)");
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        if(stop){
            this.speed = 0;
        }
        this.stop = stop;
    }

    public void printSpeed(){
        System.out.println("현재 속도 : "+this.speed);
    }
}
