import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("H");
        hs.add("E");
        hs.add("R");
        hs.add("M");
        hs.add("A");
        hs.add("N");
        hs.add("H");
        System.out.println("number of elements in HashSet: " + hs);
        boolean ContainsH = hs.contains("H");
        hs.remove("H");
        System.out.println("Contains H : " + ContainsH);
        boolean isEmpty = hs.isEmpty();
        System.out.println("empty: " + isEmpty);

    }
}
