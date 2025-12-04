import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextFloat();
        
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("CGPA   : " + cgpa);

        scanner.close();
    }
}