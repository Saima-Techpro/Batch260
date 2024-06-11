package javapractice.miniproject1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isCheckedOut;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = false;
    }

    public boolean checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            return true;
        }
        return false;
    }

    // Getter for isbn
    public String getIsbn() {
        return isbn;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Checked Out: " + isCheckedOut;
    }
}
