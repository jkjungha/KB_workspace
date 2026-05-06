package day05.objectCasting;

import day05.dogcat.hire.Cat;
import day05.dogcat.hire.Animal;
import day05.dogcat.hire.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        //Animal => Dog, Cat

        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

        // ani.night();
        ((Cat)ani).night(); //다운 캐스팅

    }
}
