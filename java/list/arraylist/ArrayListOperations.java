import java.util.*;
public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");
        System.out.println("Original ArrayList: " + fruits);

        System.out.println("Fruit at index 2: " + fruits.get(2));

        fruits.set(1, "Mango");
        System.out.println("Updated ArrayList: " + fruits);
        
        fruits.add(2, "Kiwi");
        System.out.println("Updated ArrayList: " + fruits);

        fruits.remove(3);
        System.out.println("Updated ArrayList: " + fruits);

        fruits.remove("Orange");
        System.out.println("Updated ArrayList: " + fruits);
        
        System.out.println("Size of ArrayList: " + fruits.size());

        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        System.out.println("For each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("iterate with iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        fruits.clear();
        System.out.println("ArrayList after clear: " + fruits);


        System.out.println("is Array empty?:"+fruits.isEmpty());
    }
}