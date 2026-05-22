/* 
import java.util.*;

public class Sdtmgnr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> m = new HashMap<>();

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Remove");
            System.out.println("4. Sort");
            System.out.println("5. Exit");
            System.out.print("Choice : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Roll no : ");
                    int roll = sc.nextInt();
                    System.out.print("Name : ");
                    String name = sc.next();
                    m.put(roll, name);
                    break;

                case 2:
                    System.out.println(m);
                    break;

                case 3:
                    System.out.print("Roll no : ");
                    int r = sc.nextInt();
                    m.remove(r);
                    break;

                case 4:
                    sort(m);
                    break;

                case 5:
                    System.out.println("Exit");
                    sc.close();
                    return;

                default:
                    System.out.println("Wrong choice");
            }

            System.out.print("Do you want to continue? (y/n): ");
            String ch = sc.next();
            if (ch.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc.close();
    }

    // Sorting function — prints entries sorted by keys
    public static void sort(Map<Integer, String> m) {
        System.out.println("Sorted:");
        m.entrySet()
         .stream()
         .sorted(Map.Entry.comparingByKey())
         .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}

*/

import java.util.*;

public class Sdtmgnr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TreeMap automatically keeps keys (roll no) sorted
        Map<Integer, String> m = new TreeMap<>();

        while (true) {
            System.out.println("\n=== Student Manager ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Remove Student");
            System.out.println("4. View Sorted List");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Roll no: ");
                    int roll = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    m.put(roll, name);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (m.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        System.out.println("All Students:");
                        for (Map.Entry<Integer, String> entry : m.entrySet()) {
                            System.out.println(entry.getKey() + " :" + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll no to remove: ");
                    int r = sc.nextInt();
                    if (m.remove(r) != null) {
                        System.out.println("Student removed!");
                    } else {
                        System.out.println("Roll no not found!");
                    }
                    break;

                case 4:
                    if (m.isEmpty()) {
                        System.out.println("No students to show!");
                    } else {
                        System.out.println("Students (Sorted by Roll No):");
                        // Normal loop instead of forEach or stream
                        for (Map.Entry<Integer, String> entry : m.entrySet()) {
                            System.out.println(entry.getKey() + " " + entry.getValue());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You! Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Wrong choice! Please try again.");
            }

            // Ask to continue - only exit if user says 'n'
            System.out.print("\nDo you want to continue? (y/n): ");
            String ch = sc.next();
            if (ch.equalsIgnoreCase("n")) {
                System.out.println("Thank You! Goodbye!");
                break;
            }
        }
        sc.close();
    }
}
