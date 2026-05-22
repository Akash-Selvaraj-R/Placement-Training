
/*working of add method in java?

The add() method is used to add an element to the end of the ArrayList
It returns the new size of the ArrayList

Example:
*/
import java.util.ArrayList;
public class Fruits {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    System.out.println(list.size());
  }
}