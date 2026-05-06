package practice_0427.실습;

public class SampleTest1 {
    public static void main(String[] args) {
        Sample1<String> sample1 = new Sample1<>();
        sample1.addElement("This is string", 5);
        System.out.println(sample1.getElement(5));
    }
}
interface ISample<T> {
    public void addElement(T t, int index);
    public T getElement(int index);
}

class Sample1<T> implements ISample<T> {
    private T[] array;

    public Sample1() {
        array = (T[]) new Object[10];
    }

    @Override
    public void addElement(T element, int index) {
        array[index] = element;
    }

    @Override
    public T getElement(int index) {
        return array[index];
    }
}
