package practice_0420.실습.dogcat;

import practice_0420.실습.dogcat.hire.Cat;
import practice_0420.실습.dogcat.hire.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
        c.night();
    }
}
