package Book;

public class Book {
    private String title;
    private String author;

    private Book(String title, String author) {
        this.title = title;
        this.author = author;

    }
    public static Book createBook(String title, String author) {
        return new Book(title, author);
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}