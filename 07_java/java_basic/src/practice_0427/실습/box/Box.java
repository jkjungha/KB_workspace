package practice_0427.실습.box;

//어떤 물건이든 담을 수 있는 박스 클래스 만드세요
public class Box<T> {
    public T content;

    //박스에 담긴 내용물이 같은 물건인지 판단하는 기능
    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    }
}
