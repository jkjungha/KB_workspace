package practice_0427.실습.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardListTest {
    public static void main(String[] args) {
        List<Board> list1 = new ArrayList<Board>();
        list1.add(new Board("제목1", "내용1", "sym"));
        list1.add(new Board("제목2", "내용1", "sym"));
        list1.add(new Board("제목3", "내용1", "sym"));

        System.out.println("현재 게시판의 글의 수 : "+list1.size()+"개");

        for (Board board : list1) {
            System.out.println("책 제목 : "+board.getSubject());
            System.out.println("책 내용 : "+board.getContent());
            System.out.println("글쓴이 : "+board.getWriter());
        }

        list1.remove(2);

        System.out.println();
        printBoard(list1);
//        for (Board board : list1) {
//            System.out.println("책 제목 : "+board.getSubject());
//            System.out.println("책 내용 : "+board.getContent());
//            System.out.println("글쓴이 : "+board.getWriter());
//            System.out.println();
//        }

    }

    private static void printBoard(List<Board> list1) {
        for (Board board : list1) {
            System.out.println("책 제목 : "+board.getSubject());
            System.out.println("책 내용 : "+board.getContent());
            System.out.println("글쓴이 : "+board.getWriter());
        }
    }
}
