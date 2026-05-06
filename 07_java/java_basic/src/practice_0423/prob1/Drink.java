package practice_0423.prob1;

public class Drink {
    public String name;
    public int price;
    public int count;

    public Drink(){

    }

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice(){
        return price*count;
    }

    public void printTitle(){
        System.out.println("상품명   단가   수량   금액");
    }

    public void printData(){
        int total = this.getTotalPrice();
        System.out.printf("%s      %d    %d    %d\n", this.name, this.price, this.count, total);
    }
}
