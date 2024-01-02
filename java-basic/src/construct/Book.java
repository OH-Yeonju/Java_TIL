package construct;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("제목", "작가", 500);
    }

    Book(String title, String author) {
        this(title, author, 500);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목 : " + title + ", 작가 : " + author + " , 페이지수 : " + page);
    }
}
