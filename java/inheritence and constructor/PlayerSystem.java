/*
create an interface "player" with method "play"
create an abstract class " spors person " with common properties like name
create class "crickter" and "foorballer" which will extend sportsperson and implement player interface
*/
interface Player {
    void play();
}
abstract class Sportsperson {
    String name;

    Sportsperson(String name) {
        this.name = name;
    }

    abstract void display();
}
class Cricketer extends Sportsperson implements Player {
    Cricketer(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing cricket.");
    }

    @Override
    void display() {
        System.out.println("Cricketer Name: " + name);
    }
}
class Footballer extends Sportsperson implements Player {
    Footballer(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing soccer.");
    }

    @Override
    void display() {
        System.out.println("Footballer Name: " + name);
    }
}
public class PlayerSystem {
    public static void main(String[] args) {
        Sportsperson cricketer = new Cricketer("MS Dhoni");
        cricketer.display();
        ((Player) cricketer).play();

        Sportsperson footballer = new Footballer("Cristiano Ronaldo");
        footballer.display();
        ((Player) footballer).play();
    }
}

// Output:
// Cricketer Name: Sachin Tendulkar
// Sachin Tendulkar is playing cricket.
// Footballer Name: Lionel Messi
// Lionel Messi is playing football.
