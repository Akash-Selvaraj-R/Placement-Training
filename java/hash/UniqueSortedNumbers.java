import java.util.*;

public class UniqueSortedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numbers.add(num); // HashSet automatically removes duplicates
        }

        // Convert HashSet to List for sorting
        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList); // Sort the list

        System.out.println("\nUnique numbers in sorted order:");
        for (int n : sortedList) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}