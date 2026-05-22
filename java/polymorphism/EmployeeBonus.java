/*
in company, employee are trow types : permenant and contractual, and bonus depends on employee types
in simple polymorphism method with constructor
*/

class Employee{
    String name;
    int salary;
}
class Permenant extends Employee{
    Permenant(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void bonus(){
        System.out.println(name + " : " + salary + " : " + (salary * 0.2));
    }
}
class Contractual extends Employee{
    Contractual(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void bonus(){
        System.out.println(name + " : " + salary + " : " + (salary * 0.1));
    }
}
public class EmployeeBonus {
    public static void main(String[] args){
        Permenant p = new Permenant("Yinlin", 50000);
        p.bonus(); 

        Contractual c = new Contractual("Changli", 30000);
        c.bonus();
    }
}