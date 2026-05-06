package practice_0428.실습.수업;

public class PrintCommand implements Command{
    @Override
    public void execute() {
        System.out.println("=================");
        System.out.println("Print command");
        System.out.println("=================");
        System.out.println();
    }
}
