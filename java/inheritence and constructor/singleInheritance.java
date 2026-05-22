/*
SINGLE INHERITANCE:
In single inheritance, a class can inherit properties from only one base class
*/

class Animal{
    void eat(){
        System.out.println("animal is eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking...");
    }
}
class singleInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}

/*
OUTPUT
animal is eating...
dog is barking...
*/