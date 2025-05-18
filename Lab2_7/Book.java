package Lab2_7;


public class Book {
    String author;
    String title;
    int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public void showInfo() {
        System.out.println("Автор: " + author);
        System.out.println("Назва: " + title);
        System.out.println("Сторінок: " + pages);
    }
}
