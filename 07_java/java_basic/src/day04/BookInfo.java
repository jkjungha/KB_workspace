package day04;

import java.util.Scanner;

public class BookInfo {

    public static void main(String[] args) {
        String title,publishing,author,isbn;
        int price,page;
        Scanner input = new Scanner(System.in);
        System.out.print("책 제목 입력 : ");
        title = input.nextLine();
        System.out.print("책 가격 입력");
        price = input.nextInt();
        publishing = input.next();
        author = input.next();
        isbn = input.next();

        System.out.printf("책 제목 : %s\n",title);
        System.out.printf("책 가격 : %d\n",price);
        System.out.printf("출판사 : %s\n",publishing);
        System.out.printf("책 저자 : %s\n",author);
        System.out.printf("책 ISBN : %s\n",isbn);

    }
}
