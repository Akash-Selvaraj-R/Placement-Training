//Encapsulation using getter and setter methods in Java:

class Employee{
    private String name;
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary (double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    
    }
    public class EmployeeDemo {
        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.setName("Akash");
            emp.setSalary(5000000);
            System.out.println(emp.getName() + " earns " + emp.getSalary());
        }
    }
}
// Output: Akash earns 5000000.0