package javapractice.miniproject1;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<Book> checkedOutBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.checkedOutBooks = new ArrayList<>();
    }

    public boolean checkOutBook(Book book) {
        if (book.checkOut()) {
            checkedOutBooks.add(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if (checkedOutBooks.contains(book) && book.returnBook()) {
            checkedOutBooks.remove(book);
            return true;
        }
        return false;
    }

    public String getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        StringBuilder books = new StringBuilder();
        for (Book book : checkedOutBooks) {
            books.append(book.getTitle()).append(", ");
        }
        return "Member Name: " + name + ", Member ID: " + memberId + ", Checked Out Books: " + books.toString();
    }
}
