/*
MULTIPLE INHERITANCE::
In multiple inheritance, a class can inherit properties from more than one base class.
This is called multiple inheritance.
*/

interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }
    public void show() {
        System.out.println("Showing...");
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        obj.show();
    }
}
