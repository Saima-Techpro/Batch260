package javapractice.miniproject1;

public class Runner {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "1234567891");

        // Create some members
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        // Create a library
        Library library = new Library();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Add members to the library
        library.addMember(member1);
        library.addMember(member2);

        // Member checks out a book
        System.out.println(member1.checkOutBook(book1));  // Should print true
        System.out.println(member1);  // Should show book1 in the checked out books list

        // Member tries to check out the same book again
        System.out.println(member2.checkOutBook(book1));  // Should print false

        // Member returns the book
        System.out.println(member1.returnBook(book1));  // Should print true
        System.out.println(member1);  // Should show no books in the checked out books list

        // Library status
        System.out.println(library);  // Should show 2 books and 2 members
    }
}
