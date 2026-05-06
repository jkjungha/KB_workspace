package practice_0427.실습;

class Tv{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "model='" + model + '\'' +
                '}';
    }
}
class Radio{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
public class ProductTest {
    public static void main(String[] args) {
        Product<Tv, String> p1 = new Product<>();
        p1.setKind(new Tv());
        p1.setModel("스마트TV");
        System.out.println("제품종류 : "+p1.getKind());
        System.out.println("제품모델 : "+p1.getModel());
    }
}
