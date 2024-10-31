import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Add Patron");
            System.out.println("5. View Patrons");
            System.out.println("6. Delete Patron");
            System.out.println("7. Borrow Book");
            System.out.println("8. Return Book");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter book ID to delete: ");
                    String bookId = scanner.nextLine();
                    library.deleteBook(bookId);
                    break;
                case 4:
                    System.out.print("Enter patron name: ");
                    String name = scanner.nextLine();
                    library.addPatron(name);
                    break;
                case 5:
                    library.viewPatrons();
                    break;
                case 6:
                    System.out.print("Enter patron ID to delete: ");
                    String patronId = scanner.nextLine();
                    library.deletePatron(patronId);
                    break;
                case 7:
                    System.out.print("Enter book ID to borrow: ");
                    bookId = scanner.nextLine();
                    System.out.print("Enter patron ID: ");
                    patronId = scanner.nextLine();
                    library.borrowBook(bookId, patronId);
                    break;
                case 8:
                    System.out.print("Enter book ID to return: ");
                    bookId = scanner.nextLine();
                    library.returnBook(bookId);
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
