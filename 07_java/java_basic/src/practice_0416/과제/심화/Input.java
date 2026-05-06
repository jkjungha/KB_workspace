package practice_0416.과제.심화;

import java.util.Scanner;

public class Input {
    private static Scanner scan = new Scanner(System.in);
    private boolean defaultValue = true;

    public static String read(String title){
        System.out.print(title+" : ");
        String input = scan.nextLine();
        System.out.println("입력값 : "+input);
        return input;
    }

    public static String read(String title, String defaultValue){
        System.out.print(title+"("+defaultValue+") : ");
        String input = scan.nextLine();
        if(!input.isEmpty()){
            defaultValue = input;
        }
        System.out.println("입력값 : "+defaultValue);
        return defaultValue;
    }

    public static int readInt(String title){
        System.out.print(title+" : ");
        String input = scan.nextLine();
        int inputInt = Integer.parseInt(input);
        System.out.println("입력값 : "+inputInt);
        return inputInt;
    }

    public static boolean confirm(String title, boolean defaultValue){
        System.out.print(title);
        if(defaultValue){
            System.out.print(" (Y/n) : ");
        }else{
            System.out.print(" (y/N) : ");
        }
        String input = scan.nextLine();
        if(!input.isEmpty()){
            defaultValue = false;
        }
        System.out.println("입력값 : "+defaultValue);
        return defaultValue;
    }

    public static boolean confirm(String title){
        return confirm(title, true);
    }
}
