package Lab2_7;

public class DigitalBook extends Book {

    String format;
    double fileSizeMB;

    public DigitalBook(String author, String title, int pages, String format, double fileSizeMB) {
        super(author, title, pages);
        this.format = format;
        this.fileSizeMB = fileSizeMB;
    }

    public void showFullInfo() {
        showInfo();
        System.out.println("Формат: " + format);
        System.out.println("Розмір файлу: " + fileSizeMB + " MB");
    }
}