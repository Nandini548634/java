class Book {

    int bookId;
    String title;
    String author;

    // Constructor with two parameters
    Book(int bookId, String title) {
        this(bookId, title, "Unknown Author");
    }

    // Constructor with three parameters
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------------");
    }
}

public class Main32 {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming");

        Book b2 = new Book(102, "Python Programming", "James Gosling");

        b1.displayBook();
        b2.displayBook();
    }
}