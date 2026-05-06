package practice_0423.prob1;

public class Alcohol extends Drink {
    public double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price,count);
        this.alcper = alcper;
    }

    @Override
    public void printTitle(){
        System.out.println("상품명(도수[%])    단가   수량   금액");
    }

    @Override
    public void printData(){
        int total = this.getTotalPrice();
        System.out.printf("%s(%.1f)       %d   %d    %d", this.name, this.alcper, this.price, this.count, total);
    }
}
