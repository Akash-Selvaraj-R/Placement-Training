/*
HIERARCHICAL INHERITANCE
In this type of inheritance, a derived class inherits from more than one base class. 
*/

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
public class hierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}

/*
OUTPUT:
Animal is eating
Dog is barking
Animal is eating
Cat is meowing
 */
