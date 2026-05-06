package practice_0423.prob2;

public class BookMgr {
    private Book[] booklist;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist(){
        for (Book b : this.booklist){
            System.out.println(b.getTitle());
        }
    }

    public void printTotalPrice(){
        int sum = 0;
        for(Book b : this.booklist){
            sum += b.getPrice();
        }
        System.out.println("책 전체 각겨의 합 : "+sum);
    }
}
