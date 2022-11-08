package librarySystem.entity;

public class Book {
    private int id;
    private String bookName;
    private int authorId;

    public Book(int id, String bookName, int authorId) {
        this.id = id;
        this.bookName = bookName;
        this.authorId = authorId;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
