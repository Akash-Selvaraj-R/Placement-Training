// Q2: Create a parent class Employee with attributes name and salary.
// Derive Manager and Developer classes with extra attributes 
// (department for manager, programmingLanguage for developer).

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Company {
    public static void main(String[] args) {
        //Manager m = new Manager("Alice", 90000, "HR");
        //Developer d = new Developer("Bob", 80000, "Java");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter details for Manager and Developer:");
        System.out.print("Enter Manager's Name: ");
        String managerName = sc.nextLine();
        System.out.print("Enter Manager's Salary: ");
        double managerSalary = sc.nextDouble();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Manager's Department: ");
        String managerDepartment = sc.nextLine();
        Manager m = new Manager(managerName, managerSalary, managerDepartment);
        System.out.print("Enter Developer's Name: ");
        String developerName = sc.nextLine();
        System.out.print("Enter Developer's Salary: ");
        double developerSalary = sc.nextDouble();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Developer's Programming Language: ");
        String developerProgrammingLanguage = sc.nextLine();
        Developer d = new Developer(developerName, developerSalary, developerProgrammingLanguage);
        System.out.println("\nDeveloper Details:");
        d.displayDeveloper();
        System.out.println("\nManager Details:");
        m.displayManager();
        sc.close();
    }
}