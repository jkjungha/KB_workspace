package practice_0423.prob2;

public class Tv {
    protected String color;
    protected boolean power;
    protected int channel;

    public Tv(){
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void power(){
        this.power = !this.power;
    }

    public void channelUp(){
        this.channel++;
    }

    public void channelDown(){
        this.channel--;
    }

    public void print(){
        System.out.printf("color:%s \tpower :%b \tchannel:%d\n", this.color, this.power, this.channel);
    }
}
