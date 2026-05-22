import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMap {
    private static final HashMap<Integer, String> students = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Student Management System using HashMap ===\n");

        // Adding initial student records
        addInitialStudents();

        // Display all students
        displayAllStudents();

        // Search student
        searchStudent();

        // Remove student
        removeStudent();

        // Final list after removal
        System.out.println("\n" + "=".repeat(50));
        System.out.println("final");
        System.out.println("=".repeat(50));
        displayAllStudents();

        scanner.close();
        System.out.println("\nThank you for using the system!");
    }

    private static void addInitialStudents() {
        students.put(101, "Aman Sharma");
        students.put(102, "Priya Singh");
        students.put(103, "Ravi Kumar");
        students.put(104, "Sneha Patel");
        students.put(105, "Karan Mehta");
        System.out.println("Added 5 students successfully.\n");
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found in the system.");
            return;
        }

        System.out.println("Total Students: " + students.size());
        System.out.println("-".repeat(40));
        System.out.printf("%-10s %-20s%n", "Roll No", "Name");
        System.out.println("-".repeat(40));

        // Sort by roll number (optional but looks professional)
        students.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> 
                    System.out.printf("%-10d %-20s%n", entry.getKey(), entry.getValue())
                );
        System.out.println("-".repeat(40) + "\n");
    }

    private static void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int roll = getIntegerInput();

        String name = students.get(roll);
        if (name != null) {
            System.out.println("Found → Roll: " + roll + " | Name: " + name);
        } else {
            System.out.println("Not Found: No student with roll number " + roll);
        }
        System.out.println();
    }

    private static void removeStudent() {
        System.out.print("Enter roll number to remove: ");
        int roll = getIntegerInput();

        String removedName = students.remove(roll);
        if (removedName != null) {
            System.out.println("Removed Successfully → Roll: " + roll + " | Name: " + removedName);
        } else {
            System.out.println("Failed: Student with roll number " + roll + " does not exist.");
        }
        System.out.println();
    }

    // Safe integer input method to prevent crashes
    private static int getIntegerInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Please enter a valid roll number: ");
            scanner.next(); // clear invalid input
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return value;
    }
}