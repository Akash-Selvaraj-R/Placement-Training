/*

Q1) simple java code for paramaterized constructor
```java
class Student{
    int id;
    String name;
    Student(int i, String n){ //Parameterized Constructor
        id = i;
        name = n;
    }
    void display(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public static void main(String args[]){
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        s1.display();
        s2.display();
    }
}
output:
ID: 1, Name: Alice
ID: 2, Name: Bob
```

Q2) simple java code for Constructor overloading
```java
class Student{
    int id;
    String name;
    Student(int i, String n){ //Parameterized Constructor
        id = i;
        name = n;
    }
    Student(){ //Default Constructor
        id = 0;
        name = "Unknown";
    }
    void display(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public static void main(String args[]){
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student();
        s1.display();
        s2.display();
    }
}
output:
ID: 1, Name: Alice
ID: 0, Name: Unknown
```

Q3) simple java code for using this keyword
```java
class Student{
    int id;
    String name;
    Student(int i, String n){ //Parameterized Constructor
        id = i;
        name = n;
    }
    void display(){ 
        System.out.println("ID: " + this.id + ", Name: " + this.name);
    }
    public static void main(String args[]){
        Student s1 = new Student(1, "Alice");
        s1.display();
    }
}
output:
ID: 1, Name: Alice
```

Q4) simple java code for method overloading
```java
class Student{
    int id;
    String name;
    void setData(int i, String n){ //Method with 2 parameters
        id = i;
        name = n;
    }
    void setData(int i){ //Method with 1 parameter
        id = i;
        name = "Unknown";
    }
    void display(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setData(1, "Alice");
        s1.display();
        
        Student s2 = new Student();
        s2.setData(2);
        s2.display();
    }
}
output:
ID: 1, Name: Alice
ID: 2, Name: Unknown
```

Q5) simple java code for encapsulation
```java
class Student{
    private int id; //private variable
    private String name; //private variable

    //Getter for id
    public int getId(){
        return id;
    }

    //Setter for id
    public void setId(int i){
        id = i;
    }

    //Getter for name
    public String getName(){
        return name;
    }

    //Setter for name
    public void setName(String n){
        name = n;
    }

    public static void main(String args[]){
        Student s = new Student();
        s.setId(1);
        s.setName("Alice");
        System.out.println("ID: " + s.getId() + ", Name: " + s.getName());
    }
}
output:
ID: 1, Name: Alice
```

*/