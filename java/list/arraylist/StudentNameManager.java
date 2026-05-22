import java.util.ArrayList;
import java.util.Scanner;

public class StudentNameManager{
    private static ArrayList<String> studentNames = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean running = true;
         while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            // Consume the leftover newline character after reading the integer
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudentName();
                    break;
                case 2:
                    removeStudentName();
                    break;
                case 3:
                    searchStudentName();
                    break;
                case 4:
                    displayStudentNames();
                    break;
                case 5:
                    running = false;
                    System.out.println("already exists!");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("1. add");
        System.out.println("2. remove");
        System.out.println("3. search");
        System.out.println("4. display");
        System.out.println("5. exit");
        System.out.print("ur choice: ");
    } 
    private static void addStudentName() {
        System.out.print("name: ");
        String name = scanner.nextLine();
        studentNames.add(name);
    }
    private static void removeStudentName() {
        System.out.println("to remove? : ");
        String name = scanner.nextLine();
        if (studentNames.contains(name)) {
            studentNames.remove(name);
            System.out.println("removed");
        } else {
            System.out.println("not found");
        }
    }
    private static void searchStudentName(){
        System.out.println("to search? : ");
        String name = scanner.nextLine();
        if (studentNames.contains(name)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
    private static void displayStudentNames() {
        String formatted = studentNames.toString()
        .replace("[", "['")
        .replace("]", "']")
        .replace(", ", "','");
        System.out.println(formatted);
}
}
