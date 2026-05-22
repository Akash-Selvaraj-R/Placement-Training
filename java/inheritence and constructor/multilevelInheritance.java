/*
MULTILEVEL INHERITENCE

In multiple inheritance, a class can inherit properties from more than one base class
This is called multiple inheritance.
*/

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}
class SportsCar extends Car {
    void boost(){
        System.out.println("SportsCar is boosting");
    }
}
class multilevelInheritance {
    public static void main(String[] args) {
        SportsCar s = new SportsCar();
        s.run();
        s.drive();
        s.boost();
    }
}

/*
OUTPUT:
Vehicle is running
Car is driving
SportsCar is boosting
 */
