//LIBRARY MANAGEMENT SYSTEM 
//Problem statmment : create Book class with private fields: title,author,available. provide methods to borrowbook() and returnbook() and book is available or not 
//simple java progam withour using override method

// LIBRARY MANAGEMENT SYSTEM - Improved Version

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // New book is always available initially
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("✅ SUCCESS: \"" + title + "\" by " + author + " has been borrowed.");
        } else {
            System.out.println("❌ SORRY: \"" + title + "\" is currently NOT AVAILABLE.");
        }
    }

    public void returnBook() {
        if (!available) {  // Only allow return if it was borrowed
            available = true;
            System.out.println("✅ Thank you! \"" + title + "\" has been returned successfully.");
        } else {
            System.out.println("⚠️  \"" + title + "\" was not borrowed. No action taken.");
        }
    }

    // toString method (without @Override as requested)
    public String toString() {
        String status = available ? "Available ✔️" : "Not Available ❌";
        return "Book [Title: '" + title + "', Author: '" + author + "', Status: " + status + "]";
    }

    // Main method to test the system
    public static void LibraryManagementSystem(String[] args) {
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM ===\n");

        // Creating multiple books
        Book book1 = new Book("The Tempest", "William Shakespeare");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen");
        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Display all books initially
        System.out.println("Initial Library Stock:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println();

        // Testing borrowing
        System.out.println("--- Borrowing Books ---");
        book1.borrowBook();  // Should succeed
        book2.borrowBook();  // Should succeed
        book1.borrowBook();  // Already borrowed → show not available
        book3.borrowBook();  // Should succeed

        System.out.println("\nCurrent Status After Borrowing:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println();

        // Testing returning
        System.out.println("--- Returning Books ---");
        book1.returnBook();  // Should succeed
        book1.returnBook();  // Already available → show message
        book4.borrowBook();  // Borrow one more

        System.out.println("\nFinal Library Status:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
    }
}


/*
class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently not available.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book("Tempest", "William Shakespeare");
        System.out.println(book1);
        
        book1.borrowBook();
        System.out.println(book1);
        
        book1.returnBook();
        System.out.println(book1);
}

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently not available.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("Tempest", "William Shakespeare");
        System.out.println(book1);
        
        book1.borrowBook();
        System.out.println(book1);
    }
}

*/