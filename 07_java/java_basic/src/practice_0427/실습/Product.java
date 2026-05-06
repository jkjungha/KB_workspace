package practice_0427.실습;

public class Product<K, M> {// 타입 파라메터 K, V 선언
    private K kind;
    private M model;//타입 파라메터를 필드 타입으로 선언

    public K getKind(){
        return this.kind;
    }

    public void setKind(K kind){
        this.kind = kind;
    }

    public M getModel(){
        return this.model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
