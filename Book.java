package GitPush;


    import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String isbn;

    private static List<Book> collection = new ArrayList<>();

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title.trim();
        this.author = author.trim();
        this.isbn = isbn.trim();
    }

    // Add book to list
    public void addBook() {
        collection.add(this);
        System.out.println("Book added: " + this);
    }

    // Remove book by title, author, or ISBN
    public static void removeBook(String keyword) {
        keyword = keyword.trim().toLowerCase();
        boolean found = false;
        List<Book> toRemove = new ArrayList<>();

        for (Book book : collection) {
            if (book.title.toLowerCase().equals(keyword)
             || book.author.toLowerCase().equals(keyword)
             || book.isbn.toLowerCase().equals(keyword)) {
                toRemove.add(book);
                found = true;
            }
        }

        collection.removeAll(toRemove);

        if (found) {
            System.out.println("Book(s) removed with keyword: " + keyword);
        } else {
            System.out.println("No matching book found for: " + keyword);
        }
    }

    // List all books
    public static void listBooks() {
        if (collection.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("\nBooks in the collection:");
            for (Book b : collection) {
                System.out.println(" - " + b);
            }
        }
    }

    // Format book info
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (ISBN: " + isbn + ")";
    }

    // Main method with user interaction
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;



        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Add a book");
            System.out.println("2 - Remove a book");
            System.out.println("3 - List all books");
            System.out.println("4 - Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();

                    new Book(title, author, isbn).addBook();
                    break;

                case "2":
                    System.out.print("Enter title, author, or ISBN to remove: ");
                    String keyword = scanner.nextLine();
                    removeBook(keyword);
                    break;

                case "3":
                    listBooks();
                    break;

                case "4":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}


