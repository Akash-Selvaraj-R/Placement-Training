public class LexographicalOrder {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";
        int result = a.compareTo(b);
        if (result == 0){
            System.out.println("Both strings are equal");
        }
        else if (result < 0){
            System.out.println("a comes before b");
        }
        else {
            System.out.println("b comes before a");
        }
    }
}
