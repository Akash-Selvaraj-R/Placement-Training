import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;   // You were using Iterator but forgot to import it

public class ReverseList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("H");
        list.add("E");
        list.add("R");
        list.add("M");
        list.add("A");
        list.add("N");

        System.out.println("Original list: " + list);

        // Print forward using Iterator
        System.out.println("\nPrinting forward:");
        Iterator<String> itr = list.iterator();               // Fixed: added import above
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Print in reverse using ListIterator starting from the end
        System.out.println("\nReversed list:");
        ListIterator<String> listItr = list.listIterator(list.size());
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        // Alternative simple way (often preferred for just printing)
        System.out.println("\nReversed list (simple loop):");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}