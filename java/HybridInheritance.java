/*
HYBRID INHERITANCE:
In hybrid inheritance, a class can inherit properties from multiple base classes,
but it is a combination of single and multiple inheritance.
*/

interface A {
    void methodA();
}
interface B {
    void methodB();
}
interface C extends A, B {
    void methodC();
}
class D implements C {
    public void methodA() {
        System.out.println("Method A from interface A");
    }
    public void methodB() {
        System.out.println("Method B from interface B");
    }
    public void methodC() {
        System.out.println("Method C from interface C");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}