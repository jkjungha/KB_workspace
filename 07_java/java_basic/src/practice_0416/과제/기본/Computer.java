package practice_0416.과제.기본;

public class Computer {
    public int sum(int ...args) {
        int r = 0;
        for(int i : args){
            r += i;
        }
        return r;
    }
}
