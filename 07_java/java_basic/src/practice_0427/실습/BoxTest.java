package practice_0427.실습;

public class BoxTest {
    public static void main(String[] args) {
//        Box<Integer> box1 = new Box<>();
//        box1.setWidth(10);
//        box1.setHeight(10);
//        System.out.println(box1.getWidth());
        Doll 인형 = new Doll();
        Doll 둘리인형 = new Doll();
        Box<Doll> box = new Box<>();
        box.setContent(둘리인형);
        System.out.println(box.getContent().type);
    }
}
class Box<T>{
    private T content;
//    private T width;
//    private T height;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    }

//    public T getWidth() {
//        return width;
//    }
//
//    public void setWidth(T width) {
//        this.width = width;
//    }
//
//    public T getHeight() {
//        return height;
//    }
//
//    public void setHeight(T height) {
//        this.height = height;
//    }
}
class Doll{
    String type = "둘리인형";
}
