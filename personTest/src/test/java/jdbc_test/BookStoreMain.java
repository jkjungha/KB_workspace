package jdbc_test;

import com.example.bookstore.domain.Book;
import com.example.bookstore.service.BookService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * BookStoreMain
 * ------------------------------------------------------------
 *  요구사항을 기반으로 구현한 콘솔 프로그램입니다.
 *
 * 입력 방식:
 *
 * - BufferedReader를 사용
 *
 * 종료 조건:
 * - 반드시 메뉴에서 0번을 입력했을 때만 종료
 */
public class BookStoreMain {

    private final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    private final BookService bookService =
            new BookService();

    public static void main(String[] args) {
        new BookStoreMain().menu();
    }

    public void menu() {
        while (true) {
            printMenu();

            int menuNo = readInt("번호를 선택하세요 : ");

            try {
                switch (menuNo) {
                    case 1 -> register();
                    case 2 -> modify();
                    case 3 -> delete();
                    case 4 -> search();
                    case 5 -> list();
                    case 0 -> {
                        exit();
                        return;
                    }
                    default -> System.out.println("잘못된 번호입니다.");
                }
            } catch (Exception e) {
                System.out.println("처리 중 오류 발생 : " + e.getMessage());
            }
        }
    }

    private void printMenu() {
        System.out.println("=============== 번호 선택 ===============");
        System.out.println("1. 도서등록");
        System.out.println("2. 도서수정");
        System.out.println("3. 도서삭제");
        System.out.println("4. 도서검색");
        System.out.println("5. 도서리스트");
        System.out.println("-----------------------------------------");
        System.out.println("0. 프로그램 종료");
        System.out.println("=========================================");
    }

    private void register() throws Exception {
        System.out.println("----- 등록할 도서정보 입력 -----");

        int isbn = readInt("ISBN : ");
        String title = readString("도서명 : ");
        String writer = readString("저자 : ");
        int price = readInt("가격 : ");

        Book book = new Book(isbn, title, writer, price);

        int result = bookService.register(book);

        if (result > 0) {
            System.out.println("도서 등록 완료!!");
        }
    }

    private void modify() throws Exception {
        System.out.println("----- 수정할 도서정보 입력 -----");

        int isbn = readInt("ISBN : ");
        int price = readInt("가격 : ");

        int result = bookService.modify(isbn, price);

        if (result > 0) {
            System.out.println("도서 수정 완료!!");
        } else {
            System.out.println("수정할 도서가 없습니다.");
        }
    }

    private void delete() throws Exception {
        System.out.println("----- 삭제할 도서정보 입력 -----");

        int isbn = readInt("ISBN : ");

        int result = bookService.delete(isbn);

        if (result > 0) {
            System.out.println("도서 삭제 완료!!");
        } else {
            System.out.println("삭제할 도서가 없습니다.");
        }
    }

    private void search() throws Exception {
        System.out.println("----- 검색할 도서정보 입력 -----");

        int isbn = readInt("ISBN : ");

        System.out.println("ISBN\t도서명\t저자\t가격");
        System.out.println("-----------------------------------------");

        bookService.search(isbn)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("검색 결과가 없습니다.")
                );
    }

    private void list() throws Exception {
        System.out.println("----- 도서리스트 -----");
        System.out.println("ISBN\t도서명\t저자\t가격");
        System.out.println("-----------------------------------------");

        List<Book> books = bookService.list();

        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        books.forEach(System.out::println);
    }

    private void exit() {
        System.out.println("프로그램을 종료합니다.");
    }

    private int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하세요.");
            } catch (Exception e) {
                throw new RuntimeException("입력 처리 중 오류가 발생했습니다.", e);
            }
        }
    }

    private String readString(String message) {
        try {
            System.out.print(message);
            return br.readLine();
        } catch (Exception e) {
            throw new RuntimeException("입력 처리 중 오류가 발생했습니다.", e);
        }
    }
}