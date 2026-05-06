package practice_0423.prob3;

public abstract class Account {
    private String accId;
    private long balance;
    private String ownerName;

    public Account(){

    }

    public Account(String accId, long balance, String ownerName){
        this.accId = accId;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public abstract void calcRate();

    public void deposit(long amount){
        this.balance = this.balance + amount;
    }

    public void withdraw(long amount){
        this.balance = this.balance - amount;
    }

    public long getBalance(){
        return this.balance;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
