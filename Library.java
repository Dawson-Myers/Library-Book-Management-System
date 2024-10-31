import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    // Book Management
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void deleteBook(String id) {
        books.removeIf(book -> book.getId().equals(id));
        System.out.println("Book deleted successfully.");
    }

    // Patron Management
    public void addPatron(String name) {
        patrons.add(new Patron(name));
        System.out.println("Patron added successfully.");
    }

    public void viewPatrons() {
        if (patrons.isEmpty()) {
            System.out.println("No patrons available.");
        } else {
            for (Patron patron : patrons) {
                System.out.println(patron);
            }
        }
    }

    public void deletePatron(String id) {
        patrons.removeIf(patron -> patron.getId().equals(id));
        System.out.println("Patron deleted successfully.");
    }

    // Borrowing and Returning
    public void borrowBook(String bookId, String patronId) {
        Book bookToBorrow = null;
        Patron borrowingPatron = null;

        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                bookToBorrow = book;
                break;
            }
        }

        for (Patron patron : patrons) {
            if (patron.getId().equals(patronId)) {
                borrowingPatron = patron;
                break;
            }
        }

        if (bookToBorrow != null && borrowingPatron != null) {
            bookToBorrow.borrowBook();
            System.out.println(borrowingPatron.getName() + " borrowed " + bookToBorrow.getTitle());
        } else {
            System.out.println("Invalid book or patron ID.");
        }
    }

    public void returnBook(String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid book ID.");
    }
}
