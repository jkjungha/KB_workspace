package practice_0423.prob3;

public class CheckingAccount extends Account {
    private String cardNo;

    public CheckingAccount(String accId, String ownerName, long balance, String cardNo){
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }

    public void pay(String cardNo, long amount){
        long balance = super.getBalance();
        if(this.cardNo == cardNo && amount < balance){
            super.setBalance(balance - amount);
        }else {
            System.out.println("지불이 불가능합니다.");
        }
    }

    @Override
    public void calcRate() {

    }
}
